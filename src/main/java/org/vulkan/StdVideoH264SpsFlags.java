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
 * struct StdVideoH264SpsFlags {
 *     uint32_t constraint_set0_flag : 1;
 *     uint32_t constraint_set1_flag : 1;
 *     uint32_t constraint_set2_flag : 1;
 *     uint32_t constraint_set3_flag : 1;
 *     uint32_t constraint_set4_flag : 1;
 *     uint32_t constraint_set5_flag : 1;
 *     uint32_t direct_8x8_inference_flag : 1;
 *     uint32_t mb_adaptive_frame_field_flag : 1;
 *     uint32_t frame_mbs_only_flag : 1;
 *     uint32_t delta_pic_order_always_zero_flag : 1;
 *     uint32_t separate_colour_plane_flag : 1;
 *     uint32_t gaps_in_frame_num_value_allowed_flag : 1;
 *     uint32_t qpprime_y_zero_transform_bypass_flag : 1;
 *     uint32_t frame_cropping_flag : 1;
 *     uint32_t seq_scaling_matrix_present_flag : 1;
 *     uint32_t vui_parameters_present_flag : 1;
 * }
 * }
 */
public class StdVideoH264SpsFlags {

    StdVideoH264SpsFlags() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.paddingLayout(4)
    ).withName("StdVideoH264SpsFlags");

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

