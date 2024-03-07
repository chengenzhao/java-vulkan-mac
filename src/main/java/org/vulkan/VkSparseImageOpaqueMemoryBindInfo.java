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
 * struct VkSparseImageOpaqueMemoryBindInfo {
 *     VkImage image;
 *     uint32_t bindCount;
 *     const VkSparseMemoryBind *pBinds;
 * }
 * }
 */
public class VkSparseImageOpaqueMemoryBindInfo {

    VkSparseImageOpaqueMemoryBindInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_POINTER.withName("image"),
        vulkan_h.C_INT.withName("bindCount"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pBinds")
    ).withName("VkSparseImageOpaqueMemoryBindInfo");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout image$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("image"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkImage image
     * }
     */
    public static final AddressLayout image$layout() {
        return image$LAYOUT;
    }

    private static final long image$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkImage image
     * }
     */
    public static final long image$offset() {
        return image$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkImage image
     * }
     */
    public static MemorySegment image(MemorySegment struct) {
        return struct.get(image$LAYOUT, image$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkImage image
     * }
     */
    public static void image(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(image$LAYOUT, image$OFFSET, fieldValue);
    }

    private static final OfInt bindCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bindCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t bindCount
     * }
     */
    public static final OfInt bindCount$layout() {
        return bindCount$LAYOUT;
    }

    private static final long bindCount$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t bindCount
     * }
     */
    public static final long bindCount$offset() {
        return bindCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t bindCount
     * }
     */
    public static int bindCount(MemorySegment struct) {
        return struct.get(bindCount$LAYOUT, bindCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t bindCount
     * }
     */
    public static void bindCount(MemorySegment struct, int fieldValue) {
        struct.set(bindCount$LAYOUT, bindCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pBinds$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pBinds"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkSparseMemoryBind *pBinds
     * }
     */
    public static final AddressLayout pBinds$layout() {
        return pBinds$LAYOUT;
    }

    private static final long pBinds$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkSparseMemoryBind *pBinds
     * }
     */
    public static final long pBinds$offset() {
        return pBinds$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkSparseMemoryBind *pBinds
     * }
     */
    public static MemorySegment pBinds(MemorySegment struct) {
        return struct.get(pBinds$LAYOUT, pBinds$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkSparseMemoryBind *pBinds
     * }
     */
    public static void pBinds(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pBinds$LAYOUT, pBinds$OFFSET, fieldValue);
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

