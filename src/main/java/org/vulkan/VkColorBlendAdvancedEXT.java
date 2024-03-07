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
 * struct VkColorBlendAdvancedEXT {
 *     VkBlendOp advancedBlendOp;
 *     VkBool32 srcPremultiplied;
 *     VkBool32 dstPremultiplied;
 *     VkBlendOverlapEXT blendOverlap;
 *     VkBool32 clampResults;
 * }
 * }
 */
public class VkColorBlendAdvancedEXT {

    VkColorBlendAdvancedEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("advancedBlendOp"),
        vulkan_h.C_INT.withName("srcPremultiplied"),
        vulkan_h.C_INT.withName("dstPremultiplied"),
        vulkan_h.C_INT.withName("blendOverlap"),
        vulkan_h.C_INT.withName("clampResults")
    ).withName("VkColorBlendAdvancedEXT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt advancedBlendOp$LAYOUT = (OfInt)$LAYOUT.select(groupElement("advancedBlendOp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBlendOp advancedBlendOp
     * }
     */
    public static final OfInt advancedBlendOp$layout() {
        return advancedBlendOp$LAYOUT;
    }

    private static final long advancedBlendOp$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBlendOp advancedBlendOp
     * }
     */
    public static final long advancedBlendOp$offset() {
        return advancedBlendOp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBlendOp advancedBlendOp
     * }
     */
    public static int advancedBlendOp(MemorySegment struct) {
        return struct.get(advancedBlendOp$LAYOUT, advancedBlendOp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBlendOp advancedBlendOp
     * }
     */
    public static void advancedBlendOp(MemorySegment struct, int fieldValue) {
        struct.set(advancedBlendOp$LAYOUT, advancedBlendOp$OFFSET, fieldValue);
    }

    private static final OfInt srcPremultiplied$LAYOUT = (OfInt)$LAYOUT.select(groupElement("srcPremultiplied"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 srcPremultiplied
     * }
     */
    public static final OfInt srcPremultiplied$layout() {
        return srcPremultiplied$LAYOUT;
    }

    private static final long srcPremultiplied$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 srcPremultiplied
     * }
     */
    public static final long srcPremultiplied$offset() {
        return srcPremultiplied$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 srcPremultiplied
     * }
     */
    public static int srcPremultiplied(MemorySegment struct) {
        return struct.get(srcPremultiplied$LAYOUT, srcPremultiplied$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 srcPremultiplied
     * }
     */
    public static void srcPremultiplied(MemorySegment struct, int fieldValue) {
        struct.set(srcPremultiplied$LAYOUT, srcPremultiplied$OFFSET, fieldValue);
    }

    private static final OfInt dstPremultiplied$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dstPremultiplied"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 dstPremultiplied
     * }
     */
    public static final OfInt dstPremultiplied$layout() {
        return dstPremultiplied$LAYOUT;
    }

    private static final long dstPremultiplied$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 dstPremultiplied
     * }
     */
    public static final long dstPremultiplied$offset() {
        return dstPremultiplied$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 dstPremultiplied
     * }
     */
    public static int dstPremultiplied(MemorySegment struct) {
        return struct.get(dstPremultiplied$LAYOUT, dstPremultiplied$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 dstPremultiplied
     * }
     */
    public static void dstPremultiplied(MemorySegment struct, int fieldValue) {
        struct.set(dstPremultiplied$LAYOUT, dstPremultiplied$OFFSET, fieldValue);
    }

    private static final OfInt blendOverlap$LAYOUT = (OfInt)$LAYOUT.select(groupElement("blendOverlap"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBlendOverlapEXT blendOverlap
     * }
     */
    public static final OfInt blendOverlap$layout() {
        return blendOverlap$LAYOUT;
    }

    private static final long blendOverlap$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBlendOverlapEXT blendOverlap
     * }
     */
    public static final long blendOverlap$offset() {
        return blendOverlap$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBlendOverlapEXT blendOverlap
     * }
     */
    public static int blendOverlap(MemorySegment struct) {
        return struct.get(blendOverlap$LAYOUT, blendOverlap$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBlendOverlapEXT blendOverlap
     * }
     */
    public static void blendOverlap(MemorySegment struct, int fieldValue) {
        struct.set(blendOverlap$LAYOUT, blendOverlap$OFFSET, fieldValue);
    }

    private static final OfInt clampResults$LAYOUT = (OfInt)$LAYOUT.select(groupElement("clampResults"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 clampResults
     * }
     */
    public static final OfInt clampResults$layout() {
        return clampResults$LAYOUT;
    }

    private static final long clampResults$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 clampResults
     * }
     */
    public static final long clampResults$offset() {
        return clampResults$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 clampResults
     * }
     */
    public static int clampResults(MemorySegment struct) {
        return struct.get(clampResults$LAYOUT, clampResults$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 clampResults
     * }
     */
    public static void clampResults(MemorySegment struct, int fieldValue) {
        struct.set(clampResults$LAYOUT, clampResults$OFFSET, fieldValue);
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

