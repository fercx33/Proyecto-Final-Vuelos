package SistemaVuelosSB.services;

import SistemaVuelosSB.entities.Aerolinea;
import SistemaVuelosSB.entities.Avion;
import SistemaVuelosSB.repositories.AvionRepository;
import SistemaVuelosSB.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvionServiceImpl extends BaseServiceImpl<Avion, Long> implements AvionService {
    @Autowired
    private AvionRepository avionRepository;

    public AvionServiceImpl(BaseRepository<Avion, Long> baseRepository, AvionRepository avionRepository) {
        super(baseRepository);
        this.avionRepository = avionRepository;
    }
}
