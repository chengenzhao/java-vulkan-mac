package com.example;

import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.stage.Screen;
import javafx.stage.Stage;
import org.vulkan.*;

import java.io.IOException;
import java.io.InputStream;
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
 * 6. create frame buffer
 * 7. create pipeline
 * 8. semaphore fence
 * 9. render loop
 */
public class HelloApplication extends HelloApplication1 {

  private static final boolean DEBUG = true;

  public static final int SCREEN_WIDTH = (int) (Screen.getPrimary().getBounds().getWidth() * 3 / 4);
  public static final int SCREEN_HEIGHT = (int) (Screen.getPrimary().getBounds().getHeight() * 3 / 4);
  public Arena arena;
  public MemorySegment fxSurface;

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
    //0. prepare the fxSurface
    var bufferSize = SCREEN_WIDTH * SCREEN_HEIGHT * 4;
    fxSurface = arena.allocate(bufferSize);
//      fxSurface = MemorySegment.ofAddress(imagePair.imageMemory().get(ValueLayout.JAVA_LONG,0)).reinterpret(bufferSize);
//      System.out.println(fxSurface);

    //1. vk instance
    var pInstance = createVkInstance(arena, DEBUG);
    //get the value from pIntance pointer, which is the instance address, and then make a MemorySegment base on that address
    //following two lines of code are equivalent
//      var instance = MemorySegment.ofAddress(pInstance.get(ValueLayout.JAVA_LONG,0));
    var instance = pInstance.get(C_POINTER, 0);//or vkInstance

//      List<String> extensions = getAvailableExtensions(arena);

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

    var imagePair = createImage(arena, physicalDevice, device, SCREEN_WIDTH, SCREEN_HEIGHT, vulkan_h.VK_FORMAT_R8G8B8A8_SRGB(),
      vulkan_h.VK_IMAGE_TILING_OPTIMAL(), vulkan_h.VK_IMAGE_USAGE_SAMPLED_BIT()|vulkan_h.VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT(), vulkan_h.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT());
    var imageview = createImageView(arena, device, vulkan_h.VK_FORMAT_R8G8B8A8_SRGB(),vulkan_h.VK_IMAGE_ASPECT_COLOR_BIT(),imagePair.image());

    //4.
    var renderPass = createRenderPass(arena, device);

    //5. command pool
    var commondPool = createCommandPool(arena, graphicsQueueFamily, device);

    var pVkGraphicsQueue = arena.allocate(C_POINTER);
    vulkan_h.vkGetDeviceQueue(device, graphicsQueueFamily.queueFamilyIndex(), 0, pVkGraphicsQueue);

//    var commandBuffer = createCommandBuffers(arena, device, commondPool, );

    //6. frame buffer
    var depthImageMemoryPair = createImage(arena, physicalDevice, device, SCREEN_WIDTH, SCREEN_HEIGHT, depthFormat,
      vulkan_h.VK_IMAGE_TILING_OPTIMAL(), vulkan_h.VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT(), vulkan_h.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT());
    var pDepthImageView = createImageView(arena, device, depthFormat, vulkan_h.VK_IMAGE_ASPECT_DEPTH_BIT(), depthImageMemoryPair.image());

    transitionImageLayout(arena, commondPool, device, pVkGraphicsQueue, depthImageMemoryPair.image(), depthFormat, vulkan_h.VK_IMAGE_LAYOUT_UNDEFINED(), vulkan_h.VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL());

