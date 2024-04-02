// Generated by jextract

package org.vulkan;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * typedef VkResult (*PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT)(VkPhysicalDevice, VkSurfaceKHR, VkSurfaceCapabilities2EXT *)
 * }
 */
public class PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT {

    PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment physicalDevice, MemorySegment surface, MemorySegment pSurfaceCapabilities);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        vulkan_h.C_INT,
        vulkan_h.C_POINTER,
        vulkan_h.C_POINTER,
        vulkan_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = vulkan_h.upcallHandle(PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFN_vkGetPhysicalDeviceSurfaceCapabilities2EXT.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment physicalDevice, MemorySegment surface, MemorySegment pSurfaceCapabilities) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, physicalDevice, surface, pSurfaceCapabilities);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

