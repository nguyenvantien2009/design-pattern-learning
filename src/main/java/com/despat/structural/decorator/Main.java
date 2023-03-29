package com.despat.structural.decorator;

public class Main {

  public static void main(String... args) {
    System.out.println("Run code decorator pattern...");

    Beverage beverage = new Espresso();
    CondimentDecorator decorator = new Mocha(beverage);
    decorator = new Whip(beverage);
  
    System.out.println(decorator.getDescription() + " $" + decorator.getCost());
  }
}
