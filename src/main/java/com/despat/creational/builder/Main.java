package com.despat.creational.builder;

public class Main {

  public static void main(String... args) {
    Rectangle rectangle = new RectangleBuilder()
      .setWidth(12)
      .setLength(11)
      // .setColor("red")
      .setX(23)
      .setY(22)
      .build();

    System.out.println("Rectangle width " + rectangle.getWidth());
    System.out.println("Rectangle length " + rectangle.getLength());
    System.out.println("Rectangle color " + rectangle.getColor());
    System.out.println("Rectangle X " + rectangle.getX());
    System.out.println("Rectangle Y " + rectangle.getY());
  }
}
