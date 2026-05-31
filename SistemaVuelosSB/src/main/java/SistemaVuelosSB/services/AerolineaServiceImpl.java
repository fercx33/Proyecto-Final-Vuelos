package SistemaVuelosSB.services;

import SistemaVuelosSB.entities.Aerolinea;
import SistemaVuelosSB.repositories.AerolineaRepository;
import SistemaVuelosSB.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AerolineaServiceImpl extends BaseServiceImpl<Aerolinea, Long> implements AerolineaService {
    @Autowired
    private AerolineaRepository aerolineaRepository;

    public AerolineaServiceImpl(BaseRepository<Aerolinea, Long> baseRepository, AerolineaRepository aerolineaRepository) {
        super(baseRepository);
        this.aerolineaRepository = aerolineaRepository;
    }
}
