package SistemaVuelosSB.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "avion")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Avion extends Base implements Especificacion{
    @Column(name = "avion_numero")
    private int numeroAvion;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "avion_fk")
    private List<Asiento> asientos = new ArrayList<>();

    public void addAsiento(Asiento asientos){
        this.asientos.add(asientos);
    }

    public void removeAsiento(Asiento asientos){
        this.asientos.remove(asientos);
    }

    @Override
    public String tipoTurbina() {
        return "T-567";
    }

    @Override
    public String tipoAvion() {
        return "Boing747";
    }
}
