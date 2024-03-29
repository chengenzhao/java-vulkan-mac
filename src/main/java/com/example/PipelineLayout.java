package com.example;

import java.lang.foreign.MemorySegment;

public record PipelineLayout(MemorySegment pipeline, MemorySegment layout) {
}