    var framebuffer = createFramebuffer(arena, SCREEN_WIDTH, SCREEN_HEIGHT, device, imageview, renderPass, pDepthImageView);

//    var image = new Image("texture.jpg");
//    var pixels = getRGBAIntArrayFromImage(image);
//
//    BufferMemoryPair textureStagingBufferPair = createStagingBuffer(arena, physicalDevice, device, pixels);
//
//    var textureImageMemoryPair = createImage(arena, physicalDevice, device, (int)image.getWidth(), (int)image.getHeight(), vulkan_h.VK_FORMAT_R8G8B8A8_SRGB(),
//      vulkan_h.VK_IMAGE_TILING_OPTIMAL(), vulkan_h.VK_IMAGE_USAGE_TRANSFER_DST_BIT() | vulkan_h.VK_IMAGE_USAGE_SAMPLED_BIT(), vulkan_h.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT());
//
//    transitionImageLayout(arena, commondPool, device, pVkGraphicsQueue, textureImageMemoryPair.image(), vulkan_h.VK_FORMAT_R8G8B8A8_SRGB(), vulkan_h.VK_IMAGE_LAYOUT_UNDEFINED(), vulkan_h.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL());
//    copyBufferToImage(arena, commondPool, device, pVkGraphicsQueue, textureStagingBufferPair, textureImageMemoryPair, (int)image.getWidth(), (int)image.getHeight());
//    transitionImageLayout(arena, commondPool, device, pVkGraphicsQueue, textureImageMemoryPair.image(), vulkan_h.VK_FORMAT_R8G8B8A8_SRGB(), vulkan_h.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL(), vulkan_h.VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL());
//    freeBuffer(device, textureStagingBufferPair);
//

    //7. pipeline
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

    var pVertShaderModule = getShaderModule(device, vertShaderBytes, arena);
    var pFragShaderModule = getShaderModule(device, fragShaderBytes, arena);

    var pVertShaderStageInfo = VkPipelineShaderStageCreateInfo.allocate(arena);
    VkPipelineShaderStageCreateInfo.sType(pVertShaderStageInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO());
    VkPipelineShaderStageCreateInfo.stage(pVertShaderStageInfo, vulkan_h.VK_SHADER_STAGE_VERTEX_BIT());
    VkPipelineShaderStageCreateInfo.module(pVertShaderStageInfo, pVertShaderModule.get(C_POINTER, 0));
    VkPipelineShaderStageCreateInfo.pName(pVertShaderStageInfo, arena.allocateFrom("main",StandardCharsets.UTF_8));

    var pFragShaderStageInfo = VkPipelineShaderStageCreateInfo.allocate(arena);
    VkPipelineShaderStageCreateInfo.sType(pFragShaderStageInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO());
    VkPipelineShaderStageCreateInfo.stage(pFragShaderStageInfo, vulkan_h.VK_SHADER_STAGE_FRAGMENT_BIT());
    VkPipelineShaderStageCreateInfo.module(pFragShaderStageInfo, pFragShaderModule.get(C_POINTER, 0));
    VkPipelineShaderStageCreateInfo.pName(pFragShaderStageInfo, arena.allocateFrom("main",StandardCharsets.UTF_8));

    var pVertexInputBindingDescription = VkVertexInputBindingDescription.allocate(arena);
    VkVertexInputBindingDescription.binding(pVertexInputBindingDescription, 0);
    // Square with colors at the vertices.
    float[] vertices = new float[]{
      -0.5f, -0.5f, 0.0f, // Vertex 0, Position
      1.0f, 0.0f, 0.0f,   // Vertex 0, Color (red)
      1.0f, 0.0f,         // Vertex 0, texCoord
      0.5f, -0.5f, 0.0f,  // Vertex 1, Position
      0.0f, 1.0f, 0.0f,   // Vertex 1, Color (green)
      0.0f, 0.0f,         // Vertex 1, texCoord
      0.5f, 0.5f, 0.0f,   // Vertex 2, Position
      0.0f, 1.0f, 1.0f,   // Vertex 2, Color (cyan)
      0.0f, 1.0f,         // Vertex 2, texCoord
      -0.5f, 0.5f, 0.0f,  // Vertex 3, Position
      1.0f, 1.0f, 1.0f,   // Vertex 3, Color (white)
      1.0f, 1.0f,         // Vertex 3, texCoord
    };

