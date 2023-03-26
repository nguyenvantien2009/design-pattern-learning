package com.despat.structural.bridge;

public class BrushRectangleDraw implements DrawAPI {


    @Override
    public void drawCircle(int x, int y, int radius) {
        // not do things.
    }

    @Override
    public void drawRectangle(int x, int y, int h, int w) {
        System.out.println("Draw rectangle by brush...");
    }
}
