package com.example.SpringBootAssessment.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="movie")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="release_date")
	private String releaseDate;
	@Column(name="details")
	private String details;
	@Column(name="genre")
	private String genre;
	public Movie() {
		super();
	}
	public Movie(Integer id, String name, String releaseDate, String details, String genre) {
		super();
		this.id = id;
		this.name = name;
		this.releaseDate = releaseDate;
		this.details = details;
		this.genre = genre;
	}
	public Movie(String name, String releaseDate, String details, String genre) {
		super();
		this.name = name;
		this.releaseDate = releaseDate;
		this.details = details;
		this.genre = genre;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}
