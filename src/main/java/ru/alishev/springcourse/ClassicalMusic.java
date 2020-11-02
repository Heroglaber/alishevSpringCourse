package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {

    @PostConstruct
    private void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }

    private String[] trackList = {"J.S. Bach: Suite No. 1 in G major",
            "Ludwig van Beethoven: Symphony No. 5 in C Minor",
            "Franz Schubert: 'Du bist die Ruh"};

    @Override
    public String getSong() {
        int num = new Random().nextInt(trackList.length);
        return trackList[num];
    }
}
