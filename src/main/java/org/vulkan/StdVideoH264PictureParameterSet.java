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
 * struct StdVideoH264PictureParameterSet {
 *     StdVideoH264PpsFlags flags;
 *     uint8_t seq_parameter_set_id;
 *     uint8_t pic_parameter_set_id;
 *     uint8_t num_ref_idx_l0_default_active_minus1;
 *     uint8_t num_ref_idx_l1_default_active_minus1;
 *     StdVideoH264WeightedBipredIdc weighted_bipred_idc;
 *     int8_t pic_init_qp_minus26;
 *     int8_t pic_init_qs_minus26;
 *     int8_t chroma_qp_index_offset;
 *     int8_t second_chroma_qp_index_offset;
 *     const StdVideoH264ScalingLists *pScalingLists;
 * }
 * }
 */
public class StdVideoH264PictureParameterSet {

    StdVideoH264PictureParameterSet() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        StdVideoH264PpsFlags.layout().withName("flags"),
        vulkan_h.C_CHAR.withName("seq_parameter_set_id"),
        vulkan_h.C_CHAR.withName("pic_parameter_set_id"),
        vulkan_h.C_CHAR.withName("num_ref_idx_l0_default_active_minus1"),
        vulkan_h.C_CHAR.withName("num_ref_idx_l1_default_active_minus1"),
        vulkan_h.C_INT.withName("weighted_bipred_idc"),
        vulkan_h.C_CHAR.withName("pic_init_qp_minus26"),
        vulkan_h.C_CHAR.withName("pic_init_qs_minus26"),
        vulkan_h.C_CHAR.withName("chroma_qp_index_offset"),
        vulkan_h.C_CHAR.withName("second_chroma_qp_index_offset"),
        vulkan_h.C_POINTER.withName("pScalingLists")
    ).withName("StdVideoH264PictureParameterSet");

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
     * StdVideoH264PpsFlags flags
     * }
     */
    public static final GroupLayout flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * StdVideoH264PpsFlags flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * StdVideoH264PpsFlags flags
     * }
     */
    public static MemorySegment flags(MemorySegment struct) {
        return struct.asSlice(flags$OFFSET, flags$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * StdVideoH264PpsFlags flags
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

    private static final OfByte num_ref_idx_l0_default_active_minus1$LAYOUT = (OfByte)$LAYOUT.select(groupElement("num_ref_idx_l0_default_active_minus1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t num_ref_idx_l0_default_active_minus1
     * }
     */
    public static final OfByte num_ref_idx_l0_default_active_minus1$layout() {
        return num_ref_idx_l0_default_active_minus1$LAYOUT;
    }

    private static final long num_ref_idx_l0_default_active_minus1$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t num_ref_idx_l0_default_active_minus1
     * }
     */
    public static final long num_ref_idx_l0_default_active_minus1$offset() {
        return num_ref_idx_l0_default_active_minus1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t num_ref_idx_l0_default_active_minus1
     * }
     */
    public static byte num_ref_idx_l0_default_active_minus1(MemorySegment struct) {
        return struct.get(num_ref_idx_l0_default_active_minus1$LAYOUT, num_ref_idx_l0_default_active_minus1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t num_ref_idx_l0_default_active_minus1
     * }
     */
    public static void num_ref_idx_l0_default_active_minus1(MemorySegment struct, byte fieldValue) {
        struct.set(num_ref_idx_l0_default_active_minus1$LAYOUT, num_ref_idx_l0_default_active_minus1$OFFSET, fieldValue);
    }

    private static final OfByte num_ref_idx_l1_default_active_minus1$LAYOUT = (OfByte)$LAYOUT.select(groupElement("num_ref_idx_l1_default_active_minus1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t num_ref_idx_l1_default_active_minus1
     * }
     */
    public static final OfByte num_ref_idx_l1_default_active_minus1$layout() {
        return num_ref_idx_l1_default_active_minus1$LAYOUT;
    }

    private static final long num_ref_idx_l1_default_active_minus1$OFFSET = 7;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t num_ref_idx_l1_default_active_minus1
     * }
     */
    public static final long num_ref_idx_l1_default_active_minus1$offset() {
        return num_ref_idx_l1_default_active_minus1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t num_ref_idx_l1_default_active_minus1
     * }
     */
    public static byte num_ref_idx_l1_default_active_minus1(MemorySegment struct) {
        return struct.get(num_ref_idx_l1_default_active_minus1$LAYOUT, num_ref_idx_l1_default_active_minus1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t num_ref_idx_l1_default_active_minus1
     * }
     */
    public static void num_ref_idx_l1_default_active_minus1(MemorySegment struct, byte fieldValue) {
        struct.set(num_ref_idx_l1_default_active_minus1$LAYOUT, num_ref_idx_l1_default_active_minus1$OFFSET, fieldValue);
    }

    private static final OfInt weighted_bipred_idc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("weighted_bipred_idc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * StdVideoH264WeightedBipredIdc weighted_bipred_idc
     * }
     */
    public static final OfInt weighted_bipred_idc$layout() {
        return weighted_bipred_idc$LAYOUT;
    }

    private static final long weighted_bipred_idc$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * StdVideoH264WeightedBipredIdc weighted_bipred_idc
     * }
     */
    public static final long weighted_bipred_idc$offset() {
        return weighted_bipred_idc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * StdVideoH264WeightedBipredIdc weighted_bipred_idc
     * }
     */
    public static int weighted_bipred_idc(MemorySegment struct) {
        return struct.get(weighted_bipred_idc$LAYOUT, weighted_bipred_idc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * StdVideoH264WeightedBipredIdc weighted_bipred_idc
     * }
     */
    public static void weighted_bipred_idc(MemorySegment struct, int fieldValue) {
        struct.set(weighted_bipred_idc$LAYOUT, weighted_bipred_idc$OFFSET, fieldValue);
    }

    private static final OfByte pic_init_qp_minus26$LAYOUT = (OfByte)$LAYOUT.select(groupElement("pic_init_qp_minus26"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int8_t pic_init_qp_minus26
     * }
     */
    public static final OfByte pic_init_qp_minus26$layout() {
        return pic_init_qp_minus26$LAYOUT;
    }

    private static final long pic_init_qp_minus26$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int8_t pic_init_qp_minus26
     * }
     */
    public static final long pic_init_qp_minus26$offset() {
        return pic_init_qp_minus26$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int8_t pic_init_qp_minus26
     * }
     */
    public static byte pic_init_qp_minus26(MemorySegment struct) {
        return struct.get(pic_init_qp_minus26$LAYOUT, pic_init_qp_minus26$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int8_t pic_init_qp_minus26
     * }
     */
    public static void pic_init_qp_minus26(MemorySegment struct, byte fieldValue) {
        struct.set(pic_init_qp_minus26$LAYOUT, pic_init_qp_minus26$OFFSET, fieldValue);
    }

    private static final OfByte pic_init_qs_minus26$LAYOUT = (OfByte)$LAYOUT.select(groupElement("pic_init_qs_minus26"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int8_t pic_init_qs_minus26
     * }
     */
    public static final OfByte pic_init_qs_minus26$layout() {
        return pic_init_qs_minus26$LAYOUT;
    }

    private static final long pic_init_qs_minus26$OFFSET = 13;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int8_t pic_init_qs_minus26
     * }
     */
    public static final long pic_init_qs_minus26$offset() {
        return pic_init_qs_minus26$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int8_t pic_init_qs_minus26
     * }
     */
    public static byte pic_init_qs_minus26(MemorySegment struct) {
        return struct.get(pic_init_qs_minus26$LAYOUT, pic_init_qs_minus26$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int8_t pic_init_qs_minus26
     * }
     */
    public static void pic_init_qs_minus26(MemorySegment struct, byte fieldValue) {
        struct.set(pic_init_qs_minus26$LAYOUT, pic_init_qs_minus26$OFFSET, fieldValue);
    }

    private static final OfByte chroma_qp_index_offset$LAYOUT = (OfByte)$LAYOUT.select(groupElement("chroma_qp_index_offset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int8_t chroma_qp_index_offset
     * }
     */
    public static final OfByte chroma_qp_index_offset$layout() {
        return chroma_qp_index_offset$LAYOUT;
    }

    private static final long chroma_qp_index_offset$OFFSET = 14;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int8_t chroma_qp_index_offset
     * }
     */
    public static final long chroma_qp_index_offset$offset() {
        return chroma_qp_index_offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int8_t chroma_qp_index_offset
     * }
     */
    public static byte chroma_qp_index_offset(MemorySegment struct) {
        return struct.get(chroma_qp_index_offset$LAYOUT, chroma_qp_index_offset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int8_t chroma_qp_index_offset
     * }
     */
    public static void chroma_qp_index_offset(MemorySegment struct, byte fieldValue) {
        struct.set(chroma_qp_index_offset$LAYOUT, chroma_qp_index_offset$OFFSET, fieldValue);
    }

    private static final OfByte second_chroma_qp_index_offset$LAYOUT = (OfByte)$LAYOUT.select(groupElement("second_chroma_qp_index_offset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int8_t second_chroma_qp_index_offset
     * }
     */
    public static final OfByte second_chroma_qp_index_offset$layout() {
        return second_chroma_qp_index_offset$LAYOUT;
    }

    private static final long second_chroma_qp_index_offset$OFFSET = 15;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int8_t second_chroma_qp_index_offset
     * }
     */
    public static final long second_chroma_qp_index_offset$offset() {
        return second_chroma_qp_index_offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int8_t second_chroma_qp_index_offset
     * }
     */
    public static byte second_chroma_qp_index_offset(MemorySegment struct) {
        return struct.get(second_chroma_qp_index_offset$LAYOUT, second_chroma_qp_index_offset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int8_t second_chroma_qp_index_offset
     * }
     */
    public static void second_chroma_qp_index_offset(MemorySegment struct, byte fieldValue) {
        struct.set(second_chroma_qp_index_offset$LAYOUT, second_chroma_qp_index_offset$OFFSET, fieldValue);
    }

    private static final AddressLayout pScalingLists$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pScalingLists"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const StdVideoH264ScalingLists *pScalingLists
     * }
     */
    public static final AddressLayout pScalingLists$layout() {
        return pScalingLists$LAYOUT;
    }

    private static final long pScalingLists$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const StdVideoH264ScalingLists *pScalingLists
     * }
     */
    public static final long pScalingLists$offset() {
        return pScalingLists$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const StdVideoH264ScalingLists *pScalingLists
     * }
     */
    public static MemorySegment pScalingLists(MemorySegment struct) {
        return struct.get(pScalingLists$LAYOUT, pScalingLists$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const StdVideoH264ScalingLists *pScalingLists
     * }
     */
    public static void pScalingLists(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pScalingLists$LAYOUT, pScalingLists$OFFSET, fieldValue);
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

