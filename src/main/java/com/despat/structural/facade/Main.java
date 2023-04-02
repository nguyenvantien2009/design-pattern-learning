package com.despat.structural.facade;

public class Main {
  
  public static void main(String... args) {
    System.out.println("Run code face pattern...");

    OrderFacade facade = new OrderFacade();
    facade.procces();
  }
}
