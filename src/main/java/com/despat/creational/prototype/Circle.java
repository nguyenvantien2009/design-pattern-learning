package com.despat.creational.prototype;

public class Circle extends Shape {

  public int radius;

  public Circle() {}

  public Circle(Circle target) {
    super(target);
    if (target != null) {
      this.radius = target.radius;
    }
  }
  
  @Override
  public Circle clone() {
    return new Circle(this);
  }

  @Override
  public boolean equals(Object object2) {
    if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
    Circle circle2 = (Circle) object2;
    return circle2.radius == this.radius;
  }
}
