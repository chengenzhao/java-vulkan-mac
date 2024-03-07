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
 * struct VkVertexInputBindingDescription {
 *     uint32_t binding;
 *     uint32_t stride;
 *     VkVertexInputRate inputRate;
 * }
 * }
 */
public class VkVertexInputBindingDescription {

    VkVertexInputBindingDescription() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("binding"),
        vulkan_h.C_INT.withName("stride"),
        vulkan_h.C_INT.withName("inputRate")
    ).withName("VkVertexInputBindingDescription");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt binding$LAYOUT = (OfInt)$LAYOUT.select(groupElement("binding"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t binding
     * }
     */
    public static final OfInt binding$layout() {
        return binding$LAYOUT;
    }

    private static final long binding$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t binding
     * }
     */
    public static final long binding$offset() {
        return binding$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t binding
     * }
     */
    public static int binding(MemorySegment struct) {
        return struct.get(binding$LAYOUT, binding$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t binding
     * }
     */
    public static void binding(MemorySegment struct, int fieldValue) {
        struct.set(binding$LAYOUT, binding$OFFSET, fieldValue);
    }

    private static final OfInt stride$LAYOUT = (OfInt)$LAYOUT.select(groupElement("stride"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t stride
     * }
     */
    public static final OfInt stride$layout() {
        return stride$LAYOUT;
    }

    private static final long stride$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t stride
     * }
     */
    public static final long stride$offset() {
        return stride$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t stride
     * }
     */
    public static int stride(MemorySegment struct) {
        return struct.get(stride$LAYOUT, stride$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t stride
     * }
     */
    public static void stride(MemorySegment struct, int fieldValue) {
        struct.set(stride$LAYOUT, stride$OFFSET, fieldValue);
    }

    private static final OfInt inputRate$LAYOUT = (OfInt)$LAYOUT.select(groupElement("inputRate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkVertexInputRate inputRate
     * }
     */
    public static final OfInt inputRate$layout() {
        return inputRate$LAYOUT;
    }

    private static final long inputRate$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkVertexInputRate inputRate
     * }
     */
    public static final long inputRate$offset() {
        return inputRate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkVertexInputRate inputRate
     * }
     */
    public static int inputRate(MemorySegment struct) {
        return struct.get(inputRate$LAYOUT, inputRate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkVertexInputRate inputRate
     * }
     */
    public static void inputRate(MemorySegment struct, int fieldValue) {
        struct.set(inputRate$LAYOUT, inputRate$OFFSET, fieldValue);
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

