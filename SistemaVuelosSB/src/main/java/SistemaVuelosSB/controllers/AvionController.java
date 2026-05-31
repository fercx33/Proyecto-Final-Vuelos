package SistemaVuelosSB.controllers;

import SistemaVuelosSB.entities.Avion;
import SistemaVuelosSB.services.AvionServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
@RequestMapping(path = "api/v1/aviones")
public class AvionController extends BaseControllerImpl<Avion, AvionServiceImpl>{
}
