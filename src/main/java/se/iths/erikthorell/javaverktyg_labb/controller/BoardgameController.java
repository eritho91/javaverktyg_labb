package se.iths.erikthorell.javaverktyg_labb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.erikthorell.javaverktyg_labb.model.Boardgame;

import java.util.List;

@Controller
@RequestMapping("/boardgames")
public class BoardgameController {
    @GetMapping
    public String getBoardgames(Model model) {
        List<Boardgame> boardgames = List.of(
                new Boardgame("Fort", "Leder Games", "Strategy"),
                new Boardgame("Othello", "Alga", "Strategy"),
                new Boardgame("Chess", "None", "Strategy")
        );
        model.addAttribute("boardgames", boardgames);
        return "boardgames";
    }
}
