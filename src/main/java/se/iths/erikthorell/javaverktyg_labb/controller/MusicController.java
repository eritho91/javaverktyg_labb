package se.iths.erikthorell.javaverktyg_labb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.erikthorell.javaverktyg_labb.Model.Music;

import java.util.List;

@Controller
public class MusicController {

    @GetMapping("/music")
    public String music(Model model) {
        List<Music> music = List.of(
                new Music("This Fire", "Killswitch Engage", "Metalcore", 2006),
                new Music("Shadow Moses", "Bring Me the Horizon", "Metalcore", 2013),
                new Music("Legends Never Die", "J.Fla", "Pop", 2017)
        );
        model.addAttribute("music", music);
        return "music";
    }
}
