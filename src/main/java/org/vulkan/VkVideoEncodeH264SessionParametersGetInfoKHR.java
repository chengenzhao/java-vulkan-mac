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
 * struct VkVideoEncodeH264SessionParametersGetInfoKHR {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkBool32 writeStdSPS;
 *     VkBool32 writeStdPPS;
 *     uint32_t stdSPSId;
 *     uint32_t stdPPSId;
 * }
 * }
 */
public class VkVideoEncodeH264SessionParametersGetInfoKHR {

    VkVideoEncodeH264SessionParametersGetInfoKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("writeStdSPS"),
        vulkan_h.C_INT.withName("writeStdPPS"),
        vulkan_h.C_INT.withName("stdSPSId"),
        vulkan_h.C_INT.withName("stdPPSId")
    ).withName("VkVideoEncodeH264SessionParametersGetInfoKHR");

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

    private static final OfInt writeStdSPS$LAYOUT = (OfInt)$LAYOUT.select(groupElement("writeStdSPS"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 writeStdSPS
     * }
     */
    public static final OfInt writeStdSPS$layout() {
        return writeStdSPS$LAYOUT;
    }

    private static final long writeStdSPS$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 writeStdSPS
     * }
     */
    public static final long writeStdSPS$offset() {
        return writeStdSPS$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 writeStdSPS
     * }
     */
    public static int writeStdSPS(MemorySegment struct) {
        return struct.get(writeStdSPS$LAYOUT, writeStdSPS$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 writeStdSPS
     * }
     */
    public static void writeStdSPS(MemorySegment struct, int fieldValue) {
        struct.set(writeStdSPS$LAYOUT, writeStdSPS$OFFSET, fieldValue);
    }

    private static final OfInt writeStdPPS$LAYOUT = (OfInt)$LAYOUT.select(groupElement("writeStdPPS"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 writeStdPPS
     * }
     */
    public static final OfInt writeStdPPS$layout() {
        return writeStdPPS$LAYOUT;
    }

    private static final long writeStdPPS$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 writeStdPPS
     * }
     */
    public static final long writeStdPPS$offset() {
        return writeStdPPS$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 writeStdPPS
     * }
     */
    public static int writeStdPPS(MemorySegment struct) {
        return struct.get(writeStdPPS$LAYOUT, writeStdPPS$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 writeStdPPS
     * }
     */
    public static void writeStdPPS(MemorySegment struct, int fieldValue) {
        struct.set(writeStdPPS$LAYOUT, writeStdPPS$OFFSET, fieldValue);
    }

    private static final OfInt stdSPSId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("stdSPSId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t stdSPSId
     * }
     */
    public static final OfInt stdSPSId$layout() {
        return stdSPSId$LAYOUT;
    }

    private static final long stdSPSId$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t stdSPSId
     * }
     */
    public static final long stdSPSId$offset() {
        return stdSPSId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t stdSPSId
     * }
     */
    public static int stdSPSId(MemorySegment struct) {
        return struct.get(stdSPSId$LAYOUT, stdSPSId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t stdSPSId
     * }
     */
    public static void stdSPSId(MemorySegment struct, int fieldValue) {
        struct.set(stdSPSId$LAYOUT, stdSPSId$OFFSET, fieldValue);
    }

    private static final OfInt stdPPSId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("stdPPSId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t stdPPSId
     * }
     */
    public static final OfInt stdPPSId$layout() {
        return stdPPSId$LAYOUT;
    }

    private static final long stdPPSId$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t stdPPSId
     * }
     */
    public static final long stdPPSId$offset() {
        return stdPPSId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t stdPPSId
     * }
     */
    public static int stdPPSId(MemorySegment struct) {
        return struct.get(stdPPSId$LAYOUT, stdPPSId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t stdPPSId
     * }
     */
    public static void stdPPSId(MemorySegment struct, int fieldValue) {
        struct.set(stdPPSId$LAYOUT, stdPPSId$OFFSET, fieldValue);
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

