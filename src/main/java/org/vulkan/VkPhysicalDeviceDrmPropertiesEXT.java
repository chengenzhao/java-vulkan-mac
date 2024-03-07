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
 * struct VkPhysicalDeviceDrmPropertiesEXT {
 *     VkStructureType sType;
 *     void *pNext;
 *     VkBool32 hasPrimary;
 *     VkBool32 hasRender;
 *     int64_t primaryMajor;
 *     int64_t primaryMinor;
 *     int64_t renderMajor;
 *     int64_t renderMinor;
 * }
 * }
 */
public class VkPhysicalDeviceDrmPropertiesEXT {

    VkPhysicalDeviceDrmPropertiesEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("hasPrimary"),
        vulkan_h.C_INT.withName("hasRender"),
        vulkan_h.C_LONG_LONG.withName("primaryMajor"),
        vulkan_h.C_LONG_LONG.withName("primaryMinor"),
        vulkan_h.C_LONG_LONG.withName("renderMajor"),
        vulkan_h.C_LONG_LONG.withName("renderMinor")
    ).withName("VkPhysicalDeviceDrmPropertiesEXT");

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

    private static final OfInt hasPrimary$LAYOUT = (OfInt)$LAYOUT.select(groupElement("hasPrimary"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 hasPrimary
     * }
     */
    public static final OfInt hasPrimary$layout() {
        return hasPrimary$LAYOUT;
    }

    private static final long hasPrimary$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 hasPrimary
     * }
     */
    public static final long hasPrimary$offset() {
        return hasPrimary$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 hasPrimary
     * }
     */
    public static int hasPrimary(MemorySegment struct) {
        return struct.get(hasPrimary$LAYOUT, hasPrimary$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 hasPrimary
     * }
     */
    public static void hasPrimary(MemorySegment struct, int fieldValue) {
        struct.set(hasPrimary$LAYOUT, hasPrimary$OFFSET, fieldValue);
    }

    private static final OfInt hasRender$LAYOUT = (OfInt)$LAYOUT.select(groupElement("hasRender"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 hasRender
     * }
     */
    public static final OfInt hasRender$layout() {
        return hasRender$LAYOUT;
    }

    private static final long hasRender$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 hasRender
     * }
     */
    public static final long hasRender$offset() {
        return hasRender$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 hasRender
     * }
     */
    public static int hasRender(MemorySegment struct) {
        return struct.get(hasRender$LAYOUT, hasRender$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 hasRender
     * }
     */
    public static void hasRender(MemorySegment struct, int fieldValue) {
        struct.set(hasRender$LAYOUT, hasRender$OFFSET, fieldValue);
    }

    private static final OfLong primaryMajor$LAYOUT = (OfLong)$LAYOUT.select(groupElement("primaryMajor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t primaryMajor
     * }
     */
    public static final OfLong primaryMajor$layout() {
        return primaryMajor$LAYOUT;
    }

    private static final long primaryMajor$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t primaryMajor
     * }
     */
    public static final long primaryMajor$offset() {
        return primaryMajor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t primaryMajor
     * }
     */
    public static long primaryMajor(MemorySegment struct) {
        return struct.get(primaryMajor$LAYOUT, primaryMajor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t primaryMajor
     * }
     */
    public static void primaryMajor(MemorySegment struct, long fieldValue) {
        struct.set(primaryMajor$LAYOUT, primaryMajor$OFFSET, fieldValue);
    }

    private static final OfLong primaryMinor$LAYOUT = (OfLong)$LAYOUT.select(groupElement("primaryMinor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t primaryMinor
     * }
     */
    public static final OfLong primaryMinor$layout() {
        return primaryMinor$LAYOUT;
    }

    private static final long primaryMinor$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t primaryMinor
     * }
     */
    public static final long primaryMinor$offset() {
        return primaryMinor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t primaryMinor
     * }
     */
    public static long primaryMinor(MemorySegment struct) {
        return struct.get(primaryMinor$LAYOUT, primaryMinor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t primaryMinor
     * }
     */
    public static void primaryMinor(MemorySegment struct, long fieldValue) {
        struct.set(primaryMinor$LAYOUT, primaryMinor$OFFSET, fieldValue);
    }

    private static final OfLong renderMajor$LAYOUT = (OfLong)$LAYOUT.select(groupElement("renderMajor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t renderMajor
     * }
     */
    public static final OfLong renderMajor$layout() {
        return renderMajor$LAYOUT;
    }

    private static final long renderMajor$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t renderMajor
     * }
     */
    public static final long renderMajor$offset() {
        return renderMajor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t renderMajor
     * }
     */
    public static long renderMajor(MemorySegment struct) {
        return struct.get(renderMajor$LAYOUT, renderMajor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t renderMajor
     * }
     */
    public static void renderMajor(MemorySegment struct, long fieldValue) {
        struct.set(renderMajor$LAYOUT, renderMajor$OFFSET, fieldValue);
    }

    private static final OfLong renderMinor$LAYOUT = (OfLong)$LAYOUT.select(groupElement("renderMinor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t renderMinor
     * }
     */
    public static final OfLong renderMinor$layout() {
        return renderMinor$LAYOUT;
    }

    private static final long renderMinor$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t renderMinor
     * }
     */
    public static final long renderMinor$offset() {
        return renderMinor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t renderMinor
     * }
     */
    public static long renderMinor(MemorySegment struct) {
        return struct.get(renderMinor$LAYOUT, renderMinor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t renderMinor
     * }
     */
    public static void renderMinor(MemorySegment struct, long fieldValue) {
        struct.set(renderMinor$LAYOUT, renderMinor$OFFSET, fieldValue);
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

