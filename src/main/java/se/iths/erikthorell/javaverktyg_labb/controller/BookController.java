package se.iths.erikthorell.javaverktyg_labb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.erikthorell.javaverktyg_labb.model.Book;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    @GetMapping
    public String getBooks(Model model) {
        List<Book> books = List.of(
                new Book("Moby Dick", "Herman Melville", 1846),
                new Book("Paradise Lost", "John Milton", 1672),
                new Book("Ulysseus", "James Joyce", 1912)
        );
        model.addAttribute("books", books);
        return "books";
    }
}
