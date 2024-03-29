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
 * union VkAccelerationStructureGeometryDataKHR {
 *     VkAccelerationStructureGeometryTrianglesDataKHR triangles;
 *     VkAccelerationStructureGeometryAabbsDataKHR aabbs;
 *     VkAccelerationStructureGeometryInstancesDataKHR instances;
 * }
 * }
 */
public class VkAccelerationStructureGeometryDataKHR {

    VkAccelerationStructureGeometryDataKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
        VkAccelerationStructureGeometryTrianglesDataKHR.layout().withName("triangles"),
        VkAccelerationStructureGeometryAabbsDataKHR.layout().withName("aabbs"),
        VkAccelerationStructureGeometryInstancesDataKHR.layout().withName("instances")
    ).withName("VkAccelerationStructureGeometryDataKHR");

    /**
     * The layout of this union
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout triangles$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("triangles"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkAccelerationStructureGeometryTrianglesDataKHR triangles
     * }
     */
    public static final GroupLayout triangles$layout() {
        return triangles$LAYOUT;
    }

    private static final long triangles$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkAccelerationStructureGeometryTrianglesDataKHR triangles
     * }
     */
    public static final long triangles$offset() {
        return triangles$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkAccelerationStructureGeometryTrianglesDataKHR triangles
     * }
     */
    public static MemorySegment triangles(MemorySegment union) {
        return union.asSlice(triangles$OFFSET, triangles$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkAccelerationStructureGeometryTrianglesDataKHR triangles
     * }
     */
    public static void triangles(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, union, triangles$OFFSET, triangles$LAYOUT.byteSize());
    }

    private static final GroupLayout aabbs$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("aabbs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkAccelerationStructureGeometryAabbsDataKHR aabbs
     * }
     */
    public static final GroupLayout aabbs$layout() {
        return aabbs$LAYOUT;
    }

    private static final long aabbs$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkAccelerationStructureGeometryAabbsDataKHR aabbs
     * }
     */
    public static final long aabbs$offset() {
        return aabbs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkAccelerationStructureGeometryAabbsDataKHR aabbs
     * }
     */
    public static MemorySegment aabbs(MemorySegment union) {
        return union.asSlice(aabbs$OFFSET, aabbs$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkAccelerationStructureGeometryAabbsDataKHR aabbs
     * }
     */
    public static void aabbs(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, union, aabbs$OFFSET, aabbs$LAYOUT.byteSize());
    }

    private static final GroupLayout instances$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("instances"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkAccelerationStructureGeometryInstancesDataKHR instances
     * }
     */
    public static final GroupLayout instances$layout() {
        return instances$LAYOUT;
    }

    private static final long instances$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkAccelerationStructureGeometryInstancesDataKHR instances
     * }
     */
    public static final long instances$offset() {
        return instances$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkAccelerationStructureGeometryInstancesDataKHR instances
     * }
     */
    public static MemorySegment instances(MemorySegment union) {
        return union.asSlice(instances$OFFSET, instances$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkAccelerationStructureGeometryInstancesDataKHR instances
     * }
     */
    public static void instances(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, union, instances$OFFSET, instances$LAYOUT.byteSize());
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this union
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

