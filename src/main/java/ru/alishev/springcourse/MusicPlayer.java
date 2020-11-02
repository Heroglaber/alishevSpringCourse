package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    @Value ("${musicPlayer.name}")
    private String name;

    @Value ("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private List<Music> genres;

    public MusicPlayer(List<Music> genres) {
        this.genres = genres;
    }

    public String playMusic() {
        int num = new Random().nextInt(genres.size());
        return genres.get(num).getSong();
    }
}
