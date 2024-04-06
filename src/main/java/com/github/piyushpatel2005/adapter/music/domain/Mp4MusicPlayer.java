package com.github.piyushpatel2005.adapter.music.domain;

public class Mp4MusicPlayer implements MusicPlayer {
    @Override
    public void playMusic(String musicType, String fileName) {
        if (musicType.equalsIgnoreCase("mp4")) {
            System.out.println("Playing mp4 file. Name: " + fileName);
        } else {
            throw new UnsupportedOperationException("Unsupported music type: " + musicType);
        }
    }
}
