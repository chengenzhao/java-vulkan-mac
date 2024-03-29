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
 * struct VkPhysicalDeviceFragmentDensityMap2PropertiesEXT {
 *     VkStructureType sType;
 *     void *pNext;
 *     VkBool32 subsampledLoads;
 *     VkBool32 subsampledCoarseReconstructionEarlyAccess;
 *     uint32_t maxSubsampledArrayLayers;
 *     uint32_t maxDescriptorSetSubsampledSamplers;
 * }
 * }
 */
public class VkPhysicalDeviceFragmentDensityMap2PropertiesEXT {

    VkPhysicalDeviceFragmentDensityMap2PropertiesEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("subsampledLoads"),
        vulkan_h.C_INT.withName("subsampledCoarseReconstructionEarlyAccess"),
        vulkan_h.C_INT.withName("maxSubsampledArrayLayers"),
        vulkan_h.C_INT.withName("maxDescriptorSetSubsampledSamplers")
    ).withName("VkPhysicalDeviceFragmentDensityMap2PropertiesEXT");

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

    private static final OfInt subsampledLoads$LAYOUT = (OfInt)$LAYOUT.select(groupElement("subsampledLoads"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 subsampledLoads
     * }
     */
    public static final OfInt subsampledLoads$layout() {
        return subsampledLoads$LAYOUT;
    }

    private static final long subsampledLoads$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 subsampledLoads
     * }
     */
    public static final long subsampledLoads$offset() {
        return subsampledLoads$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 subsampledLoads
     * }
     */
    public static int subsampledLoads(MemorySegment struct) {
        return struct.get(subsampledLoads$LAYOUT, subsampledLoads$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 subsampledLoads
     * }
     */
    public static void subsampledLoads(MemorySegment struct, int fieldValue) {
        struct.set(subsampledLoads$LAYOUT, subsampledLoads$OFFSET, fieldValue);
    }

    private static final OfInt subsampledCoarseReconstructionEarlyAccess$LAYOUT = (OfInt)$LAYOUT.select(groupElement("subsampledCoarseReconstructionEarlyAccess"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 subsampledCoarseReconstructionEarlyAccess
     * }
     */
    public static final OfInt subsampledCoarseReconstructionEarlyAccess$layout() {
        return subsampledCoarseReconstructionEarlyAccess$LAYOUT;
    }

    private static final long subsampledCoarseReconstructionEarlyAccess$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 subsampledCoarseReconstructionEarlyAccess
     * }
     */
    public static final long subsampledCoarseReconstructionEarlyAccess$offset() {
        return subsampledCoarseReconstructionEarlyAccess$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 subsampledCoarseReconstructionEarlyAccess
     * }
     */
    public static int subsampledCoarseReconstructionEarlyAccess(MemorySegment struct) {
        return struct.get(subsampledCoarseReconstructionEarlyAccess$LAYOUT, subsampledCoarseReconstructionEarlyAccess$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 subsampledCoarseReconstructionEarlyAccess
     * }
     */
    public static void subsampledCoarseReconstructionEarlyAccess(MemorySegment struct, int fieldValue) {
        struct.set(subsampledCoarseReconstructionEarlyAccess$LAYOUT, subsampledCoarseReconstructionEarlyAccess$OFFSET, fieldValue);
    }

    private static final OfInt maxSubsampledArrayLayers$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxSubsampledArrayLayers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxSubsampledArrayLayers
     * }
     */
    public static final OfInt maxSubsampledArrayLayers$layout() {
        return maxSubsampledArrayLayers$LAYOUT;
    }

    private static final long maxSubsampledArrayLayers$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxSubsampledArrayLayers
     * }
     */
    public static final long maxSubsampledArrayLayers$offset() {
        return maxSubsampledArrayLayers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxSubsampledArrayLayers
     * }
     */
    public static int maxSubsampledArrayLayers(MemorySegment struct) {
        return struct.get(maxSubsampledArrayLayers$LAYOUT, maxSubsampledArrayLayers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxSubsampledArrayLayers
     * }
     */
    public static void maxSubsampledArrayLayers(MemorySegment struct, int fieldValue) {
        struct.set(maxSubsampledArrayLayers$LAYOUT, maxSubsampledArrayLayers$OFFSET, fieldValue);
    }

    private static final OfInt maxDescriptorSetSubsampledSamplers$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxDescriptorSetSubsampledSamplers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxDescriptorSetSubsampledSamplers
     * }
     */
    public static final OfInt maxDescriptorSetSubsampledSamplers$layout() {
        return maxDescriptorSetSubsampledSamplers$LAYOUT;
    }

    private static final long maxDescriptorSetSubsampledSamplers$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxDescriptorSetSubsampledSamplers
     * }
     */
    public static final long maxDescriptorSetSubsampledSamplers$offset() {
        return maxDescriptorSetSubsampledSamplers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxDescriptorSetSubsampledSamplers
     * }
     */
    public static int maxDescriptorSetSubsampledSamplers(MemorySegment struct) {
        return struct.get(maxDescriptorSetSubsampledSamplers$LAYOUT, maxDescriptorSetSubsampledSamplers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxDescriptorSetSubsampledSamplers
     * }
     */
    public static void maxDescriptorSetSubsampledSamplers(MemorySegment struct, int fieldValue) {
        struct.set(maxDescriptorSetSubsampledSamplers$LAYOUT, maxDescriptorSetSubsampledSamplers$OFFSET, fieldValue);
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

