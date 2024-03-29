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
 * struct VkSwapchainPresentScalingCreateInfoEXT {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkPresentScalingFlagsEXT scalingBehavior;
 *     VkPresentGravityFlagsEXT presentGravityX;
 *     VkPresentGravityFlagsEXT presentGravityY;
 * }
 * }
 */
public class VkSwapchainPresentScalingCreateInfoEXT {

    VkSwapchainPresentScalingCreateInfoEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("scalingBehavior"),
        vulkan_h.C_INT.withName("presentGravityX"),
        vulkan_h.C_INT.withName("presentGravityY"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkSwapchainPresentScalingCreateInfoEXT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt sType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkStructureType sType
     * }
     */
    public static final OfInt sType$layout() {
        return sType$LAYOUT;
    }

    private static final long sType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkStructureType sType
     * }
     */
    public static final long sType$offset() {
        return sType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkStructureType sType
     * }
     */
    public static int sType(MemorySegment struct) {
        return struct.get(sType$LAYOUT, sType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkStructureType sType
     * }
     */
    public static void sType(MemorySegment struct, int fieldValue) {
        struct.set(sType$LAYOUT, sType$OFFSET, fieldValue);
    }

    private static final AddressLayout pNext$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pNext"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const void *pNext
     * }
     */
    public static final AddressLayout pNext$layout() {
        return pNext$LAYOUT;
    }

    private static final long pNext$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const void *pNext
     * }
     */
    public static final long pNext$offset() {
        return pNext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const void *pNext
     * }
     */
    public static MemorySegment pNext(MemorySegment struct) {
        return struct.get(pNext$LAYOUT, pNext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const void *pNext
     * }
     */
    public static void pNext(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pNext$LAYOUT, pNext$OFFSET, fieldValue);
    }

    private static final OfInt scalingBehavior$LAYOUT = (OfInt)$LAYOUT.select(groupElement("scalingBehavior"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPresentScalingFlagsEXT scalingBehavior
     * }
     */
    public static final OfInt scalingBehavior$layout() {
        return scalingBehavior$LAYOUT;
    }

    private static final long scalingBehavior$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPresentScalingFlagsEXT scalingBehavior
     * }
     */
    public static final long scalingBehavior$offset() {
        return scalingBehavior$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPresentScalingFlagsEXT scalingBehavior
     * }
     */
    public static int scalingBehavior(MemorySegment struct) {
        return struct.get(scalingBehavior$LAYOUT, scalingBehavior$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPresentScalingFlagsEXT scalingBehavior
     * }
     */
    public static void scalingBehavior(MemorySegment struct, int fieldValue) {
        struct.set(scalingBehavior$LAYOUT, scalingBehavior$OFFSET, fieldValue);
    }

    private static final OfInt presentGravityX$LAYOUT = (OfInt)$LAYOUT.select(groupElement("presentGravityX"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPresentGravityFlagsEXT presentGravityX
     * }
     */
    public static final OfInt presentGravityX$layout() {
        return presentGravityX$LAYOUT;
    }

    private static final long presentGravityX$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPresentGravityFlagsEXT presentGravityX
     * }
     */
    public static final long presentGravityX$offset() {
        return presentGravityX$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPresentGravityFlagsEXT presentGravityX
     * }
     */
    public static int presentGravityX(MemorySegment struct) {
        return struct.get(presentGravityX$LAYOUT, presentGravityX$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPresentGravityFlagsEXT presentGravityX
     * }
     */
    public static void presentGravityX(MemorySegment struct, int fieldValue) {
        struct.set(presentGravityX$LAYOUT, presentGravityX$OFFSET, fieldValue);
    }

    private static final OfInt presentGravityY$LAYOUT = (OfInt)$LAYOUT.select(groupElement("presentGravityY"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPresentGravityFlagsEXT presentGravityY
     * }
     */
    public static final OfInt presentGravityY$layout() {
        return presentGravityY$LAYOUT;
    }

    private static final long presentGravityY$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPresentGravityFlagsEXT presentGravityY
     * }
     */
    public static final long presentGravityY$offset() {
        return presentGravityY$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPresentGravityFlagsEXT presentGravityY
     * }
     */
    public static int presentGravityY(MemorySegment struct) {
        return struct.get(presentGravityY$LAYOUT, presentGravityY$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPresentGravityFlagsEXT presentGravityY
     * }
     */
    public static void presentGravityY(MemorySegment struct, int fieldValue) {
        struct.set(presentGravityY$LAYOUT, presentGravityY$OFFSET, fieldValue);
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

