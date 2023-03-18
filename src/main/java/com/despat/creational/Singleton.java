package com.despat.creational;

class Singleton {

  private static Singleton instance;

  public static Singleton getInstance() {
    if (Singleton.instance != null) {
      Singleton.instance = new Singleton();
    }

    return Singleton.instance;
  }
}
