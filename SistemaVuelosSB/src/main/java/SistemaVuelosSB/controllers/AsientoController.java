package SistemaVuelosSB.controllers;

import SistemaVuelosSB.entities.Asiento;
import SistemaVuelosSB.services.AsientoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
@RequestMapping(path = "api/v1/asientos")
public class AsientoController extends BaseControllerImpl<Asiento, AsientoServiceImpl>{
}
