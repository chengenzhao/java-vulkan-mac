package com.example.resourcetype;

import java.lang.foreign.MemorySegment;

import static org.vulkan.vulkan_h_5.C_POINTER;

public record BufferMemory(MemorySegment pBuffer, MemorySegment pMemory) {
  public MemorySegment buffer(){
    return pBuffer.get(C_POINTER, 0);
  }

  public MemorySegment memory(){
    return pMemory.get(C_POINTER, 0);
  }
}
