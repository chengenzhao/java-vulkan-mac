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
 * struct VkVideoEncodeH264GopRemainingFrameInfoKHR {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkBool32 useGopRemainingFrames;
 *     uint32_t gopRemainingI;
 *     uint32_t gopRemainingP;
 *     uint32_t gopRemainingB;
 * }
 * }
 */
public class VkVideoEncodeH264GopRemainingFrameInfoKHR {

    VkVideoEncodeH264GopRemainingFrameInfoKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("useGopRemainingFrames"),
        vulkan_h.C_INT.withName("gopRemainingI"),
        vulkan_h.C_INT.withName("gopRemainingP"),
        vulkan_h.C_INT.withName("gopRemainingB")
    ).withName("VkVideoEncodeH264GopRemainingFrameInfoKHR");

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

    private static final OfInt useGopRemainingFrames$LAYOUT = (OfInt)$LAYOUT.select(groupElement("useGopRemainingFrames"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 useGopRemainingFrames
     * }
     */
    public static final OfInt useGopRemainingFrames$layout() {
        return useGopRemainingFrames$LAYOUT;
    }

    private static final long useGopRemainingFrames$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 useGopRemainingFrames
     * }
     */
    public static final long useGopRemainingFrames$offset() {
        return useGopRemainingFrames$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 useGopRemainingFrames
     * }
     */
    public static int useGopRemainingFrames(MemorySegment struct) {
        return struct.get(useGopRemainingFrames$LAYOUT, useGopRemainingFrames$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 useGopRemainingFrames
     * }
     */
    public static void useGopRemainingFrames(MemorySegment struct, int fieldValue) {
        struct.set(useGopRemainingFrames$LAYOUT, useGopRemainingFrames$OFFSET, fieldValue);
    }

    private static final OfInt gopRemainingI$LAYOUT = (OfInt)$LAYOUT.select(groupElement("gopRemainingI"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t gopRemainingI
     * }
     */
    public static final OfInt gopRemainingI$layout() {
        return gopRemainingI$LAYOUT;
    }

    private static final long gopRemainingI$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t gopRemainingI
     * }
     */
    public static final long gopRemainingI$offset() {
        return gopRemainingI$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t gopRemainingI
     * }
     */
    public static int gopRemainingI(MemorySegment struct) {
        return struct.get(gopRemainingI$LAYOUT, gopRemainingI$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t gopRemainingI
     * }
     */
    public static void gopRemainingI(MemorySegment struct, int fieldValue) {
        struct.set(gopRemainingI$LAYOUT, gopRemainingI$OFFSET, fieldValue);
    }

    private static final OfInt gopRemainingP$LAYOUT = (OfInt)$LAYOUT.select(groupElement("gopRemainingP"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t gopRemainingP
     * }
     */
    public static final OfInt gopRemainingP$layout() {
        return gopRemainingP$LAYOUT;
    }

    private static final long gopRemainingP$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t gopRemainingP
     * }
     */
    public static final long gopRemainingP$offset() {
        return gopRemainingP$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t gopRemainingP
     * }
     */
    public static int gopRemainingP(MemorySegment struct) {
        return struct.get(gopRemainingP$LAYOUT, gopRemainingP$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t gopRemainingP
     * }
     */
    public static void gopRemainingP(MemorySegment struct, int fieldValue) {
        struct.set(gopRemainingP$LAYOUT, gopRemainingP$OFFSET, fieldValue);
    }

    private static final OfInt gopRemainingB$LAYOUT = (OfInt)$LAYOUT.select(groupElement("gopRemainingB"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t gopRemainingB
     * }
     */
    public static final OfInt gopRemainingB$layout() {
        return gopRemainingB$LAYOUT;
    }

    private static final long gopRemainingB$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t gopRemainingB
     * }
     */
    public static final long gopRemainingB$offset() {
        return gopRemainingB$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t gopRemainingB
     * }
     */
    public static int gopRemainingB(MemorySegment struct) {
        return struct.get(gopRemainingB$LAYOUT, gopRemainingB$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t gopRemainingB
     * }
     */
    public static void gopRemainingB(MemorySegment struct, int fieldValue) {
        struct.set(gopRemainingB$LAYOUT, gopRemainingB$OFFSET, fieldValue);
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

