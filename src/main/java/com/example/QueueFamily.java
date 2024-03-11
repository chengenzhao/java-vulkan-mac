package com.example;

import java.lang.foreign.MemorySegment;

public record QueueFamily(MemorySegment physicalDevicePtr, MemorySegment queue, int queueFamilyIndex, int numQueues,
                          boolean supportsGraphicsOperations, boolean supportsComputeOperations,
                          boolean supportsTransferOperations, boolean supportsSparseMemoryManagementOperations,
                          boolean supportsPresentToSurface) {

  @Override
  public String toString() {
    return "QueueFamily{" +
      " queue=" + queue +
      " queueFamilyIndex=" + queueFamilyIndex +
      " numQueues=" + numQueues +
      " supportsGraphicsOperations=" + supportsGraphicsOperations +
      " supportsComputeOperations=" + supportsComputeOperations +
      " supportsTransferOperations=" + supportsTransferOperations +
      " supportsSparseMemoryManagementOperations=" + supportsSparseMemoryManagementOperations +
      " supportsPresentToSurface=" + supportsPresentToSurface +
      '}';
  }
}