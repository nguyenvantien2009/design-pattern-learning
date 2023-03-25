package com.despat.structural.adapter;

public class Mp4Player implements AdvanceAdapter {
 
  // @Override
  public void playVlc(String filename) {
    // empty implement.
  }
  
  // @Override
  public void playMp4(String filename) {
    System.out.println("Playing with MP4 " + filename);
  }
}
