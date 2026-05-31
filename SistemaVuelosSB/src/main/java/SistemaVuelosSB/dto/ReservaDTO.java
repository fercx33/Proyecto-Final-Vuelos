package SistemaVuelosSB.dto;

import SistemaVuelosSB.entities.TipoTarjeta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * DTO utilizado para transportar los datos necesarios
 * para generar una reserva.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReservaDTO {
    private String nombre;
    private String apellido;
    private int dni;
    private String numeroTarjeta;
    private TipoTarjeta tipoTarjeta;

    private String correoElectronico;

    private Long vueloId;
}
