package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

     private List<String> music = new ArrayList<>();

    Random r = new Random();

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }


    @Autowired
    public MusicPlayer(@Qualifier("listOfMusicalGenres")Music genres) {
        this.music.addAll(genres.getSong());


    }

    public void musicPlaying(){
        System.out.println("Playing: "+music.get(r.nextInt(music.size())));




    }
}
