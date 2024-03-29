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
 * struct VkVideoEncodeH264CapabilitiesKHR {
 *     VkStructureType sType;
 *     void *pNext;
 *     VkVideoEncodeH264CapabilityFlagsKHR flags;
 *     StdVideoH264LevelIdc maxLevelIdc;
 *     uint32_t maxSliceCount;
 *     uint32_t maxPPictureL0ReferenceCount;
 *     uint32_t maxBPictureL0ReferenceCount;
 *     uint32_t maxL1ReferenceCount;
 *     uint32_t maxTemporalLayerCount;
 *     VkBool32 expectDyadicTemporalLayerPattern;
 *     int32_t minQp;
 *     int32_t maxQp;
 *     VkBool32 prefersGopRemainingFrames;
 *     VkBool32 requiresGopRemainingFrames;
 *     VkVideoEncodeH264StdFlagsKHR stdSyntaxFlags;
 * }
 * }
 */
public class VkVideoEncodeH264CapabilitiesKHR {

    VkVideoEncodeH264CapabilitiesKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("flags"),
        vulkan_h.C_INT.withName("maxLevelIdc"),
        vulkan_h.C_INT.withName("maxSliceCount"),
        vulkan_h.C_INT.withName("maxPPictureL0ReferenceCount"),
        vulkan_h.C_INT.withName("maxBPictureL0ReferenceCount"),
        vulkan_h.C_INT.withName("maxL1ReferenceCount"),
        vulkan_h.C_INT.withName("maxTemporalLayerCount"),
        vulkan_h.C_INT.withName("expectDyadicTemporalLayerPattern"),
        vulkan_h.C_INT.withName("minQp"),
        vulkan_h.C_INT.withName("maxQp"),
        vulkan_h.C_INT.withName("prefersGopRemainingFrames"),
        vulkan_h.C_INT.withName("requiresGopRemainingFrames"),
        vulkan_h.C_INT.withName("stdSyntaxFlags"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkVideoEncodeH264CapabilitiesKHR");

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
     * void *pNext
     * }
     */
    public static final AddressLayout pNext$layout() {
        return pNext$LAYOUT;
    }

