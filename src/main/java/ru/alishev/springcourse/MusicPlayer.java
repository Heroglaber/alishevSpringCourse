package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Autowired
    @Qualifier("classicalMusic")
    private Music classicalMusic;
    @Autowired
    @Qualifier("rockMusic")
    private Music rockMusic;

    public String playMusic(MusicGenre genre) {
        return "Playing: " + classicalMusic.getSong() + "\n" + rockMusic.getSong();
    }
}
