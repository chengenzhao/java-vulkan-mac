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
 * struct VkAccelerationStructureMatrixMotionInstanceNV {
 *     VkTransformMatrixKHR transformT0;
 *     VkTransformMatrixKHR transformT1;
 *     uint32_t instanceCustomIndex : 24;
 *     uint32_t mask : 8;
 *     uint32_t instanceShaderBindingTableRecordOffset : 24;
 *     VkGeometryInstanceFlagsKHR flags : 8;
 *     uint64_t accelerationStructureReference;
 * }
 * }
 */
public class VkAccelerationStructureMatrixMotionInstanceNV {

    VkAccelerationStructureMatrixMotionInstanceNV() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        VkTransformMatrixKHR.layout().withName("transformT0"),
        VkTransformMatrixKHR.layout().withName("transformT1"),
        MemoryLayout.paddingLayout(8),
        vulkan_h.C_LONG_LONG.withName("accelerationStructureReference")
    ).withName("VkAccelerationStructureMatrixMotionInstanceNV");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout transformT0$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("transformT0"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkTransformMatrixKHR transformT0
     * }
     */
    public static final GroupLayout transformT0$layout() {
        return transformT0$LAYOUT;
    }

    private static final long transformT0$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkTransformMatrixKHR transformT0
     * }
     */
    public static final long transformT0$offset() {
        return transformT0$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkTransformMatrixKHR transformT0
     * }
     */
    public static MemorySegment transformT0(MemorySegment struct) {
        return struct.asSlice(transformT0$OFFSET, transformT0$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkTransformMatrixKHR transformT0
     * }
     */
    public static void transformT0(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, transformT0$OFFSET, transformT0$LAYOUT.byteSize());
    }

    private static final GroupLayout transformT1$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("transformT1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkTransformMatrixKHR transformT1
     * }
     */
    public static final GroupLayout transformT1$layout() {
        return transformT1$LAYOUT;
    }

    private static final long transformT1$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkTransformMatrixKHR transformT1
     * }
     */
    public static final long transformT1$offset() {
        return transformT1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkTransformMatrixKHR transformT1
     * }
     */
    public static MemorySegment transformT1(MemorySegment struct) {
        return struct.asSlice(transformT1$OFFSET, transformT1$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkTransformMatrixKHR transformT1
     * }
     */
    public static void transformT1(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, transformT1$OFFSET, transformT1$LAYOUT.byteSize());
    }

    private static final OfLong accelerationStructureReference$LAYOUT = (OfLong)$LAYOUT.select(groupElement("accelerationStructureReference"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t accelerationStructureReference
     * }
     */
    public static final OfLong accelerationStructureReference$layout() {
        return accelerationStructureReference$LAYOUT;
    }

    private static final long accelerationStructureReference$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t accelerationStructureReference
     * }
     */
    public static final long accelerationStructureReference$offset() {
        return accelerationStructureReference$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t accelerationStructureReference
     * }
     */
    public static long accelerationStructureReference(MemorySegment struct) {
        return struct.get(accelerationStructureReference$LAYOUT, accelerationStructureReference$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t accelerationStructureReference
     * }
     */
    public static void accelerationStructureReference(MemorySegment struct, long fieldValue) {
        struct.set(accelerationStructureReference$LAYOUT, accelerationStructureReference$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

