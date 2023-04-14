package com.example.SpringBootAssessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootAssessment.entity.*;
import com.example.SpringBootAssessment.service.*;


@RestController
@RequestMapping("/api")
public class MovieController {
	@Autowired
	MovieService movieService;
	
	@Autowired
	public MovieController(MovieService movieService) {
		super();
		this.movieService = movieService;
	}
	
	@PutMapping("/Movies")
	public Movie updateMovie(@RequestBody Movie movie) {
		return movieService.saveOrUpdate(movie);
	}
	@PostMapping("/Movies")
	public Movie saveMovie(@RequestBody Movie movie) {
		return movieService.saveMovie(movie);
	}
	
	@GetMapping("/Movies")
	public List<Movie> getAllMovies(){
		//return bookService.fetchBooks();
		return movieService.findAllMovies();
	}
	
	@GetMapping("/Movies/id/{id}")
	public Movie getMovieById(@PathVariable("id") int id) {
		return movieService.findMovieById(id);
	}
	
	@GetMapping("/Movies/genre/{genre}")
	public List<Movie> getMovieByGenre(@PathVariable("genre") String genre) {
		return movieService.findMovieByGenre(genre);
	}

	@DeleteMapping("/Movies/{id}")
	public void deleteMovie(@PathVariable("id") int id) {
		movieService.deleteMovieById(id);
	}

}
