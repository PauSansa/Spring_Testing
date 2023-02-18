package cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.model.services;

import cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.model.domain.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {
    List<Persona> listar();
    Optional<Persona> listarId(long Id);
    int save(Persona p);
    void delete(long Id);
}
