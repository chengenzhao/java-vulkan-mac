package com.example;

public class Format {
  private final int format;
  private final int linearTilingFeatures;
  private final int optimalTilingFeatures;

  public Format(int format, int linearTilingFeatures, int optimalTilingFeatures) {
    this.format = format;
    this.linearTilingFeatures = linearTilingFeatures;
    this.optimalTilingFeatures = optimalTilingFeatures;
  }
}