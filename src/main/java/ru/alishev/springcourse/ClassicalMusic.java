package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ClassicalMusic implements Music {

    private String[] trackList = {"J.S. Bach: Suite No. 1 in G major",
            "Ludwig van Beethoven: Symphony No. 5 in C Minor",
            "Franz Schubert: 'Du bist die Ruh"};

    private void init() {

    }

    @Override
    public String getSong() {
        int num = new Random().nextInt(trackList.length);
        return trackList[num];
    }
}
