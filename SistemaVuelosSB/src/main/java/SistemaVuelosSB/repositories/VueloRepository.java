package SistemaVuelosSB.repositories;

import SistemaVuelosSB.entities.Ciudad;
import SistemaVuelosSB.entities.Vuelo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VueloRepository extends BaseRepository<Vuelo, Long>{
    @Query(value = "SELECT DISTINCT v FROM Vuelo v JOIN v.aeropuertos ap WHERE ap.ciudad.nombreCiudad = :filtro")
    List<Vuelo> search(@Param("filtro") String filtro);

}
