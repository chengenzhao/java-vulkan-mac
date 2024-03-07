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
 * struct VkVideoEncodeInfoKHR {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkVideoEncodeFlagsKHR flags;
 *     VkBuffer dstBuffer;
 *     VkDeviceSize dstBufferOffset;
 *     VkDeviceSize dstBufferRange;
 *     VkVideoPictureResourceInfoKHR srcPictureResource;
 *     const VkVideoReferenceSlotInfoKHR *pSetupReferenceSlot;
 *     uint32_t referenceSlotCount;
 *     const VkVideoReferenceSlotInfoKHR *pReferenceSlots;
 *     uint32_t precedingExternallyEncodedBytes;
 * }
 * }
 */
public class VkVideoEncodeInfoKHR {

    VkVideoEncodeInfoKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("flags"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("dstBuffer"),
        vulkan_h.C_LONG_LONG.withName("dstBufferOffset"),
        vulkan_h.C_LONG_LONG.withName("dstBufferRange"),
        VkVideoPictureResourceInfoKHR.layout().withName("srcPictureResource"),
        vulkan_h.C_POINTER.withName("pSetupReferenceSlot"),
        vulkan_h.C_INT.withName("referenceSlotCount"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pReferenceSlots"),
        vulkan_h.C_INT.withName("precedingExternallyEncodedBytes"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkVideoEncodeInfoKHR");

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

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkVideoEncodeFlagsKHR flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkVideoEncodeFlagsKHR flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkVideoEncodeFlagsKHR flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkVideoEncodeFlagsKHR flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
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

    private static final OfLong dstBufferOffset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("dstBufferOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize dstBufferOffset
     * }
     */
    public static final OfLong dstBufferOffset$layout() {
        return dstBufferOffset$LAYOUT;
    }

    private static final long dstBufferOffset$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize dstBufferOffset
     * }
     */
    public static final long dstBufferOffset$offset() {
        return dstBufferOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize dstBufferOffset
     * }
     */
    public static long dstBufferOffset(MemorySegment struct) {
        return struct.get(dstBufferOffset$LAYOUT, dstBufferOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize dstBufferOffset
     * }
     */
    public static void dstBufferOffset(MemorySegment struct, long fieldValue) {
        struct.set(dstBufferOffset$LAYOUT, dstBufferOffset$OFFSET, fieldValue);
    }

    private static final OfLong dstBufferRange$LAYOUT = (OfLong)$LAYOUT.select(groupElement("dstBufferRange"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize dstBufferRange
     * }
     */
    public static final OfLong dstBufferRange$layout() {
        return dstBufferRange$LAYOUT;
    }

    private static final long dstBufferRange$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize dstBufferRange
     * }
     */
    public static final long dstBufferRange$offset() {
        return dstBufferRange$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize dstBufferRange
     * }
     */
    public static long dstBufferRange(MemorySegment struct) {
        return struct.get(dstBufferRange$LAYOUT, dstBufferRange$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize dstBufferRange
     * }
     */
    public static void dstBufferRange(MemorySegment struct, long fieldValue) {
        struct.set(dstBufferRange$LAYOUT, dstBufferRange$OFFSET, fieldValue);
    }

    private static final GroupLayout srcPictureResource$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("srcPictureResource"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkVideoPictureResourceInfoKHR srcPictureResource
     * }
     */
    public static final GroupLayout srcPictureResource$layout() {
        return srcPictureResource$LAYOUT;
    }

    private static final long srcPictureResource$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkVideoPictureResourceInfoKHR srcPictureResource
     * }
     */
    public static final long srcPictureResource$offset() {
        return srcPictureResource$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkVideoPictureResourceInfoKHR srcPictureResource
     * }
     */
    public static MemorySegment srcPictureResource(MemorySegment struct) {
        return struct.asSlice(srcPictureResource$OFFSET, srcPictureResource$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkVideoPictureResourceInfoKHR srcPictureResource
     * }
     */
    public static void srcPictureResource(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, srcPictureResource$OFFSET, srcPictureResource$LAYOUT.byteSize());
    }

    private static final AddressLayout pSetupReferenceSlot$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pSetupReferenceSlot"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkVideoReferenceSlotInfoKHR *pSetupReferenceSlot
     * }
     */
    public static final AddressLayout pSetupReferenceSlot$layout() {
        return pSetupReferenceSlot$LAYOUT;
    }

    private static final long pSetupReferenceSlot$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkVideoReferenceSlotInfoKHR *pSetupReferenceSlot
     * }
     */
    public static final long pSetupReferenceSlot$offset() {
        return pSetupReferenceSlot$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkVideoReferenceSlotInfoKHR *pSetupReferenceSlot
     * }
     */
    public static MemorySegment pSetupReferenceSlot(MemorySegment struct) {
        return struct.get(pSetupReferenceSlot$LAYOUT, pSetupReferenceSlot$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkVideoReferenceSlotInfoKHR *pSetupReferenceSlot
     * }
     */
    public static void pSetupReferenceSlot(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pSetupReferenceSlot$LAYOUT, pSetupReferenceSlot$OFFSET, fieldValue);
    }

    private static final OfInt referenceSlotCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("referenceSlotCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t referenceSlotCount
     * }
     */
    public static final OfInt referenceSlotCount$layout() {
        return referenceSlotCount$LAYOUT;
    }

    private static final long referenceSlotCount$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t referenceSlotCount
     * }
     */
    public static final long referenceSlotCount$offset() {
        return referenceSlotCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t referenceSlotCount
     * }
     */
    public static int referenceSlotCount(MemorySegment struct) {
        return struct.get(referenceSlotCount$LAYOUT, referenceSlotCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t referenceSlotCount
     * }
     */
    public static void referenceSlotCount(MemorySegment struct, int fieldValue) {
        struct.set(referenceSlotCount$LAYOUT, referenceSlotCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pReferenceSlots$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pReferenceSlots"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkVideoReferenceSlotInfoKHR *pReferenceSlots
     * }
     */
    public static final AddressLayout pReferenceSlots$layout() {
        return pReferenceSlots$LAYOUT;
    }

    private static final long pReferenceSlots$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkVideoReferenceSlotInfoKHR *pReferenceSlots
     * }
     */
    public static final long pReferenceSlots$offset() {
        return pReferenceSlots$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkVideoReferenceSlotInfoKHR *pReferenceSlots
     * }
     */
    public static MemorySegment pReferenceSlots(MemorySegment struct) {
        return struct.get(pReferenceSlots$LAYOUT, pReferenceSlots$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkVideoReferenceSlotInfoKHR *pReferenceSlots
     * }
     */
    public static void pReferenceSlots(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pReferenceSlots$LAYOUT, pReferenceSlots$OFFSET, fieldValue);
    }

    private static final OfInt precedingExternallyEncodedBytes$LAYOUT = (OfInt)$LAYOUT.select(groupElement("precedingExternallyEncodedBytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t precedingExternallyEncodedBytes
     * }
     */
    public static final OfInt precedingExternallyEncodedBytes$layout() {
        return precedingExternallyEncodedBytes$LAYOUT;
    }

    private static final long precedingExternallyEncodedBytes$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t precedingExternallyEncodedBytes
     * }
     */
    public static final long precedingExternallyEncodedBytes$offset() {
        return precedingExternallyEncodedBytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t precedingExternallyEncodedBytes
     * }
     */
    public static int precedingExternallyEncodedBytes(MemorySegment struct) {
        return struct.get(precedingExternallyEncodedBytes$LAYOUT, precedingExternallyEncodedBytes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t precedingExternallyEncodedBytes
     * }
     */
    public static void precedingExternallyEncodedBytes(MemorySegment struct, int fieldValue) {
        struct.set(precedingExternallyEncodedBytes$LAYOUT, precedingExternallyEncodedBytes$OFFSET, fieldValue);
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

