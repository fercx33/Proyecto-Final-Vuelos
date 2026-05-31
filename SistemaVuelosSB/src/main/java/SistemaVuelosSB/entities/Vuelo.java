package SistemaVuelosSB.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "vuelo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Vuelo extends Base{
    @Column(name = "vuelo_numero")
    private int numeroVuelo;

    @OneToOne
    @JoinColumn(name="avion_fk")
    private Avion avion;
    @ManyToOne
    @JoinColumn(name="aerolinea_fk")
    private Aerolinea aerolinea = new Aerolinea();
    @ManyToOne
    @JoinColumn(name="fecha_fk")
    private Fecha fecha;
    @OneToOne
    @JoinColumn(name="piloto_fk")
    private Piloto piloto;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "vuelo_fk")
    private List<Aeropuerto> aeropuertos = new ArrayList<>();
    @OneToMany(mappedBy = "vuelo", fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Tarifa> tarifas = new ArrayList<>();

    public Date salida(){

        return new Date();

    }

    public Date destino(){
        return new Date();
    }

    public void addAeropuerto(Aeropuerto aeropuertos){
        this.aeropuertos.add(aeropuertos);
    }

    public void removeAeropuerto(Aeropuerto aeropuertos){
        this.aeropuertos.remove(aeropuertos);
    }

    public void addTarifa(Tarifa tarifas){
        this.tarifas.add(tarifas);
    }

    public void removeTarifa(Tarifa tarifas){
        this.tarifas.remove(tarifas);
    }
}
