package com.example;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelBuffer;
import javafx.scene.image.PixelFormat;
import javafx.scene.image.WritableImage;
import javafx.stage.Screen;
import javafx.stage.Stage;
import org.vulkan.*;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.example.VKResult.*;
import static org.vulkan.vulkan_h.*;

public class HelloApplication extends Application {

  private static final boolean DEBUG = true;

  public static final int SCREEN_WIDTH = (int) (Screen.getPrimary().getBounds().getWidth() * 3 / 4);
  public static final int SCREEN_HEIGHT = (int) (Screen.getPrimary().getBounds().getHeight() * 3 / 4);
  public static Arena ARENA;

  @Override
  public void start(Stage stage) {
    var bufferSize = SCREEN_WIDTH * SCREEN_HEIGHT * 4;

    WritableImage writableImage;

    var vkMemorySegment = ARENA.allocate(bufferSize);
    PixelBuffer<ByteBuffer> pixelBuffer = new PixelBuffer<>(SCREEN_WIDTH, SCREEN_HEIGHT,
      vkMemorySegment.asByteBuffer(), PixelFormat.getByteBgraPreInstance());
    writableImage = new WritableImage(pixelBuffer);

    Scene scene = new Scene(new Group(new ImageView(writableImage)), SCREEN_WIDTH, SCREEN_HEIGHT);
    stage.setTitle("Vulkan Demo");
    stage.setScene(scene);
    stage.show();

    new AnimationTimer() {
      @Override
      public void handle(long now) {
        for (int i = 0; i < vkMemorySegment.byteSize() / 4; i++) {
          vkMemorySegment.setAtIndex(ValueLayout.JAVA_BYTE, i * 4L, (byte) 0x00);//blue
          vkMemorySegment.setAtIndex(ValueLayout.JAVA_BYTE, i * 4L + 1, (byte) 0x00);//green
          vkMemorySegment.setAtIndex(ValueLayout.JAVA_BYTE, i * 4L + 2, (byte) 0xff);//red
          vkMemorySegment.setAtIndex(ValueLayout.JAVA_BYTE, i * 4L + 3, (byte) 0xff);//alpha
        }
      }
    }.start();
  }

  public static void main(String[] args) {
    System.loadLibrary("osx");
    System.loadLibrary("vulkan.1");

    try (Arena arena = Arena.ofShared()) {
      ARENA = arena;

      var pVkInstance = createVkInstance(arena);
      var vkInstance = pVkInstance.get(C_POINTER, 0);

      List<String> extensions = getAvailableExtensions(arena);
      System.out.println("Available extensions:");
      extensions.forEach(System.out::println);

      if (DEBUG) {
        setupDebugMessagesCallback(arena, pVkInstance);
      }

      launch();
    }
  }

