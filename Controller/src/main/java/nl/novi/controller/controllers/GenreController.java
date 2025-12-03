package nl.novi.controller.controllers;

import nl.novi.controller.entities.Genre;
import nl.novi.controller.services.GenreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class GenreController {

    private final GenreService genreService;

    // Constructor injection
    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }


    // POST / create
    @PostMapping("/genres")
    public ResponseEntity<Genre> postGenre(@ResponseBody Genre genre) {
        Genre newGenre = genreService.createGenre(genre);
        return ResponseEntity.created(newGenre);
    }

    // GET ALL / read
    @GetMapping("/genres")
    public ResponseEntity<List<Genre>> getGenres() {
        List<Genre> genres = genreService.findAllGenres();
        return ResponseEntity.ok(genres);
    }

    // GET ONE / read
    @GetMapping("/genres/{id}")
    public ResponseEntity<Genre> getGenreById(@PathVariable Long id) {
        Genre genre = genreService.findGenreById(id);
        return ResponseEntity.ok(genre);
    }


    // PUT / update
    @PutMapping("/genres/{id}")
    public ResponseEntity<Genre> putGenreById(@PathVariable Long id, @RequestBody Genre genreInput) {
        Genre updatedGenre = genreService.updateGenre(id, genreInput);
        return ResponseEntity.ok(updatedGenre);
    }


    // DELETE / delete
    @DeleteMapping("/genres/{id}")
    public ResponseEntity<> deleteGenre(@PathVariable Long id) {
        Genre deleteGenre = genreService.deleteGenre(id);
        return ResponseEntity.noContent();
    }


}

