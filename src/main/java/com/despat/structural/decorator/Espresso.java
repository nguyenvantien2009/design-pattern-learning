package com.despat.structural.decorator;

public class Espresso implements Beverage {

  public double getCost() {
    return 100;
  }

  @Override
  public String getDescription() {
    return "Espresso Cup";
  }
}
