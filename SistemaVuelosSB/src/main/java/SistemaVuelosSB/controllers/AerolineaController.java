package SistemaVuelosSB.controllers;

import SistemaVuelosSB.entities.Aerolinea;
import SistemaVuelosSB.services.AerolineaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
@RequestMapping(path = "api/v1/aerolineas")
public class AerolineaController extends BaseControllerImpl<Aerolinea, AerolineaServiceImpl>{
}
