package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class JazzMusic implements Music{
    private List<String> jazzMusic = new ArrayList<>();

    public JazzMusic(){
        jazzMusic.add("Coquille de terre");
        jazzMusic.add("Ramona");
        jazzMusic.add("Lets Begin");
        MusicGenre type = MusicGenre.JAZZ;

    }

    @PostConstruct
    public void initMethod(){
        System.out.println("init Method");
    }
    @PreDestroy
    public void destroyMethod(){
        System.out.println("destroy Method");
    }
    @Override
    public List<String> getSong() {
        return  jazzMusic;
    }


}
