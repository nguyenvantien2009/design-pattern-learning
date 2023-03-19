package com.despat.creational.singleton;

class SingletonMultiThread {
  
  private static SingletonMultiThread instance;

  private String name;
  
  public synchronized static SingletonMultiThread getInstance() {
    if (SingletonMultiThread.instance == null) {
      SingletonMultiThread.instance = new SingletonMultiThread();
    }
    return SingletonMultiThread.instance;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
