package com.despat.structural.adapter;

public class VlcPlayer implements AdvanceAdapter {
  
  @Override
  public void playVlc(String filename) {
    System.out.println("Playing VLC with filename " + filename);
  }

  @Override
  public void playMp4(String filename) {
    // empty play with mp4
  }
}
