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
 * struct VkPhysicalDeviceImageProcessingPropertiesQCOM {
 *     VkStructureType sType;
 *     void *pNext;
 *     uint32_t maxWeightFilterPhases;
 *     VkExtent2D maxWeightFilterDimension;
 *     VkExtent2D maxBlockMatchRegion;
 *     VkExtent2D maxBoxFilterBlockSize;
 * }
 * }
 */
public class VkPhysicalDeviceImageProcessingPropertiesQCOM {

    VkPhysicalDeviceImageProcessingPropertiesQCOM() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("maxWeightFilterPhases"),
        VkExtent2D.layout().withName("maxWeightFilterDimension"),
        VkExtent2D.layout().withName("maxBlockMatchRegion"),
        VkExtent2D.layout().withName("maxBoxFilterBlockSize"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceImageProcessingPropertiesQCOM");

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

    private static final OfInt maxWeightFilterPhases$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxWeightFilterPhases"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxWeightFilterPhases
     * }
     */
    public static final OfInt maxWeightFilterPhases$layout() {
        return maxWeightFilterPhases$LAYOUT;
    }

    private static final long maxWeightFilterPhases$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxWeightFilterPhases
     * }
     */
    public static final long maxWeightFilterPhases$offset() {
        return maxWeightFilterPhases$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxWeightFilterPhases
     * }
     */
    public static int maxWeightFilterPhases(MemorySegment struct) {
        return struct.get(maxWeightFilterPhases$LAYOUT, maxWeightFilterPhases$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxWeightFilterPhases
     * }
     */
    public static void maxWeightFilterPhases(MemorySegment struct, int fieldValue) {
        struct.set(maxWeightFilterPhases$LAYOUT, maxWeightFilterPhases$OFFSET, fieldValue);
    }

    private static final GroupLayout maxWeightFilterDimension$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("maxWeightFilterDimension"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkExtent2D maxWeightFilterDimension
     * }
     */
    public static final GroupLayout maxWeightFilterDimension$layout() {
        return maxWeightFilterDimension$LAYOUT;
    }

    private static final long maxWeightFilterDimension$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkExtent2D maxWeightFilterDimension
     * }
     */
    public static final long maxWeightFilterDimension$offset() {
        return maxWeightFilterDimension$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkExtent2D maxWeightFilterDimension
     * }
     */
    public static MemorySegment maxWeightFilterDimension(MemorySegment struct) {
        return struct.asSlice(maxWeightFilterDimension$OFFSET, maxWeightFilterDimension$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkExtent2D maxWeightFilterDimension
     * }
     */
    public static void maxWeightFilterDimension(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, maxWeightFilterDimension$OFFSET, maxWeightFilterDimension$LAYOUT.byteSize());
    }

    private static final GroupLayout maxBlockMatchRegion$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("maxBlockMatchRegion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkExtent2D maxBlockMatchRegion
     * }
     */
    public static final GroupLayout maxBlockMatchRegion$layout() {
        return maxBlockMatchRegion$LAYOUT;
    }

    private static final long maxBlockMatchRegion$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkExtent2D maxBlockMatchRegion
     * }
     */
    public static final long maxBlockMatchRegion$offset() {
        return maxBlockMatchRegion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkExtent2D maxBlockMatchRegion
     * }
     */
    public static MemorySegment maxBlockMatchRegion(MemorySegment struct) {
        return struct.asSlice(maxBlockMatchRegion$OFFSET, maxBlockMatchRegion$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkExtent2D maxBlockMatchRegion
     * }
     */
    public static void maxBlockMatchRegion(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, maxBlockMatchRegion$OFFSET, maxBlockMatchRegion$LAYOUT.byteSize());
    }

    private static final GroupLayout maxBoxFilterBlockSize$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("maxBoxFilterBlockSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkExtent2D maxBoxFilterBlockSize
     * }
     */
    public static final GroupLayout maxBoxFilterBlockSize$layout() {
        return maxBoxFilterBlockSize$LAYOUT;
    }

    private static final long maxBoxFilterBlockSize$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkExtent2D maxBoxFilterBlockSize
     * }
     */
    public static final long maxBoxFilterBlockSize$offset() {
        return maxBoxFilterBlockSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkExtent2D maxBoxFilterBlockSize
     * }
     */
    public static MemorySegment maxBoxFilterBlockSize(MemorySegment struct) {
        return struct.asSlice(maxBoxFilterBlockSize$OFFSET, maxBoxFilterBlockSize$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkExtent2D maxBoxFilterBlockSize
     * }
     */
    public static void maxBoxFilterBlockSize(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, maxBoxFilterBlockSize$OFFSET, maxBoxFilterBlockSize$LAYOUT.byteSize());
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

