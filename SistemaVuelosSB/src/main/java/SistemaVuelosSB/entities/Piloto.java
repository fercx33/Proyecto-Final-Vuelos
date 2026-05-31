package SistemaVuelosSB.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "piloto")
@PrimaryKeyJoinColumn(name = "piloto_id")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Piloto extends Persona{
    @Column(name = "piloto_numero")
    private int numeroPiloto;
}
