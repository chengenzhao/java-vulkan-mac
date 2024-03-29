package com.example;

import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.stage.Screen;
import javafx.stage.Stage;
import org.vulkan.*;

import java.io.IOException;
import java.lang.foreign.*;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static com.example.VKResult.*;
import static org.vulkan.vulkan_h.*;

/**
 * Steps of using Vulkan(off-screen/off-surface rendering)
 * 1. create vk instance
 * 2. create physical device(GPU) and vk device
 * 3. create image and imageview
 * 4. create render pass
 * 5. create command pool and buffer
 * 6. create pipeline
 * 7. create frame buffer
 * 8. semaphore fence
 * 9. render loop
 */
public class HelloApplication extends HelloApplication1 {

  private static final boolean DEBUG = true;

  public static final int SCREEN_WIDTH = (int) (Screen.getPrimary().getBounds().getWidth() * 3 / 4);
  public static final int SCREEN_HEIGHT = (int) (Screen.getPrimary().getBounds().getHeight() * 3 / 4);
  public Arena arena;

  @Override
  public void init() throws Exception {
    super.init();
    System.loadLibrary("osx");
    System.loadLibrary("vulkan.1");
  }

  @Override
  public void start(Stage stage) {
//    var bufferSize = SCREEN_WIDTH * SCREEN_HEIGHT * 4;

    arena = Arena.ofShared();

    //1. vk instance
    var pInstance = createVkInstance(arena, DEBUG);
    //get the value from pIntance pointer, which is the instance address, and then make a MemorySegment base on that address
    //following two lines of code are equivalent
//      var instance = MemorySegment.ofAddress(pInstance.get(ValueLayout.JAVA_LONG,0));
    var instance = pInstance.get(C_POINTER, 0);//or vkInstance

    List<String> extensions = getAvailableExtensions(arena);

    if (DEBUG) {
      setupDebugMessagesCallback(arena, instance);
    }

    //2. device
    var physicalDevice = getPhysicalDevices(arena, instance).getFirst();

    var graphicsQueueFamilies = physicalDevice.getQueueFamilies();
    var graphicsQueueFamily = graphicsQueueFamilies.stream().filter(QueueFamily::supportsGraphicsOperations).findFirst().orElseThrow();

    var pDevice = createVkDevice(arena, graphicsQueueFamily, physicalDevice);
    var device = pDevice.get(C_POINTER, 0);
    //or
//      var device = MemorySegment.ofAddress(pDevice.get(ValueLayout.JAVA_LONG, 0));

    //3. image and image view
    int depthFormat = findSupportedFormat(List.of(vulkan_h.VK_FORMAT_D32_SFLOAT(), vulkan_h.VK_FORMAT_D32_SFLOAT_S8_UINT(), vulkan_h.VK_FORMAT_D24_UNORM_S8_UINT()), physicalDevice, vulkan_h.VK_IMAGE_TILING_OPTIMAL(),
      vulkan_h.VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT());
    System.out.println("Found supported format: " + depthFormat); // 126 -> VK_FORMAT_D32_SFLOAT

    var image = createImage(arena, physicalDevice, device, SCREEN_WIDTH, SCREEN_HEIGHT, vulkan_h.VK_FORMAT_B8G8R8A8_SRGB(),
      vulkan_h.VK_IMAGE_TILING_OPTIMAL(),
      vulkan_h.VK_IMAGE_USAGE_SAMPLED_BIT() | vulkan_h.VK_IMAGE_USAGE_TRANSFER_DST_BIT() | vulkan_h.VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT() | vulkan_h.VK_IMAGE_USAGE_TRANSFER_SRC_BIT(),
      vulkan_h.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT());
    var imageview = createImageView(arena, device, vulkan_h.VK_FORMAT_B8G8R8A8_SRGB(), vulkan_h.VK_IMAGE_ASPECT_COLOR_BIT(), image.image());

    //4. render pass
    var renderPass = createRenderPass(arena, device, vulkan_h.VK_FORMAT_B8G8R8A8_SRGB(),vulkan_h.VK_FORMAT_D32_SFLOAT());

    //5. command pool
    var commondPool = createCommandPool(arena, graphicsQueueFamily, device);

    var pVkGraphicsQueue = arena.allocate(C_POINTER);
    vulkan_h.vkGetDeviceQueue(device, graphicsQueueFamily.queueFamilyIndex(), 0, pVkGraphicsQueue);

    var commandBuffers = createCommandBuffers(arena, device, commondPool, 1);

    //6. pipeline
    var pipelineLayout = createGraphicsPipeline(arena, SCREEN_WIDTH, SCREEN_HEIGHT, device, renderPass);

    //7. frame buffer
    var depthImageMemory = createImage(arena, physicalDevice, device, SCREEN_WIDTH, SCREEN_HEIGHT, depthFormat,
      vulkan_h.VK_IMAGE_TILING_OPTIMAL(), vulkan_h.VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT(), vulkan_h.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT());
    var pDepthImageView = createImageView(arena, device, depthFormat, vulkan_h.VK_IMAGE_ASPECT_DEPTH_BIT(), depthImageMemory.image());

    transitionImageLayout(arena, commondPool, device, pVkGraphicsQueue, depthImageMemory.image(), depthFormat, vulkan_h.VK_IMAGE_LAYOUT_UNDEFINED(), vulkan_h.VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL());

    var framebuffer = createFramebuffer(arena, SCREEN_WIDTH, SCREEN_HEIGHT, device, imageview, renderPass, pDepthImageView);

    //8. semaphore and fence
    var pSemaphores = createSemaphores(arena, device);
    var pFence = createFence(arena, device);

    var bufferSize = SCREEN_WIDTH * SCREEN_HEIGHT * 4;
    var transferBuffer = createBuffer(arena,device, physicalDevice,bufferSize,vulkan_h.VK_BUFFER_USAGE_TRANSFER_DST_BIT()|vulkan_h.VK_BUFFER_USAGE_TRANSFER_SRC_BIT(), vulkan_h.VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT());
    var pData = arena.allocate(C_POINTER);
    var result = VKResult.vkResult(vulkan_h.vkMapMemory(device, transferBuffer.memory().get(C_POINTER, 0), 0, bufferSize, 0, pData));
    if (result != VK_SUCCESS) {
      System.out.println("vkMapMemory failed for staging buffer: " + result);
      System.exit(-1);
    }else{
      System.out.println("vkTransferBuffer is ready, buffer:"+transferBuffer);
    }

    transitionImageLayout(arena, commondPool, device, pVkGraphicsQueue, image.image(),
      vulkan_h.VK_FORMAT_R8G8B8A8_SRGB(), vulkan_h.VK_IMAGE_LAYOUT_UNDEFINED(), vulkan_h.VK_IMAGE_LAYOUT_GENERAL());
    copyImageToBuffer(arena, commondPool, device, pVkGraphicsQueue, image, transferBuffer,SCREEN_WIDTH, SCREEN_HEIGHT);



    //show the buffer data to the writable image of JavaFX
    PixelBuffer<ByteBuffer> pixelBuffer = new PixelBuffer<>(SCREEN_WIDTH, SCREEN_HEIGHT,
      pData.get(C_POINTER,0).asSlice(0,bufferSize).asByteBuffer(),
      PixelFormat.getByteBgraPreInstance());
    WritableImage writableImage = new WritableImage(pixelBuffer);
/**
    //set color to the buffer
    for (int i = 0; i < bufferSize / 4; i++) {
      pData.get(C_POINTER,0).setAtIndex(ValueLayout.JAVA_BYTE, i * 4L, (byte) 0x00);//blue
      pData.get(C_POINTER,0).setAtIndex(ValueLayout.JAVA_BYTE, i * 4L + 1, (byte) 0xff);//green
      pData.get(C_POINTER,0).setAtIndex(ValueLayout.JAVA_BYTE, i * 4L + 2, (byte) 0x00);//red
      pData.get(C_POINTER,0).setAtIndex(ValueLayout.JAVA_BYTE, i * 4L + 3, (byte) 0xff);//alpha
    }

    //get
    //copy buffer value to the pixel buffer of writable image of JavaFX
//    fxSurface.copyFrom(pData.get(C_POINTER,0).asSlice(0,fxSurface.byteSize()));
    //or copy byte by byte
//    for(int i=0;i<fxSurface.byteSize();i++){
//      fxSurface.setAtIndex(ValueLayout.JAVA_BYTE, i, pData.get(C_POINTER,0).getAtIndex(ValueLayout.JAVA_BYTE, i));
//    }
 */

//    var picture = new Image("texture.jpg");
//    var pixels = getBGRAIntArrayFromImage(picture);
//    BufferMemory textureStagingBuffer = createStagingBuffer(arena, physicalDevice, device, pixels);
//
//    var texture = createImage(arena, physicalDevice, device, (int)picture.getWidth(), (int)picture.getHeight(), vulkan_h.VK_FORMAT_B8G8R8A8_SRGB(),
//      vulkan_h.VK_IMAGE_TILING_OPTIMAL(), vulkan_h.VK_IMAGE_USAGE_TRANSFER_DST_BIT() | vulkan_h.VK_IMAGE_USAGE_SAMPLED_BIT(), vulkan_h.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT()|vulkan_h.VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT());
//
//    transitionImageLayout(arena, commondPool, device, pVkGraphicsQueue, textureImageMemory.image(), vulkan_h.VK_FORMAT_B8G8R8A8_SRGB(), vulkan_h.VK_IMAGE_LAYOUT_UNDEFINED(), vulkan_h.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL());
//    copyBufferToImage(arena, commondPool, device, pVkGraphicsQueue, textureStagingBuffer, textureImageMemory, (int)image.getWidth(), (int)image.getHeight());
//    transitionImageLayout(arena, commondPool, device, pVkGraphicsQueue, textureImageMemory.image(), vulkan_h.VK_FORMAT_B8G8R8A8_SRGB(), vulkan_h.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL(), vulkan_h.VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL());
//    freeBuffer(device, textureStagingBuffer);

    Scene scene = new Scene(new Group(new ImageView(writableImage)), SCREEN_WIDTH, SCREEN_HEIGHT);
    stage.setTitle("Vulkan Demo");
    stage.setScene(scene);
    stage.show();

    //9. render loop
    new AnimationTimer() {
      @Override
      public void handle(long now) {

        var result = vulkan_h.vkWaitForFences(device, 1, pFence, VK_TRUE(), 0L);
        switch (vkResult(result)) {
          case VK_SUCCESS -> {
            //doing render loop work here
            vulkan_h.vkResetFences(device, 1, pFence);
//            submitQueue(arena, pVkGraphicsQueue,commandBuffers.asSlice(0 * C_POINTER.byteSize()), pSemaphores,pFence.get(C_POINTER, 0));
          }
          case VK_TIMEOUT -> {
            //meaning GPU still working so go to the next loop
            for (int i = 0; i < bufferSize / 4; i++) {
              pData.get(C_POINTER,0).setAtIndex(ValueLayout.JAVA_BYTE, i * 4L, (byte) 0x00);//blue
              pData.get(C_POINTER,0).setAtIndex(ValueLayout.JAVA_BYTE, i * 4L + 1, (byte) 0x00);//green
              pData.get(C_POINTER,0).setAtIndex(ValueLayout.JAVA_BYTE, i * 4L + 2, (byte) 0xff);//red
              pData.get(C_POINTER,0).setAtIndex(ValueLayout.JAVA_BYTE, i * 4L + 3, (byte) 0xff);//alpha
            }
          }
          default -> this.stop();
        }
      }

      @Override
      public void stop() {
        super.stop();
      }
    }.start();

//    vulkan_h.vkDestroyRenderPass(device, renderPass, MemorySegment.NULL);
//    vulkan_h.vkDestroyDevice(device, MemorySegment.NULL);
//    vulkan_h.vkDestroyInstance(instance, MemorySegment.NULL);
  }

