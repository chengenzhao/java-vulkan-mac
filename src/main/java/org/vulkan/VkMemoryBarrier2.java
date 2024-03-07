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
 * struct VkMemoryBarrier2 {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkPipelineStageFlags2 srcStageMask;
 *     VkAccessFlags2 srcAccessMask;
 *     VkPipelineStageFlags2 dstStageMask;
 *     VkAccessFlags2 dstAccessMask;
 * }
 * }
 */
public class VkMemoryBarrier2 {

    VkMemoryBarrier2() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_LONG_LONG.withName("srcStageMask"),
        vulkan_h.C_LONG_LONG.withName("srcAccessMask"),
        vulkan_h.C_LONG_LONG.withName("dstStageMask"),
        vulkan_h.C_LONG_LONG.withName("dstAccessMask")
    ).withName("VkMemoryBarrier2");

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

    private static final OfLong srcStageMask$LAYOUT = (OfLong)$LAYOUT.select(groupElement("srcStageMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPipelineStageFlags2 srcStageMask
     * }
     */
    public static final OfLong srcStageMask$layout() {
        return srcStageMask$LAYOUT;
    }

    private static final long srcStageMask$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPipelineStageFlags2 srcStageMask
     * }
     */
    public static final long srcStageMask$offset() {
        return srcStageMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPipelineStageFlags2 srcStageMask
     * }
     */
    public static long srcStageMask(MemorySegment struct) {
        return struct.get(srcStageMask$LAYOUT, srcStageMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPipelineStageFlags2 srcStageMask
     * }
     */
    public static void srcStageMask(MemorySegment struct, long fieldValue) {
        struct.set(srcStageMask$LAYOUT, srcStageMask$OFFSET, fieldValue);
    }

    private static final OfLong srcAccessMask$LAYOUT = (OfLong)$LAYOUT.select(groupElement("srcAccessMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkAccessFlags2 srcAccessMask
     * }
     */
    public static final OfLong srcAccessMask$layout() {
        return srcAccessMask$LAYOUT;
    }

    private static final long srcAccessMask$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkAccessFlags2 srcAccessMask
     * }
     */
    public static final long srcAccessMask$offset() {
        return srcAccessMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkAccessFlags2 srcAccessMask
     * }
     */
    public static long srcAccessMask(MemorySegment struct) {
        return struct.get(srcAccessMask$LAYOUT, srcAccessMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkAccessFlags2 srcAccessMask
     * }
     */
    public static void srcAccessMask(MemorySegment struct, long fieldValue) {
        struct.set(srcAccessMask$LAYOUT, srcAccessMask$OFFSET, fieldValue);
    }

    private static final OfLong dstStageMask$LAYOUT = (OfLong)$LAYOUT.select(groupElement("dstStageMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPipelineStageFlags2 dstStageMask
     * }
     */
    public static final OfLong dstStageMask$layout() {
        return dstStageMask$LAYOUT;
    }

    private static final long dstStageMask$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPipelineStageFlags2 dstStageMask
     * }
     */
    public static final long dstStageMask$offset() {
        return dstStageMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPipelineStageFlags2 dstStageMask
     * }
     */
    public static long dstStageMask(MemorySegment struct) {
        return struct.get(dstStageMask$LAYOUT, dstStageMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPipelineStageFlags2 dstStageMask
     * }
     */
    public static void dstStageMask(MemorySegment struct, long fieldValue) {
        struct.set(dstStageMask$LAYOUT, dstStageMask$OFFSET, fieldValue);
    }

    private static final OfLong dstAccessMask$LAYOUT = (OfLong)$LAYOUT.select(groupElement("dstAccessMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkAccessFlags2 dstAccessMask
     * }
     */
    public static final OfLong dstAccessMask$layout() {
        return dstAccessMask$LAYOUT;
    }

    private static final long dstAccessMask$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkAccessFlags2 dstAccessMask
     * }
     */
    public static final long dstAccessMask$offset() {
        return dstAccessMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkAccessFlags2 dstAccessMask
     * }
     */
    public static long dstAccessMask(MemorySegment struct) {
        return struct.get(dstAccessMask$LAYOUT, dstAccessMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkAccessFlags2 dstAccessMask
     * }
     */
    public static void dstAccessMask(MemorySegment struct, long fieldValue) {
        struct.set(dstAccessMask$LAYOUT, dstAccessMask$OFFSET, fieldValue);
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

