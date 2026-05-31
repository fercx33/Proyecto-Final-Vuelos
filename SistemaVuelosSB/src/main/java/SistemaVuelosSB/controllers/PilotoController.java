package SistemaVuelosSB.controllers;

import SistemaVuelosSB.entities.Piloto;
import SistemaVuelosSB.services.PilotoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
@RequestMapping(path = "api/v1/pilotos")
public class PilotoController extends BaseControllerImpl<Piloto, PilotoServiceImpl>{
}
