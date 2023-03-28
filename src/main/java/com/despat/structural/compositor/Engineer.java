package com.despat.structural.compositor;

public class Engineer implements Employee {
  
  private String name;
  private String skills;

  public Engineer(String name, String skills) {
    this.name = name;
    this.skills = skills;
  }

  @Override
  public void showMe() {
    System.out.println("Engineer name " + this.name);
  }
}