  @Override
  public void stop() throws Exception {
    super.stop();

    arena.close();
  }

  public static void main(String[] args) {
    launch();
  }

  protected static PipelineLayoutPair createGraphicsPipeline(Arena arena, int windowWidth, int windowHeight, MemorySegment vkDevice,MemorySegment renderPass){
    //load shader, make sure compile shader to spv first.
    /**
     * ~/VulkanSDK/1.3.275.0/macOS/bin/glslc src/main/resources/shader/triangle.vert -o vert.spv
     * ~/VulkanSDK/1.3.275.0/macOS/bin/glslc src/main/resources/shader/triangle.frag -o frag.spv
     */
    byte[] vertShaderBytes = null;
    byte[] fragShaderBytes = null;
    try {
      vertShaderBytes = getFileFromResourceAsStream("shader/vert.spv").readAllBytes();
      fragShaderBytes = getFileFromResourceAsStream("shader/frag.spv").readAllBytes();
    } catch (IOException _) {
      System.out.println("could not read shader file(s)");
      System.exit(-1);
    }

    var pVertShaderModule = createShaderModule(vkDevice, vertShaderBytes, arena);
    var pFragShaderModule = createShaderModule(vkDevice, fragShaderBytes, arena);

    var pVertShaderStageInfo = VkPipelineShaderStageCreateInfo.allocate(arena);
    VkPipelineShaderStageCreateInfo.sType(pVertShaderStageInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO());
    VkPipelineShaderStageCreateInfo.stage(pVertShaderStageInfo, vulkan_h.VK_SHADER_STAGE_VERTEX_BIT());
    VkPipelineShaderStageCreateInfo.module(pVertShaderStageInfo, pVertShaderModule.get(C_POINTER, 0));
    VkPipelineShaderStageCreateInfo.pName(pVertShaderStageInfo, arena.allocateFrom("main", StandardCharsets.UTF_8));

    var pFragShaderStageInfo = VkPipelineShaderStageCreateInfo.allocate(arena);
    VkPipelineShaderStageCreateInfo.sType(pFragShaderStageInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO());
    VkPipelineShaderStageCreateInfo.stage(pFragShaderStageInfo, vulkan_h.VK_SHADER_STAGE_FRAGMENT_BIT());
    VkPipelineShaderStageCreateInfo.module(pFragShaderStageInfo, pFragShaderModule.get(C_POINTER, 0));
    VkPipelineShaderStageCreateInfo.pName(pFragShaderStageInfo, arena.allocateFrom("main",StandardCharsets.UTF_8));

    //fixed functions
    var dynamicStates = arena.allocate(C_INT, 2);
    dynamicStates.setAtIndex(C_INT, 0, vulkan_h.VK_DYNAMIC_STATE_VIEWPORT());
    dynamicStates.setAtIndex(C_INT, 1, vulkan_h.VK_DYNAMIC_STATE_SCISSOR());

    var dynamicState = VkPipelineDynamicStateCreateInfo.allocate(arena);
    VkPipelineDynamicStateCreateInfo.sType(dynamicState, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO());
    VkPipelineDynamicStateCreateInfo.dynamicStateCount(dynamicState, (int)(dynamicStates.byteSize()/C_INT.byteSize()));
    VkPipelineDynamicStateCreateInfo.pDynamicStates(dynamicState, dynamicStates);

    var pVertexInputStateInfo = VkPipelineVertexInputStateCreateInfo.allocate(arena);
    VkPipelineVertexInputStateCreateInfo.sType(pVertexInputStateInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO());
    VkPipelineVertexInputStateCreateInfo.vertexBindingDescriptionCount(pVertexInputStateInfo, 0);
    VkPipelineVertexInputStateCreateInfo.pVertexBindingDescriptions(pVertexInputStateInfo, MemorySegment.NULL);
    VkPipelineVertexInputStateCreateInfo.vertexAttributeDescriptionCount(pVertexInputStateInfo, 0);
    VkPipelineVertexInputStateCreateInfo.pVertexAttributeDescriptions(pVertexInputStateInfo, MemorySegment.NULL);

    var inputAssemblyStateInfo = VkPipelineInputAssemblyStateCreateInfo.allocate(arena);
    VkPipelineInputAssemblyStateCreateInfo.sType(inputAssemblyStateInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO());
    VkPipelineInputAssemblyStateCreateInfo.topology(inputAssemblyStateInfo, vulkan_h.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST());
    VkPipelineInputAssemblyStateCreateInfo.primitiveRestartEnable(inputAssemblyStateInfo, vulkan_h.VK_FALSE());

    var pViewport = VkViewport.allocate(arena);
    VkViewport.x(pViewport, 0.0f);
    VkViewport.y(pViewport, 0.0f);
    VkViewport.width(pViewport, windowWidth);
    VkViewport.height(pViewport, windowHeight);
    VkViewport.minDepth(pViewport, 0f);
    VkViewport.maxDepth(pViewport, 1f);

    var scissor = VkRect2D.allocate(arena);
    var scissorOffset = VkRect2D.offset(scissor);
    var scissorExtent = VkRect2D.extent(scissor);
    VkOffset2D.x(scissorOffset, 0);
    VkOffset2D.y(scissorOffset, 0);
    VkExtent2D.width(scissorExtent, windowWidth);
    VkExtent2D.height(scissorExtent, windowHeight);

    var viewportState = VkPipelineViewportStateCreateInfo.allocate(arena);
    VkPipelineViewportStateCreateInfo.sType(viewportState, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO());
    VkPipelineViewportStateCreateInfo.viewportCount(viewportState, 1);
    VkPipelineViewportStateCreateInfo.pViewports(viewportState, pViewport);
    VkPipelineViewportStateCreateInfo.scissorCount(viewportState, 1);
    VkPipelineViewportStateCreateInfo.pScissors(viewportState, scissor);

    var rasterizer = VkPipelineRasterizationStateCreateInfo.allocate(arena);
    VkPipelineRasterizationStateCreateInfo.sType(rasterizer, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO());
    VkPipelineRasterizationStateCreateInfo.depthClampEnable(rasterizer, vulkan_h.VK_FALSE());
    VkPipelineRasterizationStateCreateInfo.rasterizerDiscardEnable(rasterizer, vulkan_h.VK_FALSE());
    VkPipelineRasterizationStateCreateInfo.polygonMode(rasterizer, vulkan_h.VK_POLYGON_MODE_FILL());
    VkPipelineRasterizationStateCreateInfo.lineWidth(rasterizer, 1.0f);
    VkPipelineRasterizationStateCreateInfo.cullMode(rasterizer, vulkan_h.VK_CULL_MODE_BACK_BIT());
    VkPipelineRasterizationStateCreateInfo.frontFace(rasterizer, vulkan_h.VK_FRONT_FACE_CLOCKWISE());
    VkPipelineRasterizationStateCreateInfo.depthBiasEnable(rasterizer, vulkan_h.VK_FALSE());

    var multisampling = VkPipelineMultisampleStateCreateInfo.allocate(arena);
    VkPipelineMultisampleStateCreateInfo.sType(multisampling, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO());
    VkPipelineMultisampleStateCreateInfo.sampleShadingEnable(multisampling, vulkan_h.VK_FALSE());
    VkPipelineMultisampleStateCreateInfo.rasterizationSamples(multisampling, vulkan_h.VK_SAMPLE_COUNT_1_BIT());
    VkPipelineMultisampleStateCreateInfo.minSampleShading(multisampling, 1.0f);
    VkPipelineMultisampleStateCreateInfo.pSampleMask(multisampling, MemorySegment.NULL);
    VkPipelineMultisampleStateCreateInfo.alphaToCoverageEnable(multisampling, vulkan_h.VK_FALSE());
    VkPipelineMultisampleStateCreateInfo.alphaToOneEnable(multisampling, vulkan_h.VK_FALSE());

    var depthStencilState = MemorySegment.NULL;

    var pipelineColorBlendAttachmentState = VkPipelineColorBlendAttachmentState.allocate(arena);
    VkPipelineColorBlendAttachmentState.colorWriteMask(pipelineColorBlendAttachmentState, vulkan_h.VK_COLOR_COMPONENT_R_BIT() | vulkan_h.VK_COLOR_COMPONENT_G_BIT() | vulkan_h.VK_COLOR_COMPONENT_B_BIT() | vulkan_h.VK_COLOR_COMPONENT_A_BIT());
    VkPipelineColorBlendAttachmentState.blendEnable(pipelineColorBlendAttachmentState, vulkan_h.VK_FALSE());
    VkPipelineColorBlendAttachmentState.srcAlphaBlendFactor(pipelineColorBlendAttachmentState, vulkan_h.VK_BLEND_FACTOR_ONE());
    VkPipelineColorBlendAttachmentState.dstAlphaBlendFactor(pipelineColorBlendAttachmentState, vulkan_h.VK_BLEND_FACTOR_ZERO());
    VkPipelineColorBlendAttachmentState.colorBlendOp(pipelineColorBlendAttachmentState, vulkan_h.VK_BLEND_OP_ADD());
    VkPipelineColorBlendAttachmentState.srcAlphaBlendFactor(pipelineColorBlendAttachmentState, vulkan_h.VK_BLEND_FACTOR_ONE());
    VkPipelineColorBlendAttachmentState.dstAlphaBlendFactor(pipelineColorBlendAttachmentState, vulkan_h.VK_BLEND_FACTOR_ZERO());
    VkPipelineColorBlendAttachmentState.alphaBlendOp(pipelineColorBlendAttachmentState, vulkan_h.VK_BLEND_OP_ADD());

    var colorBlending = VkPipelineColorBlendStateCreateInfo.allocate(arena);
    VkPipelineColorBlendStateCreateInfo.sType(colorBlending, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO());
    VkPipelineColorBlendStateCreateInfo.logicOpEnable(colorBlending, vulkan_h.VK_FALSE());
    VkPipelineColorBlendStateCreateInfo.logicOp(colorBlending, vulkan_h.VK_LOGIC_OP_COPY());
    VkPipelineColorBlendStateCreateInfo.attachmentCount(colorBlending, 1);
    VkPipelineColorBlendStateCreateInfo.pAttachments(colorBlending, pipelineColorBlendAttachmentState);
    var blendConstants = arena.allocate(C_FLOAT, 4);
    blendConstants.setAtIndex(C_FLOAT, 0, 0f);
    blendConstants.setAtIndex(C_FLOAT, 1, 0f);
    blendConstants.setAtIndex(C_FLOAT, 2, 0f);
    blendConstants.setAtIndex(C_FLOAT, 3, 0f);
    VkPipelineColorBlendStateCreateInfo.blendConstants(colorBlending, blendConstants);

    var pipelineLayoutCreateInfo = VkPipelineLayoutCreateInfo.allocate(arena);
    VkPipelineLayoutCreateInfo.sType(pipelineLayoutCreateInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO());
    VkPipelineLayoutCreateInfo.setLayoutCount(pipelineLayoutCreateInfo, 0);
    VkPipelineLayoutCreateInfo.pSetLayouts(pipelineLayoutCreateInfo, MemorySegment.NULL);
    VkPipelineLayoutCreateInfo.pushConstantRangeCount(pipelineLayoutCreateInfo, 0);
    VkPipelineLayoutCreateInfo.pPushConstantRanges(pipelineLayoutCreateInfo, MemorySegment.NULL);

    var pipelineLayout = arena.allocate(C_POINTER);
    var result = VKResult.vkResult(vulkan_h.vkCreatePipelineLayout(vkDevice, pipelineLayoutCreateInfo, MemorySegment.NULL, pipelineLayout));
    if (result != VK_SUCCESS) {
      System.out.println("vkCreatePipelineLayout failed: " + result);
      System.exit(-1);
    } else {
      System.out.println("vkCreatePipelineLayout succeeded");
    }

    var pipelineCreateInfo = VkGraphicsPipelineCreateInfo.allocate(arena);
    VkGraphicsPipelineCreateInfo.sType(pipelineCreateInfo, vulkan_h.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO());
    MemorySegment stages = VkPipelineShaderStageCreateInfo.allocateArray(2, arena);
    assert (stages.byteSize() / 2 == VkPipelineShaderStageCreateInfo.sizeof());
    MemorySegment stage0 = stages.asSlice(0, VkPipelineShaderStageCreateInfo.sizeof());//stages.byteSize()/2
    VkPipelineShaderStageCreateInfo.sType(stage0, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO());
    VkPipelineShaderStageCreateInfo.stage(stage0, vulkan_h.VK_SHADER_STAGE_VERTEX_BIT());
    VkPipelineShaderStageCreateInfo.module(stage0, pVertShaderModule.get(C_POINTER, 0));
    VkPipelineShaderStageCreateInfo.pName(stage0, arena.allocateFrom("main", StandardCharsets.UTF_8));
    MemorySegment stage1 = stages.asSlice(VkPipelineShaderStageCreateInfo.sizeof());//stages.byteSize()/2
    VkPipelineShaderStageCreateInfo.sType(stage1, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO());
    VkPipelineShaderStageCreateInfo.stage(stage1, vulkan_h.VK_SHADER_STAGE_FRAGMENT_BIT());
    VkPipelineShaderStageCreateInfo.module(stage1, pFragShaderModule.get(C_POINTER, 0));
    VkPipelineShaderStageCreateInfo.pName(stage1, arena.allocateFrom("main", StandardCharsets.UTF_8));
    VkGraphicsPipelineCreateInfo.stageCount(pipelineCreateInfo, 2);
    VkGraphicsPipelineCreateInfo.pStages(pipelineCreateInfo, stages);

    VkGraphicsPipelineCreateInfo.pVertexInputState(pipelineCreateInfo, pVertexInputStateInfo);
    VkGraphicsPipelineCreateInfo.pInputAssemblyState(pipelineCreateInfo, inputAssemblyStateInfo);
    VkGraphicsPipelineCreateInfo.pViewportState(pipelineCreateInfo, viewportState);
    VkGraphicsPipelineCreateInfo.pRasterizationState(pipelineCreateInfo, rasterizer);
    VkGraphicsPipelineCreateInfo.pMultisampleState(pipelineCreateInfo, multisampling);
    VkGraphicsPipelineCreateInfo.pDepthStencilState(pipelineCreateInfo, depthStencilState);
    VkGraphicsPipelineCreateInfo.pColorBlendState(pipelineCreateInfo, colorBlending);
    VkGraphicsPipelineCreateInfo.pDynamicState(pipelineCreateInfo, dynamicState);
    VkGraphicsPipelineCreateInfo.layout(pipelineCreateInfo, pipelineLayout.get(C_POINTER, 0));
    VkGraphicsPipelineCreateInfo.renderPass(pipelineCreateInfo, renderPass.get(C_POINTER, 0));
    VkGraphicsPipelineCreateInfo.subpass(pipelineCreateInfo, 0);
    VkGraphicsPipelineCreateInfo.basePipelineHandle(pipelineCreateInfo, vulkan_h.VK_NULL_HANDLE());
    VkGraphicsPipelineCreateInfo.basePipelineIndex(pipelineCreateInfo, -1);
    var pipeline = arena.allocate(C_POINTER, 1);
    result = VKResult.vkResult(vulkan_h.vkCreateGraphicsPipelines(vkDevice,
      vulkan_h.VK_NULL_HANDLE(), 1, pipelineCreateInfo, MemorySegment.NULL, pipeline));
    if (result != VK_SUCCESS) {
      System.out.println("vkCreateGraphicsPipelines failed: " + result);
      System.exit(-1);
    } else {
      System.out.println("vkCreateGraphicsPipelines succeeded");
    }
    return new PipelineLayoutPair(pipeline, pipelineLayout);
  }

