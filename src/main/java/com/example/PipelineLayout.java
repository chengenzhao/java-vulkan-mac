package com.example;

import java.lang.foreign.MemorySegment;

import static org.vulkan.vulkan_h_5.C_POINTER;

public record PipelineLayout(MemorySegment pPipeline, MemorySegment pLayout) {
  public MemorySegment pipeline(){
    return pPipeline.get(C_POINTER, 0);
  }

  public MemorySegment layout(){
    return pLayout.get(C_POINTER, 0);
  }
}
