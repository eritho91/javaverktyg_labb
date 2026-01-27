package se.iths.erikthorell.javaverktyg_labb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.erikthorell.javaverktyg_labb.Model.Movie;

import java.util.List;

@Controller
public class MovieController {

    @GetMapping("/movies")
    public String getMovies(Model model) {
        List<Movie> movies = List.of(
                new Movie("Pulp Fiction", 1992, "Quentin Tarantino", "Neo-noir black comedy crime"),
                new Movie("Interstellar", 2014, "Christopher Nolan", "Science Fiction"),
                new Movie("Harry Potter and the Philosopher's Stone", 2001, "Chris Columbus", "Fantasy"));
        model.addAttribute("movies", movies);
        return "movie";
    }
}
