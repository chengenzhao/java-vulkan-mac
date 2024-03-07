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
 * struct VkBufferImageCopy2 {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkDeviceSize bufferOffset;
 *     uint32_t bufferRowLength;
 *     uint32_t bufferImageHeight;
 *     VkImageSubresourceLayers imageSubresource;
 *     VkOffset3D imageOffset;
 *     VkExtent3D imageExtent;
 * }
 * }
 */
public class VkBufferImageCopy2 {

    VkBufferImageCopy2() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_LONG_LONG.withName("bufferOffset"),
        vulkan_h.C_INT.withName("bufferRowLength"),
        vulkan_h.C_INT.withName("bufferImageHeight"),
        VkImageSubresourceLayers.layout().withName("imageSubresource"),
        VkOffset3D.layout().withName("imageOffset"),
        VkExtent3D.layout().withName("imageExtent")
    ).withName("VkBufferImageCopy2");

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

    private static final OfLong bufferOffset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("bufferOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize bufferOffset
     * }
     */
    public static final OfLong bufferOffset$layout() {
        return bufferOffset$LAYOUT;
    }

    private static final long bufferOffset$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize bufferOffset
     * }
     */
    public static final long bufferOffset$offset() {
        return bufferOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize bufferOffset
     * }
     */
    public static long bufferOffset(MemorySegment struct) {
        return struct.get(bufferOffset$LAYOUT, bufferOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize bufferOffset
     * }
     */
    public static void bufferOffset(MemorySegment struct, long fieldValue) {
        struct.set(bufferOffset$LAYOUT, bufferOffset$OFFSET, fieldValue);
    }

    private static final OfInt bufferRowLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bufferRowLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t bufferRowLength
     * }
     */
    public static final OfInt bufferRowLength$layout() {
        return bufferRowLength$LAYOUT;
    }

    private static final long bufferRowLength$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t bufferRowLength
     * }
     */
    public static final long bufferRowLength$offset() {
        return bufferRowLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t bufferRowLength
     * }
     */
    public static int bufferRowLength(MemorySegment struct) {
        return struct.get(bufferRowLength$LAYOUT, bufferRowLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t bufferRowLength
     * }
     */
    public static void bufferRowLength(MemorySegment struct, int fieldValue) {
        struct.set(bufferRowLength$LAYOUT, bufferRowLength$OFFSET, fieldValue);
    }

    private static final OfInt bufferImageHeight$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bufferImageHeight"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t bufferImageHeight
     * }
     */
    public static final OfInt bufferImageHeight$layout() {
        return bufferImageHeight$LAYOUT;
    }

    private static final long bufferImageHeight$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t bufferImageHeight
     * }
     */
    public static final long bufferImageHeight$offset() {
        return bufferImageHeight$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t bufferImageHeight
     * }
     */
    public static int bufferImageHeight(MemorySegment struct) {
        return struct.get(bufferImageHeight$LAYOUT, bufferImageHeight$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t bufferImageHeight
     * }
     */
    public static void bufferImageHeight(MemorySegment struct, int fieldValue) {
        struct.set(bufferImageHeight$LAYOUT, bufferImageHeight$OFFSET, fieldValue);
    }

    private static final GroupLayout imageSubresource$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("imageSubresource"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkImageSubresourceLayers imageSubresource
     * }
     */
    public static final GroupLayout imageSubresource$layout() {
        return imageSubresource$LAYOUT;
    }

    private static final long imageSubresource$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkImageSubresourceLayers imageSubresource
     * }
     */
    public static final long imageSubresource$offset() {
        return imageSubresource$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkImageSubresourceLayers imageSubresource
     * }
     */
    public static MemorySegment imageSubresource(MemorySegment struct) {
        return struct.asSlice(imageSubresource$OFFSET, imageSubresource$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkImageSubresourceLayers imageSubresource
     * }
     */
    public static void imageSubresource(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, imageSubresource$OFFSET, imageSubresource$LAYOUT.byteSize());
    }

    private static final GroupLayout imageOffset$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("imageOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkOffset3D imageOffset
     * }
     */
    public static final GroupLayout imageOffset$layout() {
        return imageOffset$LAYOUT;
    }

    private static final long imageOffset$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkOffset3D imageOffset
     * }
     */
    public static final long imageOffset$offset() {
        return imageOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkOffset3D imageOffset
     * }
     */
    public static MemorySegment imageOffset(MemorySegment struct) {
        return struct.asSlice(imageOffset$OFFSET, imageOffset$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkOffset3D imageOffset
     * }
     */
    public static void imageOffset(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, imageOffset$OFFSET, imageOffset$LAYOUT.byteSize());
    }

    private static final GroupLayout imageExtent$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("imageExtent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkExtent3D imageExtent
     * }
     */
    public static final GroupLayout imageExtent$layout() {
        return imageExtent$LAYOUT;
    }

    private static final long imageExtent$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkExtent3D imageExtent
     * }
     */
    public static final long imageExtent$offset() {
        return imageExtent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkExtent3D imageExtent
     * }
     */
    public static MemorySegment imageExtent(MemorySegment struct) {
        return struct.asSlice(imageExtent$OFFSET, imageExtent$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkExtent3D imageExtent
     * }
     */
    public static void imageExtent(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, imageExtent$OFFSET, imageExtent$LAYOUT.byteSize());
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

