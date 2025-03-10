package com.movie.service;

import java.util.List;
import com.movie.model.Movie;

public interface MovieService {
    Movie createMovie(Movie movie);
    List<Movie> createMovies(List<Movie> movies); 
    List<Movie> getAllMovies();
    Movie findById(int id);
    Movie updateMovie(int id, Movie newMovie);
    void deleteMovie(int id);
}
