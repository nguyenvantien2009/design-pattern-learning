package com.despat.creational.singleton;


public class Main {
  
  public static void main(String... args) {
    // Use Singletion
    System.out.println("Normal Singletion.");
    Singleton instance = Singleton.getInstance();
    instance.setName("Singletion name 1.");
    System.out.println("Name of singleton is " + instance.getName());

    Singleton instance2 = Singleton.getInstance();
    System.out.println("Name of singletion 2 is " + instance2.getName());


    System.out.println("=== Singleton with multiplethreads...");

    new MultiThreadExample("Thread 1").run();
    SingletonMultiThread.getInstance().setName("Instance be created in thread");
    System.out.println("Set name of instance."); 
    
    new MultiThreadExample("Thread 2").run();
    new MultiThreadExample("Thread 3").run();

    // get name of instance
    String name = SingletonMultiThread.getInstance().getName();
    System.out.println("Name of instance " + name);
    
  }
}
