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
 * typedef VkResult (*PFN_vkBindOpticalFlowSessionImageNV)(VkDevice, VkOpticalFlowSessionNV, VkOpticalFlowSessionBindingPointNV, VkImageView, VkImageLayout)
 * }
 */
public class PFN_vkBindOpticalFlowSessionImageNV {

    PFN_vkBindOpticalFlowSessionImageNV() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment device, MemorySegment session, int bindingPoint, MemorySegment view, int layout);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        vulkan_h.C_INT,
        vulkan_h.C_POINTER,
        vulkan_h.C_POINTER,
        vulkan_h.C_INT,
        vulkan_h.C_POINTER,
        vulkan_h.C_INT
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = vulkan_h.upcallHandle(PFN_vkBindOpticalFlowSessionImageNV.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFN_vkBindOpticalFlowSessionImageNV.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment device, MemorySegment session, int bindingPoint, MemorySegment view, int layout) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, device, session, bindingPoint, view, layout);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

