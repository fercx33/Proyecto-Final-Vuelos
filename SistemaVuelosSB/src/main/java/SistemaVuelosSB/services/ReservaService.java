package SistemaVuelosSB.services;

import SistemaVuelosSB.dto.ReservaDTO;
import SistemaVuelosSB.entities.Reserva;

public interface ReservaService extends BaseService<Reserva, Long>{
    /**
     * Procesa la creación de una reserva utilizando los datos
     * del usuario, el vuelo seleccionado y la forma de pago
     * contenidos en el DTO.
     *
     * @param dto datos necesarios para generar la reserva.
     * @return reserva creada.
     */
    Reserva crearReserva(ReservaDTO dto) throws Exception;
}
