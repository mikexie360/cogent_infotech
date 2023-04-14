package com.example.SpringBootAssessment.service;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.stereotype.Service;

import com.example.SpringBootAssessment.entity.*;
@Service
public interface MovieService {
	public Movie saveMovie(Movie movie);
	public Movie findMovieById(int id);
	@Query("Select * from movie m where m.genre = ?1")
	public List<Movie> findMovieByGenre(String genre);
	public List<Movie> findAllMovies();
	public Movie saveOrUpdate(Movie movie);
	public void deleteMovieById(int id);
}
