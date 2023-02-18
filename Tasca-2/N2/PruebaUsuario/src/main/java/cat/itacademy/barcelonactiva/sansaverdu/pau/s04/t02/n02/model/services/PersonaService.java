package cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.model.services;

import cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.model.domain.Persona;
import cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.model.repository.IPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    private IPersona data;
    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Optional<Persona> listarId(long Id) {
        return Optional.empty();
    }

    @Override
    public int save(Persona p) {
        int res=0;
        Persona persona=data.save(p);
        if (!persona.equals(null)){
            res=1;
        }

        return res;
    }

    @Override
    public void delete(long Id) {

    }
}
