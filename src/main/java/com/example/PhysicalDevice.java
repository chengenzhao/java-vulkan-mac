package com.example;

import org.vulkan.*;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static com.example.VKResult.VK_SUCCESS;
import static org.vulkan.vulkan_h_5.C_INT;
import static org.vulkan.vulkan_h_5.C_POINTER;

public class PhysicalDevice {
  private final Arena arena;
  private final MemorySegment physicalDevice;
  private final MemorySegment physicalDeviceProperties;
  private final MemorySegment physicalDeviceFeatures;
  private final MemorySegment physicalDeviceMemoryProperties;
  private final int numQueueFamilies;
  private final MemorySegment physicalDeviceQueueFamilyProperties;
//  private final MemorySegment surface;
  private final List<QueueFamily> queueFamilies;
  private final List<Format> formatProperties;

  public PhysicalDevice(Arena arena, MemorySegment physicalDevice, MemorySegment physicalDeviceProperties,
                         MemorySegment physicalDeviceFeatures, MemorySegment physicalDeviceMemoryProperties,
                         int numQueueFamilies, MemorySegment physicalDeviceQueueFamilyProperties, //MemorySegment ppSurface,
                         List<Format> formatProperties) {
    Objects.requireNonNull(arena);
    Objects.requireNonNull(physicalDevice);
    Objects.requireNonNull(physicalDeviceProperties);
    Objects.requireNonNull(physicalDeviceFeatures);
    Objects.requireNonNull(physicalDeviceMemoryProperties);
    Objects.requireNonNull(physicalDeviceQueueFamilyProperties);
//    Objects.requireNonNull(ppSurface);
    System.out.println("numQueueFamilies: " + numQueueFamilies);
    this.arena = arena;
    this.physicalDevice = physicalDevice;
    this.physicalDeviceProperties = physicalDeviceProperties;
    this.physicalDeviceFeatures = physicalDeviceFeatures;
    this.physicalDeviceMemoryProperties = physicalDeviceMemoryProperties;
    this.numQueueFamilies = numQueueFamilies;
    this.physicalDeviceQueueFamilyProperties = physicalDeviceQueueFamilyProperties;
//    this.surface = ppSurface;
    this.formatProperties = formatProperties;
    if (numQueueFamilies > 0) {
      queueFamilies = new ArrayList<>();
    } else {
      queueFamilies = Collections.emptyList();
    }

    for (int i = 0; i < numQueueFamilies; i++) {
      System.out.println("queueFamilyIndex: " + i);
      MemorySegment queueFamily = physicalDeviceQueueFamilyProperties.asSlice(i * VkQueueFamilyProperties.sizeof(), VkQueueFamilyProperties.sizeof());
      int queueCount = VkQueueFamilyProperties.queueCount(queueFamily);
      System.out.println("queueCount: " + queueCount);
      int queueFlags = VkQueueFamilyProperties.queueFlags(queueFamily);

      System.out.println("queue flags: " + queueFlags);
      MemorySegment presentSupported = arena.allocate(C_INT);
      presentSupported.set(C_INT,0,-1);

//      //check the surface is supported
////      var result = VKResult.vkResult(vulkan_h.vkGetPhysicalDeviceSurfaceSupportKHR(physicalDevice, i, ppSurface.get(C_POINTER, 0), presentSupported));
//      var result = VK_SUCCESS;
//      if (result != VK_SUCCESS) {
//        System.out.println("vkGetPhysicalDeviceSurfaceSupportKHR failed: " + result);
//      } else {
//        System.out.println("vkGetPhysicalDeviceSurfaceSupportKHR succeeded!");
//      }

      queueFamilies.add(new QueueFamily(physicalDevice, queueFamily, i, queueCount,
        (queueFlags & vulkan_h.VK_QUEUE_GRAPHICS_BIT()) != 0,
        (queueFlags & vulkan_h.VK_QUEUE_COMPUTE_BIT()) != 0,
        (queueFlags & vulkan_h.VK_QUEUE_TRANSFER_BIT()) != 0,
        (queueFlags & vulkan_h.VK_QUEUE_SPARSE_BINDING_BIT()) != 0,
        false
        ));
    }
    queueFamilies.forEach(System.out::println);
  }

  public int findMemoryType(int typeFilter, int memoryPropertyFlags) {
    // System.out.println("findMemoryType: typeFilter = " + typeFilter + ", memoryPropertyFlags = " + memoryPropertyFlags);
    int memoryTypeCount = VkPhysicalDeviceMemoryProperties.memoryTypeCount(physicalDeviceMemoryProperties);
    // System.out.println("memoryTypeCount: " + memoryTypeCount);
    for (int i = 0; i < VkPhysicalDeviceMemoryProperties.memoryTypeCount(physicalDeviceMemoryProperties); i++) {
      MemorySegment memoryTypesArr = VkPhysicalDeviceMemoryProperties.memoryTypes(physicalDeviceMemoryProperties);
      if ((typeFilter & (1 << i)) != 0 && (memoryTypesArr.getAtIndex(C_INT, i) & memoryPropertyFlags) == memoryPropertyFlags) {
        System.out.println("Found memory type: " + i);
        return i;
      }
    }
    System.out.println("failed to find suitable memory type!");
    return -1;
  }

  public void printInfo() {
    System.out.println("apiVersion: " + VkPhysicalDeviceProperties.apiVersion(physicalDeviceProperties));
    System.out.println("driverVersion: " + VkPhysicalDeviceProperties.driverVersion(physicalDeviceProperties));
    System.out.println("vendorID: " + VkPhysicalDeviceProperties.vendorID(physicalDeviceProperties));
    System.out.println("deviceID: " + VkPhysicalDeviceProperties.deviceID(physicalDeviceProperties));
    System.out.println("deviceType: " + VkPhysicalDeviceProperties.deviceType(physicalDeviceProperties));
    System.out.println("deviceName: " + VkPhysicalDeviceProperties.deviceName(physicalDeviceProperties).getString(0, StandardCharsets.UTF_8));
    System.out.println("maxSamplerAnisotropy: " + VkPhysicalDeviceLimits.maxSamplerAnisotropy(VkPhysicalDeviceProperties.limits(physicalDeviceProperties)));
    System.out.println("robustBufferAccess: " + VkPhysicalDeviceFeatures.robustBufferAccess(physicalDeviceFeatures));
    System.out.println("memoryTypeCount: " + VkPhysicalDeviceMemoryProperties.memoryTypeCount(physicalDeviceMemoryProperties));
    System.out.println("memoryHeapCount: " + VkPhysicalDeviceMemoryProperties.memoryHeapCount(physicalDeviceMemoryProperties));
    System.out.println("numQueueFamilies: " + numQueueFamilies);
  }

  public int getDeviceType() {
    return VkPhysicalDeviceProperties.deviceType(physicalDeviceProperties);
  }

  public List<QueueFamily> getQueueFamilies() {
    return queueFamilies;
  }

  public List<Format> getFormatProperties() {
    return formatProperties;
  }
}
