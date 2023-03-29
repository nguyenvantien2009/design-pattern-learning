package com.despat.structural.decorator;

public abstract class CondimentDecorator implements Beverage {

  protected Beverage beverage;

  public abstract String getDescription();
}
