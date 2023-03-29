package com.despat.structural.decorator;

public class Whip extends CondimentDecorator {

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }
  
  @Override
  public String getDescription() {
    return beverage.getDescription() + ", whip";
  }

  @Override
  public double getCost() {
    return beverage.getCost() + 13;
  }
}
