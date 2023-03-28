package com.despat.structural.compositor;

public class Main {

  public static void main(String... args) {
    System.out.println("Run compositor pattern...");

    Manager manager = new Manager("Neit Nguyen", "IT");

    // add engineer
    Engineer developer = new Engineer("Dev 1", "Java, C#");
    manager.addSubOrdinate(developer);

    Engineer tester = new Engineer("Test 1", "Manual Tester");
    manager.addSubOrdinate(tester);
    
    manager.showMe();
  }
}
