package com.despat.structural.bridge;

public class Rectangle extends Shape {

  private int h;
  private int w;
  private int x;
  private int y;

  public Rectangle(int x, int y, int h, int w, DrawAPI drawAPI) {
    super(drawAPI);
    this.x = x;
    this.y = y;
    this.h = h;
    this.w = w;
  }

  @Override
  public void draw() {
    System.out.println("Draw rectangle start " + this.x + ", " +
      this.y + " with height " + this.h + ", width " + this.w);
    this.drawAPI.drawRectangle(x, y, h, w);
    System.out.println("... Done");
  }
}
