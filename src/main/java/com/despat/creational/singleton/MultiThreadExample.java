package com.despat.creational.singleton;

import java.lang.Thread;

public class MultiThreadExample implements Runnable {

  private String name;

  public MultiThreadExample(String name) {
    this.name = name;
    System.out.println("Creating " + name);
  }

  public void run() {
    System.out.println("Running " + name);
    try {
      Thread.sleep(5000); 
      SingletonMultiThread.getInstance();
    } catch(InterruptedException e) {
      System.out.println("Error run thread " + this.name);
    }
  }
}
