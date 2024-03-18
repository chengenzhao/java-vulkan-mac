package com.example;

import javafx.application.Application;
import javafx.scene.image.Image;
import org.vulkan.*;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static com.example.VKResult.VK_ERROR_LAYER_NOT_PRESENT;
import static com.example.VKResult.VK_SUCCESS;
import static org.vulkan.vulkan_h_5.*;

public abstract class HelloApplication1 extends Application {

  protected static MemorySegment allocatePtrArray(MemorySegment[] array, Arena arena) {
    var pArray = arena.allocate(C_POINTER, array.length);
    for (int i = 0; i < array.length; i++) {
      pArray.set(C_POINTER, i * C_POINTER.byteSize(), array[i]);
    }
    return pArray;
  }

  protected static List<String> getAvailableExtensions(Arena arena) {
    var pExtensionCount = arena.allocate(C_INT);
    var result = VKResult.vkResult(vulkan_h.vkEnumerateInstanceExtensionProperties(MemorySegment.NULL, pExtensionCount, MemorySegment.NULL));
    if (result != VK_SUCCESS) {
      System.out.println("vkEnumerateInstanceExtensionProperties failed: " + result);
      System.exit(-1);
    }

    var availableExtensions = VkExtensionProperties.allocateArray(pExtensionCount.get(C_INT, 0), arena);
    List<String> extensions = new ArrayList<>(pExtensionCount.get(C_INT, 0));
    result = VKResult.vkResult(vulkan_h.vkEnumerateInstanceExtensionProperties(MemorySegment.NULL, pExtensionCount, availableExtensions));
    if (result != VK_SUCCESS) {
      System.out.println("vkEnumerateInstanceExtensionProperties failed: " + result);
      System.exit(-1);
    }
    for (int i = 0; i < pExtensionCount.get(C_INT, 0); i++) {
      String extensionName = availableExtensions.asSlice(VkExtensionProperties.sizeof() * i).getString(0, StandardCharsets.UTF_8);
      extensions.add(extensionName);
    }

    System.out.println("Available extensions:");
    extensions.forEach(System.out::println);

    return extensions;
  }

  protected static void setupDebugMessagesCallback(Arena arena, MemorySegment instance) {
    MethodHandle debugCallbackHandle = null;
    try {
      debugCallbackHandle = MethodHandles.lookup().findStatic(VulkanDebug.class, "debugCallbackFunc",
        MethodType.methodType(int.class, int.class, int.class, MemorySegment.class, MemorySegment.class));
    } catch (NoSuchMethodException | IllegalAccessException ex) {
      ex.printStackTrace();
      System.exit(-1);
    }

    if (debugCallbackHandle == null) {
      System.out.println("debugCallbackHandle was null!");
      System.exit(-1);
    }
    MemorySegment debugCallbackFunc = Linker.nativeLinker().upcallStub(debugCallbackHandle, VulkanDebug.DebugCallback$FUNC, arena);

    var debugUtilsMessengerCreateInfo = VkDebugUtilsMessengerCreateInfoEXT.allocate(arena);
    VkDebugUtilsMessengerCreateInfoEXT.sType(debugUtilsMessengerCreateInfo,
      vulkan_h.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT());
    VkDebugUtilsMessengerCreateInfoEXT.messageSeverity(debugUtilsMessengerCreateInfo,
      vulkan_h.VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT() |
        vulkan_h.VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT() |
        vulkan_h.VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT());
    VkDebugUtilsMessengerCreateInfoEXT.messageType(debugUtilsMessengerCreateInfo,
      vulkan_h.VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT() |
        vulkan_h.VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT() |
        vulkan_h.VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT());
    VkDebugUtilsMessengerCreateInfoEXT.pfnUserCallback(debugUtilsMessengerCreateInfo, debugCallbackFunc);
    VkDebugUtilsMessengerCreateInfoEXT.pUserData(debugUtilsMessengerCreateInfo, MemorySegment.NULL);

    var vkCreateDebugUtilsMessengerEXTFunc = vulkan_h.vkGetInstanceProcAddr(instance, arena.allocateFrom("vkCreateDebugUtilsMessengerEXT", StandardCharsets.UTF_8));
    var result = VKResult.vkResult(PFN_vkCreateDebugUtilsMessengerEXT.invoke(vkCreateDebugUtilsMessengerEXTFunc, instance, debugUtilsMessengerCreateInfo, MemorySegment.NULL, VkDebugUtilsMessengerCreateInfoEXT.allocate(arena)));

    if (result != VK_SUCCESS) {
      System.out.println("vkCreateDebugUtilsMessengerEXT failed: " + result);
      System.exit(-1);
    } else {
      System.out.println("vkCreateDebugUtilsMessengerEXT succeeded");
    }
  }