    int[] indices = new int[]{
      0, 1, 2, 2, 3, 0
    };
    // Cube
    vertices = new float[]{
      -0.5f, -0.5f, -0.5f, // Vertex 0, Position
      1.0f, 0.0f, 0.0f, // Vertex 0, Color (red)
      1.0f, 0.0f,         // Vertex 0, texCoord
      -0.5f, -0.5f, 0.5f, // Vertex 1, Position
      0.0f, 1.0f, 0.0f, // Vertex 1, Color (green)
      0.0f, 0.0f,         // Vertex 1, texCoord
      0.5f, -0.5f, 0.5f, // Vertex 2, Position
      0.0f, 0.0f, 1.0f, // Vertex 2, Color (blue)
      0.0f, 1.0f,         // Vertex 2, texCoord
      0.5f, -0.5f, -0.5f, // Vertex 3, Position
      1.0f, 1.0f, 1.0f, // Vertex 3, Color (white)
      1.0f, 1.0f,         // Vertex 3, texCoord
      -0.5f, 0.5f, -0.5f, // Vertex 4, Position
      1.0f, 0.0f, 1.0f, // Vertex 4, Color (magenta)
      1.0f, 0.0f,         // Vertex 4, texCoord
      -0.5f, 0.5f, 0.5f, // Vertex 5, Position
      0.5f, 0.5f, 0.5f, // Vertex 5, Color (gray)
      0.0f, 0.0f,         // Vertex 5, texCoord
      0.5f, 0.5f, 0.5f, // Vertex 6, Position
      0.5f, 0.5f, 0.0f, // Vertex 6, Color (olive)
      0.0f, 1.0f,         // Vertex 6, texCoord
      0.5f, 0.5f, -0.5f, // Vertex 7, Position
      0.0f, 0.5f, 0.5f, // Vertex 7, Color (teal)
      1.0f, 1.0f,         // Vertex 7, texCoord
    };

    indices = new int[]{
      0, 2, 3, 0, 1, 2,
      4, 6, 5, 4, 7, 6,
      5, 2, 1, 5, 6, 2,
      0, 7, 4, 0, 3, 7,
      0, 4, 1, 1, 4, 5,
      2, 6, 3, 3, 6, 7
    };
    VkVertexInputBindingDescription.stride(pVertexInputBindingDescription, 32); // pos + color + texcoord = 12 + 12 + 8 bytes
    VkVertexInputBindingDescription.inputRate(pVertexInputBindingDescription, vulkan_h.VK_VERTEX_INPUT_RATE_VERTEX());

    var pVertexInputAttributeDescriptions = VkVertexInputAttributeDescription.allocateArray(3, arena);
    var descriptionSize = VkVertexInputAttributeDescription.sizeof();

    // Position description
    var positionDesc = pVertexInputAttributeDescriptions.asSlice(0, descriptionSize);
    VkVertexInputAttributeDescription.binding(positionDesc, 0);
    VkVertexInputAttributeDescription.location(positionDesc, 0);
    VkVertexInputAttributeDescription.format(positionDesc, vulkan_h.VK_FORMAT_R32G32B32_SFLOAT());
    VkVertexInputAttributeDescription.offset(positionDesc, 0);
    // Color description
    var colorDesc = pVertexInputAttributeDescriptions.asSlice(descriptionSize, descriptionSize);
    VkVertexInputAttributeDescription.binding(colorDesc, 0);
    VkVertexInputAttributeDescription.location(colorDesc, 1);
    VkVertexInputAttributeDescription.format(colorDesc, vulkan_h.VK_FORMAT_R32G32B32_SFLOAT());
    VkVertexInputAttributeDescription.offset(colorDesc, 12); // color starts at 12 bytes
    // Texcoord description
    var textcoorDesc = pVertexInputAttributeDescriptions.asSlice(descriptionSize*2, descriptionSize);
    VkVertexInputAttributeDescription.binding(textcoorDesc, 0);
    VkVertexInputAttributeDescription.location(textcoorDesc, 2);
    VkVertexInputAttributeDescription.format(textcoorDesc, vulkan_h.VK_FORMAT_R32G32_SFLOAT());
    VkVertexInputAttributeDescription.offset(textcoorDesc, 24); // texcoord starts at 24 bytes

