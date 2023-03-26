package com.despat.structural.bridge;

public class Circle extends Shape{

  private int x;
  private int y;
  private int radius;

  public Circle(int x, int y, int radius, DrawAPI drawAPI) {
    super(drawAPI);
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  @Override
  public void draw() {
    System.out.println("Draw Circle with center " + this.x + ", " + 
      this.y + " and radius is " + this.radius);
    this.drawAPI.drawCircle(x, y, radius);
    System.out.println("... Done");
  }
}
