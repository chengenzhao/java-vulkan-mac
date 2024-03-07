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
 * struct VkCopyBufferInfo2 {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkBuffer srcBuffer;
 *     VkBuffer dstBuffer;
 *     uint32_t regionCount;
 *     const VkBufferCopy2 *pRegions;
 * }
 * }
 */
public class VkCopyBufferInfo2 {

    VkCopyBufferInfo2() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_POINTER.withName("srcBuffer"),
        vulkan_h.C_POINTER.withName("dstBuffer"),
        vulkan_h.C_INT.withName("regionCount"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pRegions")
    ).withName("VkCopyBufferInfo2");

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

    private static final AddressLayout srcBuffer$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("srcBuffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBuffer srcBuffer
     * }
     */
    public static final AddressLayout srcBuffer$layout() {
        return srcBuffer$LAYOUT;
    }

    private static final long srcBuffer$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBuffer srcBuffer
     * }
     */
    public static final long srcBuffer$offset() {
        return srcBuffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBuffer srcBuffer
     * }
     */
    public static MemorySegment srcBuffer(MemorySegment struct) {
        return struct.get(srcBuffer$LAYOUT, srcBuffer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBuffer srcBuffer
     * }
     */
    public static void srcBuffer(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(srcBuffer$LAYOUT, srcBuffer$OFFSET, fieldValue);
    }

    private static final AddressLayout dstBuffer$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("dstBuffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBuffer dstBuffer
     * }
     */
    public static final AddressLayout dstBuffer$layout() {
        return dstBuffer$LAYOUT;
    }

    private static final long dstBuffer$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBuffer dstBuffer
     * }
     */
    public static final long dstBuffer$offset() {
        return dstBuffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBuffer dstBuffer
     * }
     */
    public static MemorySegment dstBuffer(MemorySegment struct) {
        return struct.get(dstBuffer$LAYOUT, dstBuffer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBuffer dstBuffer
     * }
     */
    public static void dstBuffer(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(dstBuffer$LAYOUT, dstBuffer$OFFSET, fieldValue);
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

    private static final long regionCount$OFFSET = 32;

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
     * const VkBufferCopy2 *pRegions
     * }
     */
    public static final AddressLayout pRegions$layout() {
        return pRegions$LAYOUT;
    }

    private static final long pRegions$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkBufferCopy2 *pRegions
     * }
     */
    public static final long pRegions$offset() {
        return pRegions$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkBufferCopy2 *pRegions
     * }
     */
    public static MemorySegment pRegions(MemorySegment struct) {
        return struct.get(pRegions$LAYOUT, pRegions$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkBufferCopy2 *pRegions
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

