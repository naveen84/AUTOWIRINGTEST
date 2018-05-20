package com.naveen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.naveen.dao.MovieDao;
import com.naveen.pojo.Movie;
@Service
public class MovieService 
{
	@Autowired
	private MovieDao dao;
	
	public MovieService(MovieDao dao) {
		super();
		System.out.println("======================");
		this.dao = dao;
		System.out.println("======================"+dao);
	}

	/*public MovieService() {
		super();
	}*/

	public void saveMovie(Movie movie)
	{
		dao.saveMovie(movie);
	}

	@Override
	public String toString() {
		return "MovieService [dao=" + dao + "]";
	}
	
}