  protected static List<PhysicalDevice> getPhysicalDevices(Arena arena, MemorySegment instance) {
    MemorySegment pPropertyCount = arena.allocate(C_INT);
    pPropertyCount.set(C_INT, 0, -1);
    vulkan_h.vkEnumerateInstanceLayerProperties(pPropertyCount, MemorySegment.NULL);
    System.out.println("property count: " + pPropertyCount.get(C_INT, 0));

    // See how many physical devices Vulkan knows about, then use that number to enumerate them.
    MemorySegment pPhysicalDeviceCount = arena.allocate(C_INT);
    pPhysicalDeviceCount.set(C_INT, 0, -1);
    vulkan_h.vkEnumeratePhysicalDevices(instance, pPhysicalDeviceCount, MemorySegment.NULL);

    int numPhysicalDevices = pPhysicalDeviceCount.get(C_INT, 0);
    if (numPhysicalDevices == 0) {
      System.out.println("numPhysicalDevices was 0!");
      System.exit(-1);
    } else {
      System.out.println("numPhysicalDevices: " + numPhysicalDevices);
    }

    // VkPhysicalDevice is an opaque pointer defined by VK_DEFINE_HANDLE macro - so it has C_POINTER byte size
    // (64-bit size on a 64-bit system) - thus an array of them has size = size(C_POINTER) * num devices.
    MemorySegment pPhysicalDevices = arena.allocate(C_POINTER, numPhysicalDevices);
    var result = VKResult.vkResult(vulkan_h.vkEnumeratePhysicalDevices(instance, pPhysicalDeviceCount, pPhysicalDevices));
    if (result != VK_SUCCESS) {
      System.out.println("vkEnumeratePhysicalDevices failed: " + result);
      System.exit(-1);
    } else {
      System.out.println("vkEnumeratePhysicalDevices succeeded");
    }

    System.out.println("physical device count: " + numPhysicalDevices);

    List<PhysicalDevice> physicalDevices = new ArrayList<>(numPhysicalDevices);
    for (int i = 0; i < numPhysicalDevices; i++) {
      var properties = VkPhysicalDeviceProperties.allocate(arena);
      var physicalDevice = pPhysicalDevices.getAtIndex(C_POINTER, i);
      vulkan_h.vkGetPhysicalDeviceProperties(physicalDevice, properties);
      var features = VkPhysicalDeviceFeatures.allocate(arena);
      vulkan_h.vkGetPhysicalDeviceFeatures(physicalDevice, features);
      var pMemoryProperties = VkPhysicalDeviceMemoryProperties.allocate(arena);
      vulkan_h.vkGetPhysicalDeviceMemoryProperties(physicalDevice, pMemoryProperties);

      int[] formats = {vulkan_h.VK_FORMAT_D32_SFLOAT(), vulkan_h.VK_FORMAT_D32_SFLOAT_S8_UINT(), vulkan_h.VK_FORMAT_D24_UNORM_S8_UINT()};
      List<Format> formatProperties = new ArrayList<>();
      for (int format : formats) {
        var pFormatProperties = VkFormatProperties.allocate(arena);
        vulkan_h.vkGetPhysicalDeviceFormatProperties(physicalDevice, format, pFormatProperties);
        formatProperties.add(new Format(format, VkFormatProperties.linearTilingFeatures(pFormatProperties),
          VkFormatProperties.optimalTilingFeatures(pFormatProperties)));
      }

      // See how many properties the queue family of the current physical device has, then use that number to get them.
      MemorySegment pQueueFamilyPropertyCount = arena.allocate(C_INT);
      pQueueFamilyPropertyCount.set(C_INT, 0, -1);
      vulkan_h.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, pQueueFamilyPropertyCount, MemorySegment.NULL);
      int familyPropertyCount = pQueueFamilyPropertyCount.get(C_INT, 0);
      System.out.println("familyPropertyCount: " + familyPropertyCount);
      MemorySegment pQueueFamilyProperties = VkQueueFamilyProperties.allocateArray(familyPropertyCount, arena);
      vulkan_h.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, pQueueFamilyPropertyCount, pQueueFamilyProperties);

