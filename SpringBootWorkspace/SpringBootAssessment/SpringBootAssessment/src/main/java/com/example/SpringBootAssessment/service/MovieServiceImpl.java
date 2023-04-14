package com.example.SpringBootAssessment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootAssessment.entity.Movie;

import com.example.SpringBootAssessment.repository.*;

import com.example.SpringBootAssessment.entity.*;

@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	MovieRepository movieRepo;

	@Override
	public Movie saveMovie(Movie movie) {
		// TODO Auto-generated method stub
		return movieRepo.save(movie);
	}

	@Override
	public Movie findMovieById(int id) {
		// TODO Auto-generated method stub
		return (Movie)movieRepo.findById((int)id);
	}

	@Override
	public List<Movie> findMovieByGenre(String genre) {
		// TODO Auto-generated method stub
		return (List<Movie>)movieRepo.findByGenre(genre);	
	}

	@Override
	public List<Movie> findAllMovies() {
		// TODO Auto-generated method stub
		return (List<Movie>)movieRepo.findAll();
	}

	@Override
	public Movie saveOrUpdate(Movie movie) {
		// TODO Auto-generated method stub
		return movieRepo.save(movie);
	}

	@Override
	public void deleteMovieById(int id) {
		// TODO Auto-generated method stub
		movieRepo.deleteById(id);
	}

}
