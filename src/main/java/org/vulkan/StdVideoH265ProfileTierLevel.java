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
 * struct StdVideoH265ProfileTierLevel {
 *     StdVideoH265ProfileTierLevelFlags flags;
 *     StdVideoH265ProfileIdc general_profile_idc;
 *     StdVideoH265LevelIdc general_level_idc;
 * }
 * }
 */
public class StdVideoH265ProfileTierLevel {

    StdVideoH265ProfileTierLevel() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        StdVideoH265ProfileTierLevelFlags.layout().withName("flags"),
        vulkan_h.C_INT.withName("general_profile_idc"),
        vulkan_h.C_INT.withName("general_level_idc")
    ).withName("StdVideoH265ProfileTierLevel");

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
     * StdVideoH265ProfileTierLevelFlags flags
     * }
     */
    public static final GroupLayout flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * StdVideoH265ProfileTierLevelFlags flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * StdVideoH265ProfileTierLevelFlags flags
     * }
     */
    public static MemorySegment flags(MemorySegment struct) {
        return struct.asSlice(flags$OFFSET, flags$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * StdVideoH265ProfileTierLevelFlags flags
     * }
     */
    public static void flags(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, flags$OFFSET, flags$LAYOUT.byteSize());
    }

    private static final OfInt general_profile_idc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("general_profile_idc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * StdVideoH265ProfileIdc general_profile_idc
     * }
     */
    public static final OfInt general_profile_idc$layout() {
        return general_profile_idc$LAYOUT;
    }

    private static final long general_profile_idc$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * StdVideoH265ProfileIdc general_profile_idc
     * }
     */
    public static final long general_profile_idc$offset() {
        return general_profile_idc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * StdVideoH265ProfileIdc general_profile_idc
     * }
     */
    public static int general_profile_idc(MemorySegment struct) {
        return struct.get(general_profile_idc$LAYOUT, general_profile_idc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * StdVideoH265ProfileIdc general_profile_idc
     * }
     */
    public static void general_profile_idc(MemorySegment struct, int fieldValue) {
        struct.set(general_profile_idc$LAYOUT, general_profile_idc$OFFSET, fieldValue);
    }

    private static final OfInt general_level_idc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("general_level_idc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * StdVideoH265LevelIdc general_level_idc
     * }
     */
    public static final OfInt general_level_idc$layout() {
        return general_level_idc$LAYOUT;
    }

    private static final long general_level_idc$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * StdVideoH265LevelIdc general_level_idc
     * }
     */
    public static final long general_level_idc$offset() {
        return general_level_idc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * StdVideoH265LevelIdc general_level_idc
     * }
     */
    public static int general_level_idc(MemorySegment struct) {
        return struct.get(general_level_idc$LAYOUT, general_level_idc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * StdVideoH265LevelIdc general_level_idc
     * }
     */
    public static void general_level_idc(MemorySegment struct, int fieldValue) {
        struct.set(general_level_idc$LAYOUT, general_level_idc$OFFSET, fieldValue);
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

