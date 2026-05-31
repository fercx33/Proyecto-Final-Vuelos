package SistemaVuelosSB.services;

import SistemaVuelosSB.entities.Aerolinea;
import SistemaVuelosSB.entities.Persona;
import SistemaVuelosSB.repositories.BaseRepository;
import SistemaVuelosSB.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }
}
