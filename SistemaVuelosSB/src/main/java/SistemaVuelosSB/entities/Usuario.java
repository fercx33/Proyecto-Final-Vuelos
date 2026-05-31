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
@Table(name = "usuario")
@PrimaryKeyJoinColumn(name = "usuario_id")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Usuario extends Persona{
    @Column(name = "usuario_numero")
    private int numeroUsuario;
    @Column(name = "usuario_contrasenia")
    private String contraseniaUsuario;
    @Column(name = "correo_electronico_usuario")
    private String correoElectronicoUsuario;

    @ManyToOne
    @JoinColumn(name = "reserva_fk")
    private Reserva reserva;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_fk")
    private List<Consulta> consultas = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_fk")
    private List<Tarjeta> tarjetas = new ArrayList<>();

    public void addConsulta(Consulta consultas){
        this.consultas.add(consultas);
    }

    public void removeConsulta(Consulta consultas){
        this.consultas.remove(consultas);
    }

    public void addTarjeta(Tarjeta tarjetas){
        this.tarjetas.add(tarjetas);
    }

    public void removeTarjeta(Tarjeta tarjetas){
        this.tarjetas.remove(tarjetas);
    }
}
