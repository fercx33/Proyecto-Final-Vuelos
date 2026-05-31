package SistemaVuelosSB.services;

import SistemaVuelosSB.dto.ReservaDTO;
import SistemaVuelosSB.entities.Reserva;

public interface ReservaService extends BaseService<Reserva, Long>{
    Reserva crearReserva(ReservaDTO dto) throws Exception;
}
