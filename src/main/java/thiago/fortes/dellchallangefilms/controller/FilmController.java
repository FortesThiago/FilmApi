package thiago.fortes.dellchallangefilms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import thiago.fortes.dellchallangefilms.FilmRepository;
import thiago.fortes.dellchallangefilms.entity.Film;
import thiago.fortes.dellchallangefilms.service.FilmService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/film")
public class FilmController {

    @Autowired
    public FilmService filmService;

    @Autowired
    public FilmRepository filmRepository;

    @PostMapping
    public Film create(@RequestBody Film film){
        return filmService.create(film);
    }

    @GetMapping
    public List<Film> findfilms(){
        return filmService.findAllFilms();
    }

    @GetMapping("/{id}")
    public Optional<Film> findById(Long id){
        return filmService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteFilmById(Long id){
        filmService.deleteFilmById(id);
    }
}
