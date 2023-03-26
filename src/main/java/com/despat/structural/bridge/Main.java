package com.despat.structural.bridge;

public class Main {

  public static void main(String... args) {
    System.out.println("Run bridge pattern.");

    System.out.println("=== Draw Circle ===");

    // Draw circle with brush circle.
    BrushCircleDraw brushCircleDraw = new BrushCircleDraw();
    Circle circle = new Circle(12, 13, 124, brushCircleDraw);
    circle.draw();

    // Draw circle with pencel circle.
    PencilCircleDraw pencilCircleDraw = new PencilCircleDraw();
    circle.setDrawAPI(pencilCircleDraw);
    circle.draw();

    System.out.println("=== Draw Rectangle ===");

    // Draw rectangle with brush rectangle
    BrushRectangleDraw brushRectangleDraw = new BrushRectangleDraw();
    Rectangle rectangle = new Rectangle(12, 12, 12, 12, brushRectangleDraw);
    rectangle.draw();

    // Draw rectangle with pencil rectangle.
    PencilRectangleDraw pencilRectangleDraw = new PencilRectangleDraw();
    rectangle.setDrawAPI(pencilRectangleDraw);
    rectangle.draw();
  }
}
