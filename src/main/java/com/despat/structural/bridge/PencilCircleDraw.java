package com.despat.structural.bridge;

public class PencilCircleDraw implements DrawAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Draw circle by pencil...");
    }

    @Override
    public void drawRectangle(int x, int y, int h, int w) {
        // not do things.
    }
}
