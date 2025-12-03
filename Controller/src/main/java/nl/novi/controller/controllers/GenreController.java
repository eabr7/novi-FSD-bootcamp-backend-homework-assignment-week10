package nl.novi.controller.controllers;

import nl.novi.controller.services.GenreService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/genres")
public class GenreController {

    private final GenreService genreService;

    // Constructor injection
    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }


    // POST / create
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Genre createGenre(@RequestBody Genre genre) {
        Genre createdGenre = genreService.createGenre(genre);
    }


    // GET ALL / read
    @GetMapping("/genres")
    @ResponseStatus(HttpStatus.OK)
    public getGenre() {
        Genre genre = genreService.getGenre();
        return genre;
    }


    // GET ONE / read
    @GetMapping("/genres/{id}")
    @ResponseStatus(HttpStatus.OK)
    public getGenreById(@PathVariable Long id) {
        Genre genre = genreService.getGenreById(id);
        return genre;
    }


    // PUT / update
    @PutMapping("/genres/{id}")
    @ResponseStatus(HttpStatus.OK)
    public getGenre() {
        Genre genre = genreService.getGenre();
        return genre;
    }


    // DELETE / delete
    @DeleteMapping("/genres/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteGenreById(@PathVariable Long id) {
        return
    }



}

