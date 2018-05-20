package com.naveen.dao;

import org.springframework.stereotype.Repository;

import com.naveen.pojo.Movie;
@Repository
public class MovieDao 
{
	
	
	public MovieDao() {
		super();
	}

	

	public void saveMovie(Movie movie)
	{
		System.out.println(movie);
	}
}
