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
 * struct VkPhysicalDeviceOpacityMicromapFeaturesEXT {
 *     VkStructureType sType;
 *     void *pNext;
 *     VkBool32 micromap;
 *     VkBool32 micromapCaptureReplay;
 *     VkBool32 micromapHostCommands;
 * }
 * }
 */
public class VkPhysicalDeviceOpacityMicromapFeaturesEXT {

    VkPhysicalDeviceOpacityMicromapFeaturesEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("micromap"),
        vulkan_h.C_INT.withName("micromapCaptureReplay"),
        vulkan_h.C_INT.withName("micromapHostCommands"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceOpacityMicromapFeaturesEXT");

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

    private static final OfInt micromap$LAYOUT = (OfInt)$LAYOUT.select(groupElement("micromap"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 micromap
     * }
     */
    public static final OfInt micromap$layout() {
        return micromap$LAYOUT;
    }

    private static final long micromap$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 micromap
     * }
     */
    public static final long micromap$offset() {
        return micromap$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 micromap
     * }
     */
    public static int micromap(MemorySegment struct) {
        return struct.get(micromap$LAYOUT, micromap$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 micromap
     * }
     */
    public static void micromap(MemorySegment struct, int fieldValue) {
        struct.set(micromap$LAYOUT, micromap$OFFSET, fieldValue);
    }

    private static final OfInt micromapCaptureReplay$LAYOUT = (OfInt)$LAYOUT.select(groupElement("micromapCaptureReplay"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 micromapCaptureReplay
     * }
     */
    public static final OfInt micromapCaptureReplay$layout() {
        return micromapCaptureReplay$LAYOUT;
    }

    private static final long micromapCaptureReplay$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 micromapCaptureReplay
     * }
     */
    public static final long micromapCaptureReplay$offset() {
        return micromapCaptureReplay$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 micromapCaptureReplay
     * }
     */
    public static int micromapCaptureReplay(MemorySegment struct) {
        return struct.get(micromapCaptureReplay$LAYOUT, micromapCaptureReplay$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 micromapCaptureReplay
     * }
     */
    public static void micromapCaptureReplay(MemorySegment struct, int fieldValue) {
        struct.set(micromapCaptureReplay$LAYOUT, micromapCaptureReplay$OFFSET, fieldValue);
    }

    private static final OfInt micromapHostCommands$LAYOUT = (OfInt)$LAYOUT.select(groupElement("micromapHostCommands"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 micromapHostCommands
     * }
     */
    public static final OfInt micromapHostCommands$layout() {
        return micromapHostCommands$LAYOUT;
    }

    private static final long micromapHostCommands$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 micromapHostCommands
     * }
     */
    public static final long micromapHostCommands$offset() {
        return micromapHostCommands$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 micromapHostCommands
     * }
     */
    public static int micromapHostCommands(MemorySegment struct) {
        return struct.get(micromapHostCommands$LAYOUT, micromapHostCommands$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 micromapHostCommands
     * }
     */
    public static void micromapHostCommands(MemorySegment struct, int fieldValue) {
        struct.set(micromapHostCommands$LAYOUT, micromapHostCommands$OFFSET, fieldValue);
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

