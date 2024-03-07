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
 * struct VkResolveImageInfo2 {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkImage srcImage;
 *     VkImageLayout srcImageLayout;
 *     VkImage dstImage;
 *     VkImageLayout dstImageLayout;
 *     uint32_t regionCount;
 *     const VkImageResolve2 *pRegions;
 * }
 * }
 */
public class VkResolveImageInfo2 {

    VkResolveImageInfo2() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_POINTER.withName("srcImage"),
        vulkan_h.C_INT.withName("srcImageLayout"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("dstImage"),
        vulkan_h.C_INT.withName("dstImageLayout"),
        vulkan_h.C_INT.withName("regionCount"),
        vulkan_h.C_POINTER.withName("pRegions")
    ).withName("VkResolveImageInfo2");

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

    private static final AddressLayout srcImage$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("srcImage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkImage srcImage
     * }
     */
    public static final AddressLayout srcImage$layout() {
        return srcImage$LAYOUT;
    }

    private static final long srcImage$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkImage srcImage
     * }
     */
    public static final long srcImage$offset() {
        return srcImage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkImage srcImage
     * }
     */
    public static MemorySegment srcImage(MemorySegment struct) {
        return struct.get(srcImage$LAYOUT, srcImage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkImage srcImage
     * }
     */
    public static void srcImage(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(srcImage$LAYOUT, srcImage$OFFSET, fieldValue);
    }

    private static final OfInt srcImageLayout$LAYOUT = (OfInt)$LAYOUT.select(groupElement("srcImageLayout"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkImageLayout srcImageLayout
     * }
     */
    public static final OfInt srcImageLayout$layout() {
        return srcImageLayout$LAYOUT;
    }

    private static final long srcImageLayout$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkImageLayout srcImageLayout
     * }
     */
    public static final long srcImageLayout$offset() {
        return srcImageLayout$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkImageLayout srcImageLayout
     * }
     */
    public static int srcImageLayout(MemorySegment struct) {
        return struct.get(srcImageLayout$LAYOUT, srcImageLayout$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkImageLayout srcImageLayout
     * }
     */
    public static void srcImageLayout(MemorySegment struct, int fieldValue) {
        struct.set(srcImageLayout$LAYOUT, srcImageLayout$OFFSET, fieldValue);
    }

    private static final AddressLayout dstImage$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("dstImage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkImage dstImage
     * }
     */
    public static final AddressLayout dstImage$layout() {
        return dstImage$LAYOUT;
    }

    private static final long dstImage$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkImage dstImage
     * }
     */
    public static final long dstImage$offset() {
        return dstImage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkImage dstImage
     * }
     */
    public static MemorySegment dstImage(MemorySegment struct) {
        return struct.get(dstImage$LAYOUT, dstImage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkImage dstImage
     * }
     */
    public static void dstImage(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(dstImage$LAYOUT, dstImage$OFFSET, fieldValue);
    }

    private static final OfInt dstImageLayout$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dstImageLayout"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkImageLayout dstImageLayout
     * }
     */
    public static final OfInt dstImageLayout$layout() {
        return dstImageLayout$LAYOUT;
    }

    private static final long dstImageLayout$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkImageLayout dstImageLayout
     * }
     */
    public static final long dstImageLayout$offset() {
        return dstImageLayout$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkImageLayout dstImageLayout
     * }
     */
    public static int dstImageLayout(MemorySegment struct) {
        return struct.get(dstImageLayout$LAYOUT, dstImageLayout$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkImageLayout dstImageLayout
     * }
     */
    public static void dstImageLayout(MemorySegment struct, int fieldValue) {
        struct.set(dstImageLayout$LAYOUT, dstImageLayout$OFFSET, fieldValue);
    }

    private static final OfInt regionCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("regionCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t regionCount
     * }
     */
    public static final OfInt regionCount$layout() {
        return regionCount$LAYOUT;
    }

    private static final long regionCount$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t regionCount
     * }
     */
    public static final long regionCount$offset() {
        return regionCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t regionCount
     * }
     */
    public static int regionCount(MemorySegment struct) {
        return struct.get(regionCount$LAYOUT, regionCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t regionCount
     * }
     */
    public static void regionCount(MemorySegment struct, int fieldValue) {
        struct.set(regionCount$LAYOUT, regionCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pRegions$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pRegions"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkImageResolve2 *pRegions
     * }
     */
    public static final AddressLayout pRegions$layout() {
        return pRegions$LAYOUT;
    }

    private static final long pRegions$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkImageResolve2 *pRegions
     * }
     */
    public static final long pRegions$offset() {
        return pRegions$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkImageResolve2 *pRegions
     * }
     */
    public static MemorySegment pRegions(MemorySegment struct) {
        return struct.get(pRegions$LAYOUT, pRegions$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkImageResolve2 *pRegions
     * }
     */
    public static void pRegions(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pRegions$LAYOUT, pRegions$OFFSET, fieldValue);
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