    var pVertexInputStateInfo = VkPipelineVertexInputStateCreateInfo.allocate(arena);
    VkPipelineVertexInputStateCreateInfo.sType(pVertexInputStateInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO());
    VkPipelineVertexInputStateCreateInfo.vertexBindingDescriptionCount(pVertexInputStateInfo, 1);
    VkPipelineVertexInputStateCreateInfo.pVertexBindingDescriptions(pVertexInputStateInfo, pVertexInputBindingDescription);
    VkPipelineVertexInputStateCreateInfo.vertexAttributeDescriptionCount(pVertexInputStateInfo, 3);
    VkPipelineVertexInputStateCreateInfo.pVertexAttributeDescriptions(pVertexInputStateInfo, pVertexInputAttributeDescriptions);

    var pDescriptorSetLayout = createDescriptorSetLayout(arena, device);

    var pipelineLayoutPair = createGraphicsPipeline(arena, SCREEN_WIDTH, SCREEN_HEIGHT, device, pVertShaderModule, pFragShaderModule, pVertexInputStateInfo, renderPass, pDescriptorSetLayout);

    //8. semaphore and fence
    var pSemaphores = createSemaphores(arena, device);
    var pFence = createFence(arena, device);

    WritableImage writableImage;

//    var vkMemorySegment = ARENA.allocate(bufferSize);
    PixelBuffer<ByteBuffer> pixelBuffer = new PixelBuffer<>(SCREEN_WIDTH, SCREEN_HEIGHT,
      fxSurface.asByteBuffer(), PixelFormat.getByteBgraPreInstance());
    writableImage = new WritableImage(pixelBuffer);

    Scene scene = new Scene(new Group(new ImageView(writableImage)), SCREEN_WIDTH, SCREEN_HEIGHT);
    stage.setTitle("Vulkan Demo");
    stage.setScene(scene);
    stage.show();

