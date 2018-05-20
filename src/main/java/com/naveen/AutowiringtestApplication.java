package com.naveen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.naveen.pojo.Movie;
import com.naveen.service.MovieService;

@SpringBootApplication
public class AutowiringtestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(AutowiringtestApplication.class, args);
		Movie movie = new Movie();
		MovieService service = (MovieService)context.getBean("movieService");
		//service.saveMovie(movie);
		Movie movieservice =  new Movie(service);
		Movie movies = (Movie)context.getBean("movie");
		movie.setId(1);
		movie.setName("rangasthalam");
		movieservice.save(movie);
	}
}
