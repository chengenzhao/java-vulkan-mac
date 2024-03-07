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
 * struct VkDeviceMemoryReportCallbackDataEXT {
 *     VkStructureType sType;
 *     void *pNext;
 *     VkDeviceMemoryReportFlagsEXT flags;
 *     VkDeviceMemoryReportEventTypeEXT type;
 *     uint64_t memoryObjectId;
 *     VkDeviceSize size;
 *     VkObjectType objectType;
 *     uint64_t objectHandle;
 *     uint32_t heapIndex;
 * }
 * }
 */
public class VkDeviceMemoryReportCallbackDataEXT {

    VkDeviceMemoryReportCallbackDataEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("flags"),
        vulkan_h.C_INT.withName("type"),
        vulkan_h.C_LONG_LONG.withName("memoryObjectId"),
        vulkan_h.C_LONG_LONG.withName("size"),
        vulkan_h.C_INT.withName("objectType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_LONG_LONG.withName("objectHandle"),
        vulkan_h.C_INT.withName("heapIndex"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkDeviceMemoryReportCallbackDataEXT");

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

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceMemoryReportFlagsEXT flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceMemoryReportFlagsEXT flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceMemoryReportFlagsEXT flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceMemoryReportFlagsEXT flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceMemoryReportEventTypeEXT type
     * }
     */
    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceMemoryReportEventTypeEXT type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceMemoryReportEventTypeEXT type
     * }
     */
    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceMemoryReportEventTypeEXT type
     * }
     */
    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final OfLong memoryObjectId$LAYOUT = (OfLong)$LAYOUT.select(groupElement("memoryObjectId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t memoryObjectId
     * }
     */
    public static final OfLong memoryObjectId$layout() {
        return memoryObjectId$LAYOUT;
    }

    private static final long memoryObjectId$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t memoryObjectId
     * }
     */
    public static final long memoryObjectId$offset() {
        return memoryObjectId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t memoryObjectId
     * }
     */
    public static long memoryObjectId(MemorySegment struct) {
        return struct.get(memoryObjectId$LAYOUT, memoryObjectId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t memoryObjectId
     * }
     */
    public static void memoryObjectId(MemorySegment struct, long fieldValue) {
        struct.set(memoryObjectId$LAYOUT, memoryObjectId$OFFSET, fieldValue);
    }

    private static final OfLong size$LAYOUT = (OfLong)$LAYOUT.select(groupElement("size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize size
     * }
     */
    public static final OfLong size$layout() {
        return size$LAYOUT;
    }

    private static final long size$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize size
     * }
     */
    public static final long size$offset() {
        return size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize size
     * }
     */
    public static long size(MemorySegment struct) {
        return struct.get(size$LAYOUT, size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize size
     * }
     */
    public static void size(MemorySegment struct, long fieldValue) {
        struct.set(size$LAYOUT, size$OFFSET, fieldValue);
    }

    private static final OfInt objectType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("objectType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkObjectType objectType
     * }
     */
    public static final OfInt objectType$layout() {
        return objectType$LAYOUT;
    }

    private static final long objectType$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkObjectType objectType
     * }
     */
    public static final long objectType$offset() {
        return objectType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkObjectType objectType
     * }
     */
    public static int objectType(MemorySegment struct) {
        return struct.get(objectType$LAYOUT, objectType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkObjectType objectType
     * }
     */
    public static void objectType(MemorySegment struct, int fieldValue) {
        struct.set(objectType$LAYOUT, objectType$OFFSET, fieldValue);
    }

    private static final OfLong objectHandle$LAYOUT = (OfLong)$LAYOUT.select(groupElement("objectHandle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t objectHandle
     * }
     */
    public static final OfLong objectHandle$layout() {
        return objectHandle$LAYOUT;
    }

    private static final long objectHandle$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t objectHandle
     * }
     */
    public static final long objectHandle$offset() {
        return objectHandle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t objectHandle
     * }
     */
    public static long objectHandle(MemorySegment struct) {
        return struct.get(objectHandle$LAYOUT, objectHandle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t objectHandle
     * }
     */
    public static void objectHandle(MemorySegment struct, long fieldValue) {
        struct.set(objectHandle$LAYOUT, objectHandle$OFFSET, fieldValue);
    }

    private static final OfInt heapIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("heapIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t heapIndex
     * }
     */
    public static final OfInt heapIndex$layout() {
        return heapIndex$LAYOUT;
    }

    private static final long heapIndex$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t heapIndex
     * }
     */
    public static final long heapIndex$offset() {
        return heapIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t heapIndex
     * }
     */
    public static int heapIndex(MemorySegment struct) {
        return struct.get(heapIndex$LAYOUT, heapIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t heapIndex
     * }
     */
    public static void heapIndex(MemorySegment struct, int fieldValue) {
        struct.set(heapIndex$LAYOUT, heapIndex$OFFSET, fieldValue);
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