      physicalDevices.add(new PhysicalDevice(arena, physicalDevice, properties, features, pMemoryProperties, familyPropertyCount, pQueueFamilyProperties, formatProperties));
    }

    for (PhysicalDevice physicalDevice : physicalDevices) {
      physicalDevice.printInfo();
    }
    return physicalDevices;
  }

  protected static MemorySegment createVkDevice(Arena arena, QueueFamily graphicsQueueFamily, PhysicalDevice physicalDevice) {

    var pDeviceQueueCreateInfo = VkDeviceQueueCreateInfo.allocate(arena);
    VkDeviceQueueCreateInfo.sType(pDeviceQueueCreateInfo, vulkan_h.VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO());

    System.out.println("Using queue family: " + graphicsQueueFamily);
    VkDeviceQueueCreateInfo.queueFamilyIndex(pDeviceQueueCreateInfo, graphicsQueueFamily.queueFamilyIndex());
    VkDeviceQueueCreateInfo.queueCount(pDeviceQueueCreateInfo, 1);
    var priority = arena.allocate(C_DOUBLE);
    priority.set(C_DOUBLE, 0, 1.0);
    VkDeviceQueueCreateInfo.pQueuePriorities(pDeviceQueueCreateInfo, priority);

    var physicalDeviceFeatures = VkPhysicalDeviceFeatures.allocate(arena);

    VkPhysicalDeviceFeatures.depthClamp(physicalDeviceFeatures, vulkan_h.VK_FALSE());
    VkPhysicalDeviceFeatures.depthBounds(physicalDeviceFeatures, vulkan_h.VK_FALSE());//Metal doesn't support depthBounds yet
    var deviceCreateInfo = VkDeviceCreateInfo.allocate(arena);
    VkDeviceCreateInfo.sType(deviceCreateInfo, vulkan_h.VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO());
    VkDeviceCreateInfo.pQueueCreateInfos(deviceCreateInfo, pDeviceQueueCreateInfo);
    VkDeviceCreateInfo.queueCreateInfoCount(deviceCreateInfo, 1);
    VkDeviceCreateInfo.pEnabledFeatures(deviceCreateInfo, physicalDeviceFeatures);
    // Newer Vulkan implementations do not distinguish between instance and device specific validation layers, but set it to maintain compact with old implementations.
    var extensions = new MemorySegment[]{
      vulkan_h.VK_KHR_SWAPCHAIN_EXTENSION_NAME(),
      arena.allocateFrom("VK_KHR_portability_subset", StandardCharsets.UTF_8)//couldn't find this typealias or sth. in the headers.file
    };
    VkDeviceCreateInfo.enabledExtensionCount(deviceCreateInfo, extensions.length);
    MemorySegment pEnabledDeviceExtensionNames = HelloApplication1.allocatePtrArray(extensions, arena);
    VkDeviceCreateInfo.ppEnabledExtensionNames(deviceCreateInfo, pEnabledDeviceExtensionNames);

    var pVkDevice = arena.allocate(C_POINTER);
    var result = VKResult.vkResult(vulkan_h.vkCreateDevice(graphicsQueueFamily.physicalDevicePtr(), deviceCreateInfo,
      MemorySegment.NULL, pVkDevice));
    if (result != VK_SUCCESS) {
      System.out.println("vkCreateDevice failed: " + result);
      System.exit(-1);
    } else {
      System.out.println("vkCreateDevice succeeded");
    }
    return pVkDevice;
  }

  protected static MemorySegment createVkInstance(Arena arena, boolean debug) {
    var appInfo = VkApplicationInfo.allocate(arena);
    VkApplicationInfo.sType(appInfo, vulkan_h.VK_STRUCTURE_TYPE_APPLICATION_INFO());
    VkApplicationInfo.pApplicationName(appInfo, arena.allocateFrom("Java Vulkan App", StandardCharsets.UTF_8));
    VkApplicationInfo.applicationVersion(appInfo, 0x010000);
    VkApplicationInfo.pEngineName(appInfo, arena.allocateFrom("Java Vulkan", StandardCharsets.UTF_8));
    VkApplicationInfo.engineVersion(appInfo, 0x010000);
    VkApplicationInfo.apiVersion(appInfo, vulkan_h.VK_API_VERSION_1_0());

    var instanceCreateInfo = VkInstanceCreateInfo.allocate(arena);
    VkInstanceCreateInfo.sType(instanceCreateInfo, vulkan_h.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO());
    VkInstanceCreateInfo.flags(instanceCreateInfo, VkInstanceCreateInfo.flags(instanceCreateInfo) | vulkan_h.VK_INSTANCE_CREATE_ENUMERATE_PORTABILITY_BIT_KHR());
    VkInstanceCreateInfo.pApplicationInfo(instanceCreateInfo, appInfo);
    //we probably don't need surface, using JavaFX to render the end frame
    var enabledExtensionList = new ArrayList<MemorySegment>();
    enabledExtensionList.add(vulkan_h.VK_KHR_SURFACE_EXTENSION_NAME());
//    enabledExtensionList.add(vulkan_h.VK_MVK_MACOS_SURFACE_EXTENSION_NAME());
//    enabledExtensionList.add(vulkan_h.VK_EXT_METAL_SURFACE_EXTENSION_NAME());
    enabledExtensionList.add(vulkan_h.VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_EXTENSION_NAME());
    enabledExtensionList.add(vulkan_h.VK_KHR_PORTABILITY_ENUMERATION_EXTENSION_NAME());
    if (debug) {
      enabledExtensionList.add(vulkan_h.VK_EXT_DEBUG_UTILS_EXTENSION_NAME());
    }

    VkInstanceCreateInfo.enabledExtensionCount(instanceCreateInfo, enabledExtensionList.size());
    VkInstanceCreateInfo.ppEnabledExtensionNames(instanceCreateInfo, allocatePtrArray(enabledExtensionList.toArray(MemorySegment[]::new), arena));

    if (debug) {
      var enabledLayerNames = allocatePtrArray(new MemorySegment[]{arena.allocateFrom("VK_LAYER_KHRONOS_validation", StandardCharsets.UTF_8)}, arena);
      VkInstanceCreateInfo.enabledLayerCount(instanceCreateInfo, 1);
      VkInstanceCreateInfo.ppEnabledLayerNames(instanceCreateInfo, enabledLayerNames);
    }

    // VKInstance is an opaque pointer defined by VK_DEFINE_HANDLE macro.
    var pVkInstance = arena.allocate(C_POINTER);

    var result = VKResult.vkResult(vulkan_h.vkCreateInstance(instanceCreateInfo, MemorySegment.NULL, pVkInstance));
    if (result != VK_SUCCESS) {
      if (debug && result == VK_ERROR_LAYER_NOT_PRESENT) {
        System.out.println("Could not enable debug validation layer - make sure Vulkan SDK is installed.");
      } else {
        System.out.println("vkCreateInstance failed: " + result);
      }
      System.exit(-1);
    } else {
      System.out.println("vkCreateInstance succeeded");
    }

    return pVkInstance;
  }

  protected static MemorySegment getShaderModule(MemorySegment vkDevice, byte[] shaderSpv, Arena arena) {
    var pShaderModuleCreateInfo = VkShaderModuleCreateInfo.allocate(arena);
    VkShaderModuleCreateInfo.sType(pShaderModuleCreateInfo, vulkan_h.VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO());
    VkShaderModuleCreateInfo.codeSize(pShaderModuleCreateInfo, shaderSpv.length);
    System.out.println("shaderSpv num bytes: " + shaderSpv.length);
    VkShaderModuleCreateInfo.pCode(pShaderModuleCreateInfo, arena.allocateFrom(C_CHAR, shaderSpv));

    var pShaderModule = arena.allocate(C_POINTER);
    var result = VKResult.vkResult(vulkan_h.vkCreateShaderModule(vkDevice, pShaderModuleCreateInfo, MemorySegment.NULL, pShaderModule));
    if (result != VK_SUCCESS) {
      System.out.println("vkCreateShaderModule failed: " + result);
      System.exit(-1);
    } else {
      System.out.println("vkCreateShaderModule succeeded");
    }

    return pShaderModule;
  }

  public static MemorySegment copyBytes(final byte[] bytes, Arena arena) {
    MemorySegment addr = arena.allocate(bytes.length);
    MemorySegment.copy(MemorySegment.ofArray(bytes), 0, addr, 0, bytes.length);
    return addr;
  }

  protected static MemorySegment createFence(Arena arena, MemorySegment vkDevice) {
    var pFenceCreateInfo = VkFenceCreateInfo.allocate(arena);
    VkFenceCreateInfo.sType(pFenceCreateInfo, vulkan_h.VK_STRUCTURE_TYPE_FENCE_CREATE_INFO());
    VkFenceCreateInfo.flags(pFenceCreateInfo, vulkan_h.VK_FENCE_CREATE_SIGNALED_BIT());
    var pFence = arena.allocate(C_POINTER);
    var result = VKResult.vkResult(vulkan_h.vkCreateFence(vkDevice, pFenceCreateInfo, MemorySegment.NULL, pFence));
    if (result != VK_SUCCESS) {
      System.out.println("vkCreateFence failed: " + result);
      System.exit(-1);
    } else {
      System.out.println("vkCreateFence succeeded!");
    }
    return pFence;
  }

  private static MemorySegment createSemaphores(Arena arena, MemorySegment vkDevice) {
    var pSemaphoreCreateInfo = VkSemaphoreCreateInfo.allocate(arena);
    VkSemaphoreCreateInfo.sType(pSemaphoreCreateInfo, vulkan_h.VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO());

    MemorySegment pSemaphores = arena.allocate(C_POINTER, 2);

    for (int i = 0; i < 2; i++) {
      var result = VKResult.vkResult(vulkan_h.vkCreateSemaphore(vkDevice, pSemaphoreCreateInfo, MemorySegment.NULL, pSemaphores.asSlice(C_POINTER.byteSize() * i)));
      if (result != VK_SUCCESS) {
        System.out.println("vkCreateSemaphore failed: " + result);
        System.exit(-1);
      } else {
        System.out.println("vkCreateSemaphore succeeded (semaphore #" + (i + 1) + " created).");
      }
    }
    return pSemaphores;
  }

  protected static MemorySegment createImageView(Arena arena, MemorySegment vkDevice, int imageFormat, int aspectMask, MemorySegment pImage) {
    var pImageView = arena.allocate(C_POINTER);
    var imageViewCreateInfo = VkImageViewCreateInfo.allocate(arena);
    VkImageViewCreateInfo.sType(imageViewCreateInfo, vulkan_h.VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO());
    VkImageViewCreateInfo.image(imageViewCreateInfo, pImage);
    VkImageViewCreateInfo.viewType(imageViewCreateInfo, vulkan_h.VK_IMAGE_VIEW_TYPE_2D());
    VkImageViewCreateInfo.format(imageViewCreateInfo, imageFormat);
    VkComponentMapping.r(VkImageViewCreateInfo.components(imageViewCreateInfo), vulkan_h.VK_COMPONENT_SWIZZLE_IDENTITY());
    VkComponentMapping.g(VkImageViewCreateInfo.components(imageViewCreateInfo), vulkan_h.VK_COMPONENT_SWIZZLE_IDENTITY());
    VkComponentMapping.b(VkImageViewCreateInfo.components(imageViewCreateInfo), vulkan_h.VK_COMPONENT_SWIZZLE_IDENTITY());
    VkComponentMapping.a(VkImageViewCreateInfo.components(imageViewCreateInfo), vulkan_h.VK_COMPONENT_SWIZZLE_IDENTITY());
    VkImageSubresourceRange.aspectMask(VkImageViewCreateInfo.subresourceRange(imageViewCreateInfo), aspectMask);
    VkImageSubresourceRange.baseMipLevel(VkImageViewCreateInfo.subresourceRange(imageViewCreateInfo), 0);
    VkImageSubresourceRange.levelCount(VkImageViewCreateInfo.subresourceRange(imageViewCreateInfo), 1);
    VkImageSubresourceRange.baseArrayLayer(VkImageViewCreateInfo.subresourceRange(imageViewCreateInfo), 0);
    VkImageSubresourceRange.layerCount(VkImageViewCreateInfo.subresourceRange(imageViewCreateInfo), 1);

    var result = VKResult.vkResult(vulkan_h.vkCreateImageView(vkDevice, imageViewCreateInfo, MemorySegment.NULL, pImageView));
    if (result != VK_SUCCESS) {
      System.out.println("vkCreateImageView failed: " + result);
      System.exit(-1);
    } else {
      System.out.println("vkCreateImageView succeeded");
    }

    return pImageView;
  }

  protected static MemorySegment createRenderPass(Arena arena, MemorySegment device) {
    int imageFormat = vulkan_h.VK_FORMAT_B8G8R8A8_SRGB();//standard argb
    int depthFormat = vulkan_h.VK_FORMAT_D32_SFLOAT();

    var pAttachments = VkAttachmentDescription.allocateArray(2, arena);

    var attachment0 = pAttachments.asSlice(0, VkAttachmentDescription.sizeof());
    assert (VkAttachmentDescription.sizeof() == pAttachments.byteSize() / 2);

    VkAttachmentDescription.format(attachment0, imageFormat);
    VkAttachmentDescription.samples(attachment0, vulkan_h.VK_SAMPLE_COUNT_1_BIT());
    VkAttachmentDescription.loadOp(attachment0, vulkan_h.VK_ATTACHMENT_LOAD_OP_CLEAR());
    VkAttachmentDescription.storeOp(attachment0, vulkan_h.VK_ATTACHMENT_STORE_OP_STORE());
    VkAttachmentDescription.stencilLoadOp(attachment0, vulkan_h.VK_ATTACHMENT_LOAD_OP_DONT_CARE());
    VkAttachmentDescription.stencilStoreOp(attachment0, vulkan_h.VK_ATTACHMENT_STORE_OP_DONT_CARE());
    VkAttachmentDescription.initialLayout(attachment0, vulkan_h.VK_IMAGE_LAYOUT_UNDEFINED());
    VkAttachmentDescription.finalLayout(attachment0, vulkan_h.VK_IMAGE_LAYOUT_PRESENT_SRC_KHR());

    var pColorAttachmentReference = VkAttachmentReference.allocate(arena);
    VkAttachmentReference.attachment(pColorAttachmentReference, 0);
    VkAttachmentReference.layout(pColorAttachmentReference, vulkan_h.VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL());

    var attachment1 = pAttachments.asSlice(VkAttachmentDescription.sizeof(), VkAttachmentDescription.sizeof());
    VkAttachmentDescription.format(attachment1, depthFormat);
    VkAttachmentDescription.samples(attachment1, vulkan_h.VK_SAMPLE_COUNT_1_BIT());
    VkAttachmentDescription.loadOp(attachment1, vulkan_h.VK_ATTACHMENT_LOAD_OP_CLEAR());
    VkAttachmentDescription.storeOp(attachment1, vulkan_h.VK_ATTACHMENT_STORE_OP_DONT_CARE());
    VkAttachmentDescription.stencilLoadOp(attachment1, vulkan_h.VK_ATTACHMENT_LOAD_OP_DONT_CARE());
    VkAttachmentDescription.stencilStoreOp(attachment1, vulkan_h.VK_ATTACHMENT_STORE_OP_DONT_CARE());
    VkAttachmentDescription.initialLayout(attachment1, vulkan_h.VK_IMAGE_LAYOUT_UNDEFINED());
    VkAttachmentDescription.finalLayout(attachment1, vulkan_h.VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL());

    var pDepthAttachmentReference = VkAttachmentReference.allocate(arena);
    VkAttachmentReference.attachment(pDepthAttachmentReference, 1);
    VkAttachmentReference.layout(pDepthAttachmentReference, vulkan_h.VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL());

    var pSubpassDescription = VkSubpassDescription.allocate(arena);
    VkSubpassDescription.pipelineBindPoint(pSubpassDescription, vulkan_h.VK_PIPELINE_BIND_POINT_GRAPHICS());
    VkSubpassDescription.colorAttachmentCount(pSubpassDescription, 1);
    VkSubpassDescription.pColorAttachments(pSubpassDescription, pColorAttachmentReference);
    VkSubpassDescription.pDepthStencilAttachment(pSubpassDescription, pDepthAttachmentReference);

    var pSubpassDependency = VkSubpassDependency.allocate(arena);
    VkSubpassDependency.srcSubpass(pSubpassDependency, vulkan_h.VK_SUBPASS_EXTERNAL());
    VkSubpassDependency.dstSubpass(pSubpassDependency, 0);
    VkSubpassDependency.srcStageMask(pSubpassDependency, vulkan_h.VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT() | vulkan_h.VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT());
    VkSubpassDependency.srcAccessMask(pSubpassDependency, 0);
    VkSubpassDependency.dstStageMask(pSubpassDependency, vulkan_h.VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT() | vulkan_h.VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT());
    VkSubpassDependency.dstAccessMask(pSubpassDependency, vulkan_h.VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT() | vulkan_h.VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT());

    var pRenderPass = arena.allocate(C_POINTER);
    var pRenderPassCreateInfo = VkRenderPassCreateInfo.allocate(arena);
    VkRenderPassCreateInfo.sType(pRenderPassCreateInfo, vulkan_h.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO());
    VkRenderPassCreateInfo.attachmentCount(pRenderPassCreateInfo, 2);
    VkRenderPassCreateInfo.pAttachments(pRenderPassCreateInfo, pAttachments);
    VkRenderPassCreateInfo.subpassCount(pRenderPassCreateInfo, 1);
    VkRenderPassCreateInfo.pSubpasses(pRenderPassCreateInfo, pSubpassDescription);
    VkRenderPassCreateInfo.dependencyCount(pRenderPassCreateInfo, 1);
    VkRenderPassCreateInfo.pDependencies(pRenderPassCreateInfo, pSubpassDependency);

    var result = VKResult.vkResult(vulkan_h.vkCreateRenderPass(device, pRenderPassCreateInfo, MemorySegment.NULL, pRenderPass));
    if (result != VK_SUCCESS) {
      System.out.println("vkCreateRenderPass failed: " + result);
      System.exit(-1);
    } else {
      System.out.println("vkCreateRenderPass succeeded");
    }
    return pRenderPass;
  }

  protected static MemorySegment createCommandPool(Arena arena, QueueFamily graphicsQueueFamily, MemorySegment vkDevice) {
    var pCommandPoolCreateInfo = VkCommandPoolCreateInfo.allocate(arena);
    VkCommandPoolCreateInfo.sType(pCommandPoolCreateInfo, vulkan_h.VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO());
    VkCommandPoolCreateInfo.queueFamilyIndex(pCommandPoolCreateInfo, graphicsQueueFamily.queueFamilyIndex());
    VkCommandPoolCreateInfo.flags(pCommandPoolCreateInfo, vulkan_h.VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT());

    var pVkCommandPool = arena.allocate(C_POINTER);
    var result = VKResult.vkResult(vulkan_h.vkCreateCommandPool(vkDevice, pCommandPoolCreateInfo, MemorySegment.NULL, pVkCommandPool));
    if (result != VK_SUCCESS) {
      System.out.println("vkCreateCommandPool failed: " + result);
      System.exit(-1);
    } else {
      System.out.println("vkCreateCommandPool succeeded");
    }
    return pVkCommandPool;
  }

  protected static MemorySegment createCommandBuffers(Arena arena, MemorySegment vkDevice, MemorySegment pVkCommandPool, int commandBufferCount) {
    MemorySegment pCommandBuffers = arena.allocate(C_POINTER, commandBufferCount);

    var pCommandBufferAllocateInfo = VkCommandBufferAllocateInfo.allocate(arena);
    VkCommandBufferAllocateInfo.sType(pCommandBufferAllocateInfo, vulkan_h.VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO());
    VkCommandBufferAllocateInfo.commandPool(pCommandBufferAllocateInfo, pVkCommandPool.get(C_POINTER, 0));
    VkCommandBufferAllocateInfo.level(pCommandBufferAllocateInfo, vulkan_h.VK_COMMAND_BUFFER_LEVEL_PRIMARY());
    VkCommandBufferAllocateInfo.commandBufferCount(pCommandBufferAllocateInfo, commandBufferCount);

    var result = VKResult.vkResult(vulkan_h.vkAllocateCommandBuffers(vkDevice, pCommandBufferAllocateInfo, pCommandBuffers));
    if (result != VK_SUCCESS) {
      System.out.println("vkAllocateCommandBuffers failed: " + result);
      System.exit(-1);
    } else {
      System.out.println("vkAllocateCommandBuffers succeeded");
    }
    return pCommandBuffers;
  }

  protected static ImageMemoryPair createImage(Arena arena, PhysicalDevice physicalDevice, MemorySegment vkDevice, int imageWidth, int imageHeight, int format, int tiling, int usage, int memoryProperties) {
    var pImageCreateInfo = VkImageCreateInfo.allocate(arena);
    VkImageCreateInfo.sType(pImageCreateInfo, vulkan_h.VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO());
    VkImageCreateInfo.imageType(pImageCreateInfo, vulkan_h.VK_IMAGE_TYPE_2D());
    VkExtent3D.width(VkImageCreateInfo.extent(pImageCreateInfo), imageWidth);
    VkExtent3D.height(VkImageCreateInfo.extent(pImageCreateInfo), imageHeight);
    VkExtent3D.depth(VkImageCreateInfo.extent(pImageCreateInfo), 1);
    VkImageCreateInfo.mipLevels(pImageCreateInfo, 1);
    VkImageCreateInfo.arrayLayers(pImageCreateInfo, 1);
    VkImageCreateInfo.format(pImageCreateInfo, format);
    VkImageCreateInfo.tiling(pImageCreateInfo, tiling);
    VkImageCreateInfo.initialLayout(pImageCreateInfo, vulkan_h.VK_IMAGE_LAYOUT_UNDEFINED());
    VkImageCreateInfo.usage(pImageCreateInfo, usage);
    VkImageCreateInfo.samples(pImageCreateInfo, vulkan_h.VK_SAMPLE_COUNT_1_BIT());
    VkImageCreateInfo.sharingMode(pImageCreateInfo, vulkan_h.VK_SHARING_MODE_EXCLUSIVE());
    var pImage = arena.allocate(C_POINTER);
    var result = VKResult.vkResult(vulkan_h.vkCreateImage(vkDevice, pImageCreateInfo, MemorySegment.NULL, pImage));
    if (result != VK_SUCCESS) {
      System.out.println("vkCreateImage failed: " + result);
      System.exit(-1);
    }

    var pImageMemoryRequirements = VkMemoryRequirements.allocate(arena);
    vulkan_h.vkGetImageMemoryRequirements(vkDevice, pImage.get(C_POINTER, 0), pImageMemoryRequirements);

    var pImageMemoryAllocateInfo = VkMemoryAllocateInfo.allocate(arena);
    VkMemoryAllocateInfo.sType(pImageMemoryAllocateInfo, vulkan_h.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO());
    VkMemoryAllocateInfo.allocationSize(pImageMemoryAllocateInfo, VkMemoryRequirements.size(pImageMemoryRequirements));
    VkMemoryAllocateInfo.memoryTypeIndex(pImageMemoryAllocateInfo, physicalDevice.findMemoryType(VkMemoryRequirements.memoryTypeBits(pImageMemoryRequirements), memoryProperties));

    var pImageMemory = arena.allocate(C_POINTER);
    result = VKResult.vkResult(vulkan_h.vkAllocateMemory(vkDevice, pImageMemoryAllocateInfo, MemorySegment.NULL, pImageMemory));
    if (result != VK_SUCCESS) {
      System.out.println("vkAllocateMemory failed for texture: " + result);
      System.exit(-1);
    }
    vulkan_h.vkBindImageMemory(vkDevice, pImage.get(C_POINTER, 0), pImageMemory.get(C_POINTER, 0), 0);
    return new ImageMemoryPair(pImage, pImageMemory);
  }

  protected static int findSupportedFormat(List<Integer> candidates, PhysicalDevice physicalDevice, int tiling, int features) {
    for (Integer candidate : candidates) {
      for (Format format : physicalDevice.getFormatProperties()) {
        if (tiling == vulkan_h.VK_IMAGE_TILING_LINEAR() && (format.linearTilingFeatures() & features) == features) {
          System.out.println("Found supported format with linear tiling: " + format);
          return candidate;
        } else if (tiling == vulkan_h.VK_IMAGE_TILING_OPTIMAL() && (format.optimalTilingFeatures() & features) == features) {
          System.out.println("Found supported format with optimal tiling: " + format);
          return candidate;
        }
      }
    }
    throw new RuntimeException("Could not find supported format from candidates: " + candidates);
  }

  protected static BufferMemoryPair createBuffer(Arena arena, MemorySegment vkDevice, PhysicalDevice physicalDevice, long bufferSize, int usage, int memoryPropertyFlags) {
    var pBufferCreateInfo = VkBufferCreateInfo.allocate(arena);
    VkBufferCreateInfo.sType(pBufferCreateInfo, vulkan_h.VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO());
    VkBufferCreateInfo.size(pBufferCreateInfo, bufferSize);
    VkBufferCreateInfo.usage(pBufferCreateInfo, usage);
    VkBufferCreateInfo.sharingMode(pBufferCreateInfo, vulkan_h.VK_SHARING_MODE_EXCLUSIVE());
    var pBuffer = arena.allocate(C_POINTER);

    var result = VKResult.vkResult(vulkan_h.vkCreateBuffer(vkDevice, pBufferCreateInfo, MemorySegment.NULL, pBuffer));
    if (result != VK_SUCCESS) {
      System.out.println("vkCreateBuffer failed for buffer: " + result);
      System.exit(-1);
    }

    var pBufferMemoryRequirements = VkMemoryRequirements.allocate(arena);
    vulkan_h.vkGetBufferMemoryRequirements(vkDevice, pBuffer.get(C_POINTER, 0), pBufferMemoryRequirements);

    var pMemoryAllocateInfo = VkMemoryAllocateInfo.allocate(arena);
    VkMemoryAllocateInfo.sType(pMemoryAllocateInfo, vulkan_h.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO());
    VkMemoryAllocateInfo.allocationSize(pMemoryAllocateInfo, VkMemoryRequirements.size(pBufferMemoryRequirements));
    VkMemoryAllocateInfo.memoryTypeIndex(pMemoryAllocateInfo, physicalDevice.findMemoryType(
      VkMemoryRequirements.memoryTypeBits(pBufferMemoryRequirements),
      memoryPropertyFlags));

    var pBufferMemory = arena.allocate(C_POINTER);
    result = VKResult.vkResult(vulkan_h.vkAllocateMemory(vkDevice, pMemoryAllocateInfo, MemorySegment.NULL, pBufferMemory));
    if (result != VK_SUCCESS) {
      System.out.println("vkAllocateMemory failed for buffer: " + result);
      System.exit(-1);
    }

    result = VKResult.vkResult(vulkan_h.vkBindBufferMemory(vkDevice, pBuffer.get(C_POINTER, 0), pBufferMemory.get(C_POINTER, 0), 0));
    if (result != VK_SUCCESS) {
      System.out.println("vkBindBufferMemory failed for buffer: " + result);
      System.exit(-1);
    }

    return new BufferMemoryPair(pBuffer, pBufferMemory);
  }

  protected static int[] getRGBAIntArrayFromImage(Image image) {
    var width = (int) image.getWidth();
    var height = (int) image.getHeight();

    int[] rgbaPixels = new int[width * height];
    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        var pixel = image.getPixelReader().getArgb(i, j);
        rgbaPixels[i + j * width] = ((pixel & 0x00ffffff) << 8) | ((pixel & 0xff000000) >>> 24); //argb -> rgba
      }
    }
    return rgbaPixels;
  }

  protected static BufferMemoryPair createStagingBuffer(Arena arena, PhysicalDevice physicalDevice, MemorySegment vkDevice, Object stagingDataArr) {
    var pData = arena.allocate(C_POINTER);
    long bufferSize = -1;
    switch (stagingDataArr) {
      case int[] intStagingDataArr -> bufferSize = intStagingDataArr.length * 4L;
      case float[] floatStagingDataArr -> bufferSize = floatStagingDataArr.length * 4L;
      case short[] shortStagingDataArr -> bufferSize = shortStagingDataArr.length * 2L;
      case char[] charStagingDataArr -> bufferSize = charStagingDataArr.length * 2L;
      case byte[] byteStagingDataArr -> bufferSize = byteStagingDataArr.length;
      default -> {
      }
    }
    System.out.println("Staging buffer size: " + bufferSize);
    BufferMemoryPair stagingBuffer = createBuffer(arena, vkDevice, physicalDevice, bufferSize,
      vulkan_h.VK_BUFFER_USAGE_TRANSFER_SRC_BIT(), vulkan_h.VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT() | vulkan_h.VK_MEMORY_PROPERTY_HOST_COHERENT_BIT());

    var result = VKResult.vkResult(vulkan_h.vkMapMemory(vkDevice, stagingBuffer.bufferMemory().get(C_POINTER, 0), 0, bufferSize, 0, pData));
    if (result != VK_SUCCESS) {
      System.out.println("vkMapMemory failed for staging buffer: " + result);
      System.exit(-1);
    }

    setDataArrayPtr(pData, stagingDataArr);

    vulkan_h.vkUnmapMemory(vkDevice, stagingBuffer.bufferMemory().get(C_POINTER, 0));
    return stagingBuffer;
  }

  protected static MemorySegment setDataArrayPtr(MemorySegment pData, Object dataArray) {
    switch (dataArray) {
      case int[] intStagingDataArr -> {
        for (int i = 0; i < intStagingDataArr.length; i++) {
          pData.get(C_POINTER, 0).setAtIndex(C_INT, i, intStagingDataArr[i]);
        }
      }
      case float[] floatStagingDataArr -> {
        for (int i = 0; i < floatStagingDataArr.length; i++) {
          pData.get(C_POINTER, 0).setAtIndex(C_FLOAT, i, floatStagingDataArr[i]);
        }
      }
      case short[] shortStagingDataArr -> {
        for (int i = 0; i < shortStagingDataArr.length; i++) {
          pData.get(C_POINTER, 0).setAtIndex(C_SHORT, i, shortStagingDataArr[i]);
        }
      }
      case char[] charStagingDataArr -> {
        for (int i = 0; i < charStagingDataArr.length; i++) {
          pData.get(C_POINTER, 0).setAtIndex(ValueLayout.JAVA_CHAR, i, charStagingDataArr[i]);
        }
      }
      case byte[] byteStagingDataArr -> {
        for (int i = 0; i < byteStagingDataArr.length; i++) {
          pData.get(C_POINTER, 0).set(ValueLayout.JAVA_BYTE, i, byteStagingDataArr[i]);
        }
      }
      default -> {
      }
    }

    return pData;
  }

  protected static void transitionImageLayout(Arena arena, MemorySegment pVkCommandPool, MemorySegment vkDevice, MemorySegment pVkGraphicsQueue,
                                    MemorySegment pImage, int format, int oldLayout, int newLayout) {
    var pCommandBuffer = beginSingleTimeCommands(arena, pVkCommandPool, vkDevice);

    var pImageMemoryBarrier = VkImageMemoryBarrier.allocate(arena);
    VkImageMemoryBarrier.sType(pImageMemoryBarrier, vulkan_h.VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER());
    VkImageMemoryBarrier.oldLayout(pImageMemoryBarrier, oldLayout);
    VkImageMemoryBarrier.newLayout(pImageMemoryBarrier, newLayout);
    VkImageMemoryBarrier.srcQueueFamilyIndex(pImageMemoryBarrier, vulkan_h.VK_QUEUE_FAMILY_IGNORED());
    VkImageMemoryBarrier.dstQueueFamilyIndex(pImageMemoryBarrier, vulkan_h.VK_QUEUE_FAMILY_IGNORED());
    VkImageMemoryBarrier.image(pImageMemoryBarrier, pImage.get(C_POINTER, 0));
    VkImageSubresourceRange.aspectMask(VkImageMemoryBarrier.subresourceRange(pImageMemoryBarrier), vulkan_h.VK_IMAGE_ASPECT_COLOR_BIT());
    VkImageSubresourceRange.baseMipLevel(VkImageMemoryBarrier.subresourceRange(pImageMemoryBarrier), 0);
    VkImageSubresourceRange.levelCount(VkImageMemoryBarrier.subresourceRange(pImageMemoryBarrier), 1);
    VkImageSubresourceRange.baseArrayLayer(VkImageMemoryBarrier.subresourceRange(pImageMemoryBarrier), 0);
    VkImageSubresourceRange.layerCount(VkImageMemoryBarrier.subresourceRange(pImageMemoryBarrier), 1);

    if (newLayout == vulkan_h.VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL()) {
      int aspectMask = vulkan_h.VK_IMAGE_ASPECT_DEPTH_BIT();
      VkImageSubresourceRange.aspectMask(VkImageMemoryBarrier.subresourceRange(pImageMemoryBarrier), aspectMask);
      if (hasStencilComponent(format)) {
        VkImageSubresourceRange.aspectMask(VkImageMemoryBarrier.subresourceRange(pImageMemoryBarrier), aspectMask | vulkan_h.VK_IMAGE_ASPECT_STENCIL_BIT());
      }
    } else {
      VkImageSubresourceRange.aspectMask(VkImageMemoryBarrier.subresourceRange(pImageMemoryBarrier), vulkan_h.VK_IMAGE_ASPECT_COLOR_BIT());
    }

    int sourceStage = 0;
    int destinationStage = 0;

    if (oldLayout == vulkan_h.VK_IMAGE_LAYOUT_UNDEFINED() && newLayout == vulkan_h.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL()) {
      VkImageMemoryBarrier.srcAccessMask(pImageMemoryBarrier, 0);
      VkImageMemoryBarrier.dstAccessMask(pImageMemoryBarrier, vulkan_h.VK_ACCESS_TRANSFER_WRITE_BIT());
      sourceStage = vulkan_h.VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT();
      destinationStage = vulkan_h.VK_PIPELINE_STAGE_TRANSFER_BIT();
    } else if (oldLayout == vulkan_h.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL() && newLayout == vulkan_h.VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL()) {
      VkImageMemoryBarrier.srcAccessMask(pImageMemoryBarrier, vulkan_h.VK_ACCESS_TRANSFER_WRITE_BIT());
      VkImageMemoryBarrier.dstAccessMask(pImageMemoryBarrier, vulkan_h.VK_ACCESS_SHADER_READ_BIT());
      sourceStage = vulkan_h.VK_PIPELINE_STAGE_TRANSFER_BIT();
      destinationStage = vulkan_h.VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT();
    } else if (oldLayout == vulkan_h.VK_IMAGE_LAYOUT_UNDEFINED() && newLayout == vulkan_h.VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL()) {
      VkImageMemoryBarrier.srcAccessMask(pImageMemoryBarrier, 0);
      VkImageMemoryBarrier.dstAccessMask(pImageMemoryBarrier, vulkan_h.VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT() | vulkan_h.VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT());
      sourceStage = vulkan_h.VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT();
      destinationStage = vulkan_h.VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT();
    } else {
      System.out.println("Unsupported layout transition: " + oldLayout + ", " + newLayout);
      System.exit(-1);
    }
    vulkan_h.vkCmdPipelineBarrier(pCommandBuffer.get(C_POINTER, 0), sourceStage, destinationStage, 0, 0,
      MemorySegment.NULL, 0, MemorySegment.NULL, 1, pImageMemoryBarrier);

    endSingleTimeCommands(arena, pVkCommandPool, vkDevice, pVkGraphicsQueue, pCommandBuffer);
  }

  protected static boolean hasStencilComponent(int format) {
    return format == vulkan_h.VK_FORMAT_D32_SFLOAT_S8_UINT() || format == vulkan_h.VK_FORMAT_D24_UNORM_S8_UINT();
  }

  protected static MemorySegment beginSingleTimeCommands(Arena arena, MemorySegment pVkCommandPool, MemorySegment vkDevice) {
    var commandBufferAllocateInfo = VkCommandBufferAllocateInfo.allocate(arena);
    VkCommandBufferAllocateInfo.sType(commandBufferAllocateInfo, vulkan_h.VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO());
    VkCommandBufferAllocateInfo.level(commandBufferAllocateInfo, vulkan_h.VK_COMMAND_BUFFER_LEVEL_PRIMARY());
    VkCommandBufferAllocateInfo.commandPool(commandBufferAllocateInfo, pVkCommandPool.get(C_POINTER, 0));
    VkCommandBufferAllocateInfo.commandBufferCount(commandBufferAllocateInfo, 1);

    var pCommandBuffer = arena.allocate(C_POINTER);
    var result = VKResult.vkResult(vulkan_h.vkAllocateCommandBuffers(vkDevice, commandBufferAllocateInfo, pCommandBuffer));
    if (result != VK_SUCCESS) {
      System.out.println("vkAllocateCommandBuffers failed for vertex buffer: " + result);
      System.exit(-1);
    }

    var beginInfo = VkCommandBufferBeginInfo.allocate(arena);
    VkCommandBufferBeginInfo.sType(beginInfo, vulkan_h.VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO());
    VkCommandBufferBeginInfo.flags(beginInfo, vulkan_h.VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT());
    result = VKResult.vkResult(vulkan_h.vkBeginCommandBuffer(pCommandBuffer.get(C_POINTER, 0), beginInfo));
    if (result != VK_SUCCESS) {
      System.out.println("vkBeginCommandBuffer failed for vertex buffer: " + result);
      System.exit(-1);
    }
    return pCommandBuffer;
  }

  protected static void endSingleTimeCommands(Arena arena, MemorySegment pVkCommandPool, MemorySegment vkDevice,
                                    MemorySegment pVkGraphicsQueue, MemorySegment pCommandBuffer) {
    vulkan_h.vkEndCommandBuffer(pCommandBuffer.get(C_POINTER, 0));

    var pSubmitInfo = VkSubmitInfo.allocate(arena);
    VkSubmitInfo.sType(pSubmitInfo, vulkan_h.VK_STRUCTURE_TYPE_SUBMIT_INFO());
    VkSubmitInfo.commandBufferCount(pSubmitInfo, 1);
    VkSubmitInfo.pCommandBuffers(pSubmitInfo, pCommandBuffer);
    var result = VKResult.vkResult(vulkan_h.vkQueueSubmit(pVkGraphicsQueue.get(C_POINTER, 0), 1, pSubmitInfo, vulkan_h.VK_NULL_HANDLE()));
    if (result != VK_SUCCESS) {
      System.out.println("vkQueueSubmit failed for vertex buffer: " + result);
      System.exit(-1);
    }

    result = VKResult.vkResult(vulkan_h.vkQueueWaitIdle(pVkGraphicsQueue.get(C_POINTER, 0)));
    if (result != VK_SUCCESS) {
      System.out.println("vkQueueSubmit failed for vertex buffer: " + result);
      System.exit(-1);
    }
    vulkan_h.vkFreeCommandBuffers(vkDevice, pVkCommandPool.get(C_POINTER, 0), 1, pCommandBuffer);
  }

  protected static void copyBufferToImage(Arena arena, MemorySegment pVkCommandPool, MemorySegment vkDevice,
                                MemorySegment pVkGraphicsQueue, BufferMemoryPair stagingBufferPair,
                                ImageMemoryPair imageMemoryPair, int width, int height) {
    var pCommandBuffer = beginSingleTimeCommands(arena, pVkCommandPool, vkDevice);

    var pBufferImageCopyRegion = VkBufferImageCopy.allocate(arena);
    VkBufferImageCopy.bufferOffset(pBufferImageCopyRegion, 0);
    VkBufferImageCopy.bufferRowLength(pBufferImageCopyRegion, 0);
    VkBufferImageCopy.bufferImageHeight(pBufferImageCopyRegion, 0);
    VkImageSubresourceLayers.aspectMask(VkBufferImageCopy.imageSubresource(pBufferImageCopyRegion), vulkan_h.VK_IMAGE_ASPECT_COLOR_BIT());
    VkImageSubresourceLayers.mipLevel(VkBufferImageCopy.imageSubresource(pBufferImageCopyRegion), 0);
    VkImageSubresourceLayers.baseArrayLayer(VkBufferImageCopy.imageSubresource(pBufferImageCopyRegion), 0);
    VkImageSubresourceLayers.layerCount(VkBufferImageCopy.imageSubresource(pBufferImageCopyRegion), 1);
    VkExtent3D.width(VkBufferImageCopy.imageExtent(pBufferImageCopyRegion), width); // Number of texels
    VkExtent3D.height(VkBufferImageCopy.imageExtent(pBufferImageCopyRegion), height); // Number of texels
    VkExtent3D.depth(VkBufferImageCopy.imageExtent(pBufferImageCopyRegion), 1);
    VkOffset3D.x(VkBufferImageCopy.imageOffset(pBufferImageCopyRegion), 0);
    VkOffset3D.y(VkBufferImageCopy.imageOffset(pBufferImageCopyRegion), 0);
    VkOffset3D.z(VkBufferImageCopy.imageOffset(pBufferImageCopyRegion), 0);

    vulkan_h.vkCmdCopyBufferToImage(pCommandBuffer.get(C_POINTER, 0), stagingBufferPair.buffer().get(C_POINTER, 0),
      imageMemoryPair.image().get(C_POINTER, 0), vulkan_h.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL(), 1, pBufferImageCopyRegion);

    endSingleTimeCommands(arena, pVkCommandPool, vkDevice, pVkGraphicsQueue, pCommandBuffer);
  }
}
