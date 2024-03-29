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
 * struct StdVideoEncodeH265LongTermRefPics {
 *     uint8_t num_long_term_sps;
 *     uint8_t num_long_term_pics;
 *     uint8_t lt_idx_sps[32];
 *     uint8_t poc_lsb_lt[16];
 *     uint16_t used_by_curr_pic_lt_flag;
 *     uint8_t delta_poc_msb_present_flag[48];
 *     uint8_t delta_poc_msb_cycle_lt[48];
 * }
 * }
 */
public class StdVideoEncodeH265LongTermRefPics {

    StdVideoEncodeH265LongTermRefPics() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_CHAR.withName("num_long_term_sps"),
        vulkan_h.C_CHAR.withName("num_long_term_pics"),
        MemoryLayout.sequenceLayout(32, vulkan_h.C_CHAR).withName("lt_idx_sps"),
        MemoryLayout.sequenceLayout(16, vulkan_h.C_CHAR).withName("poc_lsb_lt"),
        vulkan_h.C_SHORT.withName("used_by_curr_pic_lt_flag"),
        MemoryLayout.sequenceLayout(48, vulkan_h.C_CHAR).withName("delta_poc_msb_present_flag"),
        MemoryLayout.sequenceLayout(48, vulkan_h.C_CHAR).withName("delta_poc_msb_cycle_lt")
    ).withName("StdVideoEncodeH265LongTermRefPics");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfByte num_long_term_sps$LAYOUT = (OfByte)$LAYOUT.select(groupElement("num_long_term_sps"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t num_long_term_sps
     * }
     */
    public static final OfByte num_long_term_sps$layout() {
        return num_long_term_sps$LAYOUT;
    }

    private static final long num_long_term_sps$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t num_long_term_sps
     * }
     */
    public static final long num_long_term_sps$offset() {
        return num_long_term_sps$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t num_long_term_sps
     * }
     */
    public static byte num_long_term_sps(MemorySegment struct) {
        return struct.get(num_long_term_sps$LAYOUT, num_long_term_sps$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t num_long_term_sps
     * }
     */
    public static void num_long_term_sps(MemorySegment struct, byte fieldValue) {
        struct.set(num_long_term_sps$LAYOUT, num_long_term_sps$OFFSET, fieldValue);
    }

    private static final OfByte num_long_term_pics$LAYOUT = (OfByte)$LAYOUT.select(groupElement("num_long_term_pics"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t num_long_term_pics
     * }
     */
    public static final OfByte num_long_term_pics$layout() {
        return num_long_term_pics$LAYOUT;
    }

    private static final long num_long_term_pics$OFFSET = 1;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t num_long_term_pics
     * }
     */
    public static final long num_long_term_pics$offset() {
        return num_long_term_pics$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t num_long_term_pics
     * }
     */
    public static byte num_long_term_pics(MemorySegment struct) {
        return struct.get(num_long_term_pics$LAYOUT, num_long_term_pics$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t num_long_term_pics
     * }
     */
    public static void num_long_term_pics(MemorySegment struct, byte fieldValue) {
        struct.set(num_long_term_pics$LAYOUT, num_long_term_pics$OFFSET, fieldValue);
    }

    private static final SequenceLayout lt_idx_sps$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("lt_idx_sps"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t lt_idx_sps[32]
     * }
     */
    public static final SequenceLayout lt_idx_sps$layout() {
        return lt_idx_sps$LAYOUT;
    }

    private static final long lt_idx_sps$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t lt_idx_sps[32]
     * }
     */
    public static final long lt_idx_sps$offset() {
        return lt_idx_sps$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t lt_idx_sps[32]
     * }
     */
    public static MemorySegment lt_idx_sps(MemorySegment struct) {
        return struct.asSlice(lt_idx_sps$OFFSET, lt_idx_sps$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t lt_idx_sps[32]
     * }
     */
    public static void lt_idx_sps(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, lt_idx_sps$OFFSET, lt_idx_sps$LAYOUT.byteSize());
    }

    private static long[] lt_idx_sps$DIMS = { 32 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint8_t lt_idx_sps[32]
     * }
     */
    public static long[] lt_idx_sps$dimensions() {
        return lt_idx_sps$DIMS;
    }
    private static final VarHandle lt_idx_sps$ELEM_HANDLE = lt_idx_sps$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint8_t lt_idx_sps[32]
     * }
     */
    public static byte lt_idx_sps(MemorySegment struct, long index0) {
        return (byte)lt_idx_sps$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint8_t lt_idx_sps[32]
     * }
     */
    public static void lt_idx_sps(MemorySegment struct, long index0, byte fieldValue) {
        lt_idx_sps$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout poc_lsb_lt$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("poc_lsb_lt"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t poc_lsb_lt[16]
     * }
     */
    public static final SequenceLayout poc_lsb_lt$layout() {
        return poc_lsb_lt$LAYOUT;
    }

    private static final long poc_lsb_lt$OFFSET = 34;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t poc_lsb_lt[16]
     * }
     */
    public static final long poc_lsb_lt$offset() {
        return poc_lsb_lt$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t poc_lsb_lt[16]
     * }
     */
    public static MemorySegment poc_lsb_lt(MemorySegment struct) {
        return struct.asSlice(poc_lsb_lt$OFFSET, poc_lsb_lt$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t poc_lsb_lt[16]
     * }
     */
    public static void poc_lsb_lt(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, poc_lsb_lt$OFFSET, poc_lsb_lt$LAYOUT.byteSize());
    }

    private static long[] poc_lsb_lt$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint8_t poc_lsb_lt[16]
     * }
     */
    public static long[] poc_lsb_lt$dimensions() {
        return poc_lsb_lt$DIMS;
    }
    private static final VarHandle poc_lsb_lt$ELEM_HANDLE = poc_lsb_lt$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint8_t poc_lsb_lt[16]
     * }
     */
    public static byte poc_lsb_lt(MemorySegment struct, long index0) {
        return (byte)poc_lsb_lt$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint8_t poc_lsb_lt[16]
     * }
     */
    public static void poc_lsb_lt(MemorySegment struct, long index0, byte fieldValue) {
        poc_lsb_lt$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfShort used_by_curr_pic_lt_flag$LAYOUT = (OfShort)$LAYOUT.select(groupElement("used_by_curr_pic_lt_flag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint16_t used_by_curr_pic_lt_flag
     * }
     */
    public static final OfShort used_by_curr_pic_lt_flag$layout() {
        return used_by_curr_pic_lt_flag$LAYOUT;
    }

    private static final long used_by_curr_pic_lt_flag$OFFSET = 50;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint16_t used_by_curr_pic_lt_flag
     * }
     */
    public static final long used_by_curr_pic_lt_flag$offset() {
        return used_by_curr_pic_lt_flag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint16_t used_by_curr_pic_lt_flag
     * }
     */
    public static short used_by_curr_pic_lt_flag(MemorySegment struct) {
        return struct.get(used_by_curr_pic_lt_flag$LAYOUT, used_by_curr_pic_lt_flag$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint16_t used_by_curr_pic_lt_flag
     * }
     */
    public static void used_by_curr_pic_lt_flag(MemorySegment struct, short fieldValue) {
        struct.set(used_by_curr_pic_lt_flag$LAYOUT, used_by_curr_pic_lt_flag$OFFSET, fieldValue);
    }

    private static final SequenceLayout delta_poc_msb_present_flag$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("delta_poc_msb_present_flag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t delta_poc_msb_present_flag[48]
     * }
     */
    public static final SequenceLayout delta_poc_msb_present_flag$layout() {
        return delta_poc_msb_present_flag$LAYOUT;
    }

    private static final long delta_poc_msb_present_flag$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t delta_poc_msb_present_flag[48]
     * }
     */
    public static final long delta_poc_msb_present_flag$offset() {
        return delta_poc_msb_present_flag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t delta_poc_msb_present_flag[48]
     * }
     */
    public static MemorySegment delta_poc_msb_present_flag(MemorySegment struct) {
        return struct.asSlice(delta_poc_msb_present_flag$OFFSET, delta_poc_msb_present_flag$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t delta_poc_msb_present_flag[48]
     * }
     */
    public static void delta_poc_msb_present_flag(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, delta_poc_msb_present_flag$OFFSET, delta_poc_msb_present_flag$LAYOUT.byteSize());
    }

    private static long[] delta_poc_msb_present_flag$DIMS = { 48 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint8_t delta_poc_msb_present_flag[48]
     * }
     */
    public static long[] delta_poc_msb_present_flag$dimensions() {
        return delta_poc_msb_present_flag$DIMS;
    }
    private static final VarHandle delta_poc_msb_present_flag$ELEM_HANDLE = delta_poc_msb_present_flag$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint8_t delta_poc_msb_present_flag[48]
     * }
     */
    public static byte delta_poc_msb_present_flag(MemorySegment struct, long index0) {
        return (byte)delta_poc_msb_present_flag$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint8_t delta_poc_msb_present_flag[48]
     * }
     */
    public static void delta_poc_msb_present_flag(MemorySegment struct, long index0, byte fieldValue) {
        delta_poc_msb_present_flag$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout delta_poc_msb_cycle_lt$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("delta_poc_msb_cycle_lt"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t delta_poc_msb_cycle_lt[48]
     * }
     */
    public static final SequenceLayout delta_poc_msb_cycle_lt$layout() {
        return delta_poc_msb_cycle_lt$LAYOUT;
    }

    private static final long delta_poc_msb_cycle_lt$OFFSET = 100;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t delta_poc_msb_cycle_lt[48]
     * }
     */
    public static final long delta_poc_msb_cycle_lt$offset() {
        return delta_poc_msb_cycle_lt$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t delta_poc_msb_cycle_lt[48]
     * }
     */
    public static MemorySegment delta_poc_msb_cycle_lt(MemorySegment struct) {
        return struct.asSlice(delta_poc_msb_cycle_lt$OFFSET, delta_poc_msb_cycle_lt$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t delta_poc_msb_cycle_lt[48]
     * }
     */
    public static void delta_poc_msb_cycle_lt(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, delta_poc_msb_cycle_lt$OFFSET, delta_poc_msb_cycle_lt$LAYOUT.byteSize());
    }

    private static long[] delta_poc_msb_cycle_lt$DIMS = { 48 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint8_t delta_poc_msb_cycle_lt[48]
     * }
     */
    public static long[] delta_poc_msb_cycle_lt$dimensions() {
        return delta_poc_msb_cycle_lt$DIMS;
    }
    private static final VarHandle delta_poc_msb_cycle_lt$ELEM_HANDLE = delta_poc_msb_cycle_lt$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint8_t delta_poc_msb_cycle_lt[48]
     * }
     */
    public static byte delta_poc_msb_cycle_lt(MemorySegment struct, long index0) {
        return (byte)delta_poc_msb_cycle_lt$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint8_t delta_poc_msb_cycle_lt[48]
     * }
     */
    public static void delta_poc_msb_cycle_lt(MemorySegment struct, long index0, byte fieldValue) {
        delta_poc_msb_cycle_lt$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

