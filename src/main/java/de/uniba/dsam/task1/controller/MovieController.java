package de.uniba.dsam.task1.controller;

import de.uniba.dsam.task1.model.Movie;
import de.uniba.dsam.task1.repository.MovieRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping(value = "movies")
public class MovieController {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping
    public String getMovies(Model model) {

        model.addAttribute("movies", this.movieRepository.findAll());
        model.addAttribute("movie", new Movie());
        return "movies";
    }

    @PostMapping
    public String addMovie(@Valid Movie movie, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("movies", this.movieRepository.findAll());
            return "movies";
        }
        movie.setId("M" + (this.movieRepository.count()) + 1);
        this.movieRepository.save(movie);
        return "redirect:/movies";
    }
}
