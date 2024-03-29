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
 * struct VkAccelerationStructureBuildRangeInfoKHR {
 *     uint32_t primitiveCount;
 *     uint32_t primitiveOffset;
 *     uint32_t firstVertex;
 *     uint32_t transformOffset;
 * }
 * }
 */
public class VkAccelerationStructureBuildRangeInfoKHR {

    VkAccelerationStructureBuildRangeInfoKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("primitiveCount"),
        vulkan_h.C_INT.withName("primitiveOffset"),
        vulkan_h.C_INT.withName("firstVertex"),
        vulkan_h.C_INT.withName("transformOffset")
    ).withName("VkAccelerationStructureBuildRangeInfoKHR");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt primitiveCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("primitiveCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t primitiveCount
     * }
     */
    public static final OfInt primitiveCount$layout() {
        return primitiveCount$LAYOUT;
    }

    private static final long primitiveCount$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t primitiveCount
     * }
     */
    public static final long primitiveCount$offset() {
        return primitiveCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t primitiveCount
     * }
     */
    public static int primitiveCount(MemorySegment struct) {
        return struct.get(primitiveCount$LAYOUT, primitiveCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t primitiveCount
     * }
     */
    public static void primitiveCount(MemorySegment struct, int fieldValue) {
        struct.set(primitiveCount$LAYOUT, primitiveCount$OFFSET, fieldValue);
    }

    private static final OfInt primitiveOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("primitiveOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t primitiveOffset
     * }
     */
    public static final OfInt primitiveOffset$layout() {
        return primitiveOffset$LAYOUT;
    }

    private static final long primitiveOffset$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t primitiveOffset
     * }
     */
    public static final long primitiveOffset$offset() {
        return primitiveOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t primitiveOffset
     * }
     */
    public static int primitiveOffset(MemorySegment struct) {
        return struct.get(primitiveOffset$LAYOUT, primitiveOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t primitiveOffset
     * }
     */
    public static void primitiveOffset(MemorySegment struct, int fieldValue) {
        struct.set(primitiveOffset$LAYOUT, primitiveOffset$OFFSET, fieldValue);
    }

    private static final OfInt firstVertex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("firstVertex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t firstVertex
     * }
     */
    public static final OfInt firstVertex$layout() {
        return firstVertex$LAYOUT;
    }

    private static final long firstVertex$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t firstVertex
     * }
     */
    public static final long firstVertex$offset() {
        return firstVertex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t firstVertex
     * }
     */
    public static int firstVertex(MemorySegment struct) {
        return struct.get(firstVertex$LAYOUT, firstVertex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t firstVertex
     * }
     */
    public static void firstVertex(MemorySegment struct, int fieldValue) {
        struct.set(firstVertex$LAYOUT, firstVertex$OFFSET, fieldValue);
    }

    private static final OfInt transformOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("transformOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t transformOffset
     * }
     */
    public static final OfInt transformOffset$layout() {
        return transformOffset$LAYOUT;
    }

    private static final long transformOffset$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t transformOffset
     * }
     */
    public static final long transformOffset$offset() {
        return transformOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t transformOffset
     * }
     */
    public static int transformOffset(MemorySegment struct) {
        return struct.get(transformOffset$LAYOUT, transformOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t transformOffset
     * }
     */
    public static void transformOffset(MemorySegment struct, int fieldValue) {
        struct.set(transformOffset$LAYOUT, transformOffset$OFFSET, fieldValue);
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

