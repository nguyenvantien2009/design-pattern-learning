package com.despat.creational.singleton;

class Singleton {

  private static Singleton instance;

  private String name;

  public static Singleton getInstance() {
    if (Singleton.instance == null) {
      Singleton.instance = new Singleton();
    }

    return Singleton.instance;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
