package com.example;

import java.lang.foreign.MemorySegment;

public record PipelineLayoutPair(MemorySegment pipeline, MemorySegment pipelineLayout) {
}
