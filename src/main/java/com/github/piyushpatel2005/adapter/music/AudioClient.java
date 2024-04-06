package com.github.piyushpatel2005.adapter.music;

import com.github.piyushpatel2005.adapter.music.adapter.LegacyMusicAdapter;
import com.github.piyushpatel2005.adapter.music.domain.Mp4MusicPlayer;
import com.github.piyushpatel2005.adapter.music.domain.MusicPlayer;

public class AudioClient {
    private MusicPlayer musicPlayer;

    public AudioClient(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void playMusic(String musicType, String fileName) {
        musicPlayer.playMusic(musicType, fileName);
    }

    public void play() {
        MusicPlayer mp4MusicPlayer = new Mp4MusicPlayer();
        MusicPlayer legacyMusicAdapter = new LegacyMusicAdapter();

        AudioClient audioClient = new AudioClient(mp4MusicPlayer);
        audioClient.playMusic("mp4", "file1.mp4");

        audioClient = new AudioClient(legacyMusicAdapter);
        audioClient.playMusic("vlc", "file2.vlc");
    }
}
