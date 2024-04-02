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
 * typedef void (*PFN_vkCmdEndVideoCodingKHR)(VkCommandBuffer, const VkVideoEndCodingInfoKHR *)
 * }
 */
public class PFN_vkCmdEndVideoCodingKHR {

    PFN_vkCmdEndVideoCodingKHR() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(MemorySegment commandBuffer, MemorySegment pEndCodingInfo);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        vulkan_h.C_POINTER,
        vulkan_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = vulkan_h.upcallHandle(PFN_vkCmdEndVideoCodingKHR.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFN_vkCmdEndVideoCodingKHR.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,MemorySegment commandBuffer, MemorySegment pEndCodingInfo) {
        try {
             DOWN$MH.invokeExact(funcPtr, commandBuffer, pEndCodingInfo);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

