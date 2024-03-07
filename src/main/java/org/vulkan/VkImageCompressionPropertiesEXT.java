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
 * struct VkImageCompressionPropertiesEXT {
 *     VkStructureType sType;
 *     void *pNext;
 *     VkImageCompressionFlagsEXT imageCompressionFlags;
 *     VkImageCompressionFixedRateFlagsEXT imageCompressionFixedRateFlags;
 * }
 * }
 */
public class VkImageCompressionPropertiesEXT {

    VkImageCompressionPropertiesEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("imageCompressionFlags"),
        vulkan_h.C_INT.withName("imageCompressionFixedRateFlags")
    ).withName("VkImageCompressionPropertiesEXT");

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
     * void *pNext
     * }
     */
    public static final AddressLayout pNext$layout() {
        return pNext$LAYOUT;
    }

    private static final long pNext$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *pNext
     * }
     */
    public static final long pNext$offset() {
        return pNext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *pNext
     * }
     */
    public static MemorySegment pNext(MemorySegment struct) {
        return struct.get(pNext$LAYOUT, pNext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *pNext
     * }
     */
    public static void pNext(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pNext$LAYOUT, pNext$OFFSET, fieldValue);
    }

    private static final OfInt imageCompressionFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("imageCompressionFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkImageCompressionFlagsEXT imageCompressionFlags
     * }
     */
    public static final OfInt imageCompressionFlags$layout() {
        return imageCompressionFlags$LAYOUT;
    }

    private static final long imageCompressionFlags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkImageCompressionFlagsEXT imageCompressionFlags
     * }
     */
    public static final long imageCompressionFlags$offset() {
        return imageCompressionFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkImageCompressionFlagsEXT imageCompressionFlags
     * }
     */
    public static int imageCompressionFlags(MemorySegment struct) {
        return struct.get(imageCompressionFlags$LAYOUT, imageCompressionFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkImageCompressionFlagsEXT imageCompressionFlags
     * }
     */
    public static void imageCompressionFlags(MemorySegment struct, int fieldValue) {
        struct.set(imageCompressionFlags$LAYOUT, imageCompressionFlags$OFFSET, fieldValue);
    }

    private static final OfInt imageCompressionFixedRateFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("imageCompressionFixedRateFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkImageCompressionFixedRateFlagsEXT imageCompressionFixedRateFlags
     * }
     */
    public static final OfInt imageCompressionFixedRateFlags$layout() {
        return imageCompressionFixedRateFlags$LAYOUT;
    }

    private static final long imageCompressionFixedRateFlags$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkImageCompressionFixedRateFlagsEXT imageCompressionFixedRateFlags
     * }
     */
    public static final long imageCompressionFixedRateFlags$offset() {
        return imageCompressionFixedRateFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkImageCompressionFixedRateFlagsEXT imageCompressionFixedRateFlags
     * }
     */
    public static int imageCompressionFixedRateFlags(MemorySegment struct) {
        return struct.get(imageCompressionFixedRateFlags$LAYOUT, imageCompressionFixedRateFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkImageCompressionFixedRateFlagsEXT imageCompressionFixedRateFlags
     * }
     */
    public static void imageCompressionFixedRateFlags(MemorySegment struct, int fieldValue) {
        struct.set(imageCompressionFixedRateFlags$LAYOUT, imageCompressionFixedRateFlags$OFFSET, fieldValue);
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

