package SistemaVuelosSB.controllers;

import SistemaVuelosSB.entities.Fecha;
import SistemaVuelosSB.services.FechaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
@RequestMapping(path = "api/v1/fechas")
public class FechaController extends BaseControllerImpl<Fecha, FechaServiceImpl>{
}
