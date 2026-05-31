package SistemaVuelosSB.controllers;

import SistemaVuelosSB.entities.Vuelo;
import SistemaVuelosSB.services.VueloServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
@RequestMapping(path = "api/v1/vuelos")
public class VueloController extends BaseControllerImpl<Vuelo, VueloServiceImpl>{
    /**
     * Busca vuelos por ciudad de destino.
     */
    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"" + e.getMessage() + "\"}");
        }
    }
}
