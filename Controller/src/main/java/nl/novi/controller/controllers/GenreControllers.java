package nl.novi.controller.controllers;

import nl.novi.controller.services.GenreService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/genres")
public class GenreControllers {

    private final GenreService genreService;

    // Constructor injection
    public GenreControllers(GenreService genreService) {
        this.genreService = genreService;
    }
}

