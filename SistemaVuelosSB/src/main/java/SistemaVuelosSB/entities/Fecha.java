package SistemaVuelosSB.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.Date;

@Entity
@Table(name = "fecha")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Fecha extends Base{
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
}
