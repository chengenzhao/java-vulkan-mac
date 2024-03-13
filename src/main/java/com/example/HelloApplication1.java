package com.example;

import javafx.application.Application;
import org.vulkan.*;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static com.example.VKResult.VK_ERROR_LAYER_NOT_PRESENT;
import static com.example.VKResult.VK_SUCCESS;
import static org.vulkan.vulkan_h_5.C_INT;
import static org.vulkan.vulkan_h_5.C_POINTER;

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

    return extensions;
  }

  protected static void setupDebugMessagesCallback(Arena arena, MemorySegment pVkInstance) {
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

    var instance = pVkInstance.get(C_POINTER, 0);

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

  protected static List<PhysicalDevice> getPhysicalDevices(Arena arena, MemorySegment vkInstance, MemorySegment pSurface) {
    MemorySegment pPropertyCount = arena.allocate(C_INT);
    pPropertyCount.set(C_INT, 0,-1);
    vulkan_h.vkEnumerateInstanceLayerProperties(pPropertyCount, MemorySegment.NULL);
    System.out.println("property count: " + pPropertyCount.get(C_INT, 0));

    // See how many physical devices Vulkan knows about, then use that number to enumerate them.
    MemorySegment pPhysicalDeviceCount = arena.allocate(C_INT);
    pPhysicalDeviceCount.set(C_INT, 0, -1);
    vulkan_h.vkEnumeratePhysicalDevices(vkInstance, pPhysicalDeviceCount, MemorySegment.NULL);

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
    var result = VKResult.vkResult(vulkan_h.vkEnumeratePhysicalDevices(vkInstance, pPhysicalDeviceCount, pPhysicalDevices));
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
        vulkan_h.vkGetPhysicalDeviceFormatProperties(physicalDevice, format, pFormatProperties);;
        formatProperties.add(new Format(format, VkFormatProperties.linearTilingFeatures(pFormatProperties),
          VkFormatProperties.optimalTilingFeatures(pFormatProperties)));
      }

      // See how many properties the queue family of the current physical device has, then use that number to get them.
      MemorySegment pQueueFamilyPropertyCount = arena.allocate(C_INT);
      pQueueFamilyPropertyCount.set(C_INT, 0, -1);
      vulkan_h.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice,
        pQueueFamilyPropertyCount, MemorySegment.NULL);
      int familyPropertyCount = pQueueFamilyPropertyCount.get(C_INT, 0);
      System.out.println("familyPropertyCount: " + familyPropertyCount);
      MemorySegment pQueueFamilyProperties = VkQueueFamilyProperties.allocateArray(familyPropertyCount, arena);
      vulkan_h.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice,
        pQueueFamilyPropertyCount, pQueueFamilyProperties);

      physicalDevices.add(new PhysicalDevice(arena, physicalDevice, properties, features, pMemoryProperties, familyPropertyCount, pQueueFamilyProperties, formatProperties));
    }

    for (PhysicalDevice physicalDevice : physicalDevices) {
      physicalDevice.printInfo();
    }
    return physicalDevices;
  }

  protected static MemorySegment createVkDevice(Arena arena, MemorySegment pDeviceQueueCreateInfo, QueueFamily graphicsQueueFamily) {
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
      arena.allocateFrom("VK_KHR_portability_subset",StandardCharsets.UTF_8)//couldn't find this typealias or sth. in the headers.file
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
}
