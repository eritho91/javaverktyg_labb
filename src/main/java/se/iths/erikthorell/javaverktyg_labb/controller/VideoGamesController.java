package se.iths.erikthorell.javaverktyg_labb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.erikthorell.javaverktyg_labb.Model.VideoGames;

import java.util.List;

@Controller
public class VideoGamesController {

    @GetMapping("/videogames")
    public String getVideoGames(Model model) {
        List<VideoGames> videogames = List.of(
                new VideoGames("World of Warcraft", "MMORPG", 2004, "Blizzard Entertainment Co."),
                new VideoGames("Stardew Valley", "Farming Sim RPG", 2016, "ConcernedApe"),
                new VideoGames("Pokémon Arceus", "Action RPG", 2022, "GameFreak"),
                new VideoGames("Satisfactory", "Factory and Automation Simulation", 2019, "Coffee Stain Studios")
        );
        model.addAttribute("videogames", videogames);
        return "videogames";
    }
}
