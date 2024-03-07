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
 * struct VkSurfacePresentScalingCapabilitiesEXT {
 *     VkStructureType sType;
 *     void *pNext;
 *     VkPresentScalingFlagsEXT supportedPresentScaling;
 *     VkPresentGravityFlagsEXT supportedPresentGravityX;
 *     VkPresentGravityFlagsEXT supportedPresentGravityY;
 *     VkExtent2D minScaledImageExtent;
 *     VkExtent2D maxScaledImageExtent;
 * }
 * }
 */
public class VkSurfacePresentScalingCapabilitiesEXT {

    VkSurfacePresentScalingCapabilitiesEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("supportedPresentScaling"),
        vulkan_h.C_INT.withName("supportedPresentGravityX"),
        vulkan_h.C_INT.withName("supportedPresentGravityY"),
        VkExtent2D.layout().withName("minScaledImageExtent"),
        VkExtent2D.layout().withName("maxScaledImageExtent"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkSurfacePresentScalingCapabilitiesEXT");

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

    private static final OfInt supportedPresentScaling$LAYOUT = (OfInt)$LAYOUT.select(groupElement("supportedPresentScaling"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPresentScalingFlagsEXT supportedPresentScaling
     * }
     */
    public static final OfInt supportedPresentScaling$layout() {
        return supportedPresentScaling$LAYOUT;
    }

    private static final long supportedPresentScaling$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPresentScalingFlagsEXT supportedPresentScaling
     * }
     */
    public static final long supportedPresentScaling$offset() {
        return supportedPresentScaling$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPresentScalingFlagsEXT supportedPresentScaling
     * }
     */
    public static int supportedPresentScaling(MemorySegment struct) {
        return struct.get(supportedPresentScaling$LAYOUT, supportedPresentScaling$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPresentScalingFlagsEXT supportedPresentScaling
     * }
     */
    public static void supportedPresentScaling(MemorySegment struct, int fieldValue) {
        struct.set(supportedPresentScaling$LAYOUT, supportedPresentScaling$OFFSET, fieldValue);
    }

    private static final OfInt supportedPresentGravityX$LAYOUT = (OfInt)$LAYOUT.select(groupElement("supportedPresentGravityX"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPresentGravityFlagsEXT supportedPresentGravityX
     * }
     */
    public static final OfInt supportedPresentGravityX$layout() {
        return supportedPresentGravityX$LAYOUT;
    }

    private static final long supportedPresentGravityX$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPresentGravityFlagsEXT supportedPresentGravityX
     * }
     */
    public static final long supportedPresentGravityX$offset() {
        return supportedPresentGravityX$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPresentGravityFlagsEXT supportedPresentGravityX
     * }
     */
    public static int supportedPresentGravityX(MemorySegment struct) {
        return struct.get(supportedPresentGravityX$LAYOUT, supportedPresentGravityX$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPresentGravityFlagsEXT supportedPresentGravityX
     * }
     */
    public static void supportedPresentGravityX(MemorySegment struct, int fieldValue) {
        struct.set(supportedPresentGravityX$LAYOUT, supportedPresentGravityX$OFFSET, fieldValue);
    }

    private static final OfInt supportedPresentGravityY$LAYOUT = (OfInt)$LAYOUT.select(groupElement("supportedPresentGravityY"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPresentGravityFlagsEXT supportedPresentGravityY
     * }
     */
    public static final OfInt supportedPresentGravityY$layout() {
        return supportedPresentGravityY$LAYOUT;
    }

    private static final long supportedPresentGravityY$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPresentGravityFlagsEXT supportedPresentGravityY
     * }
     */
    public static final long supportedPresentGravityY$offset() {
        return supportedPresentGravityY$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPresentGravityFlagsEXT supportedPresentGravityY
     * }
     */
    public static int supportedPresentGravityY(MemorySegment struct) {
        return struct.get(supportedPresentGravityY$LAYOUT, supportedPresentGravityY$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPresentGravityFlagsEXT supportedPresentGravityY
     * }
     */
    public static void supportedPresentGravityY(MemorySegment struct, int fieldValue) {
        struct.set(supportedPresentGravityY$LAYOUT, supportedPresentGravityY$OFFSET, fieldValue);
    }

    private static final GroupLayout minScaledImageExtent$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("minScaledImageExtent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkExtent2D minScaledImageExtent
     * }
     */
    public static final GroupLayout minScaledImageExtent$layout() {
        return minScaledImageExtent$LAYOUT;
    }

    private static final long minScaledImageExtent$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkExtent2D minScaledImageExtent
     * }
     */
    public static final long minScaledImageExtent$offset() {
        return minScaledImageExtent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkExtent2D minScaledImageExtent
     * }
     */
    public static MemorySegment minScaledImageExtent(MemorySegment struct) {
        return struct.asSlice(minScaledImageExtent$OFFSET, minScaledImageExtent$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkExtent2D minScaledImageExtent
     * }
     */
    public static void minScaledImageExtent(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, minScaledImageExtent$OFFSET, minScaledImageExtent$LAYOUT.byteSize());
    }

    private static final GroupLayout maxScaledImageExtent$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("maxScaledImageExtent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkExtent2D maxScaledImageExtent
     * }
     */
    public static final GroupLayout maxScaledImageExtent$layout() {
        return maxScaledImageExtent$LAYOUT;
    }

    private static final long maxScaledImageExtent$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkExtent2D maxScaledImageExtent
     * }
     */
    public static final long maxScaledImageExtent$offset() {
        return maxScaledImageExtent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkExtent2D maxScaledImageExtent
     * }
     */
    public static MemorySegment maxScaledImageExtent(MemorySegment struct) {
        return struct.asSlice(maxScaledImageExtent$OFFSET, maxScaledImageExtent$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkExtent2D maxScaledImageExtent
     * }
     */
    public static void maxScaledImageExtent(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, maxScaledImageExtent$OFFSET, maxScaledImageExtent$LAYOUT.byteSize());
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

