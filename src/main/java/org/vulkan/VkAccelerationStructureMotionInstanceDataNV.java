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
 * union VkAccelerationStructureMotionInstanceDataNV {
 *     VkAccelerationStructureInstanceKHR staticInstance;
 *     VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance;
 *     VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance;
 * }
 * }
 */
public class VkAccelerationStructureMotionInstanceDataNV {

    VkAccelerationStructureMotionInstanceDataNV() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
        VkAccelerationStructureInstanceKHR.layout().withName("staticInstance"),
        VkAccelerationStructureMatrixMotionInstanceNV.layout().withName("matrixMotionInstance"),
        VkAccelerationStructureSRTMotionInstanceNV.layout().withName("srtMotionInstance")
    ).withName("VkAccelerationStructureMotionInstanceDataNV");

    /**
     * The layout of this union
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout staticInstance$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("staticInstance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkAccelerationStructureInstanceKHR staticInstance
     * }
     */
    public static final GroupLayout staticInstance$layout() {
        return staticInstance$LAYOUT;
    }

    private static final long staticInstance$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkAccelerationStructureInstanceKHR staticInstance
     * }
     */
    public static final long staticInstance$offset() {
        return staticInstance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkAccelerationStructureInstanceKHR staticInstance
     * }
     */
    public static MemorySegment staticInstance(MemorySegment union) {
        return union.asSlice(staticInstance$OFFSET, staticInstance$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkAccelerationStructureInstanceKHR staticInstance
     * }
     */
    public static void staticInstance(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, union, staticInstance$OFFSET, staticInstance$LAYOUT.byteSize());
    }

    private static final GroupLayout matrixMotionInstance$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("matrixMotionInstance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance
     * }
     */
    public static final GroupLayout matrixMotionInstance$layout() {
        return matrixMotionInstance$LAYOUT;
    }

    private static final long matrixMotionInstance$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance
     * }
     */
    public static final long matrixMotionInstance$offset() {
        return matrixMotionInstance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance
     * }
     */
    public static MemorySegment matrixMotionInstance(MemorySegment union) {
        return union.asSlice(matrixMotionInstance$OFFSET, matrixMotionInstance$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance
     * }
     */
    public static void matrixMotionInstance(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, union, matrixMotionInstance$OFFSET, matrixMotionInstance$LAYOUT.byteSize());
    }

    private static final GroupLayout srtMotionInstance$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("srtMotionInstance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance
     * }
     */
    public static final GroupLayout srtMotionInstance$layout() {
        return srtMotionInstance$LAYOUT;
    }

    private static final long srtMotionInstance$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance
     * }
     */
    public static final long srtMotionInstance$offset() {
        return srtMotionInstance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance
     * }
     */
    public static MemorySegment srtMotionInstance(MemorySegment union) {
        return union.asSlice(srtMotionInstance$OFFSET, srtMotionInstance$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance
     * }
     */
    public static void srtMotionInstance(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, union, srtMotionInstance$OFFSET, srtMotionInstance$LAYOUT.byteSize());
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this union
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

