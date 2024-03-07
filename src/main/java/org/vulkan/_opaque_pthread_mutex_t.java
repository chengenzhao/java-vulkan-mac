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
 * struct _opaque_pthread_mutex_t {
 *     long __sig;
 *     char __opaque[56];
 * }
 * }
 */
public class _opaque_pthread_mutex_t {

    _opaque_pthread_mutex_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_LONG.withName("__sig"),
        MemoryLayout.sequenceLayout(56, vulkan_h.C_CHAR).withName("__opaque")
    ).withName("_opaque_pthread_mutex_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong __sig$LAYOUT = (OfLong)$LAYOUT.select(groupElement("__sig"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long __sig
     * }
     */
    public static final OfLong __sig$layout() {
        return __sig$LAYOUT;
    }

    private static final long __sig$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long __sig
     * }
     */
    public static final long __sig$offset() {
        return __sig$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long __sig
     * }
     */
    public static long __sig(MemorySegment struct) {
        return struct.get(__sig$LAYOUT, __sig$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long __sig
     * }
     */
    public static void __sig(MemorySegment struct, long fieldValue) {
        struct.set(__sig$LAYOUT, __sig$OFFSET, fieldValue);
    }

    private static final SequenceLayout __opaque$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("__opaque"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char __opaque[56]
     * }
     */
    public static final SequenceLayout __opaque$layout() {
        return __opaque$LAYOUT;
    }

    private static final long __opaque$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char __opaque[56]
     * }
     */
    public static final long __opaque$offset() {
        return __opaque$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char __opaque[56]
     * }
     */
    public static MemorySegment __opaque(MemorySegment struct) {
        return struct.asSlice(__opaque$OFFSET, __opaque$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char __opaque[56]
     * }
     */
    public static void __opaque(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __opaque$OFFSET, __opaque$LAYOUT.byteSize());
    }

    private static long[] __opaque$DIMS = { 56 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char __opaque[56]
     * }
     */
    public static long[] __opaque$dimensions() {
        return __opaque$DIMS;
    }
    private static final VarHandle __opaque$ELEM_HANDLE = __opaque$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char __opaque[56]
     * }
     */
    public static byte __opaque(MemorySegment struct, long index0) {
        return (byte)__opaque$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char __opaque[56]
     * }
     */
    public static void __opaque(MemorySegment struct, long index0, byte fieldValue) {
        __opaque$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

