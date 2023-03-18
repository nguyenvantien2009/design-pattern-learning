package com.despat.creational.abstract_factory;


public class Main {

  public static void main(String... args) throws Exception {
    System.out.println("Build crazy window.");
    Window window = new CrazyWindow();
    window.drawButton();
    window.drawHeader();
    window.drawTextBox();

    System.out.println("Build beautiful window.");
    Window beatifulWindow = new BeautifulWindow();
    beatifulWindow.drawButton();
    beatifulWindow.drawHeader();
    beatifulWindow.drawTextBox();
  }
}
