package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean2", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

//        Music music = context.getBean("musicBean1", Music.class);
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparision = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println(comparision);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(25);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
//
//        firstMusicPlayer.playMusic();
//        System.out.println(firstMusicPlayer.getName());
//        System.out.println(firstMusicPlayer.getVolume());

        context.close();
    }
}
