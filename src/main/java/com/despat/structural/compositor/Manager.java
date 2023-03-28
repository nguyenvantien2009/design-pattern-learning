package com.despat.structural.compositor;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

  private String name;
  private String department;

  private List<Employee> subOrdinates;

  public Manager(String name, String department) {
    this.name = name;
    this.department = department;
    this.subOrdinates = new ArrayList<>();
  }
  
  public void addSubOrdinate(Employee employee) {
    this.subOrdinates.add(employee);
  }

  public List<Employee> getSubOrdinates() {
    return this.subOrdinates;
  }

  @Override
  public void showMe() {
    if (this.subOrdinates.size() == 0) {
      System.out.println("The sub ordinates is empty.");
      return;
    }
    System.out.println("Manager is " + this.name);
    this.subOrdinates.forEach(employee -> employee.showMe());
  }
}
