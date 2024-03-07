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
 * struct VkCommandBufferAllocateInfo {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkCommandPool commandPool;
 *     VkCommandBufferLevel level;
 *     uint32_t commandBufferCount;
 * }
 * }
 */
public class VkCommandBufferAllocateInfo {

    VkCommandBufferAllocateInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_POINTER.withName("commandPool"),
        vulkan_h.C_INT.withName("level"),
        vulkan_h.C_INT.withName("commandBufferCount")
    ).withName("VkCommandBufferAllocateInfo");

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

    private static final AddressLayout commandPool$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("commandPool"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkCommandPool commandPool
     * }
     */
    public static final AddressLayout commandPool$layout() {
        return commandPool$LAYOUT;
    }

    private static final long commandPool$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkCommandPool commandPool
     * }
     */
    public static final long commandPool$offset() {
        return commandPool$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkCommandPool commandPool
     * }
     */
    public static MemorySegment commandPool(MemorySegment struct) {
        return struct.get(commandPool$LAYOUT, commandPool$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkCommandPool commandPool
     * }
     */
    public static void commandPool(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(commandPool$LAYOUT, commandPool$OFFSET, fieldValue);
    }

    private static final OfInt level$LAYOUT = (OfInt)$LAYOUT.select(groupElement("level"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkCommandBufferLevel level
     * }
     */
    public static final OfInt level$layout() {
        return level$LAYOUT;
    }

    private static final long level$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkCommandBufferLevel level
     * }
     */
    public static final long level$offset() {
        return level$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkCommandBufferLevel level
     * }
     */
    public static int level(MemorySegment struct) {
        return struct.get(level$LAYOUT, level$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkCommandBufferLevel level
     * }
     */
    public static void level(MemorySegment struct, int fieldValue) {
        struct.set(level$LAYOUT, level$OFFSET, fieldValue);
    }

    private static final OfInt commandBufferCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("commandBufferCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t commandBufferCount
     * }
     */
    public static final OfInt commandBufferCount$layout() {
        return commandBufferCount$LAYOUT;
    }

    private static final long commandBufferCount$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t commandBufferCount
     * }
     */
    public static final long commandBufferCount$offset() {
        return commandBufferCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t commandBufferCount
     * }
     */
    public static int commandBufferCount(MemorySegment struct) {
        return struct.get(commandBufferCount$LAYOUT, commandBufferCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t commandBufferCount
     * }
     */
    public static void commandBufferCount(MemorySegment struct, int fieldValue) {
        struct.set(commandBufferCount$LAYOUT, commandBufferCount$OFFSET, fieldValue);
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

