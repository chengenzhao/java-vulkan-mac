package com.example;

import com.example.resourcetype.BufferMemory;
import com.example.resourcetype.ImageMemory;
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
 * 3. create pImage and imageview
 * 4. create render pass
 * 5. create command pool and pBuffer
 * 6. create pipeline
 * 7. create frame pBuffer
 * 8. create fence
 * 9. integrate to JavaFX
 * 10. render loop
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
    var pInstance = createInstance(arena, DEBUG);
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
    var graphicsQueueFamily = graphicsQueueFamilies.stream().filter(QueueFamily::supportsGraphicsOperations).findAny().orElseThrow();

    var pDevice = createDevice(arena, graphicsQueueFamily);
    var device = pDevice.get(C_POINTER, 0);
    //or
//      var device = MemorySegment.ofAddress(pDevice.get(ValueLayout.JAVA_LONG, 0));

    //3. pImage and pImage view
    var format = VK_FORMAT_B8G8R8A8_SRGB();
    var image = createImage(arena, physicalDevice, device, SCREEN_WIDTH, SCREEN_HEIGHT, format,
      VK_IMAGE_TILING_OPTIMAL(),
      VK_IMAGE_USAGE_SAMPLED_BIT() | VK_IMAGE_USAGE_TRANSFER_DST_BIT() | VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT() | VK_IMAGE_USAGE_TRANSFER_SRC_BIT(),
      VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT());
    var pImageView = createImageView(arena, device, format, VK_IMAGE_ASPECT_COLOR_BIT(), image.pImage());
    var imageView = pImageView.get(C_POINTER, 0);

    //4. render pass
    var pRenderPass = createRenderPass(arena, device, format);
    var renderPass = pRenderPass.get(C_POINTER, 0);

    //5. command pool
    var pCommandPool = createCommandPool(arena, graphicsQueueFamily, device);
    var commandPool = pCommandPool.get(C_POINTER, 0);

    var pGraphicsQueue = arena.allocate(C_POINTER);
    vkGetDeviceQueue(device, graphicsQueueFamily.queueFamilyIndex(), 0, pGraphicsQueue);
    var graphicsQueue = pGraphicsQueue.get(C_POINTER, 0);

    var pCommandBuffers = createCommandBuffers(arena, device, commandPool, 1);

    //6. pipeline
    var pipelineLayout = createGraphicsPipeline(arena, SCREEN_WIDTH, SCREEN_HEIGHT, device, renderPass);

    //7. frame pBuffer
    var pFrameBuffer = createFramebuffer(arena, SCREEN_WIDTH, SCREEN_HEIGHT, device, imageView, renderPass);
    var frameBuffer = pFrameBuffer.get(C_POINTER,0);

    //8. semaphore and fence
