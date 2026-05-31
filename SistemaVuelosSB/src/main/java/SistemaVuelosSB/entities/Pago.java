package SistemaVuelosSB.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "pago")
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Pago extends Base{
    @Column(name = "pago_numero")
    protected Integer numeroPago;
    @Column(name = "pago_cantidad")
    protected Integer cantidadPago;
}
