package SistemaVuelosSB.services;

import SistemaVuelosSB.dto.ReservaDTO;
import SistemaVuelosSB.entities.Reserva;
import SistemaVuelosSB.entities.Tarjeta;
import SistemaVuelosSB.entities.Usuario;
import SistemaVuelosSB.entities.Vuelo;
import SistemaVuelosSB.repositories.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImpl extends BaseServiceImpl<Reserva, Long> implements ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private VueloRepository vueloRepository;
    @Autowired
    private TarjetaRepository tarjetaRepository;

    public ReservaServiceImpl(BaseRepository<Reserva, Long> baseRepository, ReservaRepository reservaRepository) {
        super(baseRepository);
        this.reservaRepository = reservaRepository;
    }

    @Override
    @Transactional
    public Reserva crearReserva(ReservaDTO dto) throws Exception {
        try {
            Vuelo vuelo = vueloRepository.findById(dto.getVueloId()).orElseThrow();

            Reserva reserva = new Reserva();
            reserva.setVueloReservado(vuelo);
            reserva = reservaRepository.save(reserva);

            Tarjeta tarjeta = new Tarjeta();
            tarjeta.setNumeroTarjeta(dto.getNumeroTarjeta());
            tarjeta.setTipoTarjeta(dto.getTipoTarjeta());
            tarjetaRepository.save(tarjeta);

            Usuario usuario = new Usuario();
            usuario.setNombrePersona(dto.getNombre());
            usuario.setApellidoPersona(dto.getApellido());
            usuario.setDniPersona(dto.getDni());
            usuario.setCorreoElectronicoUsuario(dto.getCorreoElectronico());
            usuario.addTarjeta(tarjeta);

            usuario.setReserva(reserva);
            usuario = usuarioRepository.save(usuario);

            return reserva;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
