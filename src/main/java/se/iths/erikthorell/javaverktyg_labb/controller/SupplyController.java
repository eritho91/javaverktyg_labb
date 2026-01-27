package se.iths.erikthorell.javaverktyg_labb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.erikthorell.javaverktyg_labb.model.Supply;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/supplies")
public class SupplyController {
    @GetMapping
    public String supplies(Model model) {
        List<Supply> supplies = List.of(
                new Supply("Ballpoint Pen", "Pen", "Black"),
                new Supply("Eraser", "Pen", "White"),
                new Supply("Notepad", "Pads", "Blue")
        );
        model.addAttribute("supplies", supplies);
        return "supplies";
    }
}
