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
 * struct VkVideoProfileInfoKHR {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkVideoCodecOperationFlagBitsKHR videoCodecOperation;
 *     VkVideoChromaSubsamplingFlagsKHR chromaSubsampling;
 *     VkVideoComponentBitDepthFlagsKHR lumaBitDepth;
 *     VkVideoComponentBitDepthFlagsKHR chromaBitDepth;
 * }
 * }
 */
public class VkVideoProfileInfoKHR {

    VkVideoProfileInfoKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("videoCodecOperation"),
        vulkan_h.C_INT.withName("chromaSubsampling"),
        vulkan_h.C_INT.withName("lumaBitDepth"),
        vulkan_h.C_INT.withName("chromaBitDepth")
    ).withName("VkVideoProfileInfoKHR");

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

    private static final OfInt videoCodecOperation$LAYOUT = (OfInt)$LAYOUT.select(groupElement("videoCodecOperation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkVideoCodecOperationFlagBitsKHR videoCodecOperation
     * }
     */
    public static final OfInt videoCodecOperation$layout() {
        return videoCodecOperation$LAYOUT;
    }

    private static final long videoCodecOperation$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkVideoCodecOperationFlagBitsKHR videoCodecOperation
     * }
     */
    public static final long videoCodecOperation$offset() {
        return videoCodecOperation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkVideoCodecOperationFlagBitsKHR videoCodecOperation
     * }
     */
    public static int videoCodecOperation(MemorySegment struct) {
        return struct.get(videoCodecOperation$LAYOUT, videoCodecOperation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkVideoCodecOperationFlagBitsKHR videoCodecOperation
     * }
     */
    public static void videoCodecOperation(MemorySegment struct, int fieldValue) {
        struct.set(videoCodecOperation$LAYOUT, videoCodecOperation$OFFSET, fieldValue);
    }

    private static final OfInt chromaSubsampling$LAYOUT = (OfInt)$LAYOUT.select(groupElement("chromaSubsampling"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkVideoChromaSubsamplingFlagsKHR chromaSubsampling
     * }
     */
    public static final OfInt chromaSubsampling$layout() {
        return chromaSubsampling$LAYOUT;
    }

    private static final long chromaSubsampling$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkVideoChromaSubsamplingFlagsKHR chromaSubsampling
     * }
     */
    public static final long chromaSubsampling$offset() {
        return chromaSubsampling$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkVideoChromaSubsamplingFlagsKHR chromaSubsampling
     * }
     */
    public static int chromaSubsampling(MemorySegment struct) {
        return struct.get(chromaSubsampling$LAYOUT, chromaSubsampling$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkVideoChromaSubsamplingFlagsKHR chromaSubsampling
     * }
     */
    public static void chromaSubsampling(MemorySegment struct, int fieldValue) {
        struct.set(chromaSubsampling$LAYOUT, chromaSubsampling$OFFSET, fieldValue);
    }

    private static final OfInt lumaBitDepth$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lumaBitDepth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkVideoComponentBitDepthFlagsKHR lumaBitDepth
     * }
     */
    public static final OfInt lumaBitDepth$layout() {
        return lumaBitDepth$LAYOUT;
    }

    private static final long lumaBitDepth$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkVideoComponentBitDepthFlagsKHR lumaBitDepth
     * }
     */
    public static final long lumaBitDepth$offset() {
        return lumaBitDepth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkVideoComponentBitDepthFlagsKHR lumaBitDepth
     * }
     */
    public static int lumaBitDepth(MemorySegment struct) {
        return struct.get(lumaBitDepth$LAYOUT, lumaBitDepth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkVideoComponentBitDepthFlagsKHR lumaBitDepth
     * }
     */
    public static void lumaBitDepth(MemorySegment struct, int fieldValue) {
        struct.set(lumaBitDepth$LAYOUT, lumaBitDepth$OFFSET, fieldValue);
    }

    private static final OfInt chromaBitDepth$LAYOUT = (OfInt)$LAYOUT.select(groupElement("chromaBitDepth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkVideoComponentBitDepthFlagsKHR chromaBitDepth
     * }
     */
    public static final OfInt chromaBitDepth$layout() {
        return chromaBitDepth$LAYOUT;
    }

    private static final long chromaBitDepth$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkVideoComponentBitDepthFlagsKHR chromaBitDepth
     * }
     */
    public static final long chromaBitDepth$offset() {
        return chromaBitDepth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkVideoComponentBitDepthFlagsKHR chromaBitDepth
     * }
     */
    public static int chromaBitDepth(MemorySegment struct) {
        return struct.get(chromaBitDepth$LAYOUT, chromaBitDepth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkVideoComponentBitDepthFlagsKHR chromaBitDepth
     * }
     */
    public static void chromaBitDepth(MemorySegment struct, int fieldValue) {
        struct.set(chromaBitDepth$LAYOUT, chromaBitDepth$OFFSET, fieldValue);
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

