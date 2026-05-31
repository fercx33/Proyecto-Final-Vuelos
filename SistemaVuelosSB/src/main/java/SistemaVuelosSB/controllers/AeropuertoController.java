package SistemaVuelosSB.controllers;

import SistemaVuelosSB.entities.Aeropuerto;
import SistemaVuelosSB.services.AeropuertoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
@RequestMapping(path = "api/v1/aeropuertos")
public class AeropuertoController extends BaseControllerImpl<Aeropuerto, AeropuertoServiceImpl>{
}
