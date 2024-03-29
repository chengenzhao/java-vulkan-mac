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
 * struct StdVideoEncodeH265PictureInfo {
 *     StdVideoEncodeH265PictureInfoFlags flags;
 *     StdVideoH265PictureType pic_type;
 *     uint8_t sps_video_parameter_set_id;
 *     uint8_t pps_seq_parameter_set_id;
 *     uint8_t pps_pic_parameter_set_id;
 *     uint8_t short_term_ref_pic_set_idx;
 *     int32_t PicOrderCntVal;
 *     uint8_t TemporalId;
 *     uint8_t reserved1[7];
 *     const StdVideoEncodeH265ReferenceListsInfo *pRefLists;
 *     const StdVideoH265ShortTermRefPicSet *pShortTermRefPicSet;
 *     const StdVideoEncodeH265LongTermRefPics *pLongTermRefPics;
 * }
 * }
 */
public class StdVideoEncodeH265PictureInfo {

    StdVideoEncodeH265PictureInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        StdVideoEncodeH265PictureInfoFlags.layout().withName("flags"),
        vulkan_h.C_INT.withName("pic_type"),
        vulkan_h.C_CHAR.withName("sps_video_parameter_set_id"),
        vulkan_h.C_CHAR.withName("pps_seq_parameter_set_id"),
        vulkan_h.C_CHAR.withName("pps_pic_parameter_set_id"),
        vulkan_h.C_CHAR.withName("short_term_ref_pic_set_idx"),
        vulkan_h.C_INT.withName("PicOrderCntVal"),
        vulkan_h.C_CHAR.withName("TemporalId"),
        MemoryLayout.sequenceLayout(7, vulkan_h.C_CHAR).withName("reserved1"),
        vulkan_h.C_POINTER.withName("pRefLists"),
        vulkan_h.C_POINTER.withName("pShortTermRefPicSet"),
        vulkan_h.C_POINTER.withName("pLongTermRefPics")
    ).withName("StdVideoEncodeH265PictureInfo");

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
     * StdVideoEncodeH265PictureInfoFlags flags
     * }
     */
    public static final GroupLayout flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * StdVideoEncodeH265PictureInfoFlags flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * StdVideoEncodeH265PictureInfoFlags flags
     * }
     */
    public static MemorySegment flags(MemorySegment struct) {
        return struct.asSlice(flags$OFFSET, flags$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * StdVideoEncodeH265PictureInfoFlags flags
     * }
     */
    public static void flags(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, flags$OFFSET, flags$LAYOUT.byteSize());
    }

    private static final OfInt pic_type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pic_type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * StdVideoH265PictureType pic_type
     * }
     */
    public static final OfInt pic_type$layout() {
        return pic_type$LAYOUT;
    }

    private static final long pic_type$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * StdVideoH265PictureType pic_type
     * }
     */
    public static final long pic_type$offset() {
        return pic_type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * StdVideoH265PictureType pic_type
     * }
     */
    public static int pic_type(MemorySegment struct) {
        return struct.get(pic_type$LAYOUT, pic_type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * StdVideoH265PictureType pic_type
     * }
     */
    public static void pic_type(MemorySegment struct, int fieldValue) {
        struct.set(pic_type$LAYOUT, pic_type$OFFSET, fieldValue);
    }

    private static final OfByte sps_video_parameter_set_id$LAYOUT = (OfByte)$LAYOUT.select(groupElement("sps_video_parameter_set_id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t sps_video_parameter_set_id
     * }
     */
    public static final OfByte sps_video_parameter_set_id$layout() {
        return sps_video_parameter_set_id$LAYOUT;
    }

    private static final long sps_video_parameter_set_id$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t sps_video_parameter_set_id
     * }
     */
    public static final long sps_video_parameter_set_id$offset() {
        return sps_video_parameter_set_id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t sps_video_parameter_set_id
     * }
     */
    public static byte sps_video_parameter_set_id(MemorySegment struct) {
        return struct.get(sps_video_parameter_set_id$LAYOUT, sps_video_parameter_set_id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t sps_video_parameter_set_id
     * }
     */
    public static void sps_video_parameter_set_id(MemorySegment struct, byte fieldValue) {
        struct.set(sps_video_parameter_set_id$LAYOUT, sps_video_parameter_set_id$OFFSET, fieldValue);
    }

    private static final OfByte pps_seq_parameter_set_id$LAYOUT = (OfByte)$LAYOUT.select(groupElement("pps_seq_parameter_set_id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t pps_seq_parameter_set_id
     * }
     */
    public static final OfByte pps_seq_parameter_set_id$layout() {
        return pps_seq_parameter_set_id$LAYOUT;
    }

    private static final long pps_seq_parameter_set_id$OFFSET = 9;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t pps_seq_parameter_set_id
     * }
     */
    public static final long pps_seq_parameter_set_id$offset() {
        return pps_seq_parameter_set_id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t pps_seq_parameter_set_id
     * }
     */
    public static byte pps_seq_parameter_set_id(MemorySegment struct) {
        return struct.get(pps_seq_parameter_set_id$LAYOUT, pps_seq_parameter_set_id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t pps_seq_parameter_set_id
     * }
     */
    public static void pps_seq_parameter_set_id(MemorySegment struct, byte fieldValue) {
        struct.set(pps_seq_parameter_set_id$LAYOUT, pps_seq_parameter_set_id$OFFSET, fieldValue);
    }

    private static final OfByte pps_pic_parameter_set_id$LAYOUT = (OfByte)$LAYOUT.select(groupElement("pps_pic_parameter_set_id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t pps_pic_parameter_set_id
     * }
     */
    public static final OfByte pps_pic_parameter_set_id$layout() {
        return pps_pic_parameter_set_id$LAYOUT;
    }

    private static final long pps_pic_parameter_set_id$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t pps_pic_parameter_set_id
     * }
     */
    public static final long pps_pic_parameter_set_id$offset() {
        return pps_pic_parameter_set_id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t pps_pic_parameter_set_id
     * }
     */
    public static byte pps_pic_parameter_set_id(MemorySegment struct) {
        return struct.get(pps_pic_parameter_set_id$LAYOUT, pps_pic_parameter_set_id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t pps_pic_parameter_set_id
     * }
     */
    public static void pps_pic_parameter_set_id(MemorySegment struct, byte fieldValue) {
        struct.set(pps_pic_parameter_set_id$LAYOUT, pps_pic_parameter_set_id$OFFSET, fieldValue);
    }

    private static final OfByte short_term_ref_pic_set_idx$LAYOUT = (OfByte)$LAYOUT.select(groupElement("short_term_ref_pic_set_idx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t short_term_ref_pic_set_idx
     * }
     */
    public static final OfByte short_term_ref_pic_set_idx$layout() {
        return short_term_ref_pic_set_idx$LAYOUT;
    }

    private static final long short_term_ref_pic_set_idx$OFFSET = 11;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t short_term_ref_pic_set_idx
     * }
     */
    public static final long short_term_ref_pic_set_idx$offset() {
        return short_term_ref_pic_set_idx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t short_term_ref_pic_set_idx
     * }
     */
    public static byte short_term_ref_pic_set_idx(MemorySegment struct) {
        return struct.get(short_term_ref_pic_set_idx$LAYOUT, short_term_ref_pic_set_idx$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t short_term_ref_pic_set_idx
     * }
     */
    public static void short_term_ref_pic_set_idx(MemorySegment struct, byte fieldValue) {
        struct.set(short_term_ref_pic_set_idx$LAYOUT, short_term_ref_pic_set_idx$OFFSET, fieldValue);
    }

    private static final OfInt PicOrderCntVal$LAYOUT = (OfInt)$LAYOUT.select(groupElement("PicOrderCntVal"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32_t PicOrderCntVal
     * }
     */
    public static final OfInt PicOrderCntVal$layout() {
        return PicOrderCntVal$LAYOUT;
    }

    private static final long PicOrderCntVal$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32_t PicOrderCntVal
     * }
     */
    public static final long PicOrderCntVal$offset() {
        return PicOrderCntVal$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32_t PicOrderCntVal
     * }
     */
    public static int PicOrderCntVal(MemorySegment struct) {
        return struct.get(PicOrderCntVal$LAYOUT, PicOrderCntVal$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32_t PicOrderCntVal
     * }
     */
    public static void PicOrderCntVal(MemorySegment struct, int fieldValue) {
        struct.set(PicOrderCntVal$LAYOUT, PicOrderCntVal$OFFSET, fieldValue);
    }

    private static final OfByte TemporalId$LAYOUT = (OfByte)$LAYOUT.select(groupElement("TemporalId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t TemporalId
     * }
     */
    public static final OfByte TemporalId$layout() {
        return TemporalId$LAYOUT;
    }

    private static final long TemporalId$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t TemporalId
     * }
     */
    public static final long TemporalId$offset() {
        return TemporalId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t TemporalId
     * }
     */
    public static byte TemporalId(MemorySegment struct) {
        return struct.get(TemporalId$LAYOUT, TemporalId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t TemporalId
     * }
     */
    public static void TemporalId(MemorySegment struct, byte fieldValue) {
        struct.set(TemporalId$LAYOUT, TemporalId$OFFSET, fieldValue);
    }

    private static final SequenceLayout reserved1$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("reserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t reserved1[7]
     * }
     */
    public static final SequenceLayout reserved1$layout() {
        return reserved1$LAYOUT;
    }

    private static final long reserved1$OFFSET = 17;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t reserved1[7]
     * }
     */
    public static final long reserved1$offset() {
        return reserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t reserved1[7]
     * }
     */
    public static MemorySegment reserved1(MemorySegment struct) {
        return struct.asSlice(reserved1$OFFSET, reserved1$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t reserved1[7]
     * }
     */
    public static void reserved1(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, reserved1$OFFSET, reserved1$LAYOUT.byteSize());
    }

    private static long[] reserved1$DIMS = { 7 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint8_t reserved1[7]
     * }
     */
    public static long[] reserved1$dimensions() {
        return reserved1$DIMS;
    }
    private static final VarHandle reserved1$ELEM_HANDLE = reserved1$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint8_t reserved1[7]
     * }
     */
    public static byte reserved1(MemorySegment struct, long index0) {
        return (byte)reserved1$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint8_t reserved1[7]
     * }
     */
    public static void reserved1(MemorySegment struct, long index0, byte fieldValue) {
        reserved1$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final AddressLayout pRefLists$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pRefLists"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const StdVideoEncodeH265ReferenceListsInfo *pRefLists
     * }
     */
    public static final AddressLayout pRefLists$layout() {
        return pRefLists$LAYOUT;
    }

    private static final long pRefLists$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const StdVideoEncodeH265ReferenceListsInfo *pRefLists
     * }
     */
    public static final long pRefLists$offset() {
        return pRefLists$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const StdVideoEncodeH265ReferenceListsInfo *pRefLists
     * }
     */
    public static MemorySegment pRefLists(MemorySegment struct) {
        return struct.get(pRefLists$LAYOUT, pRefLists$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const StdVideoEncodeH265ReferenceListsInfo *pRefLists
     * }
     */
    public static void pRefLists(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pRefLists$LAYOUT, pRefLists$OFFSET, fieldValue);
    }

    private static final AddressLayout pShortTermRefPicSet$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pShortTermRefPicSet"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const StdVideoH265ShortTermRefPicSet *pShortTermRefPicSet
     * }
     */
    public static final AddressLayout pShortTermRefPicSet$layout() {
        return pShortTermRefPicSet$LAYOUT;
    }

    private static final long pShortTermRefPicSet$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const StdVideoH265ShortTermRefPicSet *pShortTermRefPicSet
     * }
     */
    public static final long pShortTermRefPicSet$offset() {
        return pShortTermRefPicSet$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const StdVideoH265ShortTermRefPicSet *pShortTermRefPicSet
     * }
     */
    public static MemorySegment pShortTermRefPicSet(MemorySegment struct) {
        return struct.get(pShortTermRefPicSet$LAYOUT, pShortTermRefPicSet$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const StdVideoH265ShortTermRefPicSet *pShortTermRefPicSet
     * }
     */
    public static void pShortTermRefPicSet(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pShortTermRefPicSet$LAYOUT, pShortTermRefPicSet$OFFSET, fieldValue);
    }

    private static final AddressLayout pLongTermRefPics$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pLongTermRefPics"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const StdVideoEncodeH265LongTermRefPics *pLongTermRefPics
     * }
     */
    public static final AddressLayout pLongTermRefPics$layout() {
        return pLongTermRefPics$LAYOUT;
    }

    private static final long pLongTermRefPics$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const StdVideoEncodeH265LongTermRefPics *pLongTermRefPics
     * }
     */
    public static final long pLongTermRefPics$offset() {
        return pLongTermRefPics$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const StdVideoEncodeH265LongTermRefPics *pLongTermRefPics
     * }
     */
    public static MemorySegment pLongTermRefPics(MemorySegment struct) {
        return struct.get(pLongTermRefPics$LAYOUT, pLongTermRefPics$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const StdVideoEncodeH265LongTermRefPics *pLongTermRefPics
     * }
     */
    public static void pLongTermRefPics(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pLongTermRefPics$LAYOUT, pLongTermRefPics$OFFSET, fieldValue);
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

