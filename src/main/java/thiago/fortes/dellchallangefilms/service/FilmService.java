package thiago.fortes.dellchallangefilms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thiago.fortes.dellchallangefilms.FilmRepository;
import thiago.fortes.dellchallangefilms.entity.Film;

import java.util.List;
import java.util.Optional;

@Service
public class FilmService {

    @Autowired
    public FilmRepository filmRepository;

    public List<Film> findAllFilms(){
        return filmRepository.findAll();
    }

    public Film create(Film film){
        return filmRepository.save(film);
    }

    public void deleteFilmById(Long id){
        filmRepository.deleteById(id);
    }

    public Optional<Film> findById(Long id){
        return filmRepository.findById(id);
    }
}
