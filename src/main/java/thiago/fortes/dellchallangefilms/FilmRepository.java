package thiago.fortes.dellchallangefilms;

import org.springframework.data.jpa.repository.JpaRepository;
import thiago.fortes.dellchallangefilms.entity.Film;

import java.util.List;
import java.util.Optional;

public interface FilmRepository extends JpaRepository<Film, Long> {
    List<Film> findByTitle(String title);

    Optional<Film> findById(Long id);
}
