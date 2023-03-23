package com.despat.creational.prototype;

import java.util.Objects;

abstract class Shape {
  
  private int x;
  private int y;
  private String color;

  public Shape() {}

  public Shape(Shape target) {
    if (target != null) {
      this.x = target.x;
      this.y = target.y;
      this.color = target.color;
    }
  }

  public Shape(int x, int y, String color) {
    this.x = x;
    this.y = y;
    this.color = color;
  }

  public abstract Shape clone();

  @Override
  public boolean equals(Object object2) {
    if (!(object2 instanceof Shape)) return false;
    Shape shape2 = (Shape)object2;
    return shape2.x == this.x && shape2.y == this.y && Objects.equals(shape2.color, this.color);
  }
}
