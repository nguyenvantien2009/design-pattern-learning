package com.despat.creational.builder;

public class RectangleBuilder {
  private int x;
  private int y;
  private String color;
  private int length;
  private int width;

  public RectangleBuilder setX(int x) {
    this.x = x;
    return this;
  }

  public RectangleBuilder setY(int y) {
    this.y = y;
    return this;
  }

  public RectangleBuilder setLength(int length) { 
    this.length = length;
    return this;
  }

  public RectangleBuilder setColor(String color) {
    this.color = color;
    return this;
  }

  public RectangleBuilder setWidth(int width) { 
    this.width = width;
    return this;
  }

  public Rectangle build() {
    return new Rectangle(
      this.length
      , this.width
      , this.color == null ? "blue" : this.color
      , this.x
      , this.y);
  }
}
