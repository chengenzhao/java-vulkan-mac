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
 * struct VkGeneratedCommandsInfoNV {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkPipelineBindPoint pipelineBindPoint;
 *     VkPipeline pipeline;
 *     VkIndirectCommandsLayoutNV indirectCommandsLayout;
 *     uint32_t streamCount;
 *     const VkIndirectCommandsStreamNV *pStreams;
 *     uint32_t sequencesCount;
 *     VkBuffer preprocessBuffer;
 *     VkDeviceSize preprocessOffset;
 *     VkDeviceSize preprocessSize;
 *     VkBuffer sequencesCountBuffer;
 *     VkDeviceSize sequencesCountOffset;
 *     VkBuffer sequencesIndexBuffer;
 *     VkDeviceSize sequencesIndexOffset;
 * }
 * }
 */
public class VkGeneratedCommandsInfoNV {

    VkGeneratedCommandsInfoNV() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("pipelineBindPoint"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pipeline"),
        vulkan_h.C_POINTER.withName("indirectCommandsLayout"),
        vulkan_h.C_INT.withName("streamCount"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pStreams"),
        vulkan_h.C_INT.withName("sequencesCount"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("preprocessBuffer"),
        vulkan_h.C_LONG_LONG.withName("preprocessOffset"),
        vulkan_h.C_LONG_LONG.withName("preprocessSize"),
        vulkan_h.C_POINTER.withName("sequencesCountBuffer"),
        vulkan_h.C_LONG_LONG.withName("sequencesCountOffset"),
        vulkan_h.C_POINTER.withName("sequencesIndexBuffer"),
        vulkan_h.C_LONG_LONG.withName("sequencesIndexOffset")
    ).withName("VkGeneratedCommandsInfoNV");

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

    private static final OfInt pipelineBindPoint$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pipelineBindPoint"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPipelineBindPoint pipelineBindPoint
     * }
     */
    public static final OfInt pipelineBindPoint$layout() {
        return pipelineBindPoint$LAYOUT;
    }

    private static final long pipelineBindPoint$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPipelineBindPoint pipelineBindPoint
     * }
     */
    public static final long pipelineBindPoint$offset() {
        return pipelineBindPoint$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPipelineBindPoint pipelineBindPoint
     * }
     */
    public static int pipelineBindPoint(MemorySegment struct) {
        return struct.get(pipelineBindPoint$LAYOUT, pipelineBindPoint$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPipelineBindPoint pipelineBindPoint
     * }
     */
    public static void pipelineBindPoint(MemorySegment struct, int fieldValue) {
        struct.set(pipelineBindPoint$LAYOUT, pipelineBindPoint$OFFSET, fieldValue);
    }

    private static final AddressLayout pipeline$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pipeline"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPipeline pipeline
     * }
     */
    public static final AddressLayout pipeline$layout() {
        return pipeline$LAYOUT;
    }

