package SistemaVuelosSB.services;

import SistemaVuelosSB.entities.Vuelo;

import java.util.List;

public interface VueloService extends BaseService<Vuelo, Long>{
    List<Vuelo> search(String filtro) throws Exception;
}
