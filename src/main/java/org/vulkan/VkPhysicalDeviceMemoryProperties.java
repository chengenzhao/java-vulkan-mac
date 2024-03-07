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
 * struct VkPhysicalDeviceMemoryProperties {
 *     uint32_t memoryTypeCount;
 *     VkMemoryType memoryTypes[32];
 *     uint32_t memoryHeapCount;
 *     VkMemoryHeap memoryHeaps[16];
 * }
 * }
 */
public class VkPhysicalDeviceMemoryProperties {

    VkPhysicalDeviceMemoryProperties() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("memoryTypeCount"),
        MemoryLayout.sequenceLayout(32, VkMemoryType.layout()).withName("memoryTypes"),
        vulkan_h.C_INT.withName("memoryHeapCount"),
        MemoryLayout.sequenceLayout(16, VkMemoryHeap.layout()).withName("memoryHeaps")
    ).withName("VkPhysicalDeviceMemoryProperties");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt memoryTypeCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("memoryTypeCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t memoryTypeCount
     * }
     */
    public static final OfInt memoryTypeCount$layout() {
        return memoryTypeCount$LAYOUT;
    }

    private static final long memoryTypeCount$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t memoryTypeCount
     * }
     */
    public static final long memoryTypeCount$offset() {
        return memoryTypeCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t memoryTypeCount
     * }
     */
    public static int memoryTypeCount(MemorySegment struct) {
        return struct.get(memoryTypeCount$LAYOUT, memoryTypeCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t memoryTypeCount
     * }
     */
    public static void memoryTypeCount(MemorySegment struct, int fieldValue) {
        struct.set(memoryTypeCount$LAYOUT, memoryTypeCount$OFFSET, fieldValue);
    }

    private static final SequenceLayout memoryTypes$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("memoryTypes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkMemoryType memoryTypes[32]
     * }
     */
    public static final SequenceLayout memoryTypes$layout() {
        return memoryTypes$LAYOUT;
    }

    private static final long memoryTypes$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkMemoryType memoryTypes[32]
     * }
     */
    public static final long memoryTypes$offset() {
        return memoryTypes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkMemoryType memoryTypes[32]
     * }
     */
    public static MemorySegment memoryTypes(MemorySegment struct) {
        return struct.asSlice(memoryTypes$OFFSET, memoryTypes$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkMemoryType memoryTypes[32]
     * }
     */
    public static void memoryTypes(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, memoryTypes$OFFSET, memoryTypes$LAYOUT.byteSize());
    }

    private static long[] memoryTypes$DIMS = { 32 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * VkMemoryType memoryTypes[32]
     * }
     */
    public static long[] memoryTypes$dimensions() {
        return memoryTypes$DIMS;
    }
    private static final MethodHandle memoryTypes$ELEM_HANDLE = memoryTypes$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * VkMemoryType memoryTypes[32]
     * }
     */
    public static MemorySegment memoryTypes(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)memoryTypes$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * VkMemoryType memoryTypes[32]
     * }
     */
    public static void memoryTypes(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, memoryTypes(struct, index0), 0L, VkMemoryType.layout().byteSize());
    }

    private static final OfInt memoryHeapCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("memoryHeapCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t memoryHeapCount
     * }
     */
    public static final OfInt memoryHeapCount$layout() {
        return memoryHeapCount$LAYOUT;
    }

    private static final long memoryHeapCount$OFFSET = 260;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t memoryHeapCount
     * }
     */
    public static final long memoryHeapCount$offset() {
        return memoryHeapCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t memoryHeapCount
     * }
     */
    public static int memoryHeapCount(MemorySegment struct) {
        return struct.get(memoryHeapCount$LAYOUT, memoryHeapCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t memoryHeapCount
     * }
     */
    public static void memoryHeapCount(MemorySegment struct, int fieldValue) {
        struct.set(memoryHeapCount$LAYOUT, memoryHeapCount$OFFSET, fieldValue);
    }

    private static final SequenceLayout memoryHeaps$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("memoryHeaps"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkMemoryHeap memoryHeaps[16]
     * }
     */
    public static final SequenceLayout memoryHeaps$layout() {
        return memoryHeaps$LAYOUT;
    }

    private static final long memoryHeaps$OFFSET = 264;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkMemoryHeap memoryHeaps[16]
     * }
     */
    public static final long memoryHeaps$offset() {
        return memoryHeaps$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkMemoryHeap memoryHeaps[16]
     * }
     */
    public static MemorySegment memoryHeaps(MemorySegment struct) {
        return struct.asSlice(memoryHeaps$OFFSET, memoryHeaps$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkMemoryHeap memoryHeaps[16]
     * }
     */
    public static void memoryHeaps(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, memoryHeaps$OFFSET, memoryHeaps$LAYOUT.byteSize());
    }

    private static long[] memoryHeaps$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * VkMemoryHeap memoryHeaps[16]
     * }
     */
    public static long[] memoryHeaps$dimensions() {
        return memoryHeaps$DIMS;
    }
    private static final MethodHandle memoryHeaps$ELEM_HANDLE = memoryHeaps$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * VkMemoryHeap memoryHeaps[16]
     * }
     */
    public static MemorySegment memoryHeaps(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)memoryHeaps$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * VkMemoryHeap memoryHeaps[16]
     * }
     */
    public static void memoryHeaps(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, memoryHeaps(struct, index0), 0L, VkMemoryHeap.layout().byteSize());
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

