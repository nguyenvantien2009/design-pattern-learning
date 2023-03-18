package com.despat.creational.abstract_factory;

import com.despat.creational.abstract_factory.window.*;

class CrazyWindow implements Window {

  public void drawButton() {
    new WindowButton().draw();
  }

  public void drawTextBox() {
    new WindowTextBox().draw();
  }

  public void drawHeader() {
    new WindowHeader().draw();
  }
}