    private static final long pipeline$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPipeline pipeline
     * }
     */
    public static final long pipeline$offset() {
        return pipeline$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPipeline pipeline
     * }
     */
    public static MemorySegment pipeline(MemorySegment struct) {
        return struct.get(pipeline$LAYOUT, pipeline$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPipeline pipeline
     * }
     */
    public static void pipeline(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pipeline$LAYOUT, pipeline$OFFSET, fieldValue);
    }

    private static final AddressLayout indirectCommandsLayout$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("indirectCommandsLayout"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkIndirectCommandsLayoutNV indirectCommandsLayout
     * }
     */
    public static final AddressLayout indirectCommandsLayout$layout() {
        return indirectCommandsLayout$LAYOUT;
    }

    private static final long indirectCommandsLayout$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkIndirectCommandsLayoutNV indirectCommandsLayout
     * }
     */
    public static final long indirectCommandsLayout$offset() {
        return indirectCommandsLayout$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkIndirectCommandsLayoutNV indirectCommandsLayout
     * }
     */
    public static MemorySegment indirectCommandsLayout(MemorySegment struct) {
        return struct.get(indirectCommandsLayout$LAYOUT, indirectCommandsLayout$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkIndirectCommandsLayoutNV indirectCommandsLayout
     * }
     */
    public static void indirectCommandsLayout(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(indirectCommandsLayout$LAYOUT, indirectCommandsLayout$OFFSET, fieldValue);
    }

    private static final OfInt streamCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("streamCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t streamCount
     * }
     */
    public static final OfInt streamCount$layout() {
        return streamCount$LAYOUT;
    }

    private static final long streamCount$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t streamCount
     * }
     */
    public static final long streamCount$offset() {
        return streamCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t streamCount
     * }
     */
    public static int streamCount(MemorySegment struct) {
        return struct.get(streamCount$LAYOUT, streamCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t streamCount
     * }
     */
    public static void streamCount(MemorySegment struct, int fieldValue) {
        struct.set(streamCount$LAYOUT, streamCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pStreams$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pStreams"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkIndirectCommandsStreamNV *pStreams
     * }
     */
    public static final AddressLayout pStreams$layout() {
        return pStreams$LAYOUT;
    }

    private static final long pStreams$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkIndirectCommandsStreamNV *pStreams
     * }
     */
    public static final long pStreams$offset() {
        return pStreams$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkIndirectCommandsStreamNV *pStreams
     * }
     */
    public static MemorySegment pStreams(MemorySegment struct) {
        return struct.get(pStreams$LAYOUT, pStreams$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkIndirectCommandsStreamNV *pStreams
     * }
     */
    public static void pStreams(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pStreams$LAYOUT, pStreams$OFFSET, fieldValue);
    }

    private static final OfInt sequencesCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sequencesCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t sequencesCount
     * }
     */
    public static final OfInt sequencesCount$layout() {
        return sequencesCount$LAYOUT;
    }

    private static final long sequencesCount$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t sequencesCount
     * }
     */
    public static final long sequencesCount$offset() {
        return sequencesCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t sequencesCount
     * }
     */
    public static int sequencesCount(MemorySegment struct) {
        return struct.get(sequencesCount$LAYOUT, sequencesCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t sequencesCount
     * }
     */
    public static void sequencesCount(MemorySegment struct, int fieldValue) {
        struct.set(sequencesCount$LAYOUT, sequencesCount$OFFSET, fieldValue);
    }

    private static final AddressLayout preprocessBuffer$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("preprocessBuffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBuffer preprocessBuffer
     * }
     */
    public static final AddressLayout preprocessBuffer$layout() {
        return preprocessBuffer$LAYOUT;
    }

    private static final long preprocessBuffer$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBuffer preprocessBuffer
     * }
     */
    public static final long preprocessBuffer$offset() {
        return preprocessBuffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBuffer preprocessBuffer
     * }
     */
    public static MemorySegment preprocessBuffer(MemorySegment struct) {
        return struct.get(preprocessBuffer$LAYOUT, preprocessBuffer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBuffer preprocessBuffer
     * }
     */
    public static void preprocessBuffer(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(preprocessBuffer$LAYOUT, preprocessBuffer$OFFSET, fieldValue);
    }

    private static final OfLong preprocessOffset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("preprocessOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize preprocessOffset
     * }
     */
    public static final OfLong preprocessOffset$layout() {
        return preprocessOffset$LAYOUT;
    }

    private static final long preprocessOffset$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize preprocessOffset
     * }
     */
    public static final long preprocessOffset$offset() {
        return preprocessOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize preprocessOffset
     * }
     */
    public static long preprocessOffset(MemorySegment struct) {
        return struct.get(preprocessOffset$LAYOUT, preprocessOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize preprocessOffset
     * }
     */
    public static void preprocessOffset(MemorySegment struct, long fieldValue) {
        struct.set(preprocessOffset$LAYOUT, preprocessOffset$OFFSET, fieldValue);
    }

    private static final OfLong preprocessSize$LAYOUT = (OfLong)$LAYOUT.select(groupElement("preprocessSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize preprocessSize
     * }
     */
    public static final OfLong preprocessSize$layout() {
        return preprocessSize$LAYOUT;
    }

    private static final long preprocessSize$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize preprocessSize
     * }
     */
    public static final long preprocessSize$offset() {
        return preprocessSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize preprocessSize
     * }
     */
    public static long preprocessSize(MemorySegment struct) {
        return struct.get(preprocessSize$LAYOUT, preprocessSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize preprocessSize
     * }
     */
    public static void preprocessSize(MemorySegment struct, long fieldValue) {
        struct.set(preprocessSize$LAYOUT, preprocessSize$OFFSET, fieldValue);
    }

    private static final AddressLayout sequencesCountBuffer$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("sequencesCountBuffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBuffer sequencesCountBuffer
     * }
     */
    public static final AddressLayout sequencesCountBuffer$layout() {
        return sequencesCountBuffer$LAYOUT;
    }

    private static final long sequencesCountBuffer$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBuffer sequencesCountBuffer
     * }
     */
    public static final long sequencesCountBuffer$offset() {
        return sequencesCountBuffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBuffer sequencesCountBuffer
     * }
     */
    public static MemorySegment sequencesCountBuffer(MemorySegment struct) {
        return struct.get(sequencesCountBuffer$LAYOUT, sequencesCountBuffer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBuffer sequencesCountBuffer
     * }
     */
    public static void sequencesCountBuffer(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sequencesCountBuffer$LAYOUT, sequencesCountBuffer$OFFSET, fieldValue);
    }

    private static final OfLong sequencesCountOffset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("sequencesCountOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize sequencesCountOffset
     * }
     */
    public static final OfLong sequencesCountOffset$layout() {
        return sequencesCountOffset$LAYOUT;
    }

    private static final long sequencesCountOffset$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize sequencesCountOffset
     * }
     */
    public static final long sequencesCountOffset$offset() {
        return sequencesCountOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize sequencesCountOffset
     * }
     */
    public static long sequencesCountOffset(MemorySegment struct) {
        return struct.get(sequencesCountOffset$LAYOUT, sequencesCountOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize sequencesCountOffset
     * }
     */
    public static void sequencesCountOffset(MemorySegment struct, long fieldValue) {
        struct.set(sequencesCountOffset$LAYOUT, sequencesCountOffset$OFFSET, fieldValue);
    }

    private static final AddressLayout sequencesIndexBuffer$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("sequencesIndexBuffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBuffer sequencesIndexBuffer
     * }
     */
    public static final AddressLayout sequencesIndexBuffer$layout() {
        return sequencesIndexBuffer$LAYOUT;
    }

    private static final long sequencesIndexBuffer$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBuffer sequencesIndexBuffer
     * }
     */
    public static final long sequencesIndexBuffer$offset() {
        return sequencesIndexBuffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBuffer sequencesIndexBuffer
     * }
     */
    public static MemorySegment sequencesIndexBuffer(MemorySegment struct) {
        return struct.get(sequencesIndexBuffer$LAYOUT, sequencesIndexBuffer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBuffer sequencesIndexBuffer
     * }
     */
    public static void sequencesIndexBuffer(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sequencesIndexBuffer$LAYOUT, sequencesIndexBuffer$OFFSET, fieldValue);
    }

    private static final OfLong sequencesIndexOffset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("sequencesIndexOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize sequencesIndexOffset
     * }
     */
    public static final OfLong sequencesIndexOffset$layout() {
        return sequencesIndexOffset$LAYOUT;
    }

    private static final long sequencesIndexOffset$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize sequencesIndexOffset
     * }
     */
    public static final long sequencesIndexOffset$offset() {
        return sequencesIndexOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize sequencesIndexOffset
     * }
     */
    public static long sequencesIndexOffset(MemorySegment struct) {
        return struct.get(sequencesIndexOffset$LAYOUT, sequencesIndexOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize sequencesIndexOffset
     * }
     */
    public static void sequencesIndexOffset(MemorySegment struct, long fieldValue) {
        struct.set(sequencesIndexOffset$LAYOUT, sequencesIndexOffset$OFFSET, fieldValue);
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

