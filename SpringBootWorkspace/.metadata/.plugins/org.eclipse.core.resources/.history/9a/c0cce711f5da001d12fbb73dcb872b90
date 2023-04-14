package com.example.SpringBootAssessment.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.SpringBootAssessment.entity.*;
import java.util.*;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer>{
	@Query("Select * from movie m where m.genre = :genre")
	public List<Movie> findByGenre(@Param("genre") String genre);
	@Query("Select * from movie m where m.id = :id")
	public Movie findById(@Param("id") int id);
}
