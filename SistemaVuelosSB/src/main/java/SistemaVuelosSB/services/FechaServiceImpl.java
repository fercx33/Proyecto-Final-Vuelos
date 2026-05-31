package SistemaVuelosSB.services;

import SistemaVuelosSB.entities.Aerolinea;
import SistemaVuelosSB.entities.Fecha;
import SistemaVuelosSB.repositories.BaseRepository;
import SistemaVuelosSB.repositories.FechaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FechaServiceImpl extends BaseServiceImpl<Fecha, Long> implements FechaService {
    @Autowired
    private FechaRepository fechaRepository;

    public FechaServiceImpl(BaseRepository<Fecha, Long> baseRepository, FechaRepository fechaRepository) {
        super(baseRepository);
        this.fechaRepository = fechaRepository;
    }
}
