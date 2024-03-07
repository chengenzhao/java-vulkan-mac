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
 * struct VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV {
 *     VkStructureType sType;
 *     void *pNext;
 *     uint32_t maxGraphicsShaderGroupCount;
 *     uint32_t maxIndirectSequenceCount;
 *     uint32_t maxIndirectCommandsTokenCount;
 *     uint32_t maxIndirectCommandsStreamCount;
 *     uint32_t maxIndirectCommandsTokenOffset;
 *     uint32_t maxIndirectCommandsStreamStride;
 *     uint32_t minSequencesCountBufferOffsetAlignment;
 *     uint32_t minSequencesIndexBufferOffsetAlignment;
 *     uint32_t minIndirectCommandsBufferOffsetAlignment;
 * }
 * }
 */
public class VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV {

    VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("maxGraphicsShaderGroupCount"),
        vulkan_h.C_INT.withName("maxIndirectSequenceCount"),
        vulkan_h.C_INT.withName("maxIndirectCommandsTokenCount"),
        vulkan_h.C_INT.withName("maxIndirectCommandsStreamCount"),
        vulkan_h.C_INT.withName("maxIndirectCommandsTokenOffset"),
        vulkan_h.C_INT.withName("maxIndirectCommandsStreamStride"),
        vulkan_h.C_INT.withName("minSequencesCountBufferOffsetAlignment"),
        vulkan_h.C_INT.withName("minSequencesIndexBufferOffsetAlignment"),
        vulkan_h.C_INT.withName("minIndirectCommandsBufferOffsetAlignment"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV");

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

    private static final OfInt maxGraphicsShaderGroupCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxGraphicsShaderGroupCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxGraphicsShaderGroupCount
     * }
     */
    public static final OfInt maxGraphicsShaderGroupCount$layout() {
        return maxGraphicsShaderGroupCount$LAYOUT;
    }

