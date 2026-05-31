package SistemaVuelosSB.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "aeropuerto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Aeropuerto extends Base{
    @Column(name = "aeropuerto_nombre")
    private String nombreAeropuerto;

    @OneToOne
    @JoinColumn(name = "ciudad_fk")
    private Ciudad ciudad;
}
