package cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.model.repository;

import cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.model.domain.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersona extends CrudRepository<Persona, Long> {

}
