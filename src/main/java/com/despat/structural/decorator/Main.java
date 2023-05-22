package com.despat.structural.decorator;

public class Main {

  public static void main(String... args) {
    System.out.println("Run code decorator pattern...");

    Beverage beverage = new Espresso();
    beverage = new Mocha(beverage);
    beverage = new Whip(beverage);
  
    System.out.println(beverage.getDescription() + " $" + beverage.getCost());
  }
}
