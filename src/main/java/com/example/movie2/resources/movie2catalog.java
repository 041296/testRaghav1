package com.example.movie2.resources;


import com.example.movie2.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class movie2catalog {

    @GetMapping("/movieId")
    public Movie getMovieInfo(@PathVariable String movieId){

        return new Movie(movieId,"abcd");
    }
}
