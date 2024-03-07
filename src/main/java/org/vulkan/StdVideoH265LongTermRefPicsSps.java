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
 * struct StdVideoH265LongTermRefPicsSps {
 *     uint32_t used_by_curr_pic_lt_sps_flag;
 *     uint32_t lt_ref_pic_poc_lsb_sps[32];
 * }
 * }
 */
public class StdVideoH265LongTermRefPicsSps {

    StdVideoH265LongTermRefPicsSps() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("used_by_curr_pic_lt_sps_flag"),
        MemoryLayout.sequenceLayout(32, vulkan_h.C_INT).withName("lt_ref_pic_poc_lsb_sps")
    ).withName("StdVideoH265LongTermRefPicsSps");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt used_by_curr_pic_lt_sps_flag$LAYOUT = (OfInt)$LAYOUT.select(groupElement("used_by_curr_pic_lt_sps_flag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t used_by_curr_pic_lt_sps_flag
     * }
     */
    public static final OfInt used_by_curr_pic_lt_sps_flag$layout() {
        return used_by_curr_pic_lt_sps_flag$LAYOUT;
    }

    private static final long used_by_curr_pic_lt_sps_flag$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t used_by_curr_pic_lt_sps_flag
     * }
     */
    public static final long used_by_curr_pic_lt_sps_flag$offset() {
        return used_by_curr_pic_lt_sps_flag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t used_by_curr_pic_lt_sps_flag
     * }
     */
    public static int used_by_curr_pic_lt_sps_flag(MemorySegment struct) {
        return struct.get(used_by_curr_pic_lt_sps_flag$LAYOUT, used_by_curr_pic_lt_sps_flag$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t used_by_curr_pic_lt_sps_flag
     * }
     */
    public static void used_by_curr_pic_lt_sps_flag(MemorySegment struct, int fieldValue) {
        struct.set(used_by_curr_pic_lt_sps_flag$LAYOUT, used_by_curr_pic_lt_sps_flag$OFFSET, fieldValue);
    }

    private static final SequenceLayout lt_ref_pic_poc_lsb_sps$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("lt_ref_pic_poc_lsb_sps"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t lt_ref_pic_poc_lsb_sps[32]
     * }
     */
    public static final SequenceLayout lt_ref_pic_poc_lsb_sps$layout() {
        return lt_ref_pic_poc_lsb_sps$LAYOUT;
    }

    private static final long lt_ref_pic_poc_lsb_sps$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t lt_ref_pic_poc_lsb_sps[32]
     * }
     */
    public static final long lt_ref_pic_poc_lsb_sps$offset() {
        return lt_ref_pic_poc_lsb_sps$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t lt_ref_pic_poc_lsb_sps[32]
     * }
     */
    public static MemorySegment lt_ref_pic_poc_lsb_sps(MemorySegment struct) {
        return struct.asSlice(lt_ref_pic_poc_lsb_sps$OFFSET, lt_ref_pic_poc_lsb_sps$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t lt_ref_pic_poc_lsb_sps[32]
     * }
     */
    public static void lt_ref_pic_poc_lsb_sps(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, lt_ref_pic_poc_lsb_sps$OFFSET, lt_ref_pic_poc_lsb_sps$LAYOUT.byteSize());
    }

    private static long[] lt_ref_pic_poc_lsb_sps$DIMS = { 32 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint32_t lt_ref_pic_poc_lsb_sps[32]
     * }
     */
    public static long[] lt_ref_pic_poc_lsb_sps$dimensions() {
        return lt_ref_pic_poc_lsb_sps$DIMS;
    }
    private static final VarHandle lt_ref_pic_poc_lsb_sps$ELEM_HANDLE = lt_ref_pic_poc_lsb_sps$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint32_t lt_ref_pic_poc_lsb_sps[32]
     * }
     */
    public static int lt_ref_pic_poc_lsb_sps(MemorySegment struct, long index0) {
        return (int)lt_ref_pic_poc_lsb_sps$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint32_t lt_ref_pic_poc_lsb_sps[32]
     * }
     */
    public static void lt_ref_pic_poc_lsb_sps(MemorySegment struct, long index0, int fieldValue) {
        lt_ref_pic_poc_lsb_sps$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

