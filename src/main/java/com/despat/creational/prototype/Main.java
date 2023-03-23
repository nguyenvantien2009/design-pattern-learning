package com.despat.creational.prototype;


public class Main {

  public static void main(String... args) {
    System.out.println("Demo prototype pattern...");

    // create circle object than clone it
    // and compare origin object and coppied object.
    Circle circle_1 = new Circle();
    circle_1.radius = 20;

    Circle circle_2 = circle_1.clone();
    System.out.println(circle_2.radius);
    System.out.println("Radius of circle 2 : " + circle_2.radius);

    // create rectangle oject than clone it.
    // and compare object to see the effect of equals function.
    Rectangle rectangle_1 = new Rectangle();
    rectangle_1.width = 120;
    rectangle_1.height = 11;
    Rectangle rectangle_2 = rectangle_1.clone();

    if (rectangle_2 instanceof Rectangle) {
      System.out.println("Rectangle 2 is instance of Rectangle.");
    }
    
    // apply equals function to compile check equals
    if (!rectangle_2.equals(rectangle_1)) {
      System.out.println("Rectangle 2 is difference rectangle.");
    }
  }
}
