package thiago.fortes.dellchallangefilms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import thiago.fortes.dellchallangefilms.entity.Film;
import thiago.fortes.dellchallangefilms.service.FilmService;

import java.util.List;

@RestController
public class FilmController {

    @Autowired
    private FilmService filmService;

    @RequestMapping(value = "/create", method =  RequestMethod.POST)
    public Film create(@RequestBody Film film){
        return filmService.create(film);
    }

    @RequestMapping(value = "/film", method = RequestMethod.GET)
    public List<Film> findall(){
        return filmService.findAllFilms();
    }

    @DeleteMapping("/{id}")
    public void deleteFilmById(Long id){
        filmService.deleteFilmById(id);
    }
}
