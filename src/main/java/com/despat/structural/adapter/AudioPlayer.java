package com.despat.structural.adapter;

public class AudioPlayer implements MediaPlayer {

  private MediaAdapter adapter;

  @Override
  public void play(String mediaType, String filename) {

    if (mediaType.equalsIgnoreCase("mp3")) {
      System.out.println("Playing MP3 with file " + filename);
    } else if (mediaType.equalsIgnoreCase("vlc") || mediaType.equalsIgnoreCase("mp4")) {
      this.adapter = new MediaAdapter(mediaType);
      this.adapter.play(mediaType, filename);
    } else {
      System.out.println("Invalid media type " + mediaType + " format.");
    }
  } 
}
