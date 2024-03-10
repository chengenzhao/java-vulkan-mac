package com.example;

import org.vulkan.VkDebugUtilsMessengerCallbackDataEXT;
import org.vulkan.vulkan_h;

import java.lang.foreign.*;
import java.nio.charset.StandardCharsets;
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

    var message = "DEBUG MESSAGE:\n\n";
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
    message += "Message type(s): " + String.join(", ",messageTypesStr) + "\n";
    message += "Severity: " + severity + "\n";
    message += "Structure Type: " + VkStructureType.vkStructureType(VkDebugUtilsMessengerCallbackDataEXT.sType(pCallbackData)) + "\n";
    message += "Message ID name: " + VkDebugUtilsMessengerCallbackDataEXT.pMessageIdName(pCallbackData).getString(0, StandardCharsets.UTF_8) + "\n";
    message += "Message ID number: " + VkDebugUtilsMessengerCallbackDataEXT.messageIdNumber(pCallbackData) + "\n";
    message += "Message: " + VkDebugUtilsMessengerCallbackDataEXT.pMessage(pCallbackData).getString(0, StandardCharsets.UTF_8) + "\n";
    System.out.println(message + "\n");
    // System.out.println("Queue label count: " + VkDebugUtilsMessengerCallbackDataEXT.queueLabelCount$get(callbackData));
    return vulkan_h.VK_FALSE();
  }
}
