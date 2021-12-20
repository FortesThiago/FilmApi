package thiago.fortes.dellchallangefilms.dto;

import lombok.Getter;
import thiago.fortes.dellchallangefilms.entity.Film;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class FilmDto {
    private String title;
    private String author;
    private String country;
    private String releasedate;
    private String cinematography;
    private String type;

    public FilmDto(Film film) {
        this.title = film.getTitle();
        this.author = film.getAuthor();
        this.country = film.getCountry();
        this.releasedate = film.getReleasedate();
        this.cinematography = film.getCinematography();
        this.type = film.getType();
    }

    public static List<FilmDto> convert(List<Film> film) {
        return film.stream().map(FilmDto::new).collect(Collectors.toList());
    }
}
