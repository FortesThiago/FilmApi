package thiago.fortes.dellchallangefilms;

import org.springframework.data.jpa.repository.JpaRepository;
import thiago.fortes.dellchallangefilms.entity.Film;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Long> {
    List<Film> findall();
}
