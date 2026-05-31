package SistemaVuelosSB.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "consulta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Consulta extends Base{
    @Column(name = "consulta_numero")
    private int numeroConsulta;

    @OneToOne
    @JoinColumn(name = "vuelo_fk")
    private Vuelo vuelo;
}