    //9. render loop
    new AnimationTimer() {
      @Override
      public void handle(long now) {

        var result = vulkan_h.vkWaitForFences(device, 1, pFence, VK_TRUE(), 0L);
        switch (vkResult(result)){
          case VK_SUCCESS -> {
            //doing render loop work here
            vulkan_h.vkResetFences(device, 1, pFence);

          }
          case VK_TIMEOUT -> {
            //meaning GPU still working so go the next loop
            for (int i = 0; i < fxSurface.byteSize() / 4; i++) {
              fxSurface.setAtIndex(ValueLayout.JAVA_BYTE, i * 4L, (byte) 0x00);//blue
              fxSurface.setAtIndex(ValueLayout.JAVA_BYTE, i * 4L + 1, (byte) 0x00);//green
              fxSurface.setAtIndex(ValueLayout.JAVA_BYTE, i * 4L + 2, (byte) 0xff);//red
              fxSurface.setAtIndex(ValueLayout.JAVA_BYTE, i * 4L + 3, (byte) 0xff);//alpha
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

  private static PipelineLayoutPair createGraphicsPipeline(Arena arena, int windowWidth, int windowHeight, MemorySegment vkDevice,
                                                           MemorySegment vertShaderModule, MemorySegment fragShaderModule,
                                                           MemorySegment vertexInputStateInfo, MemorySegment renderPass,
                                                           MemorySegment descriptorSetLayout) {
    var pViewport = VkViewport.allocate(arena);
    VkViewport.x(pViewport, 0.0f);
    VkViewport.y(pViewport, 0.0f);
    VkViewport.width(pViewport, windowWidth);
    VkViewport.height(pViewport, windowHeight);
    VkViewport.minDepth(pViewport, 0f);
    VkViewport.maxDepth(pViewport, 1f);

    var scissor = VkRect2D.allocate(arena);
    VkOffset2D.x(VkRect2D.offset(scissor), 0);
    VkOffset2D.y(VkRect2D.offset(scissor), 0);
    VkExtent2D.width(VkRect2D.extent(scissor), windowWidth);
    VkExtent2D.height(VkRect2D.extent(scissor), windowHeight);

    var pipelineViewportStateInfo = VkPipelineViewportStateCreateInfo.allocate(arena);
    VkPipelineViewportStateCreateInfo.sType(pipelineViewportStateInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO());
    VkPipelineViewportStateCreateInfo.viewportCount(pipelineViewportStateInfo, 1);
    VkPipelineViewportStateCreateInfo.pViewports(pipelineViewportStateInfo, pViewport);
    VkPipelineViewportStateCreateInfo.scissorCount(pipelineViewportStateInfo, 1);
    VkPipelineViewportStateCreateInfo.pScissors(pipelineViewportStateInfo, scissor);

    var pipelineRasterizationStateInfo = VkPipelineRasterizationStateCreateInfo.allocate(arena);
    VkPipelineRasterizationStateCreateInfo.sType(pipelineRasterizationStateInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO());
    VkPipelineRasterizationStateCreateInfo.depthClampEnable(pipelineRasterizationStateInfo, vulkan_h.VK_FALSE());
    VkPipelineRasterizationStateCreateInfo.rasterizerDiscardEnable(pipelineRasterizationStateInfo, vulkan_h.VK_FALSE());
    VkPipelineRasterizationStateCreateInfo.polygonMode(pipelineRasterizationStateInfo, vulkan_h.VK_POLYGON_MODE_FILL());
    VkPipelineRasterizationStateCreateInfo.lineWidth(pipelineRasterizationStateInfo, 1.0f);
    VkPipelineRasterizationStateCreateInfo.cullMode(pipelineRasterizationStateInfo, vulkan_h.VK_CULL_MODE_BACK_BIT());
    VkPipelineRasterizationStateCreateInfo.frontFace(pipelineRasterizationStateInfo, vulkan_h.VK_FRONT_FACE_CLOCKWISE());

    var pipelineMultisampleStateInfo = VkPipelineMultisampleStateCreateInfo.allocate(arena);
    VkPipelineMultisampleStateCreateInfo.sType(pipelineMultisampleStateInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO());
    VkPipelineMultisampleStateCreateInfo.sampleShadingEnable(pipelineMultisampleStateInfo, vulkan_h.VK_FALSE());
    VkPipelineMultisampleStateCreateInfo.rasterizationSamples(pipelineMultisampleStateInfo, vulkan_h.VK_SAMPLE_COUNT_1_BIT());
    VkPipelineMultisampleStateCreateInfo.minSampleShading(pipelineMultisampleStateInfo, 1.0f);
    VkPipelineMultisampleStateCreateInfo.pSampleMask(pipelineMultisampleStateInfo, MemorySegment.NULL);
    VkPipelineMultisampleStateCreateInfo.alphaToCoverageEnable(pipelineMultisampleStateInfo, vulkan_h.VK_FALSE());
    VkPipelineMultisampleStateCreateInfo.alphaToOneEnable(pipelineMultisampleStateInfo, vulkan_h.VK_FALSE());

    var pipelineColorBlendAttachmentState = VkPipelineColorBlendAttachmentState.allocate(arena);
    VkPipelineColorBlendAttachmentState.colorWriteMask(pipelineColorBlendAttachmentState, vulkan_h.VK_COLOR_COMPONENT_R_BIT() | vulkan_h.VK_COLOR_COMPONENT_G_BIT() | vulkan_h.VK_COLOR_COMPONENT_B_BIT() | vulkan_h.VK_COLOR_COMPONENT_A_BIT());
    VkPipelineColorBlendAttachmentState.blendEnable(pipelineColorBlendAttachmentState, vulkan_h.VK_FALSE());
    VkPipelineColorBlendAttachmentState.srcAlphaBlendFactor(pipelineColorBlendAttachmentState, vulkan_h.VK_BLEND_FACTOR_ONE());
    VkPipelineColorBlendAttachmentState.dstAlphaBlendFactor(pipelineColorBlendAttachmentState, vulkan_h.VK_BLEND_FACTOR_ZERO());
    VkPipelineColorBlendAttachmentState.colorBlendOp(pipelineColorBlendAttachmentState, vulkan_h.VK_BLEND_OP_ADD());
    VkPipelineColorBlendAttachmentState.srcAlphaBlendFactor(pipelineColorBlendAttachmentState, vulkan_h.VK_BLEND_FACTOR_ONE());
    VkPipelineColorBlendAttachmentState.dstAlphaBlendFactor(pipelineColorBlendAttachmentState, vulkan_h.VK_BLEND_FACTOR_ZERO());
    VkPipelineColorBlendAttachmentState.alphaBlendOp(pipelineColorBlendAttachmentState, vulkan_h.VK_BLEND_OP_ADD());

    var pipelineColorBlendStateInfo = VkPipelineColorBlendStateCreateInfo.allocate(arena);
    VkPipelineColorBlendStateCreateInfo.sType(pipelineColorBlendStateInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO());
    VkPipelineColorBlendStateCreateInfo.logicOpEnable(pipelineColorBlendStateInfo, vulkan_h.VK_FALSE());
    VkPipelineColorBlendStateCreateInfo.logicOp(pipelineColorBlendStateInfo, vulkan_h.VK_LOGIC_OP_COPY());
    VkPipelineColorBlendStateCreateInfo.attachmentCount(pipelineColorBlendStateInfo, 1);
    VkPipelineColorBlendStateCreateInfo.pAttachments(pipelineColorBlendStateInfo, pipelineColorBlendAttachmentState);

    var pipelineInputAssemblyStateInfo = VkPipelineInputAssemblyStateCreateInfo.allocate(arena);
    VkPipelineInputAssemblyStateCreateInfo.sType(pipelineInputAssemblyStateInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO());
    VkPipelineInputAssemblyStateCreateInfo.topology(pipelineInputAssemblyStateInfo, vulkan_h.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST());
    VkPipelineInputAssemblyStateCreateInfo.primitiveRestartEnable(pipelineInputAssemblyStateInfo, vulkan_h.VK_FALSE());

    var pipelineDepthStencilStateCreateInfo = VkPipelineDepthStencilStateCreateInfo.allocate(arena);
    VkPipelineDepthStencilStateCreateInfo.sType(pipelineDepthStencilStateCreateInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO());
    VkPipelineDepthStencilStateCreateInfo.depthTestEnable(pipelineDepthStencilStateCreateInfo, vulkan_h.VK_TRUE());
    VkPipelineDepthStencilStateCreateInfo.depthWriteEnable(pipelineDepthStencilStateCreateInfo, vulkan_h.VK_FALSE());
    VkPipelineDepthStencilStateCreateInfo.depthCompareOp(pipelineDepthStencilStateCreateInfo, vulkan_h.VK_COMPARE_OP_LESS());
    VkPipelineDepthStencilStateCreateInfo.depthBoundsTestEnable(pipelineDepthStencilStateCreateInfo, vulkan_h.VK_FALSE());
    VkPipelineDepthStencilStateCreateInfo.stencilTestEnable(pipelineDepthStencilStateCreateInfo, vulkan_h.VK_FALSE());

    var pipelineLayout = arena.allocate(C_POINTER);
    // Setup push constants.
    var pushConstantRange = VkPushConstantRange.allocate(arena);
    VkPushConstantRange.offset(pushConstantRange, 0);
    VkPushConstantRange.size(pushConstantRange, 64); // 4x4 matrix of floats = 16*4 = 64 bytes
    VkPushConstantRange.stageFlags(pushConstantRange, vulkan_h.VK_SHADER_STAGE_VERTEX_BIT());
    var pipelineLayoutCreateInfo = VkPipelineLayoutCreateInfo.allocate(arena);
    VkPipelineLayoutCreateInfo.sType(pipelineLayoutCreateInfo, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO());
    VkPipelineLayoutCreateInfo.setLayoutCount(pipelineLayoutCreateInfo, 1);
    VkPipelineLayoutCreateInfo.pSetLayouts(pipelineLayoutCreateInfo, descriptorSetLayout);
    VkPipelineLayoutCreateInfo.pPushConstantRanges(pipelineLayoutCreateInfo, pushConstantRange);
    VkPipelineLayoutCreateInfo.pushConstantRangeCount(pipelineLayoutCreateInfo, 1);

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
    VkPipelineShaderStageCreateInfo.module(stage0, vertShaderModule.get(C_POINTER, 0));
    VkPipelineShaderStageCreateInfo.pName(stage0, arena.allocateFrom("main", StandardCharsets.UTF_8));
    MemorySegment stage1 = stages.asSlice(VkPipelineShaderStageCreateInfo.sizeof());//stages.byteSize()/2
    VkPipelineShaderStageCreateInfo.sType(stage1, vulkan_h.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO());
    VkPipelineShaderStageCreateInfo.stage(stage1, vulkan_h.VK_SHADER_STAGE_FRAGMENT_BIT());
    VkPipelineShaderStageCreateInfo.module(stage1, fragShaderModule.get(C_POINTER, 0));
    VkPipelineShaderStageCreateInfo.pName(stage1, arena.allocateFrom("main", StandardCharsets.UTF_8));
    VkGraphicsPipelineCreateInfo.stageCount(pipelineCreateInfo, 2);
    VkGraphicsPipelineCreateInfo.pStages(pipelineCreateInfo, stages);
    VkGraphicsPipelineCreateInfo.pVertexInputState(pipelineCreateInfo, vertexInputStateInfo);
    VkGraphicsPipelineCreateInfo.pInputAssemblyState(pipelineCreateInfo, pipelineInputAssemblyStateInfo);
    VkGraphicsPipelineCreateInfo.pViewportState(pipelineCreateInfo, pipelineViewportStateInfo);
    VkGraphicsPipelineCreateInfo.pRasterizationState(pipelineCreateInfo, pipelineRasterizationStateInfo);
    VkGraphicsPipelineCreateInfo.pMultisampleState(pipelineCreateInfo, pipelineMultisampleStateInfo);
    VkGraphicsPipelineCreateInfo.pColorBlendState(pipelineCreateInfo, pipelineColorBlendStateInfo);
    VkGraphicsPipelineCreateInfo.pDynamicState(pipelineCreateInfo, MemorySegment.NULL);
    VkGraphicsPipelineCreateInfo.layout(pipelineCreateInfo, pipelineLayout.get(C_POINTER, 0));
    VkGraphicsPipelineCreateInfo.renderPass(pipelineCreateInfo, renderPass.get(C_POINTER, 0));
    VkGraphicsPipelineCreateInfo.subpass(pipelineCreateInfo, 0);
    VkGraphicsPipelineCreateInfo.basePipelineHandle(pipelineCreateInfo, vulkan_h.VK_NULL_HANDLE());
    VkGraphicsPipelineCreateInfo.basePipelineIndex(pipelineCreateInfo, -1);
    VkGraphicsPipelineCreateInfo.pDepthStencilState(pipelineCreateInfo, pipelineDepthStencilStateCreateInfo);
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

  // get a file from the resources folder
  // works everywhere, IDEA, unit test and JAR file.
  private InputStream getFileFromResourceAsStream(String fileName) {

    // The class loader that loaded the class
    ClassLoader classLoader = getClass().getClassLoader();
    InputStream inputStream = classLoader.getResourceAsStream(fileName);

    // the stream holding the file content
    if (inputStream == null) {
      throw new IllegalArgumentException("file not found! " + fileName);
    } else {
      return inputStream;
    }
  }


}