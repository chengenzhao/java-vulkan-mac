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
 * typedef VkResult (*PFN_vkWriteAccelerationStructuresPropertiesKHR)(VkDevice, uint32_t, const VkAccelerationStructureKHR *, VkQueryType, size_t, void *, size_t)
 * }
 */
public class PFN_vkWriteAccelerationStructuresPropertiesKHR {

    PFN_vkWriteAccelerationStructuresPropertiesKHR() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment device, int accelerationStructureCount, MemorySegment pAccelerationStructures, int queryType, long dataSize, MemorySegment pData, long stride);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        vulkan_h.C_INT,
        vulkan_h.C_POINTER,
        vulkan_h.C_INT,
        vulkan_h.C_POINTER,
        vulkan_h.C_INT,
        vulkan_h.C_LONG,
        vulkan_h.C_POINTER,
        vulkan_h.C_LONG
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = vulkan_h.upcallHandle(PFN_vkWriteAccelerationStructuresPropertiesKHR.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFN_vkWriteAccelerationStructuresPropertiesKHR.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment device, int accelerationStructureCount, MemorySegment pAccelerationStructures, int queryType, long dataSize, MemorySegment pData, long stride) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, device, accelerationStructureCount, pAccelerationStructures, queryType, dataSize, pData, stride);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

