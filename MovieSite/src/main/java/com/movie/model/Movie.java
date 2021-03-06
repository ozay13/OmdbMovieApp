package com.movie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Movie.class Film bilgilerinin tutulduğu entity sınıfıdır.
 * 
 * @author otunctan
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "Movie")
@SequenceGenerator(name = "idGenerator", initialValue = 1, allocationSize = 1, sequenceName = "SQ_Movie")
public class Movie extends BaseEntity<Integer> {

	@Column(name = "Title")
	private String title;

	@Column(name = "Yaer")
	private String year;

	@Column(name = "ImdbID")
	private String imdbID;

	@Column(name = "Type")
	private String type;

	@Column(name = "Poster")
	private String poster;

	public Movie() {
		setId(0);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getImdbID() {
		return imdbID;
	}

	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}



}
