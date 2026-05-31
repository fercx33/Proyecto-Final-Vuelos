package SistemaVuelosSB.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "tarjeta")
@PrimaryKeyJoinColumn(name = "tarjeta_id")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Tarjeta extends Pago{
    @Column(name = "tarjeta_numero")
    private String numeroTarjeta;
    @Column(name = "tarjeta_tipo")
    @Enumerated(EnumType.STRING)
    private TipoTarjeta tipoTarjeta;
}
