package com.movie.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.movie.exception.MovieNotFoundException;
import com.movie.model.Movie;
import com.movie.service.MovieService;

@RestController
@RequestMapping("/movies") 
public class MovieController {

    @Autowired
    private MovieService service;

    
    @PostMapping
    public Movie createMovie(@RequestBody Movie movie) {
        return service.createMovie(movie);
    }

   
    @PostMapping("/saveAll")
    public List<Movie> createMovies(@RequestBody List<Movie> movies) {
        return service.createMovies(movies);
    }

   
    @GetMapping("/all")
    public List<Movie> getAllMovies() {
        return service.getAllMovies();
    }

    
    @GetMapping("/{id}")
    public Movie findById(@PathVariable int id) {
        return service.findById(id);
    }

   
    @PutMapping("/{id}")
    public Movie updateMovie(@PathVariable int id, @RequestBody Movie newMovie) {
        return service.updateMovie(id, newMovie);
    }

    
    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable int id) {
        service.deleteMovie(id);
    }

   
}
