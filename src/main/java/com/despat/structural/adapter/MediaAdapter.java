package com.despat.structural.adapter;

public class MediaAdapter implements MediaPlayer {
  
  private AdvanceAdapter advanceAdapter;

  public MediaAdapter(String mediaType) {
    if (mediaType.equalsIgnoreCase("vlc")) {
      this.advanceAdapter = new VlcPlayer();
    } else if(mediaType.equalsIgnoreCase("mp4")) {
      this.advanceAdapter = new Mp4Player();
    }
  }

  @Override
  public void play(String mediaType, String filename) {
    if (mediaType.equalsIgnoreCase("vlc")) {
      this.advanceAdapter.playVlc(filename);
    } else if(mediaType.equalsIgnoreCase("mp4")) {
      this.advanceAdapter.playMp4(filename);
    }
  }
}
