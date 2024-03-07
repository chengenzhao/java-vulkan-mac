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
 * struct VkVideoEncodeH264SessionParametersAddInfoKHR {
 *     VkStructureType sType;
 *     const void *pNext;
 *     uint32_t stdSPSCount;
 *     const StdVideoH264SequenceParameterSet *pStdSPSs;
 *     uint32_t stdPPSCount;
 *     const StdVideoH264PictureParameterSet *pStdPPSs;
 * }
 * }
 */
public class VkVideoEncodeH264SessionParametersAddInfoKHR {

    VkVideoEncodeH264SessionParametersAddInfoKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("stdSPSCount"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pStdSPSs"),
        vulkan_h.C_INT.withName("stdPPSCount"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pStdPPSs")
    ).withName("VkVideoEncodeH264SessionParametersAddInfoKHR");

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

    private static final OfInt stdSPSCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("stdSPSCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t stdSPSCount
     * }
     */
    public static final OfInt stdSPSCount$layout() {
        return stdSPSCount$LAYOUT;
    }

    private static final long stdSPSCount$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t stdSPSCount
     * }
     */
    public static final long stdSPSCount$offset() {
        return stdSPSCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t stdSPSCount
     * }
     */
    public static int stdSPSCount(MemorySegment struct) {
        return struct.get(stdSPSCount$LAYOUT, stdSPSCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t stdSPSCount
     * }
     */
    public static void stdSPSCount(MemorySegment struct, int fieldValue) {
        struct.set(stdSPSCount$LAYOUT, stdSPSCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pStdSPSs$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pStdSPSs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const StdVideoH264SequenceParameterSet *pStdSPSs
     * }
     */
    public static final AddressLayout pStdSPSs$layout() {
        return pStdSPSs$LAYOUT;
    }

    private static final long pStdSPSs$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const StdVideoH264SequenceParameterSet *pStdSPSs
     * }
     */
    public static final long pStdSPSs$offset() {
        return pStdSPSs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const StdVideoH264SequenceParameterSet *pStdSPSs
     * }
     */
    public static MemorySegment pStdSPSs(MemorySegment struct) {
        return struct.get(pStdSPSs$LAYOUT, pStdSPSs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const StdVideoH264SequenceParameterSet *pStdSPSs
     * }
     */
    public static void pStdSPSs(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pStdSPSs$LAYOUT, pStdSPSs$OFFSET, fieldValue);
    }

    private static final OfInt stdPPSCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("stdPPSCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t stdPPSCount
     * }
     */
    public static final OfInt stdPPSCount$layout() {
        return stdPPSCount$LAYOUT;
    }

    private static final long stdPPSCount$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t stdPPSCount
     * }
     */
    public static final long stdPPSCount$offset() {
        return stdPPSCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t stdPPSCount
     * }
     */
    public static int stdPPSCount(MemorySegment struct) {
        return struct.get(stdPPSCount$LAYOUT, stdPPSCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t stdPPSCount
     * }
     */
    public static void stdPPSCount(MemorySegment struct, int fieldValue) {
        struct.set(stdPPSCount$LAYOUT, stdPPSCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pStdPPSs$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pStdPPSs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const StdVideoH264PictureParameterSet *pStdPPSs
     * }
     */
    public static final AddressLayout pStdPPSs$layout() {
        return pStdPPSs$LAYOUT;
    }

    private static final long pStdPPSs$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const StdVideoH264PictureParameterSet *pStdPPSs
     * }
     */
    public static final long pStdPPSs$offset() {
        return pStdPPSs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const StdVideoH264PictureParameterSet *pStdPPSs
     * }
     */
    public static MemorySegment pStdPPSs(MemorySegment struct) {
        return struct.get(pStdPPSs$LAYOUT, pStdPPSs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const StdVideoH264PictureParameterSet *pStdPPSs
     * }
     */
    public static void pStdPPSs(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pStdPPSs$LAYOUT, pStdPPSs$OFFSET, fieldValue);
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

