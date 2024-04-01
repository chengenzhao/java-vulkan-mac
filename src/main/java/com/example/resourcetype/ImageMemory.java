package com.example.resourcetype;

import java.lang.foreign.MemorySegment;

import static org.vulkan.vulkan_h_5.C_POINTER;

public record ImageMemory(MemorySegment pImage, MemorySegment pMemory) {
  public MemorySegment image(){
    return pImage.get(C_POINTER, 0);
  }

  public MemorySegment memory(){
    return pMemory.get(C_POINTER, 0);
  }
}
