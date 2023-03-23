package com.despat.creational.prototype;

public class Rectangle extends Shape {

  public int width;
  public int height;

  public Rectangle() {}

  public Rectangle(Rectangle target) {
    super(target);
    if (target != null) {
      this.width = target.width;
      this.height = target.height;
    }
  }

  @Override
  public Rectangle clone() {
    return new Rectangle(this);
  }

  @Override
  public boolean equals(Object object2) {
    if (!(object2 instanceof Rectangle) || !super.equals(object2)) return false;
    Rectangle rectangle2 = (Rectangle)object2;
    return this.width == rectangle2.width && this.height == rectangle2.height;
  }
}
