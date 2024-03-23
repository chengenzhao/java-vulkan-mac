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

    var imagePair = createImage(arena, physicalDevice, device, SCREEN_WIDTH, SCREEN_HEIGHT, vulkan_h.VK_FORMAT_R8G8B8A8_SRGB(),
      vulkan_h.VK_IMAGE_TILING_OPTIMAL(),
      vulkan_h.VK_IMAGE_USAGE_SAMPLED_BIT() | vulkan_h.VK_IMAGE_USAGE_TRANSFER_DST_BIT() | vulkan_h.VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT(),
      vulkan_h.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT());
    var imageview = createImageView(arena, device, vulkan_h.VK_FORMAT_R8G8B8A8_SRGB(), vulkan_h.VK_IMAGE_ASPECT_COLOR_BIT(), imagePair.image());

    //4.
    var renderPass = createRenderPass(arena, device);

    //5. command pool
    var commondPool = createCommandPool(arena, graphicsQueueFamily, device);

    var pVkGraphicsQueue = arena.allocate(C_POINTER);
    vulkan_h.vkGetDeviceQueue(device, graphicsQueueFamily.queueFamilyIndex(), 0, pVkGraphicsQueue);

    var commandBuffer = createCommandBuffers(arena, device, commondPool, 1);

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

    //7. pipeline
    var pipelineLayoutPair = createGraphicsPipeline(arena, SCREEN_WIDTH, SCREEN_HEIGHT, device, renderPass);

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
        switch (vkResult(result)) {
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
}