//    var pSemaphores = createSemaphores(arena, device);//optional
    var pFence = createFence(arena, device);
    var fence = pFence.get(C_POINTER, 0);

    //9. integrate to JavaFX ImageView
    var bufferSize = SCREEN_WIDTH * SCREEN_HEIGHT * 4;
    var transferBuffer = createBuffer(arena, device, physicalDevice, bufferSize, VK_BUFFER_USAGE_TRANSFER_DST_BIT() | VK_BUFFER_USAGE_TRANSFER_SRC_BIT(), VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT());
    var pData = arena.allocate(C_POINTER);
    var result = VKResult.vkResult(vkMapMemory(device, transferBuffer.memory(), 0, bufferSize, 0, pData));
    if (result != VK_SUCCESS) {
      System.out.println("vkMapMemory failed for staging pBuffer: " + result);
      System.exit(-1);
    } else {
      System.out.println("vkTransferBuffer is ready, pBuffer:" + transferBuffer);
    }

    //show the pBuffer data to the writable pImage of JavaFX
    PixelBuffer<ByteBuffer> pixelBuffer = new PixelBuffer<>(SCREEN_WIDTH, SCREEN_HEIGHT,
      pData.get(C_POINTER, 0).asSlice(0, bufferSize).asByteBuffer(),
      PixelFormat.getByteBgraPreInstance());
    WritableImage writableImage = new WritableImage(pixelBuffer);

    //the rest of JavaFX
    Scene scene = new Scene(new Group(new ImageView(writableImage)), SCREEN_WIDTH, SCREEN_HEIGHT);
    stage.setTitle("Vulkan Demo");
    stage.setScene(scene);
    stage.show();

    //10. render loop
    new AnimationTimer() {
      @Override
      public void handle(long now) {

        var result = vkWaitForFences(device, 1, pFence, VK_TRUE(), 0L);
        switch (vkResult(result)) {
          case VK_SUCCESS -> {
            //doing render loop work here
            vkResetFences(device, 1, pFence);
            drawFrame(arena, graphicsQueue, pCommandBuffers, renderPass, frameBuffer, fence, pipelineLayout);
            copyImageToBuffer(arena, commandPool, device, graphicsQueue, image, transferBuffer, SCREEN_WIDTH, SCREEN_HEIGHT);
          }
          case VK_TIMEOUT -> {
            //meaning GPU still working so go to the next loop
            for (int i = 0; i < bufferSize / 4; i++) {
              pData.get(C_POINTER, 0).setAtIndex(ValueLayout.JAVA_BYTE, i * 4L, (byte) 0x00);//blue
              pData.get(C_POINTER, 0).setAtIndex(ValueLayout.JAVA_BYTE, i * 4L + 1, (byte) 0x00);//green
              pData.get(C_POINTER, 0).setAtIndex(ValueLayout.JAVA_BYTE, i * 4L + 2, (byte) 0xff);//red
              pData.get(C_POINTER, 0).setAtIndex(ValueLayout.JAVA_BYTE, i * 4L + 3, (byte) 0xff);//alpha
            }
          }
          default -> this.stop();
        }
      }

      @Override
      public void stop() {
        System.out.println("stoping the application");
        vulkan_h.vkDestroyFence(device, fence, MemorySegment.NULL);
//        vulkan_h.vkDestroySemaphore(device, pSemaphores.get(C_POINTER, 0), MemorySegment.NULL);
        vulkan_h.vkFreeCommandBuffers(device, commandPool, 1, pCommandBuffers);
        vulkan_h.vkDestroyBuffer(device, transferBuffer.buffer(), MemorySegment.NULL);
        vulkan_h.vkFreeMemory(device, transferBuffer.memory(), MemorySegment.NULL);
//        vulkan_h.vkDestroyDescriptorPool(device, pDescriptorPool.get(C_POINTER, 0), MemorySegment.NULL);
        vulkan_h.vkDestroyImageView(device, imageView, MemorySegment.NULL);
        vulkan_h.vkDestroyImage(device, image.image(), MemorySegment.NULL);
//        vulkan_h.vkDestroyDescriptorSetLayout(device, pDescriptorSetLayout.get(C_POINTER, 0), MemorySegment.NULL);
        vulkan_h.vkDestroyPipelineLayout(device, pipelineLayout.layout().get(C_POINTER, 0), MemorySegment.NULL);
        vulkan_h.vkDestroyDevice(device, MemorySegment.NULL);
        vulkan_h.vkDestroyInstance(instance, MemorySegment.NULL);
      }
    }.start();
  }

  @Override
  public void stop() throws Exception {
    super.stop();

    arena.close();
  }

  public static void main(String[] args) {
    launch();
  }

  private static void drawFrame(Arena arena, MemorySegment graphicsQueue, MemorySegment commandBuffers, MemorySegment renderPass, MemorySegment framebuffer, MemorySegment fence, PipelineLayout pipelineLayout) {
    var commandBuffer = commandBuffers.get(C_POINTER, 0);
    var beginInfo = VkCommandBufferBeginInfo.allocate(arena);
    VkCommandBufferBeginInfo.sType(beginInfo, VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO());
    VkCommandBufferBeginInfo.flags(beginInfo, 0);
    VkCommandBufferBeginInfo.pInheritanceInfo(beginInfo, MemorySegment.NULL);
    if (VKResult.vkResult(vkBeginCommandBuffer(commandBuffer, beginInfo)) != VK_SUCCESS) {
      System.out.println("failed to begin recording command pBuffer!");
      System.exit(-1);
    }

    var pRenderPassBeginInfo = VkRenderPassBeginInfo.allocate(arena);
    VkRenderPassBeginInfo.sType(pRenderPassBeginInfo, VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO());
    VkRenderPassBeginInfo.renderPass(pRenderPassBeginInfo, renderPass);
    VkRenderPassBeginInfo.framebuffer(pRenderPassBeginInfo, framebuffer);
    VkOffset2D.x(VkRect2D.offset(VkRenderPassBeginInfo.renderArea(pRenderPassBeginInfo)), 0);
    VkOffset2D.y(VkRect2D.offset(VkRenderPassBeginInfo.renderArea(pRenderPassBeginInfo)), 0);
    VkExtent2D.width(VkRect2D.extent(VkRenderPassBeginInfo.renderArea(pRenderPassBeginInfo)), SCREEN_WIDTH);
    VkExtent2D.height(VkRect2D.extent(VkRenderPassBeginInfo.renderArea(pRenderPassBeginInfo)), SCREEN_HEIGHT);
    VkRenderPassBeginInfo.clearValueCount(pRenderPassBeginInfo, 1);
    // VkClearValue* pClearValues = malloc(sizeof(VkClearValue) * 2);
    var pClearValues = arena.allocate(VkClearValue.layout());

    // VkClearValue* pClearValue = &pClearValues[0];
    var pClearValue = pClearValues.asSlice(0, VkClearValue.sizeof()); // reference to the first VkClearValue in the array
    VkClearValue.color(pClearValue).setAtIndex(C_FLOAT, 0, 0.0f);//red
    VkClearValue.color(pClearValue).setAtIndex(C_FLOAT, 1, 0.0f);//green
    VkClearValue.color(pClearValue).setAtIndex(C_FLOAT, 2, 0.0f);//blue
    VkClearValue.color(pClearValue).setAtIndex(C_FLOAT, 3, 1.0f);//alpha

    VkRenderPassBeginInfo.pClearValues(pRenderPassBeginInfo, pClearValues);

    vkCmdBeginRenderPass(commandBuffer, pRenderPassBeginInfo, VK_SUBPASS_CONTENTS_INLINE());
    vkCmdBindPipeline(commandBuffer, VK_PIPELINE_BIND_POINT_GRAPHICS(), pipelineLayout.pipeline().get(C_POINTER, 0));

    var viewport = VkViewport.allocate(arena);
    VkViewport.x(viewport, 0f);
    VkViewport.y(viewport, 0f);
    VkViewport.width(viewport, SCREEN_WIDTH);
    VkViewport.height(viewport, SCREEN_HEIGHT);
    VkViewport.minDepth(viewport, 0f);
    VkViewport.maxDepth(viewport, 1f);
    vkCmdSetViewport(commandBuffer, 0, 1, viewport);

    var scissor = VkRect2D.allocate(arena);
    var offset = VkRect2D.offset(scissor);
    VkOffset2D.x(offset, 0);
    VkOffset2D.y(offset, 0);
    var extent = VkRect2D.extent(scissor);
    VkExtent2D.width(extent, SCREEN_WIDTH);
    VkExtent2D.height(extent, SCREEN_HEIGHT);
    vkCmdSetScissor(commandBuffer, 0, 1, scissor);

    vkCmdDraw(commandBuffer, 3, 1, 0, 0);

    vkCmdEndRenderPass(commandBuffer);

    if (VKResult.vkResult(vkEndCommandBuffer(commandBuffer)) != VK_SUCCESS) {
      System.out.println("vkEndCommandBuffer failed!");
      System.exit(-1);
    }

    var pSubmitInfo = VkSubmitInfo.allocate(arena);
    VkSubmitInfo.sType(pSubmitInfo, VK_STRUCTURE_TYPE_SUBMIT_INFO());
    VkSubmitInfo.commandBufferCount(pSubmitInfo, 1);
    VkSubmitInfo.pCommandBuffers(pSubmitInfo, commandBuffers);

    if (VKResult.vkResult(vkQueueSubmit(graphicsQueue, 1, pSubmitInfo, fence)) != VK_SUCCESS) {
      System.out.println("vkQueueSubmit failed!");
      System.exit(-1);
    }
//    System.out.println("draw completed");
  }

  protected static PipelineLayout createGraphicsPipeline(Arena arena, int windowWidth, int windowHeight, MemorySegment device, MemorySegment renderPass) {
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

    var pVertShaderModule = createShaderModule(device, vertShaderBytes, arena);
    var pFragShaderModule = createShaderModule(device, fragShaderBytes, arena);

    var pVertShaderStageInfo = VkPipelineShaderStageCreateInfo.allocate(arena);
    VkPipelineShaderStageCreateInfo.sType(pVertShaderStageInfo, VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO());
    VkPipelineShaderStageCreateInfo.stage(pVertShaderStageInfo, VK_SHADER_STAGE_VERTEX_BIT());
    VkPipelineShaderStageCreateInfo.module(pVertShaderStageInfo, pVertShaderModule.get(C_POINTER, 0));
    VkPipelineShaderStageCreateInfo.pName(pVertShaderStageInfo, arena.allocateFrom("main", StandardCharsets.UTF_8));

    var pFragShaderStageInfo = VkPipelineShaderStageCreateInfo.allocate(arena);
    VkPipelineShaderStageCreateInfo.sType(pFragShaderStageInfo, VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO());
    VkPipelineShaderStageCreateInfo.stage(pFragShaderStageInfo, VK_SHADER_STAGE_FRAGMENT_BIT());
    VkPipelineShaderStageCreateInfo.module(pFragShaderStageInfo, pFragShaderModule.get(C_POINTER, 0));
    VkPipelineShaderStageCreateInfo.pName(pFragShaderStageInfo, arena.allocateFrom("main", StandardCharsets.UTF_8));

    //fixed functions
    var dynamicStates = arena.allocate(C_INT, 2);
    dynamicStates.setAtIndex(C_INT, 0, VK_DYNAMIC_STATE_VIEWPORT());
    dynamicStates.setAtIndex(C_INT, 1, VK_DYNAMIC_STATE_SCISSOR());

    var dynamicState = VkPipelineDynamicStateCreateInfo.allocate(arena);
    VkPipelineDynamicStateCreateInfo.sType(dynamicState, VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO());
    VkPipelineDynamicStateCreateInfo.dynamicStateCount(dynamicState, (int) (dynamicStates.byteSize() / C_INT.byteSize()));
    VkPipelineDynamicStateCreateInfo.pDynamicStates(dynamicState, dynamicStates);

    var pVertexInputStateInfo = VkPipelineVertexInputStateCreateInfo.allocate(arena);
    VkPipelineVertexInputStateCreateInfo.sType(pVertexInputStateInfo, VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO());
    VkPipelineVertexInputStateCreateInfo.vertexBindingDescriptionCount(pVertexInputStateInfo, 0);
    VkPipelineVertexInputStateCreateInfo.pVertexBindingDescriptions(pVertexInputStateInfo, MemorySegment.NULL);
    VkPipelineVertexInputStateCreateInfo.vertexAttributeDescriptionCount(pVertexInputStateInfo, 0);
    VkPipelineVertexInputStateCreateInfo.pVertexAttributeDescriptions(pVertexInputStateInfo, MemorySegment.NULL);

    var inputAssemblyStateInfo = VkPipelineInputAssemblyStateCreateInfo.allocate(arena);
    VkPipelineInputAssemblyStateCreateInfo.sType(inputAssemblyStateInfo, VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO());
    VkPipelineInputAssemblyStateCreateInfo.topology(inputAssemblyStateInfo, VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST());
    VkPipelineInputAssemblyStateCreateInfo.primitiveRestartEnable(inputAssemblyStateInfo, VK_FALSE());

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
    VkPipelineViewportStateCreateInfo.sType(viewportState, VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO());
    VkPipelineViewportStateCreateInfo.viewportCount(viewportState, 1);
    VkPipelineViewportStateCreateInfo.pViewports(viewportState, pViewport);
    VkPipelineViewportStateCreateInfo.scissorCount(viewportState, 1);
    VkPipelineViewportStateCreateInfo.pScissors(viewportState, scissor);

    var rasterizer = VkPipelineRasterizationStateCreateInfo.allocate(arena);
    VkPipelineRasterizationStateCreateInfo.sType(rasterizer, VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO());
    VkPipelineRasterizationStateCreateInfo.depthClampEnable(rasterizer, VK_FALSE());
    VkPipelineRasterizationStateCreateInfo.rasterizerDiscardEnable(rasterizer, VK_FALSE());
    VkPipelineRasterizationStateCreateInfo.polygonMode(rasterizer, VK_POLYGON_MODE_FILL());
    VkPipelineRasterizationStateCreateInfo.lineWidth(rasterizer, 1.0f);
    VkPipelineRasterizationStateCreateInfo.cullMode(rasterizer, VK_CULL_MODE_BACK_BIT());
    VkPipelineRasterizationStateCreateInfo.frontFace(rasterizer, VK_FRONT_FACE_CLOCKWISE());
    VkPipelineRasterizationStateCreateInfo.depthBiasEnable(rasterizer, VK_FALSE());

    var multisampling = VkPipelineMultisampleStateCreateInfo.allocate(arena);
    VkPipelineMultisampleStateCreateInfo.sType(multisampling, VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO());
    VkPipelineMultisampleStateCreateInfo.sampleShadingEnable(multisampling, VK_FALSE());
    VkPipelineMultisampleStateCreateInfo.rasterizationSamples(multisampling, VK_SAMPLE_COUNT_1_BIT());
    VkPipelineMultisampleStateCreateInfo.minSampleShading(multisampling, 1.0f);
    VkPipelineMultisampleStateCreateInfo.pSampleMask(multisampling, MemorySegment.NULL);
    VkPipelineMultisampleStateCreateInfo.alphaToCoverageEnable(multisampling, VK_FALSE());
    VkPipelineMultisampleStateCreateInfo.alphaToOneEnable(multisampling, VK_FALSE());

    var depthStencilState = MemorySegment.NULL;

    var pipelineColorBlendAttachmentState = VkPipelineColorBlendAttachmentState.allocate(arena);
    VkPipelineColorBlendAttachmentState.colorWriteMask(pipelineColorBlendAttachmentState, VK_COLOR_COMPONENT_R_BIT() | VK_COLOR_COMPONENT_G_BIT() | VK_COLOR_COMPONENT_B_BIT() | VK_COLOR_COMPONENT_A_BIT());
    VkPipelineColorBlendAttachmentState.blendEnable(pipelineColorBlendAttachmentState, VK_FALSE());
    VkPipelineColorBlendAttachmentState.srcAlphaBlendFactor(pipelineColorBlendAttachmentState, VK_BLEND_FACTOR_ONE());
    VkPipelineColorBlendAttachmentState.dstAlphaBlendFactor(pipelineColorBlendAttachmentState, VK_BLEND_FACTOR_ZERO());
    VkPipelineColorBlendAttachmentState.colorBlendOp(pipelineColorBlendAttachmentState, VK_BLEND_OP_ADD());
    VkPipelineColorBlendAttachmentState.srcAlphaBlendFactor(pipelineColorBlendAttachmentState, VK_BLEND_FACTOR_ONE());
    VkPipelineColorBlendAttachmentState.dstAlphaBlendFactor(pipelineColorBlendAttachmentState, VK_BLEND_FACTOR_ZERO());
    VkPipelineColorBlendAttachmentState.alphaBlendOp(pipelineColorBlendAttachmentState, VK_BLEND_OP_ADD());

    var colorBlending = VkPipelineColorBlendStateCreateInfo.allocate(arena);
    VkPipelineColorBlendStateCreateInfo.sType(colorBlending, VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO());
    VkPipelineColorBlendStateCreateInfo.logicOpEnable(colorBlending, VK_FALSE());
    VkPipelineColorBlendStateCreateInfo.logicOp(colorBlending, VK_LOGIC_OP_COPY());
    VkPipelineColorBlendStateCreateInfo.attachmentCount(colorBlending, 1);
    VkPipelineColorBlendStateCreateInfo.pAttachments(colorBlending, pipelineColorBlendAttachmentState);
    var blendConstants = arena.allocate(C_FLOAT, 4);
    blendConstants.setAtIndex(C_FLOAT, 0, 0f);
    blendConstants.setAtIndex(C_FLOAT, 1, 0f);
    blendConstants.setAtIndex(C_FLOAT, 2, 0f);
    blendConstants.setAtIndex(C_FLOAT, 3, 0f);
    VkPipelineColorBlendStateCreateInfo.blendConstants(colorBlending, blendConstants);

    var pipelineLayoutCreateInfo = VkPipelineLayoutCreateInfo.allocate(arena);
    VkPipelineLayoutCreateInfo.sType(pipelineLayoutCreateInfo, VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO());
    VkPipelineLayoutCreateInfo.setLayoutCount(pipelineLayoutCreateInfo, 0);
    VkPipelineLayoutCreateInfo.pSetLayouts(pipelineLayoutCreateInfo, MemorySegment.NULL);
    VkPipelineLayoutCreateInfo.pushConstantRangeCount(pipelineLayoutCreateInfo, 0);
    VkPipelineLayoutCreateInfo.pPushConstantRanges(pipelineLayoutCreateInfo, MemorySegment.NULL);

    var pipelineLayout = arena.allocate(C_POINTER);
    var result = VKResult.vkResult(vkCreatePipelineLayout(device, pipelineLayoutCreateInfo, MemorySegment.NULL, pipelineLayout));
    if (result != VK_SUCCESS) {
      System.out.println("vkCreatePipelineLayout failed: " + result);
      System.exit(-1);
    } else {
      System.out.println("vkCreatePipelineLayout succeeded");
    }

    var pipelineCreateInfo = VkGraphicsPipelineCreateInfo.allocate(arena);
    VkGraphicsPipelineCreateInfo.sType(pipelineCreateInfo, VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO());
    MemorySegment stages = VkPipelineShaderStageCreateInfo.allocateArray(2, arena);
    assert (stages.byteSize() / 2 == VkPipelineShaderStageCreateInfo.sizeof());
    MemorySegment stage0 = stages.asSlice(0, VkPipelineShaderStageCreateInfo.sizeof());//stages.byteSize()/2
    VkPipelineShaderStageCreateInfo.sType(stage0, VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO());
    VkPipelineShaderStageCreateInfo.stage(stage0, VK_SHADER_STAGE_VERTEX_BIT());
    VkPipelineShaderStageCreateInfo.module(stage0, pVertShaderModule.get(C_POINTER, 0));
    VkPipelineShaderStageCreateInfo.pName(stage0, arena.allocateFrom("main", StandardCharsets.UTF_8));
    MemorySegment stage1 = stages.asSlice(VkPipelineShaderStageCreateInfo.sizeof());//stages.byteSize()/2
    VkPipelineShaderStageCreateInfo.sType(stage1, VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO());
    VkPipelineShaderStageCreateInfo.stage(stage1, VK_SHADER_STAGE_FRAGMENT_BIT());
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
    VkGraphicsPipelineCreateInfo.renderPass(pipelineCreateInfo, renderPass);
    VkGraphicsPipelineCreateInfo.subpass(pipelineCreateInfo, 0);
    VkGraphicsPipelineCreateInfo.basePipelineHandle(pipelineCreateInfo, VK_NULL_HANDLE());
    VkGraphicsPipelineCreateInfo.basePipelineIndex(pipelineCreateInfo, -1);
    var pipeline = arena.allocate(C_POINTER, 1);
    result = VKResult.vkResult(vkCreateGraphicsPipelines(device,
      VK_NULL_HANDLE(), 1, pipelineCreateInfo, MemorySegment.NULL, pipeline));
    if (result != VK_SUCCESS) {
      System.out.println("vkCreateGraphicsPipelines failed: " + result);
      System.exit(-1);
    } else {
      System.out.println("vkCreateGraphicsPipelines succeeded");
    }
    return new PipelineLayout(pipeline, pipelineLayout);
  }

  protected static MemorySegment createFramebuffer(Arena arena, int windowWidth, int windowHeight,
                                                   MemorySegment device, MemorySegment imageView,
                                                   MemorySegment renderPass) {

    var pFramebufferCreateInfo = VkFramebufferCreateInfo.allocate(arena);

    var pAttachments = arena.allocate(C_POINTER);
    pAttachments.setAtIndex(C_POINTER, 0, imageView);

    VkFramebufferCreateInfo.sType(pFramebufferCreateInfo, VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO());
    VkFramebufferCreateInfo.renderPass(pFramebufferCreateInfo, renderPass);
    VkFramebufferCreateInfo.attachmentCount(pFramebufferCreateInfo, 1);
    VkFramebufferCreateInfo.pAttachments(pFramebufferCreateInfo, pAttachments);
    VkFramebufferCreateInfo.width(pFramebufferCreateInfo, windowWidth);
    VkFramebufferCreateInfo.height(pFramebufferCreateInfo, windowHeight);
    VkFramebufferCreateInfo.layers(pFramebufferCreateInfo, 1);

    var pVkFramebuffer = arena.allocate(C_POINTER);
    var result = VKResult.vkResult(vkCreateFramebuffer(device, pFramebufferCreateInfo, MemorySegment.NULL, pVkFramebuffer));
    if (result != VK_SUCCESS) {
      System.out.println("vkCreateFramebuffer failed: " + result);
      System.exit(-1);
    } else {
      System.out.println("vkCreateFramebuffer succeeded");
    }
    return pVkFramebuffer;
  }

  protected static void copyImageToBuffer(Arena arena, MemorySegment commandPool, MemorySegment device,
                                          MemorySegment graphicsQueue, ImageMemory imageMemory,
                                          BufferMemory bufferMemory, int width, int height) {
    var pCommandBuffer = beginSingleTimeCommands(arena, commandPool, device);

    var pBufferImageCopyRegion = VkBufferImageCopy.allocate(arena);
    VkBufferImageCopy.bufferOffset(pBufferImageCopyRegion, 0);
    VkBufferImageCopy.bufferRowLength(pBufferImageCopyRegion, 0);
    VkBufferImageCopy.bufferImageHeight(pBufferImageCopyRegion, 0);
    VkImageSubresourceLayers.aspectMask(VkBufferImageCopy.imageSubresource(pBufferImageCopyRegion), VK_IMAGE_ASPECT_COLOR_BIT());
    VkImageSubresourceLayers.mipLevel(VkBufferImageCopy.imageSubresource(pBufferImageCopyRegion), 0);
    VkImageSubresourceLayers.baseArrayLayer(VkBufferImageCopy.imageSubresource(pBufferImageCopyRegion), 0);
    VkImageSubresourceLayers.layerCount(VkBufferImageCopy.imageSubresource(pBufferImageCopyRegion), 1);
    VkExtent3D.width(VkBufferImageCopy.imageExtent(pBufferImageCopyRegion), width); // Number of texels
    VkExtent3D.height(VkBufferImageCopy.imageExtent(pBufferImageCopyRegion), height); // Number of texels
    VkExtent3D.depth(VkBufferImageCopy.imageExtent(pBufferImageCopyRegion), 1);
    VkOffset3D.x(VkBufferImageCopy.imageOffset(pBufferImageCopyRegion), 0);
    VkOffset3D.y(VkBufferImageCopy.imageOffset(pBufferImageCopyRegion), 0);
    VkOffset3D.z(VkBufferImageCopy.imageOffset(pBufferImageCopyRegion), 0);

    vkCmdCopyImageToBuffer(pCommandBuffer.get(C_POINTER, 0), imageMemory.image(),
      VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL(), bufferMemory.buffer(), 1, pBufferImageCopyRegion);

    endSingleTimeCommands(arena, commandPool, device, graphicsQueue, pCommandBuffer);
  }
}