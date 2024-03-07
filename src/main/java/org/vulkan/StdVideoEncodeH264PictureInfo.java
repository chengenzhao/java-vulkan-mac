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
 * struct StdVideoEncodeH264PictureInfo {
 *     StdVideoEncodeH264PictureInfoFlags flags;
 *     uint8_t seq_parameter_set_id;
 *     uint8_t pic_parameter_set_id;
 *     uint16_t idr_pic_id;
 *     StdVideoH264PictureType primary_pic_type;
 *     uint32_t frame_num;
 *     int32_t PicOrderCnt;
 *     uint8_t temporal_id;
 *     uint8_t reserved1[3];
 *     const StdVideoEncodeH264ReferenceListsInfo *pRefLists;
 * }
 * }
 */
public class StdVideoEncodeH264PictureInfo {

    StdVideoEncodeH264PictureInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        StdVideoEncodeH264PictureInfoFlags.layout().withName("flags"),
        vulkan_h.C_CHAR.withName("seq_parameter_set_id"),
        vulkan_h.C_CHAR.withName("pic_parameter_set_id"),
        vulkan_h.C_SHORT.withName("idr_pic_id"),
        vulkan_h.C_INT.withName("primary_pic_type"),
        vulkan_h.C_INT.withName("frame_num"),
        vulkan_h.C_INT.withName("PicOrderCnt"),
        vulkan_h.C_CHAR.withName("temporal_id"),
        MemoryLayout.sequenceLayout(3, vulkan_h.C_CHAR).withName("reserved1"),
        vulkan_h.C_POINTER.withName("pRefLists")
    ).withName("StdVideoEncodeH264PictureInfo");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout flags$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * StdVideoEncodeH264PictureInfoFlags flags
     * }
     */
    public static final GroupLayout flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * StdVideoEncodeH264PictureInfoFlags flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * StdVideoEncodeH264PictureInfoFlags flags
     * }
     */
    public static MemorySegment flags(MemorySegment struct) {
        return struct.asSlice(flags$OFFSET, flags$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * StdVideoEncodeH264PictureInfoFlags flags
     * }
     */
    public static void flags(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, flags$OFFSET, flags$LAYOUT.byteSize());
    }

    private static final OfByte seq_parameter_set_id$LAYOUT = (OfByte)$LAYOUT.select(groupElement("seq_parameter_set_id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t seq_parameter_set_id
     * }
     */
    public static final OfByte seq_parameter_set_id$layout() {
        return seq_parameter_set_id$LAYOUT;
    }

    private static final long seq_parameter_set_id$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t seq_parameter_set_id
     * }
     */
    public static final long seq_parameter_set_id$offset() {
        return seq_parameter_set_id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t seq_parameter_set_id
     * }
     */
    public static byte seq_parameter_set_id(MemorySegment struct) {
        return struct.get(seq_parameter_set_id$LAYOUT, seq_parameter_set_id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t seq_parameter_set_id
     * }
     */
    public static void seq_parameter_set_id(MemorySegment struct, byte fieldValue) {
        struct.set(seq_parameter_set_id$LAYOUT, seq_parameter_set_id$OFFSET, fieldValue);
    }

    private static final OfByte pic_parameter_set_id$LAYOUT = (OfByte)$LAYOUT.select(groupElement("pic_parameter_set_id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t pic_parameter_set_id
     * }
     */
    public static final OfByte pic_parameter_set_id$layout() {
        return pic_parameter_set_id$LAYOUT;
    }

    private static final long pic_parameter_set_id$OFFSET = 5;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t pic_parameter_set_id
     * }
     */
    public static final long pic_parameter_set_id$offset() {
        return pic_parameter_set_id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t pic_parameter_set_id
     * }
     */
    public static byte pic_parameter_set_id(MemorySegment struct) {
        return struct.get(pic_parameter_set_id$LAYOUT, pic_parameter_set_id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t pic_parameter_set_id
     * }
     */
    public static void pic_parameter_set_id(MemorySegment struct, byte fieldValue) {
        struct.set(pic_parameter_set_id$LAYOUT, pic_parameter_set_id$OFFSET, fieldValue);
    }

    private static final OfShort idr_pic_id$LAYOUT = (OfShort)$LAYOUT.select(groupElement("idr_pic_id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint16_t idr_pic_id
     * }
     */
    public static final OfShort idr_pic_id$layout() {
        return idr_pic_id$LAYOUT;
    }

    private static final long idr_pic_id$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint16_t idr_pic_id
     * }
     */
    public static final long idr_pic_id$offset() {
        return idr_pic_id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint16_t idr_pic_id
     * }
     */
    public static short idr_pic_id(MemorySegment struct) {
        return struct.get(idr_pic_id$LAYOUT, idr_pic_id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint16_t idr_pic_id
     * }
     */
    public static void idr_pic_id(MemorySegment struct, short fieldValue) {
        struct.set(idr_pic_id$LAYOUT, idr_pic_id$OFFSET, fieldValue);
    }

    private static final OfInt primary_pic_type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("primary_pic_type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * StdVideoH264PictureType primary_pic_type
     * }
     */
    public static final OfInt primary_pic_type$layout() {
        return primary_pic_type$LAYOUT;
    }

    private static final long primary_pic_type$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * StdVideoH264PictureType primary_pic_type
     * }
     */
    public static final long primary_pic_type$offset() {
        return primary_pic_type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * StdVideoH264PictureType primary_pic_type
     * }
     */
    public static int primary_pic_type(MemorySegment struct) {
        return struct.get(primary_pic_type$LAYOUT, primary_pic_type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * StdVideoH264PictureType primary_pic_type
     * }
     */
    public static void primary_pic_type(MemorySegment struct, int fieldValue) {
        struct.set(primary_pic_type$LAYOUT, primary_pic_type$OFFSET, fieldValue);
    }

    private static final OfInt frame_num$LAYOUT = (OfInt)$LAYOUT.select(groupElement("frame_num"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t frame_num
     * }
     */
    public static final OfInt frame_num$layout() {
        return frame_num$LAYOUT;
    }

    private static final long frame_num$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t frame_num
     * }
     */
    public static final long frame_num$offset() {
        return frame_num$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t frame_num
     * }
     */
    public static int frame_num(MemorySegment struct) {
        return struct.get(frame_num$LAYOUT, frame_num$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t frame_num
     * }
     */
    public static void frame_num(MemorySegment struct, int fieldValue) {
        struct.set(frame_num$LAYOUT, frame_num$OFFSET, fieldValue);
    }

    private static final OfInt PicOrderCnt$LAYOUT = (OfInt)$LAYOUT.select(groupElement("PicOrderCnt"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32_t PicOrderCnt
     * }
     */
    public static final OfInt PicOrderCnt$layout() {
        return PicOrderCnt$LAYOUT;
    }

    private static final long PicOrderCnt$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32_t PicOrderCnt
     * }
     */
    public static final long PicOrderCnt$offset() {
        return PicOrderCnt$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32_t PicOrderCnt
     * }
     */
    public static int PicOrderCnt(MemorySegment struct) {
        return struct.get(PicOrderCnt$LAYOUT, PicOrderCnt$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32_t PicOrderCnt
     * }
     */
    public static void PicOrderCnt(MemorySegment struct, int fieldValue) {
        struct.set(PicOrderCnt$LAYOUT, PicOrderCnt$OFFSET, fieldValue);
    }

    private static final OfByte temporal_id$LAYOUT = (OfByte)$LAYOUT.select(groupElement("temporal_id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t temporal_id
     * }
     */
    public static final OfByte temporal_id$layout() {
        return temporal_id$LAYOUT;
    }

    private static final long temporal_id$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t temporal_id
     * }
     */
    public static final long temporal_id$offset() {
        return temporal_id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t temporal_id
     * }
     */
    public static byte temporal_id(MemorySegment struct) {
        return struct.get(temporal_id$LAYOUT, temporal_id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t temporal_id
     * }
     */
    public static void temporal_id(MemorySegment struct, byte fieldValue) {
        struct.set(temporal_id$LAYOUT, temporal_id$OFFSET, fieldValue);
    }

    private static final SequenceLayout reserved1$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("reserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t reserved1[3]
     * }
     */
    public static final SequenceLayout reserved1$layout() {
        return reserved1$LAYOUT;
    }

    private static final long reserved1$OFFSET = 21;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t reserved1[3]
     * }
     */
    public static final long reserved1$offset() {
        return reserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t reserved1[3]
     * }
     */
    public static MemorySegment reserved1(MemorySegment struct) {
        return struct.asSlice(reserved1$OFFSET, reserved1$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t reserved1[3]
     * }
     */
    public static void reserved1(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, reserved1$OFFSET, reserved1$LAYOUT.byteSize());
    }

    private static long[] reserved1$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint8_t reserved1[3]
     * }
     */
    public static long[] reserved1$dimensions() {
        return reserved1$DIMS;
    }
    private static final VarHandle reserved1$ELEM_HANDLE = reserved1$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint8_t reserved1[3]
     * }
     */
    public static byte reserved1(MemorySegment struct, long index0) {
        return (byte)reserved1$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint8_t reserved1[3]
     * }
     */
    public static void reserved1(MemorySegment struct, long index0, byte fieldValue) {
        reserved1$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final AddressLayout pRefLists$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pRefLists"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const StdVideoEncodeH264ReferenceListsInfo *pRefLists
     * }
     */
    public static final AddressLayout pRefLists$layout() {
        return pRefLists$LAYOUT;
    }

    private static final long pRefLists$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const StdVideoEncodeH264ReferenceListsInfo *pRefLists
     * }
     */
    public static final long pRefLists$offset() {
        return pRefLists$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const StdVideoEncodeH264ReferenceListsInfo *pRefLists
     * }
     */
    public static MemorySegment pRefLists(MemorySegment struct) {
        return struct.get(pRefLists$LAYOUT, pRefLists$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const StdVideoEncodeH264ReferenceListsInfo *pRefLists
     * }
     */
    public static void pRefLists(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pRefLists$LAYOUT, pRefLists$OFFSET, fieldValue);
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

