package SistemaVuelosSB.services;

import SistemaVuelosSB.entities.Aerolinea;
import SistemaVuelosSB.entities.Aeropuerto;
import SistemaVuelosSB.repositories.AeropuertoRepository;
import SistemaVuelosSB.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AeropuertoServiceImpl extends BaseServiceImpl<Aeropuerto, Long> implements AeropuertoService {
    @Autowired
    private AeropuertoRepository aeropuertoRepository;

    public AeropuertoServiceImpl(BaseRepository<Aeropuerto, Long> baseRepository, AeropuertoRepository aeropuertoRepository) {
        super(baseRepository);
        this.aeropuertoRepository = aeropuertoRepository;
    }
}
