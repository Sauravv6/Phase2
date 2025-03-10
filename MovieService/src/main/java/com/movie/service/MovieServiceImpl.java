package com.movie.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.exception.MovieNotFoundException;
import com.movie.model.Movie;
import com.movie.repo.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository repo;

    @Override
    public Movie createMovie(Movie movie) {
        return repo.save(movie);
    }

    @Override
    public List<Movie> createMovies(List<Movie> movies) {
        return repo.saveAll(movies);
    }

    @Override
    public List<Movie> getAllMovies() {
        return repo.findAll();
    }

    @Override
    public Movie findById(int id) {
        return repo.findById(id)
                .orElseThrow(() -> new MovieNotFoundException("Movie with ID " + id + " not found"));
    }

    @Override
    public Movie updateMovie(int id, Movie newMovie) {
        Movie oldMovie = repo.findById(id)
                .orElseThrow(() -> new MovieNotFoundException("Movie with ID " + id + " not found"));

        oldMovie.setTitle(newMovie.getTitle());
        oldMovie.setGenre(newMovie.getGenre());
        oldMovie.setDuration(newMovie.getDuration());
        oldMovie.setActors(newMovie.getActors());

        return repo.save(oldMovie);
    }

    @Override
    public void deleteMovie(int id) {
        Movie movie = repo.findById(id)
                .orElseThrow(() -> new MovieNotFoundException("Movie with ID " + id + " not found"));
        repo.delete(movie);
    }

}
