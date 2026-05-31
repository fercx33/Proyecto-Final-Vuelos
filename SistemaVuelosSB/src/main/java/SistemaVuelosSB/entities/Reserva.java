package SistemaVuelosSB.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Reserva extends Base{
    @Column(name = "reserva_numero")
    private Integer numeroReserva;

    @ManyToOne
    @JoinColumn(name = "vuelo_fk")
    private Vuelo vueloReservado;
    @OneToOne
    @JoinColumn(name = "pago_fk")
    private Pago pago;
}
