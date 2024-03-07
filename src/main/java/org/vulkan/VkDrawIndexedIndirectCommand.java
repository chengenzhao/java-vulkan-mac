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
 * struct VkDrawIndexedIndirectCommand {
 *     uint32_t indexCount;
 *     uint32_t instanceCount;
 *     uint32_t firstIndex;
 *     int32_t vertexOffset;
 *     uint32_t firstInstance;
 * }
 * }
 */
public class VkDrawIndexedIndirectCommand {

    VkDrawIndexedIndirectCommand() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("indexCount"),
        vulkan_h.C_INT.withName("instanceCount"),
        vulkan_h.C_INT.withName("firstIndex"),
        vulkan_h.C_INT.withName("vertexOffset"),
        vulkan_h.C_INT.withName("firstInstance")
    ).withName("VkDrawIndexedIndirectCommand");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt indexCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("indexCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t indexCount
     * }
     */
    public static final OfInt indexCount$layout() {
        return indexCount$LAYOUT;
    }

    private static final long indexCount$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t indexCount
     * }
     */
    public static final long indexCount$offset() {
        return indexCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t indexCount
     * }
     */
    public static int indexCount(MemorySegment struct) {
        return struct.get(indexCount$LAYOUT, indexCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t indexCount
     * }
     */
    public static void indexCount(MemorySegment struct, int fieldValue) {
        struct.set(indexCount$LAYOUT, indexCount$OFFSET, fieldValue);
    }

    private static final OfInt instanceCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("instanceCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t instanceCount
     * }
     */
    public static final OfInt instanceCount$layout() {
        return instanceCount$LAYOUT;
    }

    private static final long instanceCount$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t instanceCount
     * }
     */
    public static final long instanceCount$offset() {
        return instanceCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t instanceCount
     * }
     */
    public static int instanceCount(MemorySegment struct) {
        return struct.get(instanceCount$LAYOUT, instanceCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t instanceCount
     * }
     */
    public static void instanceCount(MemorySegment struct, int fieldValue) {
        struct.set(instanceCount$LAYOUT, instanceCount$OFFSET, fieldValue);
    }

    private static final OfInt firstIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("firstIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t firstIndex
     * }
     */
    public static final OfInt firstIndex$layout() {
        return firstIndex$LAYOUT;
    }

    private static final long firstIndex$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t firstIndex
     * }
     */
    public static final long firstIndex$offset() {
        return firstIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t firstIndex
     * }
     */
    public static int firstIndex(MemorySegment struct) {
        return struct.get(firstIndex$LAYOUT, firstIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t firstIndex
     * }
     */
    public static void firstIndex(MemorySegment struct, int fieldValue) {
        struct.set(firstIndex$LAYOUT, firstIndex$OFFSET, fieldValue);
    }

    private static final OfInt vertexOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("vertexOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32_t vertexOffset
     * }
     */
    public static final OfInt vertexOffset$layout() {
        return vertexOffset$LAYOUT;
    }

    private static final long vertexOffset$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32_t vertexOffset
     * }
     */
    public static final long vertexOffset$offset() {
        return vertexOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32_t vertexOffset
     * }
     */
    public static int vertexOffset(MemorySegment struct) {
        return struct.get(vertexOffset$LAYOUT, vertexOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32_t vertexOffset
     * }
     */
    public static void vertexOffset(MemorySegment struct, int fieldValue) {
        struct.set(vertexOffset$LAYOUT, vertexOffset$OFFSET, fieldValue);
    }

    private static final OfInt firstInstance$LAYOUT = (OfInt)$LAYOUT.select(groupElement("firstInstance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t firstInstance
     * }
     */
    public static final OfInt firstInstance$layout() {
        return firstInstance$LAYOUT;
    }

    private static final long firstInstance$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t firstInstance
     * }
     */
    public static final long firstInstance$offset() {
        return firstInstance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t firstInstance
     * }
     */
    public static int firstInstance(MemorySegment struct) {
        return struct.get(firstInstance$LAYOUT, firstInstance$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t firstInstance
     * }
     */
    public static void firstInstance(MemorySegment struct, int fieldValue) {
        struct.set(firstInstance$LAYOUT, firstInstance$OFFSET, fieldValue);
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

