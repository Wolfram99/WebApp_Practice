package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> rockMusic = new ArrayList<>();
    public RockMusic(){
        rockMusic.add("Come as You Are");
        rockMusic.add("Seven Nation Army");
        rockMusic.add("Take Me Out");
        MusicGenre type = MusicGenre.ROCK;
    }

    @Override
    public List<String> getSong() {
        return rockMusic;
    }
}
