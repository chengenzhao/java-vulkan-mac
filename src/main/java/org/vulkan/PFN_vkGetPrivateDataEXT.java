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
 * typedef void (*PFN_vkGetPrivateDataEXT)(VkDevice, VkObjectType, uint64_t, VkPrivateDataSlot, uint64_t *)
 * }
 */
public class PFN_vkGetPrivateDataEXT {

    PFN_vkGetPrivateDataEXT() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(MemorySegment device, int objectType, long objectHandle, MemorySegment privateDataSlot, MemorySegment pData);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        vulkan_h.C_POINTER,
        vulkan_h.C_INT,
        vulkan_h.C_LONG_LONG,
        vulkan_h.C_POINTER,
        vulkan_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = vulkan_h.upcallHandle(Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,MemorySegment device, int objectType, long objectHandle, MemorySegment privateDataSlot, MemorySegment pData) {
        try {
             DOWN$MH.invokeExact(funcPtr, device, objectType, objectHandle, privateDataSlot, pData);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

