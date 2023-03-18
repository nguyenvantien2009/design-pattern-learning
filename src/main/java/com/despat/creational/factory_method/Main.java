package com.despat.creational.factory_method;

public class Main {
  
  public static void main(String... args) throws Exception {
    Shape circle = ShapeFactory.create("CIRCLE");
    circle.draw();

    Shape rectangle = ShapeFactory.create("RECTANGLE");
    rectangle.draw();

    Shape square = ShapeFactory.create("SQUARE");
    square.draw();
  }
}
