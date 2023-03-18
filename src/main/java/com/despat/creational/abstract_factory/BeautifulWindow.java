package com.despat.creational.abstract_factory;

import com.despat.creational.abstract_factory.mac.*;

public class BeautifulWindow implements Window {
  
  public void drawButton() {
    new MacButton().draw();
  }

  public void drawHeader() {
    new MacHeader().draw();
  }

  public void drawTextBox() {
    new MacTextBox().draw();
  }
}
