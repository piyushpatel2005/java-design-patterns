package com.github.piyushpatel2005.adapter.music;

import com.github.piyushpatel2005.adapter.music.domain.Mp4MusicPlayer;
import com.github.piyushpatel2005.adapter.music.domain.MusicPlayer;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new Mp4MusicPlayer();
        AudioClient audioClient = new AudioClient(musicPlayer);
        audioClient.play();
    }
}
