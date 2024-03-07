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
 * struct VkPhysicalDeviceFloatControlsProperties {
 *     VkStructureType sType;
 *     void *pNext;
 *     VkShaderFloatControlsIndependence denormBehaviorIndependence;
 *     VkShaderFloatControlsIndependence roundingModeIndependence;
 *     VkBool32 shaderSignedZeroInfNanPreserveFloat16;
 *     VkBool32 shaderSignedZeroInfNanPreserveFloat32;
 *     VkBool32 shaderSignedZeroInfNanPreserveFloat64;
 *     VkBool32 shaderDenormPreserveFloat16;
 *     VkBool32 shaderDenormPreserveFloat32;
 *     VkBool32 shaderDenormPreserveFloat64;
 *     VkBool32 shaderDenormFlushToZeroFloat16;
 *     VkBool32 shaderDenormFlushToZeroFloat32;
 *     VkBool32 shaderDenormFlushToZeroFloat64;
 *     VkBool32 shaderRoundingModeRTEFloat16;
 *     VkBool32 shaderRoundingModeRTEFloat32;
 *     VkBool32 shaderRoundingModeRTEFloat64;
 *     VkBool32 shaderRoundingModeRTZFloat16;
 *     VkBool32 shaderRoundingModeRTZFloat32;
 *     VkBool32 shaderRoundingModeRTZFloat64;
 * }
 * }
 */
public class VkPhysicalDeviceFloatControlsProperties {

