package com.example;

import org.vulkan.VkDebugUtilsMessengerCallbackDataEXT;
import org.vulkan.vulkan_h;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.util.ArrayList;
import java.util.List;

import static org.vulkan.vulkan_h_5.C_INT;
import static org.vulkan.vulkan_h_5.C_POINTER;

public class VulkanDebug {
  public static final FunctionDescriptor DebugCallback$FUNC = FunctionDescriptor.of(C_INT, C_INT, C_INT, C_POINTER, C_POINTER);

  public static int debugCallbackFunc(int messageSeverity, int messageTypes, MemorySegment pCallbackData, MemorySegment pUserData) {
    VkDebugUtilsMessageSeverityFlagBitsEXT severity = VkDebugUtilsMessageSeverityFlagBitsEXT.vkDebugUtilsMessageSeverityFlagBitsEXT(messageSeverity);
    if (messageSeverity < vulkan_h.VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT()) {
      return vulkan_h.VK_FALSE();
    }
    StringBuilder messageBuilder = new StringBuilder();
    List<String> messageTypesStr = new ArrayList<>();
    if ((messageTypes & vulkan_h.VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT()) != 0) {
      messageTypesStr.add("GENERAL");
    }
    if ((messageTypes & vulkan_h.VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT()) != 0) {
      messageTypesStr.add("VALIDATION");
    }
    if ((messageTypes & vulkan_h.VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT()) != 0) {
      messageTypesStr.add("PERFORMANCE");
    }
    messageBuilder.append("DEBUG MESSAGE:\n\n");
    messageBuilder.append("Message type(s): ").append(String.join(", ", messageTypesStr)).append("\n");
//    MemorySegment callbackData = VkDebugUtilsMessengerCallbackDataEXT.ofAddress(pCallbackData, SegmentScope.global());
    VkStructureType structureType = VkStructureType.vkStructureType(VkDebugUtilsMessengerCallbackDataEXT.sType(pCallbackData));
    messageBuilder.append("Severity: ").append(severity).append("\n");
    messageBuilder.append("Structure Type: ").append(structureType).append("\n");
    messageBuilder.append("Message ID name: ").append(VkDebugUtilsMessengerCallbackDataEXT.pMessageIdName(pCallbackData)).append("\n");
    messageBuilder.append("Message ID number: ").append(VkDebugUtilsMessengerCallbackDataEXT.messageIdNumber(pCallbackData)).append("\n");
    messageBuilder.append("Message: ").append(VkDebugUtilsMessengerCallbackDataEXT.pMessage(pCallbackData)).append("\n");
    System.out.println(messageBuilder + "\n");
    // System.out.println("Queue label count: " + VkDebugUtilsMessengerCallbackDataEXT.queueLabelCount$get(callbackData));
    return vulkan_h.VK_FALSE();
  }
}
