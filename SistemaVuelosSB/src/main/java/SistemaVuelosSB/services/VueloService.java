package SistemaVuelosSB.services;

import SistemaVuelosSB.entities.Vuelo;

import java.util.List;

public interface VueloService extends BaseService<Vuelo, Long>{
    /**
     * Busca vuelos asociados a la ciudad indicada.
     *
     * @param filtro nombre de la ciudad a buscar.
     * @return lista de vuelos encontrados.
     */
    List<Vuelo> search(String filtro) throws Exception;
}
