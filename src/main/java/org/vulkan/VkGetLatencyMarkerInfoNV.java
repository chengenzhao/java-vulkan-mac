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
 * struct VkGetLatencyMarkerInfoNV {
 *     VkStructureType sType;
 *     const void *pNext;
 *     uint32_t timingCount;
 *     VkLatencyTimingsFrameReportNV *pTimings;
 * }
 * }
 */
public class VkGetLatencyMarkerInfoNV {

    VkGetLatencyMarkerInfoNV() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("timingCount"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pTimings")
    ).withName("VkGetLatencyMarkerInfoNV");

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

    private static final OfInt timingCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("timingCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t timingCount
     * }
     */
    public static final OfInt timingCount$layout() {
        return timingCount$LAYOUT;
    }

    private static final long timingCount$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t timingCount
     * }
     */
    public static final long timingCount$offset() {
        return timingCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t timingCount
     * }
     */
    public static int timingCount(MemorySegment struct) {
        return struct.get(timingCount$LAYOUT, timingCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t timingCount
     * }
     */
    public static void timingCount(MemorySegment struct, int fieldValue) {
        struct.set(timingCount$LAYOUT, timingCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pTimings$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pTimings"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkLatencyTimingsFrameReportNV *pTimings
     * }
     */
    public static final AddressLayout pTimings$layout() {
        return pTimings$LAYOUT;
    }

    private static final long pTimings$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkLatencyTimingsFrameReportNV *pTimings
     * }
     */
    public static final long pTimings$offset() {
        return pTimings$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkLatencyTimingsFrameReportNV *pTimings
     * }
     */
    public static MemorySegment pTimings(MemorySegment struct) {
        return struct.get(pTimings$LAYOUT, pTimings$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkLatencyTimingsFrameReportNV *pTimings
     * }
     */
    public static void pTimings(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pTimings$LAYOUT, pTimings$OFFSET, fieldValue);
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

