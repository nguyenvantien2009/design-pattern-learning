package com.despat.creational.abstract_factory.window;

import com.despat.creational.abstract_factory.Header;

public class WindowHeader implements Header {
  @Override
  public void draw() {
    System.out.println("Draw header in window.");
  }
}
