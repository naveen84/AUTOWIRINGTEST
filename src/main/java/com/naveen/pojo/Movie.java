package com.naveen.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.naveen.service.MovieService;
@Component
public class Movie 
{
	private int id;
	private String name;
	//committing the changes
	//changed in website
	//@Autowired
	//private MovieService service;
	//adding new source code 
	@Autowired
	private MovieService service2;
	
	public Movie(MovieService service)
	{
		this.service2 = service;
	}
	
	public Movie() {
		super();
	}
	public Movie(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public MovieService getService2() {
		return service2;
	}

	public void setService2(MovieService service2) {
		this.service2 = service2;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + "]";
	}
	public void save(Movie movie)
	{
		System.out.println("=====service"+service2);
		service2.saveMovie(movie);
	}
}
