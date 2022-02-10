package thiago.fortes.dellchallangefilms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import thiago.fortes.dellchallangefilms.entity.Film;
import thiago.fortes.dellchallangefilms.service.FilmService;

import java.util.Optional;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class FilmServiceTest {

    @Autowired
    private FilmService filmService;

    @Test
    public void findFilmByIdTest(){
        Optional<Film> film = filmService.findById(1L);
    }
}
