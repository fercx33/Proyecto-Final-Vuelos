package SistemaVuelosSB.controllers;

import SistemaVuelosSB.dto.ReservaDTO;
import SistemaVuelosSB.entities.Reserva;
import SistemaVuelosSB.services.ReservaService;
import SistemaVuelosSB.services.ReservaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
@RequestMapping(path = "api/v1/reservas")
public class ReservaController extends BaseControllerImpl<Reserva, ReservaServiceImpl>{
    @Autowired
    private ReservaService reservaService;
    /**
     * Procesa una nueva reserva de vuelo.
     */
    @PostMapping("/crear")
    public ResponseEntity<?> crearReserva(
            @RequestBody ReservaDTO dto) {
        try {
            Reserva reserva = reservaService.crearReserva(dto);
            return ResponseEntity.status(HttpStatus.OK).body(reserva);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"" + e.getMessage() + "\"}");
        }
    }
}