  protected static MemorySegment createFramebuffer(Arena arena, int windowWidth, int windowHeight,
                                                   MemorySegment vkDevice, MemorySegment imageView,
                                                   MemorySegment pRenderPass, MemorySegment pDepthImageView) {

    var pFramebufferCreateInfo = VkFramebufferCreateInfo.allocate(arena);

    var pAttachments = arena.allocate(C_POINTER);
    pAttachments.setAtIndex(C_POINTER, 0, imageView.get(C_POINTER, 0));

    VkFramebufferCreateInfo.sType(pFramebufferCreateInfo, vulkan_h.VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO());
    VkFramebufferCreateInfo.renderPass(pFramebufferCreateInfo, pRenderPass.get(C_POINTER, 0));
    VkFramebufferCreateInfo.attachmentCount(pFramebufferCreateInfo, 1);
    VkFramebufferCreateInfo.pAttachments(pFramebufferCreateInfo, pAttachments);
    VkFramebufferCreateInfo.width(pFramebufferCreateInfo, windowWidth);
    VkFramebufferCreateInfo.height(pFramebufferCreateInfo, windowHeight);
    VkFramebufferCreateInfo.layers(pFramebufferCreateInfo, 1);

    var pVkFramebuffer = arena.allocate(C_POINTER);
    var result = VKResult.vkResult(vulkan_h.vkCreateFramebuffer(vkDevice, pFramebufferCreateInfo, MemorySegment.NULL, pVkFramebuffer));
    if (result != VK_SUCCESS) {
      System.out.println("vkCreateFramebuffer failed: " + result);
      System.exit(-1);
    } else {
      System.out.println("vkCreateFramebuffer succeeded");
    }
    return pVkFramebuffer;
  }
}