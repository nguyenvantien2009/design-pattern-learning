package com.despat.creational.abstract_factory.window;

import com.despat.creational.abstract_factory.TextBox;

public class WindowTextBox implements TextBox {
  
  @Override
  public void draw() {
    System.out.println("Drow Textbox in Windown.");
  }
}
