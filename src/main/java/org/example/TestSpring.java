package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );



        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        JazzMusic jazzMusic1 = context.getBean("jazzMusic",JazzMusic.class);
        JazzMusic jazzMusic2 = context.getBean("jazzMusic",JazzMusic.class);
        ClassicMusic classicMusic1 = context.getBean("classicMusic", ClassicMusic.class);
        ClassicMusic classicMusic2 = context.getBean("classicMusic", ClassicMusic.class);
        System.out.println(" Jazz "+(jazzMusic1 == jazzMusic2));
        System.out.println(" Classic "+(classicMusic1 == classicMusic2));
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        musicPlayer.musicPlaying(MusicGenre.CLASSIC);

        context.close();
    }
}