    private static final long pNext$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *pNext
     * }
     */
    public static final long pNext$offset() {
        return pNext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *pNext
     * }
     */
    public static MemorySegment pNext(MemorySegment struct) {
        return struct.get(pNext$LAYOUT, pNext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *pNext
     * }
     */
    public static void pNext(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pNext$LAYOUT, pNext$OFFSET, fieldValue);
    }

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkVideoEncodeH264CapabilityFlagsKHR flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkVideoEncodeH264CapabilityFlagsKHR flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkVideoEncodeH264CapabilityFlagsKHR flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkVideoEncodeH264CapabilityFlagsKHR flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final OfInt maxLevelIdc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxLevelIdc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * StdVideoH264LevelIdc maxLevelIdc
     * }
     */
    public static final OfInt maxLevelIdc$layout() {
        return maxLevelIdc$LAYOUT;
    }

    private static final long maxLevelIdc$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * StdVideoH264LevelIdc maxLevelIdc
     * }
     */
    public static final long maxLevelIdc$offset() {
        return maxLevelIdc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * StdVideoH264LevelIdc maxLevelIdc
     * }
     */
    public static int maxLevelIdc(MemorySegment struct) {
        return struct.get(maxLevelIdc$LAYOUT, maxLevelIdc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * StdVideoH264LevelIdc maxLevelIdc
     * }
     */
    public static void maxLevelIdc(MemorySegment struct, int fieldValue) {
        struct.set(maxLevelIdc$LAYOUT, maxLevelIdc$OFFSET, fieldValue);
    }

    private static final OfInt maxSliceCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxSliceCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxSliceCount
     * }
     */
    public static final OfInt maxSliceCount$layout() {
        return maxSliceCount$LAYOUT;
    }

    private static final long maxSliceCount$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxSliceCount
     * }
     */
    public static final long maxSliceCount$offset() {
        return maxSliceCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxSliceCount
     * }
     */
    public static int maxSliceCount(MemorySegment struct) {
        return struct.get(maxSliceCount$LAYOUT, maxSliceCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxSliceCount
     * }
     */
    public static void maxSliceCount(MemorySegment struct, int fieldValue) {
        struct.set(maxSliceCount$LAYOUT, maxSliceCount$OFFSET, fieldValue);
    }

    private static final OfInt maxPPictureL0ReferenceCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxPPictureL0ReferenceCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxPPictureL0ReferenceCount
     * }
     */
    public static final OfInt maxPPictureL0ReferenceCount$layout() {
        return maxPPictureL0ReferenceCount$LAYOUT;
    }

    private static final long maxPPictureL0ReferenceCount$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxPPictureL0ReferenceCount
     * }
     */
    public static final long maxPPictureL0ReferenceCount$offset() {
        return maxPPictureL0ReferenceCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxPPictureL0ReferenceCount
     * }
     */
    public static int maxPPictureL0ReferenceCount(MemorySegment struct) {
        return struct.get(maxPPictureL0ReferenceCount$LAYOUT, maxPPictureL0ReferenceCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxPPictureL0ReferenceCount
     * }
     */
    public static void maxPPictureL0ReferenceCount(MemorySegment struct, int fieldValue) {
        struct.set(maxPPictureL0ReferenceCount$LAYOUT, maxPPictureL0ReferenceCount$OFFSET, fieldValue);
    }

    private static final OfInt maxBPictureL0ReferenceCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxBPictureL0ReferenceCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxBPictureL0ReferenceCount
     * }
     */
    public static final OfInt maxBPictureL0ReferenceCount$layout() {
        return maxBPictureL0ReferenceCount$LAYOUT;
    }

    private static final long maxBPictureL0ReferenceCount$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxBPictureL0ReferenceCount
     * }
     */
    public static final long maxBPictureL0ReferenceCount$offset() {
        return maxBPictureL0ReferenceCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxBPictureL0ReferenceCount
     * }
     */
    public static int maxBPictureL0ReferenceCount(MemorySegment struct) {
        return struct.get(maxBPictureL0ReferenceCount$LAYOUT, maxBPictureL0ReferenceCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxBPictureL0ReferenceCount
     * }
     */
    public static void maxBPictureL0ReferenceCount(MemorySegment struct, int fieldValue) {
        struct.set(maxBPictureL0ReferenceCount$LAYOUT, maxBPictureL0ReferenceCount$OFFSET, fieldValue);
    }

    private static final OfInt maxL1ReferenceCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxL1ReferenceCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxL1ReferenceCount
     * }
     */
    public static final OfInt maxL1ReferenceCount$layout() {
        return maxL1ReferenceCount$LAYOUT;
    }

    private static final long maxL1ReferenceCount$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxL1ReferenceCount
     * }
     */
    public static final long maxL1ReferenceCount$offset() {
        return maxL1ReferenceCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxL1ReferenceCount
     * }
     */
    public static int maxL1ReferenceCount(MemorySegment struct) {
        return struct.get(maxL1ReferenceCount$LAYOUT, maxL1ReferenceCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxL1ReferenceCount
     * }
     */
    public static void maxL1ReferenceCount(MemorySegment struct, int fieldValue) {
        struct.set(maxL1ReferenceCount$LAYOUT, maxL1ReferenceCount$OFFSET, fieldValue);
    }

    private static final OfInt maxTemporalLayerCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxTemporalLayerCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxTemporalLayerCount
     * }
     */
    public static final OfInt maxTemporalLayerCount$layout() {
        return maxTemporalLayerCount$LAYOUT;
    }

    private static final long maxTemporalLayerCount$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxTemporalLayerCount
     * }
     */
    public static final long maxTemporalLayerCount$offset() {
        return maxTemporalLayerCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxTemporalLayerCount
     * }
     */
    public static int maxTemporalLayerCount(MemorySegment struct) {
        return struct.get(maxTemporalLayerCount$LAYOUT, maxTemporalLayerCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxTemporalLayerCount
     * }
     */
    public static void maxTemporalLayerCount(MemorySegment struct, int fieldValue) {
        struct.set(maxTemporalLayerCount$LAYOUT, maxTemporalLayerCount$OFFSET, fieldValue);
    }

    private static final OfInt expectDyadicTemporalLayerPattern$LAYOUT = (OfInt)$LAYOUT.select(groupElement("expectDyadicTemporalLayerPattern"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 expectDyadicTemporalLayerPattern
     * }
     */
    public static final OfInt expectDyadicTemporalLayerPattern$layout() {
        return expectDyadicTemporalLayerPattern$LAYOUT;
    }

    private static final long expectDyadicTemporalLayerPattern$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 expectDyadicTemporalLayerPattern
     * }
     */
    public static final long expectDyadicTemporalLayerPattern$offset() {
        return expectDyadicTemporalLayerPattern$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 expectDyadicTemporalLayerPattern
     * }
     */
    public static int expectDyadicTemporalLayerPattern(MemorySegment struct) {
        return struct.get(expectDyadicTemporalLayerPattern$LAYOUT, expectDyadicTemporalLayerPattern$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 expectDyadicTemporalLayerPattern
     * }
     */
    public static void expectDyadicTemporalLayerPattern(MemorySegment struct, int fieldValue) {
        struct.set(expectDyadicTemporalLayerPattern$LAYOUT, expectDyadicTemporalLayerPattern$OFFSET, fieldValue);
    }

    private static final OfInt minQp$LAYOUT = (OfInt)$LAYOUT.select(groupElement("minQp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32_t minQp
     * }
     */
    public static final OfInt minQp$layout() {
        return minQp$LAYOUT;
    }

    private static final long minQp$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32_t minQp
     * }
     */
    public static final long minQp$offset() {
        return minQp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32_t minQp
     * }
     */
    public static int minQp(MemorySegment struct) {
        return struct.get(minQp$LAYOUT, minQp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32_t minQp
     * }
     */
    public static void minQp(MemorySegment struct, int fieldValue) {
        struct.set(minQp$LAYOUT, minQp$OFFSET, fieldValue);
    }

    private static final OfInt maxQp$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxQp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32_t maxQp
     * }
     */
    public static final OfInt maxQp$layout() {
        return maxQp$LAYOUT;
    }

    private static final long maxQp$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32_t maxQp
     * }
     */
    public static final long maxQp$offset() {
        return maxQp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32_t maxQp
     * }
     */
    public static int maxQp(MemorySegment struct) {
        return struct.get(maxQp$LAYOUT, maxQp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32_t maxQp
     * }
     */
    public static void maxQp(MemorySegment struct, int fieldValue) {
        struct.set(maxQp$LAYOUT, maxQp$OFFSET, fieldValue);
    }

    private static final OfInt prefersGopRemainingFrames$LAYOUT = (OfInt)$LAYOUT.select(groupElement("prefersGopRemainingFrames"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 prefersGopRemainingFrames
     * }
     */
    public static final OfInt prefersGopRemainingFrames$layout() {
        return prefersGopRemainingFrames$LAYOUT;
    }

    private static final long prefersGopRemainingFrames$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 prefersGopRemainingFrames
     * }
     */
    public static final long prefersGopRemainingFrames$offset() {
        return prefersGopRemainingFrames$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 prefersGopRemainingFrames
     * }
     */
    public static int prefersGopRemainingFrames(MemorySegment struct) {
        return struct.get(prefersGopRemainingFrames$LAYOUT, prefersGopRemainingFrames$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 prefersGopRemainingFrames
     * }
     */
    public static void prefersGopRemainingFrames(MemorySegment struct, int fieldValue) {
        struct.set(prefersGopRemainingFrames$LAYOUT, prefersGopRemainingFrames$OFFSET, fieldValue);
    }

    private static final OfInt requiresGopRemainingFrames$LAYOUT = (OfInt)$LAYOUT.select(groupElement("requiresGopRemainingFrames"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 requiresGopRemainingFrames
     * }
     */
    public static final OfInt requiresGopRemainingFrames$layout() {
        return requiresGopRemainingFrames$LAYOUT;
    }

    private static final long requiresGopRemainingFrames$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 requiresGopRemainingFrames
     * }
     */
    public static final long requiresGopRemainingFrames$offset() {
        return requiresGopRemainingFrames$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 requiresGopRemainingFrames
     * }
     */
    public static int requiresGopRemainingFrames(MemorySegment struct) {
        return struct.get(requiresGopRemainingFrames$LAYOUT, requiresGopRemainingFrames$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 requiresGopRemainingFrames
     * }
     */
    public static void requiresGopRemainingFrames(MemorySegment struct, int fieldValue) {
        struct.set(requiresGopRemainingFrames$LAYOUT, requiresGopRemainingFrames$OFFSET, fieldValue);
    }

    private static final OfInt stdSyntaxFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("stdSyntaxFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkVideoEncodeH264StdFlagsKHR stdSyntaxFlags
     * }
     */
    public static final OfInt stdSyntaxFlags$layout() {
        return stdSyntaxFlags$LAYOUT;
    }

    private static final long stdSyntaxFlags$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkVideoEncodeH264StdFlagsKHR stdSyntaxFlags
     * }
     */
    public static final long stdSyntaxFlags$offset() {
        return stdSyntaxFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkVideoEncodeH264StdFlagsKHR stdSyntaxFlags
     * }
     */
    public static int stdSyntaxFlags(MemorySegment struct) {
        return struct.get(stdSyntaxFlags$LAYOUT, stdSyntaxFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkVideoEncodeH264StdFlagsKHR stdSyntaxFlags
     * }
     */
    public static void stdSyntaxFlags(MemorySegment struct, int fieldValue) {
        struct.set(stdSyntaxFlags$LAYOUT, stdSyntaxFlags$OFFSET, fieldValue);
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

