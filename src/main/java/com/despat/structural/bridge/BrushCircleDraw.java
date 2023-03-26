package com.despat.structural.bridge;

public class BrushCircleDraw implements DrawAPI {
  
  @Override
  public void drawCircle(int x, int y, int radius) {
    System.out.println("Brush circle draw...");
  }

  @Override
  public void drawRectangle(int x, int y, int h, int w) {
    // no things.
  }
}