  private static MemorySegment createVkInstance(Arena arena) {
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
//    enabledExtensionList.add(vulkan_h.VK_KHR_SURFACE_EXTENSION_NAME());
//    enabledExtensionList.add(vulkan_h.VK_MVK_MACOS_SURFACE_EXTENSION_NAME());
//    enabledExtensionList.add(vulkan_h.VK_EXT_METAL_SURFACE_EXTENSION_NAME());
    enabledExtensionList.add(vulkan_h.VK_KHR_PORTABILITY_ENUMERATION_EXTENSION_NAME());
    if (DEBUG) {
      enabledExtensionList.add(vulkan_h.VK_EXT_DEBUG_UTILS_EXTENSION_NAME());
    }

    VkInstanceCreateInfo.enabledExtensionCount(instanceCreateInfo, enabledExtensionList.size());
    VkInstanceCreateInfo.ppEnabledExtensionNames(instanceCreateInfo, allocatePtrArray(enabledExtensionList.toArray(MemorySegment[]::new), arena));

    if (DEBUG) {
      var enabledLayerNames = allocatePtrArray(new MemorySegment[]{arena.allocateFrom("VK_LAYER_KHRONOS_validation", StandardCharsets.UTF_8)}, arena);
      VkInstanceCreateInfo.enabledLayerCount(instanceCreateInfo, 1);
      VkInstanceCreateInfo.ppEnabledLayerNames(instanceCreateInfo, enabledLayerNames);
    }

    // VKInstance is an opaque pointer defined by VK_DEFINE_HANDLE macro.
    var pVkInstance = arena.allocate(C_POINTER);

    var result = VKResult.vkResult(vulkan_h.vkCreateInstance(instanceCreateInfo, MemorySegment.NULL, pVkInstance));
    if (result != VK_SUCCESS) {
      if (DEBUG && result == VK_ERROR_LAYER_NOT_PRESENT) {
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

  private static MemorySegment allocatePtrArray(MemorySegment[] array, Arena arena) {
    var pArray = arena.allocate(C_POINTER, array.length);
    for (int i = 0; i < array.length; i++) {
      pArray.set(C_POINTER, i * C_POINTER.byteSize(), array[i]);
    }
    return pArray;
  }

  private static void setupDebugMessagesCallback(Arena arena, MemorySegment pVkInstance) {
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

//    PFN_vkCreateDebugUtilsMessengerEXT vkCreateDebugUtilsMessengerEXTFunc = PFN_vkCreateDebugUtilsMessengerEXT.ofAddress(vulkan_h.vkGetInstanceProcAddr(vkInstance, arena.allocateFrom("vkCreateDebugUtilsMessengerEXT", StandardCharsets.UTF_8)), arena.scope());
    var vkCreateDebugUtilsMessengerEXTFunc = vulkan_h.vkGetInstanceProcAddr(instance, arena.allocateFrom("vkCreateDebugUtilsMessengerEXT", StandardCharsets.UTF_8));
//    var result = VKResult.vkResult(vkCreateDebugUtilsMessengerEXTFunc.apply(vkInstance, debugUtilsMessengerCreateInfo, MemorySegment.NULL, debugMessenger));
    var result = VKResult.vkResult(PFN_vkCreateDebugUtilsMessengerEXT.invoke(vkCreateDebugUtilsMessengerEXTFunc, instance, debugUtilsMessengerCreateInfo, MemorySegment.NULL, VkDebugUtilsMessengerCreateInfoEXT.allocate(arena)));

    if (result != VK_SUCCESS) {
      System.out.println("vkCreateDebugUtilsMessengerEXT failed: " + result);
      System.exit(-1);
    } else {
      System.out.println("vkCreateDebugUtilsMessengerEXT succeeded");
    }
  }

  private static List<String> getAvailableExtensions(Arena arena) {
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

  private static MemorySegment createMetalSurface(Arena arena, MemorySegment vkInstance) {
    var metalSurfaceCreateInfo = VkMetalSurfaceCreateInfoEXT.allocate(arena);

    VkMetalSurfaceCreateInfoEXT.sType(metalSurfaceCreateInfo, vulkan_h.VK_STRUCTURE_TYPE_METAL_SURFACE_CREATE_INFO_EXT());
    VkMetalSurfaceCreateInfoEXT.pNext(metalSurfaceCreateInfo, MemorySegment.NULL);
    VkMetalSurfaceCreateInfoEXT.flags(metalSurfaceCreateInfo, 0);

//    // Get HINSTANCE via GetModuleHandle.
//    var hinstance = Windows_h.GetModuleHandleW(MemorySegment.NULL);
//    VkMetalSurfaceCreateInfoEXT.hinstance(metalSurfaceCreateInfo, hinstance);
//    VkMetalSurfaceCreateInfoEXT.hwnd(metalSurfaceCreateInfo, hwndMain);

    var pVkSurface = arena.allocate(C_POINTER);
    var result = VKResult.vkResult(vulkan_h.vkCreateMetalSurfaceEXT(vkInstance, metalSurfaceCreateInfo, MemorySegment.NULL, pVkSurface));
    if (result != VK_SUCCESS) {
      System.out.println("vkCreateMetalSurfaceEXT failed: " + result);
      System.exit(-1);
    } else {
      System.out.println("vkCreateMetalSurfaceEXT succeeded");
    }
    return pVkSurface;
  }

  private static PipelineLayoutPair createGraphicsPipeline(Arena arena, int windowWidth, int windowHeight, MemorySegment vkDevice,
                                                           MemorySegment pVertShaderModule, MemorySegment pFragShaderModule,
                                                           MemorySegment vertexInputStateInfo, MemorySegment pRenderPass,
                                                           MemorySegment pDescriptorSetLayout) {
    var pViewport = VkViewport.allocate(arena);
    VkViewport.x(pViewport, 0.0f);
    VkViewport.y(pViewport, 0.0f);
    VkViewport.width(pViewport, windowWidth);
    VkViewport.height(pViewport,windowHeight);
    VkViewport.minDepth(pViewport, 0f);
    VkViewport.maxDepth(pViewport, 1f);

    var pScissor = VkRect2D.allocate(arena);
    VkOffset2D.x(VkRect2D.offset(pScissor), 0);
    VkOffset2D.y(VkRect2D.offset(pScissor), 0);
    VkExtent2D.width(VkRect2D.extent(pScissor), windowWidth);
    VkExtent2D.height(VkRect2D.extent(pScissor), windowHeight);

    var pPipelineViewportStateInfo = VkPipelineViewportStateCreateInfo.allocate(arena);
    VkPipelineViewportStateCreateInfo.sType(pPipelineViewportStateInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO());
    VkPipelineViewportStateCreateInfo.viewportCount(pPipelineViewportStateInfo, 1);
    VkPipelineViewportStateCreateInfo.pViewports(pPipelineViewportStateInfo, pViewport);
    VkPipelineViewportStateCreateInfo.scissorCount(pPipelineViewportStateInfo, 1);
    VkPipelineViewportStateCreateInfo.pScissors(pPipelineViewportStateInfo, pScissor);

    var pPipelineRasterizationStateInfo = VkPipelineRasterizationStateCreateInfo.allocate(arena);
    VkPipelineRasterizationStateCreateInfo.sType(pPipelineRasterizationStateInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO());
    VkPipelineRasterizationStateCreateInfo.depthClampEnable(pPipelineRasterizationStateInfo, vulkan_h.VK_FALSE());
    VkPipelineRasterizationStateCreateInfo.rasterizerDiscardEnable(pPipelineRasterizationStateInfo, vulkan_h.VK_FALSE());
    VkPipelineRasterizationStateCreateInfo.polygonMode(pPipelineRasterizationStateInfo, vulkan_h.VK_POLYGON_MODE_FILL());
    VkPipelineRasterizationStateCreateInfo.lineWidth(pPipelineRasterizationStateInfo, 1.0f);
    VkPipelineRasterizationStateCreateInfo.cullMode(pPipelineRasterizationStateInfo, vulkan_h.VK_CULL_MODE_BACK_BIT());
    VkPipelineRasterizationStateCreateInfo.frontFace(pPipelineRasterizationStateInfo, vulkan_h.VK_FRONT_FACE_CLOCKWISE());

    var pPipelineMultisampleStateInfo = VkPipelineMultisampleStateCreateInfo.allocate(arena);
    VkPipelineMultisampleStateCreateInfo.sType(pPipelineMultisampleStateInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO());
    VkPipelineMultisampleStateCreateInfo.sampleShadingEnable(pPipelineMultisampleStateInfo, vulkan_h.VK_FALSE());
    VkPipelineMultisampleStateCreateInfo.rasterizationSamples(pPipelineMultisampleStateInfo, vulkan_h.VK_SAMPLE_COUNT_1_BIT());
    VkPipelineMultisampleStateCreateInfo.minSampleShading(pPipelineMultisampleStateInfo, 1.0f);
    VkPipelineMultisampleStateCreateInfo.pSampleMask(pPipelineMultisampleStateInfo, MemorySegment.NULL);
    VkPipelineMultisampleStateCreateInfo.alphaToCoverageEnable(pPipelineMultisampleStateInfo, vulkan_h.VK_FALSE());
    VkPipelineMultisampleStateCreateInfo.alphaToOneEnable(pPipelineMultisampleStateInfo, vulkan_h.VK_FALSE());

    var pPipelineColorBlendAttachmentState = VkPipelineColorBlendAttachmentState.allocate(arena);
    VkPipelineColorBlendAttachmentState.colorWriteMask(pPipelineColorBlendAttachmentState, vulkan_h.VK_COLOR_COMPONENT_R_BIT() |
      vulkan_h.VK_COLOR_COMPONENT_G_BIT() | vulkan_h.VK_COLOR_COMPONENT_B_BIT() | vulkan_h.VK_COLOR_COMPONENT_A_BIT());
    VkPipelineColorBlendAttachmentState.blendEnable(pPipelineColorBlendAttachmentState, vulkan_h.VK_FALSE());
    VkPipelineColorBlendAttachmentState.srcAlphaBlendFactor(pPipelineColorBlendAttachmentState, vulkan_h.VK_BLEND_FACTOR_ONE());
    VkPipelineColorBlendAttachmentState.dstAlphaBlendFactor(pPipelineColorBlendAttachmentState, vulkan_h.VK_BLEND_FACTOR_ZERO());
    VkPipelineColorBlendAttachmentState.colorBlendOp(pPipelineColorBlendAttachmentState, vulkan_h.VK_BLEND_OP_ADD());
    VkPipelineColorBlendAttachmentState.srcAlphaBlendFactor(pPipelineColorBlendAttachmentState, vulkan_h.VK_BLEND_FACTOR_ONE());
    VkPipelineColorBlendAttachmentState.dstAlphaBlendFactor(pPipelineColorBlendAttachmentState, vulkan_h.VK_BLEND_FACTOR_ZERO());
    VkPipelineColorBlendAttachmentState.alphaBlendOp(pPipelineColorBlendAttachmentState, vulkan_h.VK_BLEND_OP_ADD());

    var pPipelineColorBlendStateInfo = VkPipelineColorBlendStateCreateInfo.allocate(arena);
    VkPipelineColorBlendStateCreateInfo.sType(pPipelineColorBlendStateInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO());
    VkPipelineColorBlendStateCreateInfo.logicOpEnable(pPipelineColorBlendStateInfo, vulkan_h.VK_FALSE());
    VkPipelineColorBlendStateCreateInfo.logicOp(pPipelineColorBlendStateInfo, vulkan_h.VK_LOGIC_OP_COPY());
    VkPipelineColorBlendStateCreateInfo.attachmentCount(pPipelineColorBlendStateInfo, 1);
    VkPipelineColorBlendStateCreateInfo.pAttachments(pPipelineColorBlendStateInfo, pPipelineColorBlendAttachmentState);

    var pPipelineInputAssemblyStateInfo = VkPipelineInputAssemblyStateCreateInfo.allocate(arena);
    VkPipelineInputAssemblyStateCreateInfo.sType(pPipelineInputAssemblyStateInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO());
    VkPipelineInputAssemblyStateCreateInfo.topology(pPipelineInputAssemblyStateInfo, vulkan_h.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST());
    VkPipelineInputAssemblyStateCreateInfo.primitiveRestartEnable(pPipelineInputAssemblyStateInfo, vulkan_h.VK_FALSE());

    var pPipelineDepthStencilStateCreateInfo = VkPipelineDepthStencilStateCreateInfo.allocate(arena);
    VkPipelineDepthStencilStateCreateInfo.sType(pPipelineDepthStencilStateCreateInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO());
    VkPipelineDepthStencilStateCreateInfo.depthTestEnable(pPipelineDepthStencilStateCreateInfo, vulkan_h.VK_TRUE());
    VkPipelineDepthStencilStateCreateInfo.depthWriteEnable(pPipelineDepthStencilStateCreateInfo, vulkan_h.VK_FALSE());
    VkPipelineDepthStencilStateCreateInfo.depthCompareOp(pPipelineDepthStencilStateCreateInfo, vulkan_h.VK_COMPARE_OP_LESS());
    VkPipelineDepthStencilStateCreateInfo.depthBoundsTestEnable(pPipelineDepthStencilStateCreateInfo, vulkan_h.VK_FALSE());
    VkPipelineDepthStencilStateCreateInfo.stencilTestEnable(pPipelineDepthStencilStateCreateInfo, vulkan_h.VK_FALSE());

    var pPipelineLayout = arena.allocate(C_POINTER);
    // Setup push constants.
    var pPushConstantRange = VkPushConstantRange.allocate(arena);
    VkPushConstantRange.offset(pPushConstantRange, 0);
    VkPushConstantRange.size(pPushConstantRange, 64); // 4x4 matrix of floats = 16*4 = 64 bytes
    VkPushConstantRange.stageFlags(pPushConstantRange, vulkan_h.VK_SHADER_STAGE_VERTEX_BIT());
    var pPipelineLayoutCreateInfo = VkPipelineLayoutCreateInfo.allocate(arena);
    VkPipelineLayoutCreateInfo.sType(pPipelineLayoutCreateInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO());
    VkPipelineLayoutCreateInfo.setLayoutCount(pPipelineLayoutCreateInfo, 1);
    VkPipelineLayoutCreateInfo.pSetLayouts(pPipelineLayoutCreateInfo, pDescriptorSetLayout);
    VkPipelineLayoutCreateInfo.pPushConstantRanges(pPipelineLayoutCreateInfo, pPushConstantRange);
    VkPipelineLayoutCreateInfo.pushConstantRangeCount(pPipelineLayoutCreateInfo, 1);

    var result = VKResult.vkResult(vulkan_h.vkCreatePipelineLayout(vkDevice, pPipelineLayoutCreateInfo, MemorySegment.NULL, pPipelineLayout));
    if (result != VK_SUCCESS) {
      System.out.println("vkCreatePipelineLayout failed: " + result);
      System.exit(-1);
    } else {
      System.out.println("vkCreatePipelineLayout succeeded");
    }

    var pPipelineCreateInfo = VkGraphicsPipelineCreateInfo.allocate(arena);
    VkGraphicsPipelineCreateInfo.sType(pPipelineCreateInfo, vulkan_h.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO());
    MemorySegment stages = VkPipelineShaderStageCreateInfo.allocateArray(2, arena);
    VkPipelineShaderStageCreateInfo.sType(stages, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO());
    VkPipelineShaderStageCreateInfo.stage(stages, vulkan_h.VK_SHADER_STAGE_VERTEX_BIT());
    VkPipelineShaderStageCreateInfo.module(stages, pVertShaderModule.get(C_POINTER, 0));
    VkPipelineShaderStageCreateInfo.pName(stages, arena.allocateFrom("main", StandardCharsets.UTF_8));
    MemorySegment stage1 = stages.asSlice(stages.byteSize()/2);
    VkPipelineShaderStageCreateInfo.sType(stage1, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO());
    VkPipelineShaderStageCreateInfo.stage(stage1, vulkan_h.VK_SHADER_STAGE_FRAGMENT_BIT());
    VkPipelineShaderStageCreateInfo.module(stage1, pFragShaderModule.get(C_POINTER, 0));
    VkPipelineShaderStageCreateInfo.pName(stage1, arena.allocateFrom("main", StandardCharsets.UTF_8));
    VkGraphicsPipelineCreateInfo.stageCount(pPipelineCreateInfo, 2);
    VkGraphicsPipelineCreateInfo.pStages(pPipelineCreateInfo, stages);
    VkGraphicsPipelineCreateInfo.pVertexInputState(pPipelineCreateInfo, vertexInputStateInfo);
    VkGraphicsPipelineCreateInfo.pInputAssemblyState(pPipelineCreateInfo, pPipelineInputAssemblyStateInfo);
    VkGraphicsPipelineCreateInfo.pViewportState(pPipelineCreateInfo, pPipelineViewportStateInfo);
    VkGraphicsPipelineCreateInfo.pRasterizationState(pPipelineCreateInfo, pPipelineRasterizationStateInfo);
    VkGraphicsPipelineCreateInfo.pMultisampleState(pPipelineCreateInfo, pPipelineMultisampleStateInfo);
    VkGraphicsPipelineCreateInfo.pColorBlendState(pPipelineCreateInfo, pPipelineColorBlendStateInfo);
    VkGraphicsPipelineCreateInfo.pDynamicState(pPipelineCreateInfo, MemorySegment.NULL);
    VkGraphicsPipelineCreateInfo.layout(pPipelineCreateInfo, pPipelineLayout.get(C_POINTER, 0));
    VkGraphicsPipelineCreateInfo.renderPass(pPipelineCreateInfo, pRenderPass.get(C_POINTER, 0));
    VkGraphicsPipelineCreateInfo.subpass(pPipelineCreateInfo, 0);
    VkGraphicsPipelineCreateInfo.basePipelineHandle(pPipelineCreateInfo, vulkan_h.VK_NULL_HANDLE());
    VkGraphicsPipelineCreateInfo.basePipelineIndex(pPipelineCreateInfo, -1);
    VkGraphicsPipelineCreateInfo.pDepthStencilState(pPipelineCreateInfo, pPipelineDepthStencilStateCreateInfo);
    var pVkPipeline = arena.allocate(C_POINTER, 1);
    result = VKResult.vkResult(vulkan_h.vkCreateGraphicsPipelines(vkDevice,
      vulkan_h.VK_NULL_HANDLE(), 1, pPipelineCreateInfo, MemorySegment.NULL, pVkPipeline));
    if (result != VK_SUCCESS) {
      System.out.println("vkCreateGraphicsPipelines failed: " + result);
      System.exit(-1);
    } else {
      System.out.println("vkCreateGraphicsPipelines succeeded");
    }
    return new PipelineLayoutPair(pVkPipeline, pPipelineLayout);
  }
}