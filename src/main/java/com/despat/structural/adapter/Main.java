package com.despat.structural.adapter;

public class Main {
  
  public static void main(String... args) throws Exception {
    System.out.println("Example code for adapter pattern.");

    AudioPlayer audioPlayer = new AudioPlayer();
    audioPlayer.play("mp4", "file name of mp4");
    audioPlayer.play("mp3", "file name of mp3");
    audioPlayer.play("vlc", "file name of vlc");
    audioPlayer.play("unknown", "file name of unknown");
  }
}
