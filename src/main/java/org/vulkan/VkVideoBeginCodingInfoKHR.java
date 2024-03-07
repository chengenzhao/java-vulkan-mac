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
 * struct VkVideoBeginCodingInfoKHR {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkVideoBeginCodingFlagsKHR flags;
 *     VkVideoSessionKHR videoSession;
 *     VkVideoSessionParametersKHR videoSessionParameters;
 *     uint32_t referenceSlotCount;
 *     const VkVideoReferenceSlotInfoKHR *pReferenceSlots;
 * }
 * }
 */
public class VkVideoBeginCodingInfoKHR {

    VkVideoBeginCodingInfoKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("flags"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("videoSession"),
        vulkan_h.C_POINTER.withName("videoSessionParameters"),
        vulkan_h.C_INT.withName("referenceSlotCount"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pReferenceSlots")
    ).withName("VkVideoBeginCodingInfoKHR");

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
     * VkVideoBeginCodingFlagsKHR flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkVideoBeginCodingFlagsKHR flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkVideoBeginCodingFlagsKHR flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkVideoBeginCodingFlagsKHR flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final AddressLayout videoSession$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("videoSession"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkVideoSessionKHR videoSession
     * }
     */
    public static final AddressLayout videoSession$layout() {
        return videoSession$LAYOUT;
    }

    private static final long videoSession$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkVideoSessionKHR videoSession
     * }
     */
    public static final long videoSession$offset() {
        return videoSession$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkVideoSessionKHR videoSession
     * }
     */
    public static MemorySegment videoSession(MemorySegment struct) {
        return struct.get(videoSession$LAYOUT, videoSession$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkVideoSessionKHR videoSession
     * }
     */
    public static void videoSession(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(videoSession$LAYOUT, videoSession$OFFSET, fieldValue);
    }

    private static final AddressLayout videoSessionParameters$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("videoSessionParameters"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkVideoSessionParametersKHR videoSessionParameters
     * }
     */
    public static final AddressLayout videoSessionParameters$layout() {
        return videoSessionParameters$LAYOUT;
    }

    private static final long videoSessionParameters$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkVideoSessionParametersKHR videoSessionParameters
     * }
     */
    public static final long videoSessionParameters$offset() {
        return videoSessionParameters$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkVideoSessionParametersKHR videoSessionParameters
     * }
     */
    public static MemorySegment videoSessionParameters(MemorySegment struct) {
        return struct.get(videoSessionParameters$LAYOUT, videoSessionParameters$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkVideoSessionParametersKHR videoSessionParameters
     * }
     */
    public static void videoSessionParameters(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(videoSessionParameters$LAYOUT, videoSessionParameters$OFFSET, fieldValue);
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

    private static final long referenceSlotCount$OFFSET = 40;

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

    private static final long pReferenceSlots$OFFSET = 48;

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

