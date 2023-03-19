package com.despat.creational.builder;

public class Rectangle {

  private int length;
  private int width;
  private String color;
  private int x;
  private int y;

  public Rectangle(int length, int width, String color, int x, int y) {
    this.length = length;
    this.width = width;
    this.color = color;
    this.x = x;
    this.y = y;
  }

  public int getX() { 
    return this.x;
  }

  public int getY() { 
    return this.y;
  }

  public String getColor() { 
    return this.color;
  }

  public int getLength() { 
    return this.length;
  }
  
  public int getWidth() { 
    return this.width;
  }
}
