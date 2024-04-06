package com.github.piyushpatel2005.adapter.music.adapter;

import com.github.piyushpatel2005.adapter.music.domain.MusicPlayer;
import com.github.piyushpatel2005.adapter.music.legacy.LegacyPlayer;

public class LegacyMusicAdapter extends LegacyPlayer implements MusicPlayer {

    @Override
    public void playMusic(String musicType, String fileName) {
        if (musicType.equalsIgnoreCase("vlc")) {
            playVlcMusic(fileName);
        } else {
            throw new UnsupportedOperationException("Unsupported music type: " + musicType);
        }
    }
}
