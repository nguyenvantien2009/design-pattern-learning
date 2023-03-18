package com.despat.creational;

class SingletonMultiThread {
  
  private static SingletonMultiThread instance;
  
  public synchronized static SingletonMultiThread getInstance() {
    if (SingletonMultiThread.instance != null) {
      SingletonMultiThread.instance = new SingletonMultiThread();
    }
    return SingletonMultiThread.instance;
  }
}
