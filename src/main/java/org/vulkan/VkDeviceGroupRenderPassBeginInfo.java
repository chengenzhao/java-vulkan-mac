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
 * struct VkDeviceGroupRenderPassBeginInfo {
 *     VkStructureType sType;
 *     const void *pNext;
 *     uint32_t deviceMask;
 *     uint32_t deviceRenderAreaCount;
 *     const VkRect2D *pDeviceRenderAreas;
 * }
 * }
 */
public class VkDeviceGroupRenderPassBeginInfo {

    VkDeviceGroupRenderPassBeginInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("deviceMask"),
        vulkan_h.C_INT.withName("deviceRenderAreaCount"),
        vulkan_h.C_POINTER.withName("pDeviceRenderAreas")
    ).withName("VkDeviceGroupRenderPassBeginInfo");

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

    private static final OfInt deviceMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("deviceMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t deviceMask
     * }
     */
    public static final OfInt deviceMask$layout() {
        return deviceMask$LAYOUT;
    }

    private static final long deviceMask$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t deviceMask
     * }
     */
    public static final long deviceMask$offset() {
        return deviceMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t deviceMask
     * }
     */
    public static int deviceMask(MemorySegment struct) {
        return struct.get(deviceMask$LAYOUT, deviceMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t deviceMask
     * }
     */
    public static void deviceMask(MemorySegment struct, int fieldValue) {
        struct.set(deviceMask$LAYOUT, deviceMask$OFFSET, fieldValue);
    }

    private static final OfInt deviceRenderAreaCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("deviceRenderAreaCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t deviceRenderAreaCount
     * }
     */
    public static final OfInt deviceRenderAreaCount$layout() {
        return deviceRenderAreaCount$LAYOUT;
    }

    private static final long deviceRenderAreaCount$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t deviceRenderAreaCount
     * }
     */
    public static final long deviceRenderAreaCount$offset() {
        return deviceRenderAreaCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t deviceRenderAreaCount
     * }
     */
    public static int deviceRenderAreaCount(MemorySegment struct) {
        return struct.get(deviceRenderAreaCount$LAYOUT, deviceRenderAreaCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t deviceRenderAreaCount
     * }
     */
    public static void deviceRenderAreaCount(MemorySegment struct, int fieldValue) {
        struct.set(deviceRenderAreaCount$LAYOUT, deviceRenderAreaCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pDeviceRenderAreas$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pDeviceRenderAreas"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkRect2D *pDeviceRenderAreas
     * }
     */
    public static final AddressLayout pDeviceRenderAreas$layout() {
        return pDeviceRenderAreas$LAYOUT;
    }

    private static final long pDeviceRenderAreas$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkRect2D *pDeviceRenderAreas
     * }
     */
    public static final long pDeviceRenderAreas$offset() {
        return pDeviceRenderAreas$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkRect2D *pDeviceRenderAreas
     * }
     */
    public static MemorySegment pDeviceRenderAreas(MemorySegment struct) {
        return struct.get(pDeviceRenderAreas$LAYOUT, pDeviceRenderAreas$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkRect2D *pDeviceRenderAreas
     * }
     */
    public static void pDeviceRenderAreas(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pDeviceRenderAreas$LAYOUT, pDeviceRenderAreas$OFFSET, fieldValue);
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

