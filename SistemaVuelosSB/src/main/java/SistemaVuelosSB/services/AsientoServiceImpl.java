package SistemaVuelosSB.services;

import SistemaVuelosSB.entities.Aerolinea;
import SistemaVuelosSB.entities.Asiento;
import SistemaVuelosSB.repositories.AsientoRepository;
import SistemaVuelosSB.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsientoServiceImpl extends BaseServiceImpl<Asiento, Long> implements AsientoService {
    @Autowired
    private AsientoRepository asientoRepository;

    public AsientoServiceImpl(BaseRepository<Asiento, Long> baseRepository, AsientoRepository asientoRepository) {
        super(baseRepository);
        this.asientoRepository = asientoRepository;
    }
}
