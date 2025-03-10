package com.movie.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String genre;
    private int duration; 

    @ElementCollection
    private List<String> actors; 

    
    public Movie() {}

    
    public Movie(String title, String genre, int duration, List<String> actors) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.actors = actors;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie [id=" + id + ", title=" + title + ", genre=" + genre + ", duration=" + duration + ", actors=" + actors + "]";
    }
}
