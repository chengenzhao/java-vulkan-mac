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
 * struct VkExportMetalCommandQueueInfoEXT {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkQueue queue;
 *     MTLCommandQueue_id mtlCommandQueue;
 * }
 * }
 */
public class VkExportMetalCommandQueueInfoEXT {

    VkExportMetalCommandQueueInfoEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_POINTER.withName("queue"),
        vulkan_h.C_POINTER.withName("mtlCommandQueue")
    ).withName("VkExportMetalCommandQueueInfoEXT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt sType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkStructureType sType
     * }
     */
    public static final OfInt sType$layout() {
        return sType$LAYOUT;
    }

    private static final long sType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkStructureType sType
     * }
     */
    public static final long sType$offset() {
        return sType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkStructureType sType
     * }
     */
    public static int sType(MemorySegment struct) {
        return struct.get(sType$LAYOUT, sType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkStructureType sType
     * }
     */
    public static void sType(MemorySegment struct, int fieldValue) {
        struct.set(sType$LAYOUT, sType$OFFSET, fieldValue);
    }

    private static final AddressLayout pNext$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pNext"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const void *pNext
     * }
     */
    public static final AddressLayout pNext$layout() {
        return pNext$LAYOUT;
    }

    private static final long pNext$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const void *pNext
     * }
     */
    public static final long pNext$offset() {
        return pNext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const void *pNext
     * }
     */
    public static MemorySegment pNext(MemorySegment struct) {
        return struct.get(pNext$LAYOUT, pNext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const void *pNext
     * }
     */
    public static void pNext(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pNext$LAYOUT, pNext$OFFSET, fieldValue);
    }

    private static final AddressLayout queue$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("queue"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkQueue queue
     * }
     */
    public static final AddressLayout queue$layout() {
        return queue$LAYOUT;
    }

    private static final long queue$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkQueue queue
     * }
     */
    public static final long queue$offset() {
        return queue$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkQueue queue
     * }
     */
    public static MemorySegment queue(MemorySegment struct) {
        return struct.get(queue$LAYOUT, queue$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkQueue queue
     * }
     */
    public static void queue(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(queue$LAYOUT, queue$OFFSET, fieldValue);
    }

    private static final AddressLayout mtlCommandQueue$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("mtlCommandQueue"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * MTLCommandQueue_id mtlCommandQueue
     * }
     */
    public static final AddressLayout mtlCommandQueue$layout() {
        return mtlCommandQueue$LAYOUT;
    }

    private static final long mtlCommandQueue$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * MTLCommandQueue_id mtlCommandQueue
     * }
     */
    public static final long mtlCommandQueue$offset() {
        return mtlCommandQueue$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * MTLCommandQueue_id mtlCommandQueue
     * }
     */
    public static MemorySegment mtlCommandQueue(MemorySegment struct) {
        return struct.get(mtlCommandQueue$LAYOUT, mtlCommandQueue$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * MTLCommandQueue_id mtlCommandQueue
     * }
     */
    public static void mtlCommandQueue(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(mtlCommandQueue$LAYOUT, mtlCommandQueue$OFFSET, fieldValue);
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

