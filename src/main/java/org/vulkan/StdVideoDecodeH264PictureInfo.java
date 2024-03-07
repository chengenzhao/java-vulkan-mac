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
 * struct StdVideoDecodeH264PictureInfo {
 *     StdVideoDecodeH264PictureInfoFlags flags;
 *     uint8_t seq_parameter_set_id;
 *     uint8_t pic_parameter_set_id;
 *     uint8_t reserved1;
 *     uint8_t reserved2;
 *     uint16_t frame_num;
 *     uint16_t idr_pic_id;
 *     int32_t PicOrderCnt[2];
 * }
 * }
 */
public class StdVideoDecodeH264PictureInfo {

    StdVideoDecodeH264PictureInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        StdVideoDecodeH264PictureInfoFlags.layout().withName("flags"),
        vulkan_h.C_CHAR.withName("seq_parameter_set_id"),
        vulkan_h.C_CHAR.withName("pic_parameter_set_id"),
        vulkan_h.C_CHAR.withName("reserved1"),
        vulkan_h.C_CHAR.withName("reserved2"),
        vulkan_h.C_SHORT.withName("frame_num"),
        vulkan_h.C_SHORT.withName("idr_pic_id"),
        MemoryLayout.sequenceLayout(2, vulkan_h.C_INT).withName("PicOrderCnt")
    ).withName("StdVideoDecodeH264PictureInfo");

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
     * StdVideoDecodeH264PictureInfoFlags flags
     * }
     */
    public static final GroupLayout flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * StdVideoDecodeH264PictureInfoFlags flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * StdVideoDecodeH264PictureInfoFlags flags
     * }
     */
    public static MemorySegment flags(MemorySegment struct) {
        return struct.asSlice(flags$OFFSET, flags$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * StdVideoDecodeH264PictureInfoFlags flags
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

    private static final OfByte reserved1$LAYOUT = (OfByte)$LAYOUT.select(groupElement("reserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t reserved1
     * }
     */
    public static final OfByte reserved1$layout() {
        return reserved1$LAYOUT;
    }

    private static final long reserved1$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t reserved1
     * }
     */
    public static final long reserved1$offset() {
        return reserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t reserved1
     * }
     */
    public static byte reserved1(MemorySegment struct) {
        return struct.get(reserved1$LAYOUT, reserved1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t reserved1
     * }
     */
    public static void reserved1(MemorySegment struct, byte fieldValue) {
        struct.set(reserved1$LAYOUT, reserved1$OFFSET, fieldValue);
    }

    private static final OfByte reserved2$LAYOUT = (OfByte)$LAYOUT.select(groupElement("reserved2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t reserved2
     * }
     */
    public static final OfByte reserved2$layout() {
        return reserved2$LAYOUT;
    }

    private static final long reserved2$OFFSET = 7;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t reserved2
     * }
     */
    public static final long reserved2$offset() {
        return reserved2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t reserved2
     * }
     */
    public static byte reserved2(MemorySegment struct) {
        return struct.get(reserved2$LAYOUT, reserved2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t reserved2
     * }
     */
    public static void reserved2(MemorySegment struct, byte fieldValue) {
        struct.set(reserved2$LAYOUT, reserved2$OFFSET, fieldValue);
    }

    private static final OfShort frame_num$LAYOUT = (OfShort)$LAYOUT.select(groupElement("frame_num"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint16_t frame_num
     * }
     */
    public static final OfShort frame_num$layout() {
        return frame_num$LAYOUT;
    }

    private static final long frame_num$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint16_t frame_num
     * }
     */
    public static final long frame_num$offset() {
        return frame_num$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint16_t frame_num
     * }
     */
    public static short frame_num(MemorySegment struct) {
        return struct.get(frame_num$LAYOUT, frame_num$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint16_t frame_num
     * }
     */
    public static void frame_num(MemorySegment struct, short fieldValue) {
        struct.set(frame_num$LAYOUT, frame_num$OFFSET, fieldValue);
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

    private static final long idr_pic_id$OFFSET = 10;

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

    private static final SequenceLayout PicOrderCnt$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("PicOrderCnt"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32_t PicOrderCnt[2]
     * }
     */
    public static final SequenceLayout PicOrderCnt$layout() {
        return PicOrderCnt$LAYOUT;
    }

    private static final long PicOrderCnt$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32_t PicOrderCnt[2]
     * }
     */
    public static final long PicOrderCnt$offset() {
        return PicOrderCnt$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32_t PicOrderCnt[2]
     * }
     */
    public static MemorySegment PicOrderCnt(MemorySegment struct) {
        return struct.asSlice(PicOrderCnt$OFFSET, PicOrderCnt$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32_t PicOrderCnt[2]
     * }
     */
    public static void PicOrderCnt(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, PicOrderCnt$OFFSET, PicOrderCnt$LAYOUT.byteSize());
    }

    private static long[] PicOrderCnt$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * int32_t PicOrderCnt[2]
     * }
     */
    public static long[] PicOrderCnt$dimensions() {
        return PicOrderCnt$DIMS;
    }
    private static final VarHandle PicOrderCnt$ELEM_HANDLE = PicOrderCnt$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * int32_t PicOrderCnt[2]
     * }
     */
    public static int PicOrderCnt(MemorySegment struct, long index0) {
        return (int)PicOrderCnt$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * int32_t PicOrderCnt[2]
     * }
     */
    public static void PicOrderCnt(MemorySegment struct, long index0, int fieldValue) {
        PicOrderCnt$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

