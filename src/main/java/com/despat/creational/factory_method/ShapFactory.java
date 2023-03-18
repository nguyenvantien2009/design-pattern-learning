package com.despat.creational.factory_method;

class ShapeFactory {

  public static Shape create(String name) {
    if (name.equals("SQUARE")) {
      return new Square();
    } else if (name.equals("CIRCLE")) {
      return new Circle();
    } else {
      return new Rectangle();
    }
  }
}

