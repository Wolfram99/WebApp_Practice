package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class ClassicMusic implements Music{
    private List<String> classicMusic = new ArrayList<>();

    public ClassicMusic(){
        classicMusic.add("Kiss the Rain");
        classicMusic.add("Harmony of Dream");
        classicMusic.add("Memory Box");
        MusicGenre type = MusicGenre.CLASSIC;
    }
    @Override
    public List<String> getSong() {
        return classicMusic;
    }
}
