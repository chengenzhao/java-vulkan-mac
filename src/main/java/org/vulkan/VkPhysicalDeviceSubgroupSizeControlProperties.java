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
 * struct VkPhysicalDeviceSubgroupSizeControlProperties {
 *     VkStructureType sType;
 *     void *pNext;
 *     uint32_t minSubgroupSize;
 *     uint32_t maxSubgroupSize;
 *     uint32_t maxComputeWorkgroupSubgroups;
 *     VkShaderStageFlags requiredSubgroupSizeStages;
 * }
 * }
 */
public class VkPhysicalDeviceSubgroupSizeControlProperties {

    VkPhysicalDeviceSubgroupSizeControlProperties() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("minSubgroupSize"),
        vulkan_h.C_INT.withName("maxSubgroupSize"),
        vulkan_h.C_INT.withName("maxComputeWorkgroupSubgroups"),
        vulkan_h.C_INT.withName("requiredSubgroupSizeStages")
    ).withName("VkPhysicalDeviceSubgroupSizeControlProperties");

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

    private static final OfInt minSubgroupSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("minSubgroupSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t minSubgroupSize
     * }
     */
    public static final OfInt minSubgroupSize$layout() {
        return minSubgroupSize$LAYOUT;
    }

    private static final long minSubgroupSize$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t minSubgroupSize
     * }
     */
    public static final long minSubgroupSize$offset() {
        return minSubgroupSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t minSubgroupSize
     * }
     */
    public static int minSubgroupSize(MemorySegment struct) {
        return struct.get(minSubgroupSize$LAYOUT, minSubgroupSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t minSubgroupSize
     * }
     */
    public static void minSubgroupSize(MemorySegment struct, int fieldValue) {
        struct.set(minSubgroupSize$LAYOUT, minSubgroupSize$OFFSET, fieldValue);
    }

    private static final OfInt maxSubgroupSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxSubgroupSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxSubgroupSize
     * }
     */
    public static final OfInt maxSubgroupSize$layout() {
        return maxSubgroupSize$LAYOUT;
    }

    private static final long maxSubgroupSize$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxSubgroupSize
     * }
     */
    public static final long maxSubgroupSize$offset() {
        return maxSubgroupSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxSubgroupSize
     * }
     */
    public static int maxSubgroupSize(MemorySegment struct) {
        return struct.get(maxSubgroupSize$LAYOUT, maxSubgroupSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxSubgroupSize
     * }
     */
    public static void maxSubgroupSize(MemorySegment struct, int fieldValue) {
        struct.set(maxSubgroupSize$LAYOUT, maxSubgroupSize$OFFSET, fieldValue);
    }

    private static final OfInt maxComputeWorkgroupSubgroups$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxComputeWorkgroupSubgroups"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxComputeWorkgroupSubgroups
     * }
     */
    public static final OfInt maxComputeWorkgroupSubgroups$layout() {
        return maxComputeWorkgroupSubgroups$LAYOUT;
    }

    private static final long maxComputeWorkgroupSubgroups$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxComputeWorkgroupSubgroups
     * }
     */
    public static final long maxComputeWorkgroupSubgroups$offset() {
        return maxComputeWorkgroupSubgroups$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxComputeWorkgroupSubgroups
     * }
     */
    public static int maxComputeWorkgroupSubgroups(MemorySegment struct) {
        return struct.get(maxComputeWorkgroupSubgroups$LAYOUT, maxComputeWorkgroupSubgroups$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxComputeWorkgroupSubgroups
     * }
     */
    public static void maxComputeWorkgroupSubgroups(MemorySegment struct, int fieldValue) {
        struct.set(maxComputeWorkgroupSubgroups$LAYOUT, maxComputeWorkgroupSubgroups$OFFSET, fieldValue);
    }

    private static final OfInt requiredSubgroupSizeStages$LAYOUT = (OfInt)$LAYOUT.select(groupElement("requiredSubgroupSizeStages"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkShaderStageFlags requiredSubgroupSizeStages
     * }
     */
    public static final OfInt requiredSubgroupSizeStages$layout() {
        return requiredSubgroupSizeStages$LAYOUT;
    }

    private static final long requiredSubgroupSizeStages$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkShaderStageFlags requiredSubgroupSizeStages
     * }
     */
    public static final long requiredSubgroupSizeStages$offset() {
        return requiredSubgroupSizeStages$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkShaderStageFlags requiredSubgroupSizeStages
     * }
     */
    public static int requiredSubgroupSizeStages(MemorySegment struct) {
        return struct.get(requiredSubgroupSizeStages$LAYOUT, requiredSubgroupSizeStages$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkShaderStageFlags requiredSubgroupSizeStages
     * }
     */
    public static void requiredSubgroupSizeStages(MemorySegment struct, int fieldValue) {
        struct.set(requiredSubgroupSizeStages$LAYOUT, requiredSubgroupSizeStages$OFFSET, fieldValue);
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

