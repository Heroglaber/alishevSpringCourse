package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RockMusic implements Music {

    private String[] trackList = {"Smoke on the Water",
            "You shock me all Night Long",
            "Start Me Up"};

    @Override
    public String getSong() {
        int num = new Random().nextInt(trackList.length);
        return trackList[num];
    }
}