    VkPhysicalDeviceFloatControlsProperties() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("denormBehaviorIndependence"),
        vulkan_h.C_INT.withName("roundingModeIndependence"),
        vulkan_h.C_INT.withName("shaderSignedZeroInfNanPreserveFloat16"),
        vulkan_h.C_INT.withName("shaderSignedZeroInfNanPreserveFloat32"),
        vulkan_h.C_INT.withName("shaderSignedZeroInfNanPreserveFloat64"),
        vulkan_h.C_INT.withName("shaderDenormPreserveFloat16"),
        vulkan_h.C_INT.withName("shaderDenormPreserveFloat32"),
        vulkan_h.C_INT.withName("shaderDenormPreserveFloat64"),
        vulkan_h.C_INT.withName("shaderDenormFlushToZeroFloat16"),
        vulkan_h.C_INT.withName("shaderDenormFlushToZeroFloat32"),
        vulkan_h.C_INT.withName("shaderDenormFlushToZeroFloat64"),
        vulkan_h.C_INT.withName("shaderRoundingModeRTEFloat16"),
        vulkan_h.C_INT.withName("shaderRoundingModeRTEFloat32"),
        vulkan_h.C_INT.withName("shaderRoundingModeRTEFloat64"),
        vulkan_h.C_INT.withName("shaderRoundingModeRTZFloat16"),
        vulkan_h.C_INT.withName("shaderRoundingModeRTZFloat32"),
        vulkan_h.C_INT.withName("shaderRoundingModeRTZFloat64"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceFloatControlsProperties");

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

    private static final OfInt denormBehaviorIndependence$LAYOUT = (OfInt)$LAYOUT.select(groupElement("denormBehaviorIndependence"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkShaderFloatControlsIndependence denormBehaviorIndependence
     * }
     */
    public static final OfInt denormBehaviorIndependence$layout() {
        return denormBehaviorIndependence$LAYOUT;
    }

    private static final long denormBehaviorIndependence$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkShaderFloatControlsIndependence denormBehaviorIndependence
     * }
     */
    public static final long denormBehaviorIndependence$offset() {
        return denormBehaviorIndependence$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkShaderFloatControlsIndependence denormBehaviorIndependence
     * }
     */
    public static int denormBehaviorIndependence(MemorySegment struct) {
        return struct.get(denormBehaviorIndependence$LAYOUT, denormBehaviorIndependence$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkShaderFloatControlsIndependence denormBehaviorIndependence
     * }
     */
    public static void denormBehaviorIndependence(MemorySegment struct, int fieldValue) {
        struct.set(denormBehaviorIndependence$LAYOUT, denormBehaviorIndependence$OFFSET, fieldValue);
    }

    private static final OfInt roundingModeIndependence$LAYOUT = (OfInt)$LAYOUT.select(groupElement("roundingModeIndependence"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkShaderFloatControlsIndependence roundingModeIndependence
     * }
     */
    public static final OfInt roundingModeIndependence$layout() {
        return roundingModeIndependence$LAYOUT;
    }

    private static final long roundingModeIndependence$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkShaderFloatControlsIndependence roundingModeIndependence
     * }
     */
    public static final long roundingModeIndependence$offset() {
        return roundingModeIndependence$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkShaderFloatControlsIndependence roundingModeIndependence
     * }
     */
    public static int roundingModeIndependence(MemorySegment struct) {
        return struct.get(roundingModeIndependence$LAYOUT, roundingModeIndependence$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkShaderFloatControlsIndependence roundingModeIndependence
     * }
     */
    public static void roundingModeIndependence(MemorySegment struct, int fieldValue) {
        struct.set(roundingModeIndependence$LAYOUT, roundingModeIndependence$OFFSET, fieldValue);
    }

    private static final OfInt shaderSignedZeroInfNanPreserveFloat16$LAYOUT = (OfInt)$LAYOUT.select(groupElement("shaderSignedZeroInfNanPreserveFloat16"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 shaderSignedZeroInfNanPreserveFloat16
     * }
     */
    public static final OfInt shaderSignedZeroInfNanPreserveFloat16$layout() {
        return shaderSignedZeroInfNanPreserveFloat16$LAYOUT;
    }

    private static final long shaderSignedZeroInfNanPreserveFloat16$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 shaderSignedZeroInfNanPreserveFloat16
     * }
     */
    public static final long shaderSignedZeroInfNanPreserveFloat16$offset() {
        return shaderSignedZeroInfNanPreserveFloat16$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 shaderSignedZeroInfNanPreserveFloat16
     * }
     */
    public static int shaderSignedZeroInfNanPreserveFloat16(MemorySegment struct) {
        return struct.get(shaderSignedZeroInfNanPreserveFloat16$LAYOUT, shaderSignedZeroInfNanPreserveFloat16$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 shaderSignedZeroInfNanPreserveFloat16
     * }
     */
    public static void shaderSignedZeroInfNanPreserveFloat16(MemorySegment struct, int fieldValue) {
        struct.set(shaderSignedZeroInfNanPreserveFloat16$LAYOUT, shaderSignedZeroInfNanPreserveFloat16$OFFSET, fieldValue);
    }

    private static final OfInt shaderSignedZeroInfNanPreserveFloat32$LAYOUT = (OfInt)$LAYOUT.select(groupElement("shaderSignedZeroInfNanPreserveFloat32"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 shaderSignedZeroInfNanPreserveFloat32
     * }
     */
    public static final OfInt shaderSignedZeroInfNanPreserveFloat32$layout() {
        return shaderSignedZeroInfNanPreserveFloat32$LAYOUT;
    }

    private static final long shaderSignedZeroInfNanPreserveFloat32$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 shaderSignedZeroInfNanPreserveFloat32
     * }
     */
    public static final long shaderSignedZeroInfNanPreserveFloat32$offset() {
        return shaderSignedZeroInfNanPreserveFloat32$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 shaderSignedZeroInfNanPreserveFloat32
     * }
     */
    public static int shaderSignedZeroInfNanPreserveFloat32(MemorySegment struct) {
        return struct.get(shaderSignedZeroInfNanPreserveFloat32$LAYOUT, shaderSignedZeroInfNanPreserveFloat32$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 shaderSignedZeroInfNanPreserveFloat32
     * }
     */
    public static void shaderSignedZeroInfNanPreserveFloat32(MemorySegment struct, int fieldValue) {
        struct.set(shaderSignedZeroInfNanPreserveFloat32$LAYOUT, shaderSignedZeroInfNanPreserveFloat32$OFFSET, fieldValue);
    }

    private static final OfInt shaderSignedZeroInfNanPreserveFloat64$LAYOUT = (OfInt)$LAYOUT.select(groupElement("shaderSignedZeroInfNanPreserveFloat64"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 shaderSignedZeroInfNanPreserveFloat64
     * }
     */
    public static final OfInt shaderSignedZeroInfNanPreserveFloat64$layout() {
        return shaderSignedZeroInfNanPreserveFloat64$LAYOUT;
    }

    private static final long shaderSignedZeroInfNanPreserveFloat64$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 shaderSignedZeroInfNanPreserveFloat64
     * }
     */
    public static final long shaderSignedZeroInfNanPreserveFloat64$offset() {
        return shaderSignedZeroInfNanPreserveFloat64$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 shaderSignedZeroInfNanPreserveFloat64
     * }
     */
    public static int shaderSignedZeroInfNanPreserveFloat64(MemorySegment struct) {
        return struct.get(shaderSignedZeroInfNanPreserveFloat64$LAYOUT, shaderSignedZeroInfNanPreserveFloat64$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 shaderSignedZeroInfNanPreserveFloat64
     * }
     */
    public static void shaderSignedZeroInfNanPreserveFloat64(MemorySegment struct, int fieldValue) {
        struct.set(shaderSignedZeroInfNanPreserveFloat64$LAYOUT, shaderSignedZeroInfNanPreserveFloat64$OFFSET, fieldValue);
    }

    private static final OfInt shaderDenormPreserveFloat16$LAYOUT = (OfInt)$LAYOUT.select(groupElement("shaderDenormPreserveFloat16"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormPreserveFloat16
     * }
     */
    public static final OfInt shaderDenormPreserveFloat16$layout() {
        return shaderDenormPreserveFloat16$LAYOUT;
    }

    private static final long shaderDenormPreserveFloat16$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormPreserveFloat16
     * }
     */
    public static final long shaderDenormPreserveFloat16$offset() {
        return shaderDenormPreserveFloat16$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormPreserveFloat16
     * }
     */
    public static int shaderDenormPreserveFloat16(MemorySegment struct) {
        return struct.get(shaderDenormPreserveFloat16$LAYOUT, shaderDenormPreserveFloat16$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormPreserveFloat16
     * }
     */
    public static void shaderDenormPreserveFloat16(MemorySegment struct, int fieldValue) {
        struct.set(shaderDenormPreserveFloat16$LAYOUT, shaderDenormPreserveFloat16$OFFSET, fieldValue);
    }

    private static final OfInt shaderDenormPreserveFloat32$LAYOUT = (OfInt)$LAYOUT.select(groupElement("shaderDenormPreserveFloat32"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormPreserveFloat32
     * }
     */
    public static final OfInt shaderDenormPreserveFloat32$layout() {
        return shaderDenormPreserveFloat32$LAYOUT;
    }

    private static final long shaderDenormPreserveFloat32$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormPreserveFloat32
     * }
     */
    public static final long shaderDenormPreserveFloat32$offset() {
        return shaderDenormPreserveFloat32$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormPreserveFloat32
     * }
     */
    public static int shaderDenormPreserveFloat32(MemorySegment struct) {
        return struct.get(shaderDenormPreserveFloat32$LAYOUT, shaderDenormPreserveFloat32$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormPreserveFloat32
     * }
     */
    public static void shaderDenormPreserveFloat32(MemorySegment struct, int fieldValue) {
        struct.set(shaderDenormPreserveFloat32$LAYOUT, shaderDenormPreserveFloat32$OFFSET, fieldValue);
    }

    private static final OfInt shaderDenormPreserveFloat64$LAYOUT = (OfInt)$LAYOUT.select(groupElement("shaderDenormPreserveFloat64"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormPreserveFloat64
     * }
     */
    public static final OfInt shaderDenormPreserveFloat64$layout() {
        return shaderDenormPreserveFloat64$LAYOUT;
    }

    private static final long shaderDenormPreserveFloat64$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormPreserveFloat64
     * }
     */
    public static final long shaderDenormPreserveFloat64$offset() {
        return shaderDenormPreserveFloat64$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormPreserveFloat64
     * }
     */
    public static int shaderDenormPreserveFloat64(MemorySegment struct) {
        return struct.get(shaderDenormPreserveFloat64$LAYOUT, shaderDenormPreserveFloat64$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormPreserveFloat64
     * }
     */
    public static void shaderDenormPreserveFloat64(MemorySegment struct, int fieldValue) {
        struct.set(shaderDenormPreserveFloat64$LAYOUT, shaderDenormPreserveFloat64$OFFSET, fieldValue);
    }

    private static final OfInt shaderDenormFlushToZeroFloat16$LAYOUT = (OfInt)$LAYOUT.select(groupElement("shaderDenormFlushToZeroFloat16"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormFlushToZeroFloat16
     * }
     */
    public static final OfInt shaderDenormFlushToZeroFloat16$layout() {
        return shaderDenormFlushToZeroFloat16$LAYOUT;
    }

    private static final long shaderDenormFlushToZeroFloat16$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormFlushToZeroFloat16
     * }
     */
    public static final long shaderDenormFlushToZeroFloat16$offset() {
        return shaderDenormFlushToZeroFloat16$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormFlushToZeroFloat16
     * }
     */
    public static int shaderDenormFlushToZeroFloat16(MemorySegment struct) {
        return struct.get(shaderDenormFlushToZeroFloat16$LAYOUT, shaderDenormFlushToZeroFloat16$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormFlushToZeroFloat16
     * }
     */
    public static void shaderDenormFlushToZeroFloat16(MemorySegment struct, int fieldValue) {
        struct.set(shaderDenormFlushToZeroFloat16$LAYOUT, shaderDenormFlushToZeroFloat16$OFFSET, fieldValue);
    }

    private static final OfInt shaderDenormFlushToZeroFloat32$LAYOUT = (OfInt)$LAYOUT.select(groupElement("shaderDenormFlushToZeroFloat32"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormFlushToZeroFloat32
     * }
     */
    public static final OfInt shaderDenormFlushToZeroFloat32$layout() {
        return shaderDenormFlushToZeroFloat32$LAYOUT;
    }

    private static final long shaderDenormFlushToZeroFloat32$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormFlushToZeroFloat32
     * }
     */
    public static final long shaderDenormFlushToZeroFloat32$offset() {
        return shaderDenormFlushToZeroFloat32$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormFlushToZeroFloat32
     * }
     */
    public static int shaderDenormFlushToZeroFloat32(MemorySegment struct) {
        return struct.get(shaderDenormFlushToZeroFloat32$LAYOUT, shaderDenormFlushToZeroFloat32$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormFlushToZeroFloat32
     * }
     */
    public static void shaderDenormFlushToZeroFloat32(MemorySegment struct, int fieldValue) {
        struct.set(shaderDenormFlushToZeroFloat32$LAYOUT, shaderDenormFlushToZeroFloat32$OFFSET, fieldValue);
    }

    private static final OfInt shaderDenormFlushToZeroFloat64$LAYOUT = (OfInt)$LAYOUT.select(groupElement("shaderDenormFlushToZeroFloat64"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormFlushToZeroFloat64
     * }
     */
    public static final OfInt shaderDenormFlushToZeroFloat64$layout() {
        return shaderDenormFlushToZeroFloat64$LAYOUT;
    }

    private static final long shaderDenormFlushToZeroFloat64$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormFlushToZeroFloat64
     * }
     */
    public static final long shaderDenormFlushToZeroFloat64$offset() {
        return shaderDenormFlushToZeroFloat64$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormFlushToZeroFloat64
     * }
     */
    public static int shaderDenormFlushToZeroFloat64(MemorySegment struct) {
        return struct.get(shaderDenormFlushToZeroFloat64$LAYOUT, shaderDenormFlushToZeroFloat64$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 shaderDenormFlushToZeroFloat64
     * }
     */
    public static void shaderDenormFlushToZeroFloat64(MemorySegment struct, int fieldValue) {
        struct.set(shaderDenormFlushToZeroFloat64$LAYOUT, shaderDenormFlushToZeroFloat64$OFFSET, fieldValue);
    }

    private static final OfInt shaderRoundingModeRTEFloat16$LAYOUT = (OfInt)$LAYOUT.select(groupElement("shaderRoundingModeRTEFloat16"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTEFloat16
     * }
     */
    public static final OfInt shaderRoundingModeRTEFloat16$layout() {
        return shaderRoundingModeRTEFloat16$LAYOUT;
    }

    private static final long shaderRoundingModeRTEFloat16$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTEFloat16
     * }
     */
    public static final long shaderRoundingModeRTEFloat16$offset() {
        return shaderRoundingModeRTEFloat16$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTEFloat16
     * }
     */
    public static int shaderRoundingModeRTEFloat16(MemorySegment struct) {
        return struct.get(shaderRoundingModeRTEFloat16$LAYOUT, shaderRoundingModeRTEFloat16$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTEFloat16
     * }
     */
    public static void shaderRoundingModeRTEFloat16(MemorySegment struct, int fieldValue) {
        struct.set(shaderRoundingModeRTEFloat16$LAYOUT, shaderRoundingModeRTEFloat16$OFFSET, fieldValue);
    }

    private static final OfInt shaderRoundingModeRTEFloat32$LAYOUT = (OfInt)$LAYOUT.select(groupElement("shaderRoundingModeRTEFloat32"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTEFloat32
     * }
     */
    public static final OfInt shaderRoundingModeRTEFloat32$layout() {
        return shaderRoundingModeRTEFloat32$LAYOUT;
    }

    private static final long shaderRoundingModeRTEFloat32$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTEFloat32
     * }
     */
    public static final long shaderRoundingModeRTEFloat32$offset() {
        return shaderRoundingModeRTEFloat32$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTEFloat32
     * }
     */
    public static int shaderRoundingModeRTEFloat32(MemorySegment struct) {
        return struct.get(shaderRoundingModeRTEFloat32$LAYOUT, shaderRoundingModeRTEFloat32$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTEFloat32
     * }
     */
    public static void shaderRoundingModeRTEFloat32(MemorySegment struct, int fieldValue) {
        struct.set(shaderRoundingModeRTEFloat32$LAYOUT, shaderRoundingModeRTEFloat32$OFFSET, fieldValue);
    }

    private static final OfInt shaderRoundingModeRTEFloat64$LAYOUT = (OfInt)$LAYOUT.select(groupElement("shaderRoundingModeRTEFloat64"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTEFloat64
     * }
     */
    public static final OfInt shaderRoundingModeRTEFloat64$layout() {
        return shaderRoundingModeRTEFloat64$LAYOUT;
    }

    private static final long shaderRoundingModeRTEFloat64$OFFSET = 68;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTEFloat64
     * }
     */
    public static final long shaderRoundingModeRTEFloat64$offset() {
        return shaderRoundingModeRTEFloat64$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTEFloat64
     * }
     */
    public static int shaderRoundingModeRTEFloat64(MemorySegment struct) {
        return struct.get(shaderRoundingModeRTEFloat64$LAYOUT, shaderRoundingModeRTEFloat64$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTEFloat64
     * }
     */
    public static void shaderRoundingModeRTEFloat64(MemorySegment struct, int fieldValue) {
        struct.set(shaderRoundingModeRTEFloat64$LAYOUT, shaderRoundingModeRTEFloat64$OFFSET, fieldValue);
    }

    private static final OfInt shaderRoundingModeRTZFloat16$LAYOUT = (OfInt)$LAYOUT.select(groupElement("shaderRoundingModeRTZFloat16"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTZFloat16
     * }
     */
    public static final OfInt shaderRoundingModeRTZFloat16$layout() {
        return shaderRoundingModeRTZFloat16$LAYOUT;
    }

    private static final long shaderRoundingModeRTZFloat16$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTZFloat16
     * }
     */
    public static final long shaderRoundingModeRTZFloat16$offset() {
        return shaderRoundingModeRTZFloat16$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTZFloat16
     * }
     */
    public static int shaderRoundingModeRTZFloat16(MemorySegment struct) {
        return struct.get(shaderRoundingModeRTZFloat16$LAYOUT, shaderRoundingModeRTZFloat16$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTZFloat16
     * }
     */
    public static void shaderRoundingModeRTZFloat16(MemorySegment struct, int fieldValue) {
        struct.set(shaderRoundingModeRTZFloat16$LAYOUT, shaderRoundingModeRTZFloat16$OFFSET, fieldValue);
    }

    private static final OfInt shaderRoundingModeRTZFloat32$LAYOUT = (OfInt)$LAYOUT.select(groupElement("shaderRoundingModeRTZFloat32"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTZFloat32
     * }
     */
    public static final OfInt shaderRoundingModeRTZFloat32$layout() {
        return shaderRoundingModeRTZFloat32$LAYOUT;
    }

    private static final long shaderRoundingModeRTZFloat32$OFFSET = 76;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTZFloat32
     * }
     */
    public static final long shaderRoundingModeRTZFloat32$offset() {
        return shaderRoundingModeRTZFloat32$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTZFloat32
     * }
     */
    public static int shaderRoundingModeRTZFloat32(MemorySegment struct) {
        return struct.get(shaderRoundingModeRTZFloat32$LAYOUT, shaderRoundingModeRTZFloat32$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTZFloat32
     * }
     */
    public static void shaderRoundingModeRTZFloat32(MemorySegment struct, int fieldValue) {
        struct.set(shaderRoundingModeRTZFloat32$LAYOUT, shaderRoundingModeRTZFloat32$OFFSET, fieldValue);
    }

    private static final OfInt shaderRoundingModeRTZFloat64$LAYOUT = (OfInt)$LAYOUT.select(groupElement("shaderRoundingModeRTZFloat64"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTZFloat64
     * }
     */
    public static final OfInt shaderRoundingModeRTZFloat64$layout() {
        return shaderRoundingModeRTZFloat64$LAYOUT;
    }

    private static final long shaderRoundingModeRTZFloat64$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTZFloat64
     * }
     */
    public static final long shaderRoundingModeRTZFloat64$offset() {
        return shaderRoundingModeRTZFloat64$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTZFloat64
     * }
     */
    public static int shaderRoundingModeRTZFloat64(MemorySegment struct) {
        return struct.get(shaderRoundingModeRTZFloat64$LAYOUT, shaderRoundingModeRTZFloat64$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 shaderRoundingModeRTZFloat64
     * }
     */
    public static void shaderRoundingModeRTZFloat64(MemorySegment struct, int fieldValue) {
        struct.set(shaderRoundingModeRTZFloat64$LAYOUT, shaderRoundingModeRTZFloat64$OFFSET, fieldValue);
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

