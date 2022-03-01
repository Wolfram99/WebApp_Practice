package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ListOfMusicalGenres implements Music{
    private List<String> genres = new ArrayList<>();

    @Autowired
    public ListOfMusicalGenres (@Qualifier("classicMusic") Music classicMusic,@Qualifier("rockMusic") Music rockMusic,
                                @Qualifier("jazzMusic") Music jazzMusic){
       this.genres.addAll(classicMusic.getSong());
       this.genres.addAll(rockMusic.getSong());
       this.genres.addAll(jazzMusic.getSong());
    }

    @Override
    public List<String> getSong() {
        return genres;
    }


}
