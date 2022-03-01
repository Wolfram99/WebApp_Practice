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

     private List<Music> music = new ArrayList<>();

    Random r = new Random();

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }


    @Autowired
    public MusicPlayer(@Qualifier("classicMusic")Music classicMusic,@Qualifier("rockMusic")Music rockMusic,
                       @Qualifier("jazzMusic")Music jazzMusic) {
        this.music.add(0,classicMusic);
        this.music.add(1,rockMusic);
        this.music.add(2,jazzMusic);

    }

    public void musicPlaying(MusicGenre type){
        switch (type){
            case JAZZ :
                 System.out.println("Playing: "+music.get(2).getSong().get(r.nextInt(3)));
                 break;
            case ROCK:
                System.out.println("Playing: "+music.get(1).getSong().get(r.nextInt(3)));
                break;
            case CLASSIC:
                System.out.println("Playing: "+music.get(0).getSong().get(r.nextInt(3)));
                break;
        }
//        for(int i = 0; i<music.size();i++){
//        System.out.println("Playing: "+music.get(i).getSong());
//        }
    }
}
