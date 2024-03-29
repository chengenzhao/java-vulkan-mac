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
 * struct StdVideoH264SequenceParameterSetVui {
 *     StdVideoH264SpsVuiFlags flags;
 *     StdVideoH264AspectRatioIdc aspect_ratio_idc;
 *     uint16_t sar_width;
 *     uint16_t sar_height;
 *     uint8_t video_format;
 *     uint8_t colour_primaries;
 *     uint8_t transfer_characteristics;
 *     uint8_t matrix_coefficients;
 *     uint32_t num_units_in_tick;
 *     uint32_t time_scale;
 *     uint8_t max_num_reorder_frames;
 *     uint8_t max_dec_frame_buffering;
 *     uint8_t chroma_sample_loc_type_top_field;
 *     uint8_t chroma_sample_loc_type_bottom_field;
 *     uint32_t reserved1;
 *     const StdVideoH264HrdParameters *pHrdParameters;
 * }
 * }
 */
public class StdVideoH264SequenceParameterSetVui {

    StdVideoH264SequenceParameterSetVui() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        StdVideoH264SpsVuiFlags.layout().withName("flags"),
        vulkan_h.C_INT.withName("aspect_ratio_idc"),
        vulkan_h.C_SHORT.withName("sar_width"),
        vulkan_h.C_SHORT.withName("sar_height"),
        vulkan_h.C_CHAR.withName("video_format"),
        vulkan_h.C_CHAR.withName("colour_primaries"),
        vulkan_h.C_CHAR.withName("transfer_characteristics"),
        vulkan_h.C_CHAR.withName("matrix_coefficients"),
        vulkan_h.C_INT.withName("num_units_in_tick"),
        vulkan_h.C_INT.withName("time_scale"),
        vulkan_h.C_CHAR.withName("max_num_reorder_frames"),
        vulkan_h.C_CHAR.withName("max_dec_frame_buffering"),
        vulkan_h.C_CHAR.withName("chroma_sample_loc_type_top_field"),
        vulkan_h.C_CHAR.withName("chroma_sample_loc_type_bottom_field"),
        vulkan_h.C_INT.withName("reserved1"),
        vulkan_h.C_POINTER.withName("pHrdParameters")
    ).withName("StdVideoH264SequenceParameterSetVui");

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
     * StdVideoH264SpsVuiFlags flags
     * }
     */
    public static final GroupLayout flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * StdVideoH264SpsVuiFlags flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * StdVideoH264SpsVuiFlags flags
     * }
     */
    public static MemorySegment flags(MemorySegment struct) {
        return struct.asSlice(flags$OFFSET, flags$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * StdVideoH264SpsVuiFlags flags
     * }
     */
    public static void flags(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, flags$OFFSET, flags$LAYOUT.byteSize());
    }

    private static final OfInt aspect_ratio_idc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("aspect_ratio_idc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * StdVideoH264AspectRatioIdc aspect_ratio_idc
     * }
     */
    public static final OfInt aspect_ratio_idc$layout() {
        return aspect_ratio_idc$LAYOUT;
    }

    private static final long aspect_ratio_idc$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * StdVideoH264AspectRatioIdc aspect_ratio_idc
     * }
     */
    public static final long aspect_ratio_idc$offset() {
        return aspect_ratio_idc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * StdVideoH264AspectRatioIdc aspect_ratio_idc
     * }
     */
    public static int aspect_ratio_idc(MemorySegment struct) {
        return struct.get(aspect_ratio_idc$LAYOUT, aspect_ratio_idc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * StdVideoH264AspectRatioIdc aspect_ratio_idc
     * }
     */
    public static void aspect_ratio_idc(MemorySegment struct, int fieldValue) {
        struct.set(aspect_ratio_idc$LAYOUT, aspect_ratio_idc$OFFSET, fieldValue);
    }

    private static final OfShort sar_width$LAYOUT = (OfShort)$LAYOUT.select(groupElement("sar_width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint16_t sar_width
     * }
     */
    public static final OfShort sar_width$layout() {
        return sar_width$LAYOUT;
    }

    private static final long sar_width$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint16_t sar_width
     * }
     */
    public static final long sar_width$offset() {
        return sar_width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint16_t sar_width
     * }
     */
    public static short sar_width(MemorySegment struct) {
        return struct.get(sar_width$LAYOUT, sar_width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint16_t sar_width
     * }
     */
    public static void sar_width(MemorySegment struct, short fieldValue) {
        struct.set(sar_width$LAYOUT, sar_width$OFFSET, fieldValue);
    }

    private static final OfShort sar_height$LAYOUT = (OfShort)$LAYOUT.select(groupElement("sar_height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint16_t sar_height
     * }
     */
    public static final OfShort sar_height$layout() {
        return sar_height$LAYOUT;
    }

    private static final long sar_height$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint16_t sar_height
     * }
     */
    public static final long sar_height$offset() {
        return sar_height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint16_t sar_height
     * }
     */
    public static short sar_height(MemorySegment struct) {
        return struct.get(sar_height$LAYOUT, sar_height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint16_t sar_height
     * }
     */
    public static void sar_height(MemorySegment struct, short fieldValue) {
        struct.set(sar_height$LAYOUT, sar_height$OFFSET, fieldValue);
    }

    private static final OfByte video_format$LAYOUT = (OfByte)$LAYOUT.select(groupElement("video_format"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t video_format
     * }
     */
    public static final OfByte video_format$layout() {
        return video_format$LAYOUT;
    }

    private static final long video_format$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t video_format
     * }
     */
    public static final long video_format$offset() {
        return video_format$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t video_format
     * }
     */
    public static byte video_format(MemorySegment struct) {
        return struct.get(video_format$LAYOUT, video_format$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t video_format
     * }
     */
    public static void video_format(MemorySegment struct, byte fieldValue) {
        struct.set(video_format$LAYOUT, video_format$OFFSET, fieldValue);
    }

    private static final OfByte colour_primaries$LAYOUT = (OfByte)$LAYOUT.select(groupElement("colour_primaries"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t colour_primaries
     * }
     */
    public static final OfByte colour_primaries$layout() {
        return colour_primaries$LAYOUT;
    }

    private static final long colour_primaries$OFFSET = 13;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t colour_primaries
     * }
     */
    public static final long colour_primaries$offset() {
        return colour_primaries$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t colour_primaries
     * }
     */
    public static byte colour_primaries(MemorySegment struct) {
        return struct.get(colour_primaries$LAYOUT, colour_primaries$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t colour_primaries
     * }
     */
    public static void colour_primaries(MemorySegment struct, byte fieldValue) {
        struct.set(colour_primaries$LAYOUT, colour_primaries$OFFSET, fieldValue);
    }

    private static final OfByte transfer_characteristics$LAYOUT = (OfByte)$LAYOUT.select(groupElement("transfer_characteristics"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t transfer_characteristics
     * }
     */
    public static final OfByte transfer_characteristics$layout() {
        return transfer_characteristics$LAYOUT;
    }

    private static final long transfer_characteristics$OFFSET = 14;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t transfer_characteristics
     * }
     */
    public static final long transfer_characteristics$offset() {
        return transfer_characteristics$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t transfer_characteristics
     * }
     */
    public static byte transfer_characteristics(MemorySegment struct) {
        return struct.get(transfer_characteristics$LAYOUT, transfer_characteristics$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t transfer_characteristics
     * }
     */
    public static void transfer_characteristics(MemorySegment struct, byte fieldValue) {
        struct.set(transfer_characteristics$LAYOUT, transfer_characteristics$OFFSET, fieldValue);
    }

    private static final OfByte matrix_coefficients$LAYOUT = (OfByte)$LAYOUT.select(groupElement("matrix_coefficients"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t matrix_coefficients
     * }
     */
    public static final OfByte matrix_coefficients$layout() {
        return matrix_coefficients$LAYOUT;
    }

    private static final long matrix_coefficients$OFFSET = 15;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t matrix_coefficients
     * }
     */
    public static final long matrix_coefficients$offset() {
        return matrix_coefficients$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t matrix_coefficients
     * }
     */
    public static byte matrix_coefficients(MemorySegment struct) {
        return struct.get(matrix_coefficients$LAYOUT, matrix_coefficients$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t matrix_coefficients
     * }
     */
    public static void matrix_coefficients(MemorySegment struct, byte fieldValue) {
        struct.set(matrix_coefficients$LAYOUT, matrix_coefficients$OFFSET, fieldValue);
    }

    private static final OfInt num_units_in_tick$LAYOUT = (OfInt)$LAYOUT.select(groupElement("num_units_in_tick"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t num_units_in_tick
     * }
     */
    public static final OfInt num_units_in_tick$layout() {
        return num_units_in_tick$LAYOUT;
    }

    private static final long num_units_in_tick$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t num_units_in_tick
     * }
     */
    public static final long num_units_in_tick$offset() {
        return num_units_in_tick$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t num_units_in_tick
     * }
     */
    public static int num_units_in_tick(MemorySegment struct) {
        return struct.get(num_units_in_tick$LAYOUT, num_units_in_tick$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t num_units_in_tick
     * }
     */
    public static void num_units_in_tick(MemorySegment struct, int fieldValue) {
        struct.set(num_units_in_tick$LAYOUT, num_units_in_tick$OFFSET, fieldValue);
    }

    private static final OfInt time_scale$LAYOUT = (OfInt)$LAYOUT.select(groupElement("time_scale"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t time_scale
     * }
     */
    public static final OfInt time_scale$layout() {
        return time_scale$LAYOUT;
    }

    private static final long time_scale$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t time_scale
     * }
     */
    public static final long time_scale$offset() {
        return time_scale$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t time_scale
     * }
     */
    public static int time_scale(MemorySegment struct) {
        return struct.get(time_scale$LAYOUT, time_scale$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t time_scale
     * }
     */
    public static void time_scale(MemorySegment struct, int fieldValue) {
        struct.set(time_scale$LAYOUT, time_scale$OFFSET, fieldValue);
    }

    private static final OfByte max_num_reorder_frames$LAYOUT = (OfByte)$LAYOUT.select(groupElement("max_num_reorder_frames"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t max_num_reorder_frames
     * }
     */
    public static final OfByte max_num_reorder_frames$layout() {
        return max_num_reorder_frames$LAYOUT;
    }

    private static final long max_num_reorder_frames$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t max_num_reorder_frames
     * }
     */
    public static final long max_num_reorder_frames$offset() {
        return max_num_reorder_frames$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t max_num_reorder_frames
     * }
     */
    public static byte max_num_reorder_frames(MemorySegment struct) {
        return struct.get(max_num_reorder_frames$LAYOUT, max_num_reorder_frames$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t max_num_reorder_frames
     * }
     */
    public static void max_num_reorder_frames(MemorySegment struct, byte fieldValue) {
        struct.set(max_num_reorder_frames$LAYOUT, max_num_reorder_frames$OFFSET, fieldValue);
    }

    private static final OfByte max_dec_frame_buffering$LAYOUT = (OfByte)$LAYOUT.select(groupElement("max_dec_frame_buffering"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t max_dec_frame_buffering
     * }
     */
    public static final OfByte max_dec_frame_buffering$layout() {
        return max_dec_frame_buffering$LAYOUT;
    }

    private static final long max_dec_frame_buffering$OFFSET = 25;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t max_dec_frame_buffering
     * }
     */
    public static final long max_dec_frame_buffering$offset() {
        return max_dec_frame_buffering$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t max_dec_frame_buffering
     * }
     */
    public static byte max_dec_frame_buffering(MemorySegment struct) {
        return struct.get(max_dec_frame_buffering$LAYOUT, max_dec_frame_buffering$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t max_dec_frame_buffering
     * }
     */
    public static void max_dec_frame_buffering(MemorySegment struct, byte fieldValue) {
        struct.set(max_dec_frame_buffering$LAYOUT, max_dec_frame_buffering$OFFSET, fieldValue);
    }

    private static final OfByte chroma_sample_loc_type_top_field$LAYOUT = (OfByte)$LAYOUT.select(groupElement("chroma_sample_loc_type_top_field"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t chroma_sample_loc_type_top_field
     * }
     */
    public static final OfByte chroma_sample_loc_type_top_field$layout() {
        return chroma_sample_loc_type_top_field$LAYOUT;
    }

    private static final long chroma_sample_loc_type_top_field$OFFSET = 26;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t chroma_sample_loc_type_top_field
     * }
     */
    public static final long chroma_sample_loc_type_top_field$offset() {
        return chroma_sample_loc_type_top_field$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t chroma_sample_loc_type_top_field
     * }
     */
    public static byte chroma_sample_loc_type_top_field(MemorySegment struct) {
        return struct.get(chroma_sample_loc_type_top_field$LAYOUT, chroma_sample_loc_type_top_field$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t chroma_sample_loc_type_top_field
     * }
     */
    public static void chroma_sample_loc_type_top_field(MemorySegment struct, byte fieldValue) {
        struct.set(chroma_sample_loc_type_top_field$LAYOUT, chroma_sample_loc_type_top_field$OFFSET, fieldValue);
    }

    private static final OfByte chroma_sample_loc_type_bottom_field$LAYOUT = (OfByte)$LAYOUT.select(groupElement("chroma_sample_loc_type_bottom_field"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t chroma_sample_loc_type_bottom_field
     * }
     */
    public static final OfByte chroma_sample_loc_type_bottom_field$layout() {
        return chroma_sample_loc_type_bottom_field$LAYOUT;
    }

    private static final long chroma_sample_loc_type_bottom_field$OFFSET = 27;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t chroma_sample_loc_type_bottom_field
     * }
     */
    public static final long chroma_sample_loc_type_bottom_field$offset() {
        return chroma_sample_loc_type_bottom_field$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t chroma_sample_loc_type_bottom_field
     * }
     */
    public static byte chroma_sample_loc_type_bottom_field(MemorySegment struct) {
        return struct.get(chroma_sample_loc_type_bottom_field$LAYOUT, chroma_sample_loc_type_bottom_field$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t chroma_sample_loc_type_bottom_field
     * }
     */
    public static void chroma_sample_loc_type_bottom_field(MemorySegment struct, byte fieldValue) {
        struct.set(chroma_sample_loc_type_bottom_field$LAYOUT, chroma_sample_loc_type_bottom_field$OFFSET, fieldValue);
    }

    private static final OfInt reserved1$LAYOUT = (OfInt)$LAYOUT.select(groupElement("reserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t reserved1
     * }
     */
    public static final OfInt reserved1$layout() {
        return reserved1$LAYOUT;
    }

    private static final long reserved1$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t reserved1
     * }
     */
    public static final long reserved1$offset() {
        return reserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t reserved1
     * }
     */
    public static int reserved1(MemorySegment struct) {
        return struct.get(reserved1$LAYOUT, reserved1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t reserved1
     * }
     */
    public static void reserved1(MemorySegment struct, int fieldValue) {
        struct.set(reserved1$LAYOUT, reserved1$OFFSET, fieldValue);
    }

    private static final AddressLayout pHrdParameters$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pHrdParameters"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const StdVideoH264HrdParameters *pHrdParameters
     * }
     */
    public static final AddressLayout pHrdParameters$layout() {
        return pHrdParameters$LAYOUT;
    }

    private static final long pHrdParameters$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const StdVideoH264HrdParameters *pHrdParameters
     * }
     */
    public static final long pHrdParameters$offset() {
        return pHrdParameters$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const StdVideoH264HrdParameters *pHrdParameters
     * }
     */
    public static MemorySegment pHrdParameters(MemorySegment struct) {
        return struct.get(pHrdParameters$LAYOUT, pHrdParameters$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const StdVideoH264HrdParameters *pHrdParameters
     * }
     */
    public static void pHrdParameters(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pHrdParameters$LAYOUT, pHrdParameters$OFFSET, fieldValue);
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

