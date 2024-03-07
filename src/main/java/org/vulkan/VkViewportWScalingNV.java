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
 * struct VkViewportWScalingNV {
 *     float xcoeff;
 *     float ycoeff;
 * }
 * }
 */
public class VkViewportWScalingNV {

    VkViewportWScalingNV() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_FLOAT.withName("xcoeff"),
        vulkan_h.C_FLOAT.withName("ycoeff")
    ).withName("VkViewportWScalingNV");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfFloat xcoeff$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("xcoeff"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float xcoeff
     * }
     */
    public static final OfFloat xcoeff$layout() {
        return xcoeff$LAYOUT;
    }

    private static final long xcoeff$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float xcoeff
     * }
     */
    public static final long xcoeff$offset() {
        return xcoeff$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float xcoeff
     * }
     */
    public static float xcoeff(MemorySegment struct) {
        return struct.get(xcoeff$LAYOUT, xcoeff$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float xcoeff
     * }
     */
    public static void xcoeff(MemorySegment struct, float fieldValue) {
        struct.set(xcoeff$LAYOUT, xcoeff$OFFSET, fieldValue);
    }

    private static final OfFloat ycoeff$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("ycoeff"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float ycoeff
     * }
     */
    public static final OfFloat ycoeff$layout() {
        return ycoeff$LAYOUT;
    }

    private static final long ycoeff$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float ycoeff
     * }
     */
    public static final long ycoeff$offset() {
        return ycoeff$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float ycoeff
     * }
     */
    public static float ycoeff(MemorySegment struct) {
        return struct.get(ycoeff$LAYOUT, ycoeff$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float ycoeff
     * }
     */
    public static void ycoeff(MemorySegment struct, float fieldValue) {
        struct.set(ycoeff$LAYOUT, ycoeff$OFFSET, fieldValue);
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