    private static final long maxGraphicsShaderGroupCount$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxGraphicsShaderGroupCount
     * }
     */
    public static final long maxGraphicsShaderGroupCount$offset() {
        return maxGraphicsShaderGroupCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxGraphicsShaderGroupCount
     * }
     */
    public static int maxGraphicsShaderGroupCount(MemorySegment struct) {
        return struct.get(maxGraphicsShaderGroupCount$LAYOUT, maxGraphicsShaderGroupCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxGraphicsShaderGroupCount
     * }
     */
    public static void maxGraphicsShaderGroupCount(MemorySegment struct, int fieldValue) {
        struct.set(maxGraphicsShaderGroupCount$LAYOUT, maxGraphicsShaderGroupCount$OFFSET, fieldValue);
    }

    private static final OfInt maxIndirectSequenceCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxIndirectSequenceCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxIndirectSequenceCount
     * }
     */
    public static final OfInt maxIndirectSequenceCount$layout() {
        return maxIndirectSequenceCount$LAYOUT;
    }

    private static final long maxIndirectSequenceCount$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxIndirectSequenceCount
     * }
     */
    public static final long maxIndirectSequenceCount$offset() {
        return maxIndirectSequenceCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxIndirectSequenceCount
     * }
     */
    public static int maxIndirectSequenceCount(MemorySegment struct) {
        return struct.get(maxIndirectSequenceCount$LAYOUT, maxIndirectSequenceCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxIndirectSequenceCount
     * }
     */
    public static void maxIndirectSequenceCount(MemorySegment struct, int fieldValue) {
        struct.set(maxIndirectSequenceCount$LAYOUT, maxIndirectSequenceCount$OFFSET, fieldValue);
    }

    private static final OfInt maxIndirectCommandsTokenCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxIndirectCommandsTokenCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxIndirectCommandsTokenCount
     * }
     */
    public static final OfInt maxIndirectCommandsTokenCount$layout() {
        return maxIndirectCommandsTokenCount$LAYOUT;
    }

    private static final long maxIndirectCommandsTokenCount$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxIndirectCommandsTokenCount
     * }
     */
    public static final long maxIndirectCommandsTokenCount$offset() {
        return maxIndirectCommandsTokenCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxIndirectCommandsTokenCount
     * }
     */
    public static int maxIndirectCommandsTokenCount(MemorySegment struct) {
        return struct.get(maxIndirectCommandsTokenCount$LAYOUT, maxIndirectCommandsTokenCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxIndirectCommandsTokenCount
     * }
     */
    public static void maxIndirectCommandsTokenCount(MemorySegment struct, int fieldValue) {
        struct.set(maxIndirectCommandsTokenCount$LAYOUT, maxIndirectCommandsTokenCount$OFFSET, fieldValue);
    }

    private static final OfInt maxIndirectCommandsStreamCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxIndirectCommandsStreamCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxIndirectCommandsStreamCount
     * }
     */
    public static final OfInt maxIndirectCommandsStreamCount$layout() {
        return maxIndirectCommandsStreamCount$LAYOUT;
    }

    private static final long maxIndirectCommandsStreamCount$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxIndirectCommandsStreamCount
     * }
     */
    public static final long maxIndirectCommandsStreamCount$offset() {
        return maxIndirectCommandsStreamCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxIndirectCommandsStreamCount
     * }
     */
    public static int maxIndirectCommandsStreamCount(MemorySegment struct) {
        return struct.get(maxIndirectCommandsStreamCount$LAYOUT, maxIndirectCommandsStreamCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxIndirectCommandsStreamCount
     * }
     */
    public static void maxIndirectCommandsStreamCount(MemorySegment struct, int fieldValue) {
        struct.set(maxIndirectCommandsStreamCount$LAYOUT, maxIndirectCommandsStreamCount$OFFSET, fieldValue);
    }

    private static final OfInt maxIndirectCommandsTokenOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxIndirectCommandsTokenOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxIndirectCommandsTokenOffset
     * }
     */
    public static final OfInt maxIndirectCommandsTokenOffset$layout() {
        return maxIndirectCommandsTokenOffset$LAYOUT;
    }

    private static final long maxIndirectCommandsTokenOffset$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxIndirectCommandsTokenOffset
     * }
     */
    public static final long maxIndirectCommandsTokenOffset$offset() {
        return maxIndirectCommandsTokenOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxIndirectCommandsTokenOffset
     * }
     */
    public static int maxIndirectCommandsTokenOffset(MemorySegment struct) {
        return struct.get(maxIndirectCommandsTokenOffset$LAYOUT, maxIndirectCommandsTokenOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxIndirectCommandsTokenOffset
     * }
     */
    public static void maxIndirectCommandsTokenOffset(MemorySegment struct, int fieldValue) {
        struct.set(maxIndirectCommandsTokenOffset$LAYOUT, maxIndirectCommandsTokenOffset$OFFSET, fieldValue);
    }

    private static final OfInt maxIndirectCommandsStreamStride$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxIndirectCommandsStreamStride"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxIndirectCommandsStreamStride
     * }
     */
    public static final OfInt maxIndirectCommandsStreamStride$layout() {
        return maxIndirectCommandsStreamStride$LAYOUT;
    }

    private static final long maxIndirectCommandsStreamStride$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxIndirectCommandsStreamStride
     * }
     */
    public static final long maxIndirectCommandsStreamStride$offset() {
        return maxIndirectCommandsStreamStride$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxIndirectCommandsStreamStride
     * }
     */
    public static int maxIndirectCommandsStreamStride(MemorySegment struct) {
        return struct.get(maxIndirectCommandsStreamStride$LAYOUT, maxIndirectCommandsStreamStride$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxIndirectCommandsStreamStride
     * }
     */
    public static void maxIndirectCommandsStreamStride(MemorySegment struct, int fieldValue) {
        struct.set(maxIndirectCommandsStreamStride$LAYOUT, maxIndirectCommandsStreamStride$OFFSET, fieldValue);
    }

    private static final OfInt minSequencesCountBufferOffsetAlignment$LAYOUT = (OfInt)$LAYOUT.select(groupElement("minSequencesCountBufferOffsetAlignment"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t minSequencesCountBufferOffsetAlignment
     * }
     */
    public static final OfInt minSequencesCountBufferOffsetAlignment$layout() {
        return minSequencesCountBufferOffsetAlignment$LAYOUT;
    }

    private static final long minSequencesCountBufferOffsetAlignment$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t minSequencesCountBufferOffsetAlignment
     * }
     */
    public static final long minSequencesCountBufferOffsetAlignment$offset() {
        return minSequencesCountBufferOffsetAlignment$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t minSequencesCountBufferOffsetAlignment
     * }
     */
    public static int minSequencesCountBufferOffsetAlignment(MemorySegment struct) {
        return struct.get(minSequencesCountBufferOffsetAlignment$LAYOUT, minSequencesCountBufferOffsetAlignment$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t minSequencesCountBufferOffsetAlignment
     * }
     */
    public static void minSequencesCountBufferOffsetAlignment(MemorySegment struct, int fieldValue) {
        struct.set(minSequencesCountBufferOffsetAlignment$LAYOUT, minSequencesCountBufferOffsetAlignment$OFFSET, fieldValue);
    }

    private static final OfInt minSequencesIndexBufferOffsetAlignment$LAYOUT = (OfInt)$LAYOUT.select(groupElement("minSequencesIndexBufferOffsetAlignment"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t minSequencesIndexBufferOffsetAlignment
     * }
     */
    public static final OfInt minSequencesIndexBufferOffsetAlignment$layout() {
        return minSequencesIndexBufferOffsetAlignment$LAYOUT;
    }

    private static final long minSequencesIndexBufferOffsetAlignment$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t minSequencesIndexBufferOffsetAlignment
     * }
     */
    public static final long minSequencesIndexBufferOffsetAlignment$offset() {
        return minSequencesIndexBufferOffsetAlignment$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t minSequencesIndexBufferOffsetAlignment
     * }
     */
    public static int minSequencesIndexBufferOffsetAlignment(MemorySegment struct) {
        return struct.get(minSequencesIndexBufferOffsetAlignment$LAYOUT, minSequencesIndexBufferOffsetAlignment$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t minSequencesIndexBufferOffsetAlignment
     * }
     */
    public static void minSequencesIndexBufferOffsetAlignment(MemorySegment struct, int fieldValue) {
        struct.set(minSequencesIndexBufferOffsetAlignment$LAYOUT, minSequencesIndexBufferOffsetAlignment$OFFSET, fieldValue);
    }

    private static final OfInt minIndirectCommandsBufferOffsetAlignment$LAYOUT = (OfInt)$LAYOUT.select(groupElement("minIndirectCommandsBufferOffsetAlignment"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t minIndirectCommandsBufferOffsetAlignment
     * }
     */
    public static final OfInt minIndirectCommandsBufferOffsetAlignment$layout() {
        return minIndirectCommandsBufferOffsetAlignment$LAYOUT;
    }

    private static final long minIndirectCommandsBufferOffsetAlignment$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t minIndirectCommandsBufferOffsetAlignment
     * }
     */
    public static final long minIndirectCommandsBufferOffsetAlignment$offset() {
        return minIndirectCommandsBufferOffsetAlignment$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t minIndirectCommandsBufferOffsetAlignment
     * }
     */
    public static int minIndirectCommandsBufferOffsetAlignment(MemorySegment struct) {
        return struct.get(minIndirectCommandsBufferOffsetAlignment$LAYOUT, minIndirectCommandsBufferOffsetAlignment$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t minIndirectCommandsBufferOffsetAlignment
     * }
     */
    public static void minIndirectCommandsBufferOffsetAlignment(MemorySegment struct, int fieldValue) {
        struct.set(minIndirectCommandsBufferOffsetAlignment$LAYOUT, minIndirectCommandsBufferOffsetAlignment$OFFSET, fieldValue);
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

