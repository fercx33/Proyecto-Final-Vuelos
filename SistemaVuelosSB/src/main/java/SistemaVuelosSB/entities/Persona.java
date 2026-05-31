package SistemaVuelosSB.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Persona extends Base{
    @Column(name = "persona_dni")
    protected int dniPersona;
    @Column(name = "persona_nombre")
    protected String nombrePersona;
    @Column(name = "persona_apellido")
    protected String apellidoPersona;
}
