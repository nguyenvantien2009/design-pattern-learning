package com.despat.structural.decorator;

public class Mocha extends CondimentDecorator {

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage + ", mocha";
  }

  @Override
  public double getCost() {
    return beverage.getCost() + 10;
  }
}
