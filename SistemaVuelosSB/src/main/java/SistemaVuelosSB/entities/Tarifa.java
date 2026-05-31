package SistemaVuelosSB.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "tarifa")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Tarifa extends Base{
    @Column(name = "tarifa_numero")
    private int numeroTarifa;
    @Column(name = "tarifa_impuesto")
    private int impuestoTarifa;
    @Column(name = "tarifa_precio")
    private int precioTarifa;

    @Enumerated(EnumType.STRING)
    private Clase claseTarifa;

    @ManyToOne
    @JoinColumn(name = "vuelo_fk")
    @JsonBackReference
    private Vuelo vuelo;
}
