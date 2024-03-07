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
 * struct VkDebugMarkerMarkerInfoEXT {
 *     VkStructureType sType;
 *     const void *pNext;
 *     const char *pMarkerName;
 *     float color[4];
 * }
 * }
 */
public class VkDebugMarkerMarkerInfoEXT {

    VkDebugMarkerMarkerInfoEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_POINTER.withName("pMarkerName"),
        MemoryLayout.sequenceLayout(4, vulkan_h.C_FLOAT).withName("color")
    ).withName("VkDebugMarkerMarkerInfoEXT");

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

    private static final AddressLayout pMarkerName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pMarkerName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *pMarkerName
     * }
     */
    public static final AddressLayout pMarkerName$layout() {
        return pMarkerName$LAYOUT;
    }

    private static final long pMarkerName$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *pMarkerName
     * }
     */
    public static final long pMarkerName$offset() {
        return pMarkerName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *pMarkerName
     * }
     */
    public static MemorySegment pMarkerName(MemorySegment struct) {
        return struct.get(pMarkerName$LAYOUT, pMarkerName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *pMarkerName
     * }
     */
    public static void pMarkerName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pMarkerName$LAYOUT, pMarkerName$OFFSET, fieldValue);
    }

    private static final SequenceLayout color$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("color"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float color[4]
     * }
     */
    public static final SequenceLayout color$layout() {
        return color$LAYOUT;
    }

    private static final long color$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float color[4]
     * }
     */
    public static final long color$offset() {
        return color$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float color[4]
     * }
     */
    public static MemorySegment color(MemorySegment struct) {
        return struct.asSlice(color$OFFSET, color$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float color[4]
     * }
     */
    public static void color(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, color$OFFSET, color$LAYOUT.byteSize());
    }

    private static long[] color$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * float color[4]
     * }
     */
    public static long[] color$dimensions() {
        return color$DIMS;
    }
    private static final VarHandle color$ELEM_HANDLE = color$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * float color[4]
     * }
     */
    public static float color(MemorySegment struct, long index0) {
        return (float)color$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * float color[4]
     * }
     */
    public static void color(MemorySegment struct, long index0, float fieldValue) {
        color$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

