package SistemaVuelosSB.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "asiento")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Asiento extends Base{
    @Column(name = "asiento_fila")
    private int filaAsiento;

    @Column(name = "asiento_letra")
    private char letraAsiento;

    @Column(name = "asiento_clase")
    @Enumerated(EnumType.STRING)
    private Clase claseAsiento;
}
