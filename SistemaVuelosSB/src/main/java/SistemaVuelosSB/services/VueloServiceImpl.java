package SistemaVuelosSB.services;

import SistemaVuelosSB.entities.Vuelo;
import SistemaVuelosSB.repositories.BaseRepository;
import SistemaVuelosSB.repositories.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VueloServiceImpl extends BaseServiceImpl<Vuelo, Long> implements VueloService {
    @Autowired
    private VueloRepository vueloRepository;

    public VueloServiceImpl(BaseRepository<Vuelo, Long> baseRepository, VueloRepository vueloRepository) {
        super(baseRepository);
        this.vueloRepository = vueloRepository;
    }


    @Override
    public List<Vuelo> search(String filtro) throws Exception {
        try {
            List<Vuelo> vuelos = vueloRepository.search(filtro);
            return vuelos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
