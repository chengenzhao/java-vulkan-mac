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

import java.io.File;
import java.lang.foreign.*;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

import static com.example.VKResult.*;
import static org.vulkan.vulkan_h.*;

public class HelloApplication extends Application {

  private static final boolean DEBUG = false;

  public static final int SCREEN_WIDTH = (int) (Screen.getPrimary().getBounds().getWidth() * 3 / 4);
  public static final int SCREEN_HEIGHT = (int) (Screen.getPrimary().getBounds().getHeight() * 3 / 4);
  public static Arena ARENA;

  @Override
  public void start(Stage stage) {
    var bufferSize = SCREEN_WIDTH * SCREEN_HEIGHT * 4;

    WritableImage writableImage;

    var memorySegment = ARENA.allocate(bufferSize);
    PixelBuffer<ByteBuffer> pixelBuffer = new PixelBuffer<>(SCREEN_WIDTH, SCREEN_HEIGHT,
      memorySegment.asByteBuffer(), PixelFormat.getByteBgraPreInstance());
    writableImage = new WritableImage(pixelBuffer);

    Scene scene = new Scene(new Group(new ImageView(writableImage)), SCREEN_WIDTH, SCREEN_HEIGHT);
    stage.setTitle("Hello!");
    stage.setScene(scene);
    stage.show();

    new AnimationTimer() {
      @Override
      public void handle(long now) {
        for (int i = 0; i < memorySegment.byteSize() / 4; i++) {
          memorySegment.setAtIndex(ValueLayout.JAVA_BYTE, i * 4L, (byte) 0x00);//blue
          memorySegment.setAtIndex(ValueLayout.JAVA_BYTE, i * 4L + 1, (byte) 0x00);//green
          memorySegment.setAtIndex(ValueLayout.JAVA_BYTE, i * 4L + 2, (byte) 0xff);//red
          memorySegment.setAtIndex(ValueLayout.JAVA_BYTE, i * 4L + 3, (byte) 0xff);//alpha
        }
      }
    }.start();
  }

  public static void main(String[] args) {
    String javaHome = System.getProperty("java.home");
    File f = new File(javaHome);
    System.out.println("Java Home:" + new File(javaHome));

    System.loadLibrary("osx");
    System.loadLibrary("vulkan.1");
//    System.loadLibrary("MoltenVK");

    try (Arena arena = Arena.ofShared()) {
      ARENA = arena;

      var pVkInstance = createVkInstance(arena);
      var vkInstance = pVkInstance.get(C_POINTER, 0);
//      launch();
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

    var enabledExtensionArray = DEBUG ? new MemorySegment[]{
      vulkan_h.VK_KHR_SURFACE_EXTENSION_NAME(),
      vulkan_h.VK_KHR_PORTABILITY_ENUMERATION_EXTENSION_NAME(),
      vulkan_h.VK_MVK_MACOS_SURFACE_EXTENSION_NAME(),
//      vulkan_h.VK_LUNARG_DIRECT_DRIVER_LOADING_EXTENSION_NAME(),
      vulkan_h.VK_EXT_DEBUG_UTILS_EXTENSION_NAME()}
      : new MemorySegment[]{
      vulkan_h.VK_KHR_SURFACE_EXTENSION_NAME(),
      vulkan_h.VK_KHR_PORTABILITY_ENUMERATION_EXTENSION_NAME(),
//      vulkan_h.VK_LUNARG_DIRECT_DRIVER_LOADING_EXTENSION_NAME(),
      vulkan_h.VK_MVK_MACOS_SURFACE_EXTENSION_NAME()};

    VkInstanceCreateInfo.enabledExtensionCount(instanceCreateInfo, enabledExtensionArray.length);
    VkInstanceCreateInfo.ppEnabledExtensionNames(instanceCreateInfo, allocatePtrArray(enabledExtensionArray, arena));

    //todo how to get the pfnGetInstanceProcAddr???
//    var directLoadingInfo = VkDirectDriverLoadingInfoLUNARG.allocate(arena);
//    VkDirectDriverLoadingInfoLUNARG.sType(directLoadingInfo, vulkan_h.VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_INFO_LUNARG());
//    VkDirectDriverLoadingInfoLUNARG.pfnGetInstanceProcAddr(directLoadingInfo, Linker.nativeLinker().defaultLookup().find("vkGetInstanceProcAddr").orElseThrow());
//
//    var directDriverList = VkDirectDriverLoadingListLUNARG.allocate(arena);
//    VkDirectDriverLoadingListLUNARG.sType(directDriverList, vulkan_h.VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_LIST_LUNARG());
//    VkDirectDriverLoadingListLUNARG.mode(directDriverList, vulkan_h.VK_DIRECT_DRIVER_LOADING_MODE_INCLUSIVE_LUNARG());
//    VkDirectDriverLoadingListLUNARG.driverCount(directDriverList, 1);
//    VkDirectDriverLoadingListLUNARG.pDrivers(directDriverList, directLoadingInfo);
//
//    VkInstanceCreateInfo.pNext(instanceCreateInfo, directDriverList);

    if (DEBUG) {
      var pEnabledLayerNames = allocatePtrArray(new MemorySegment[]{
        arena.allocateFrom("VK_LAYER_KHRONOS_validation", StandardCharsets.UTF_8)}, arena);
      VkInstanceCreateInfo.enabledLayerCount(instanceCreateInfo, 1);
      VkInstanceCreateInfo.ppEnabledLayerNames(instanceCreateInfo, pEnabledLayerNames);
    }

    // VKInstance is an opaque pointer defined by VK_DEFINE_HANDLE macro.
    var pVkInstance = arena.allocate(C_POINTER);

    var result = VkResult(vulkan_h.vkCreateInstance(instanceCreateInfo, MemorySegment.NULL, pVkInstance));
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
}