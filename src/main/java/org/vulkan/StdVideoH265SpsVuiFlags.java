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
 * struct StdVideoH265SpsVuiFlags {
 *     uint32_t aspect_ratio_info_present_flag : 1;
 *     uint32_t overscan_info_present_flag : 1;
 *     uint32_t overscan_appropriate_flag : 1;
 *     uint32_t video_signal_type_present_flag : 1;
 *     uint32_t video_full_range_flag : 1;
 *     uint32_t colour_description_present_flag : 1;
 *     uint32_t chroma_loc_info_present_flag : 1;
 *     uint32_t neutral_chroma_indication_flag : 1;
 *     uint32_t field_seq_flag : 1;
 *     uint32_t frame_field_info_present_flag : 1;
 *     uint32_t default_display_window_flag : 1;
 *     uint32_t vui_timing_info_present_flag : 1;
 *     uint32_t vui_poc_proportional_to_timing_flag : 1;
 *     uint32_t vui_hrd_parameters_present_flag : 1;
 *     uint32_t bitstream_restriction_flag : 1;
 *     uint32_t tiles_fixed_structure_flag : 1;
 *     uint32_t motion_vectors_over_pic_boundaries_flag : 1;
 *     uint32_t restricted_ref_pic_lists_flag : 1;
 * }
 * }
 */
public class StdVideoH265SpsVuiFlags {

    StdVideoH265SpsVuiFlags() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.paddingLayout(4)
    ).withName("StdVideoH265SpsVuiFlags");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
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

