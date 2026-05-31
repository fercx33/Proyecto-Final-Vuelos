package SistemaVuelosSB.config;
import SistemaVuelosSB.entities.*;
import SistemaVuelosSB.entities.Clase;
import SistemaVuelosSB.repositories.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private PilotoRepository pilotoRepository;

    @Autowired
    private CiudadRepository ciudadRepository;

    @Autowired
    private AerolineaRepository aerolineaRepository;

    @Autowired
    private FechaRepository fechaRepository;

    @Autowired
    private AvionRepository avionRepository;

    @Autowired
    private AeropuertoRepository aeropuertoRepository;

    @Autowired
    private VueloRepository vueloRepository;

    @Autowired
    private TarifaRepository tarifaRepository;

    @Override
    public void run(String... args) throws Exception {

        if (vueloRepository.count() > 0) {
            return;
        }

        //Insert de pilotos
        Piloto pl1 = new Piloto();
        pl1.setNumeroPiloto(321);
        pl1.setDniPersona(40123456);
        pl1.setNombrePersona("María");
        pl1.setApellidoPersona("Gómez");
        pilotoRepository.save(pl1);

        Piloto pl2 = new Piloto();
        pl2.setNumeroPiloto(423);
        pl2.setDniPersona(35987654);
        pl2.setNombrePersona("Carlos");
        pl2.setApellidoPersona("Rodríguez");
        pilotoRepository.save(pl2);

        Piloto pl3 = new Piloto();
        pl3.setNumeroPiloto(231);
        pl3.setDniPersona(28555444);
        pl3.setNombrePersona("Laura");
        pl3.setApellidoPersona("Díaz");
        pilotoRepository.save(pl3);

        Piloto pl4 = new Piloto();
        pl4.setNumeroPiloto(302);
        pl4.setDniPersona(30123456);
        pl4.setNombrePersona("Rodolfo");
        pl4.setApellidoPersona("López");
        pilotoRepository.save(pl4);

        Piloto pl5 = new Piloto();
        pl5.setNumeroPiloto(336);
        pl5.setDniPersona(40789012);
        pl5.setNombrePersona("Pedro");
        pl5.setApellidoPersona("Gómez");
        pilotoRepository.save(pl5);

        Piloto pl6 = new Piloto();
        pl6.setNumeroPiloto(338);
        pl6.setDniPersona(36747012);
        pl6.setNombrePersona("Esteban");
        pl6.setApellidoPersona("Tovio");
        pilotoRepository.save(pl6);

        Piloto pl7 = new Piloto();
        pl7.setNumeroPiloto(428);
        pl7.setDniPersona(36747012);
        pl7.setNombrePersona("Juan");
        pl7.setApellidoPersona("Rodríguez");
        pilotoRepository.save(pl7);

        //Insert de ciudades
        Ciudad cd1 = new Ciudad("Buenos Aires");
        Ciudad cd2 = new Ciudad("Miami");
        Ciudad cd3 = new Ciudad("Rio de Janeiro");
        Ciudad cd4 = new Ciudad("Ciudad de Mexico");
        Ciudad cd5 = new Ciudad("Lima");
        Ciudad cd6 = new Ciudad("Madrid");
        Ciudad cd7 = new Ciudad("Santiago de Chile");

        ciudadRepository.save(cd1);
        ciudadRepository.save(cd2);
        ciudadRepository.save(cd3);
        ciudadRepository.save(cd4);
        ciudadRepository.save(cd5);
        ciudadRepository.save(cd6);
        ciudadRepository.save(cd7);

        //Insert de Aerolineas
        Aerolinea arl1 = new Aerolinea("Aerolineas Argentinas");
        Aerolinea arl2 = new Aerolinea("LATAM");
        Aerolinea arl3 = new Aerolinea("American Airlines");
        Aerolinea arl4 = new Aerolinea("JetSMART");

        aerolineaRepository.save(arl1);
        aerolineaRepository.save(arl2);
        aerolineaRepository.save(arl3);
        aerolineaRepository.save(arl4);

        //Insert de Fechas
        LocalDate localDate1 = LocalDate.of(2026, 12, 10);
        Date fecha1 = java.sql.Date.valueOf(localDate1);
        LocalDate localDate2 = LocalDate.of(2026, 12, 15);
        Date fecha2 = java.sql.Date.valueOf(localDate2);
        LocalDate localDate3 = LocalDate.of(2026, 12, 20);
        Date fecha3 = java.sql.Date.valueOf(localDate3);
        LocalDate localDate4 = LocalDate.of(2026, 11, 10);
        Date fecha4 = java.sql.Date.valueOf(localDate4);
        LocalDate localDate5 = LocalDate.of(2026, 11, 21);
        Date fecha5 = java.sql.Date.valueOf(localDate5);

        Fecha fec1 = new Fecha(fecha1);
        Fecha fec2 = new Fecha(fecha2);
        Fecha fec3 = new Fecha(fecha3);
        Fecha fec4 = new Fecha(fecha4);
        Fecha fec5 = new Fecha(fecha5);

        fechaRepository.save(fec1);
        fechaRepository.save(fec2);
        fechaRepository.save(fec3);
        fechaRepository.save(fec4);
        fechaRepository.save(fec5);

        //Insert de Asientos
        Asiento ast1 = new Asiento(3,'A',Clase.TURISTA);
        Asiento ast2 = new Asiento(2, 'C', Clase.BUSINESS);
        Asiento ast3 = new Asiento(5, 'E', Clase.TURISTA);
        Asiento ast4 = new Asiento(1, 'B', Clase.BUSINESS);
        Asiento ast5 = new Asiento(3, 'B', Clase.ECONOMY);
        Asiento ast6 = new Asiento(4,'C',Clase.ECONOMY);
        Asiento ast7 = new Asiento(1,'B', Clase.BUSINESS);

        //Insert de Aviones
        Avion av1 = new Avion();
        av1.setNumeroAvion(101);
        av1.addAsiento(ast1);
        avionRepository.save(av1);

        Avion av2 = new Avion();
        av2.setNumeroAvion(232);
        av2.addAsiento(ast5);
        avionRepository.save(av2);

        Avion av3 = new Avion();
        av3.setNumeroAvion(313);
        av3.addAsiento(ast3);
        avionRepository.save(av3);

        Avion av4 = new Avion();
        av4.setNumeroAvion(215);
        av4.addAsiento(ast2);
        avionRepository.save(av4);

        Avion av5 = new Avion();
        av5.setNumeroAvion(338);
        av5.addAsiento(ast4);
        avionRepository.save(av5);

        Avion av6 = new Avion();
        av6.setNumeroAvion(327);
        av6.addAsiento(ast6);
        avionRepository.save(av6);

        Avion av7 = new Avion();
        av7.setNumeroAvion(378);
        av7.addAsiento(ast7);
        avionRepository.save(av7);

        //Insert de Aeropuertos
        Aeropuerto aer1 = new Aeropuerto();
        aer1.setNombreAeropuerto("Aeropuerto Internacional de Ezeiza");
        aer1.setCiudad(cd1);

        Aeropuerto aer2 = new Aeropuerto();
        aer2.setNombreAeropuerto("Aeropuerto Internacional de Miami");
        aer2.setCiudad(cd2);

        Aeropuerto aer3 = new Aeropuerto();
        aer3.setNombreAeropuerto("Aeropuerto Internacional Galeao");
        aer3.setCiudad(cd3);

        Aeropuerto aer4 = new Aeropuerto();
        aer4.setNombreAeropuerto("Aeropuerto Internacional Benito Juárez");
        aer4.setCiudad(cd4);

        Aeropuerto aer5 = new Aeropuerto();
        aer5.setNombreAeropuerto("Aeropuerto Internacional Jorge Chávez");
        aer5.setCiudad(cd5);

        Aeropuerto aer6 = new Aeropuerto();
        aer6.setNombreAeropuerto("Aeropuerto Adolfo Suárez Madrid-Barajas");
        aer6.setCiudad(cd6);

        Aeropuerto aer7 = new Aeropuerto();
        aer7.setNombreAeropuerto("Aeropuerto Arturo Merino Benítez");
        aer7.setCiudad(cd7);


        //Insert de Vuelos
        Vuelo vue1 = new Vuelo();
        vue1.setNumeroVuelo(1011);
        vue1.setAerolinea(arl1);
        vue1.setPiloto(pl1);
        vue1.setFecha(fec1);
        vue1.setAvion(av1);
        vue1.addAeropuerto(aer1);
        vueloRepository.save(vue1);

        Vuelo vue2 = new Vuelo();
        vue2.setNumeroVuelo(1012);
        vue2.setAerolinea(arl3);
        vue2.setPiloto(pl2);
        vue2.setFecha(fec2);
        vue2.setAvion(av4);
        vue2.addAeropuerto(aer2);
        vueloRepository.save(vue2);

        Vuelo vue3 = new Vuelo();
        vue3.setNumeroVuelo(2103);
        vue3.setAerolinea(arl1);
        vue3.setPiloto(pl3);
        vue3.setFecha(fec1);
        vue3.setAvion(av3);
        vue3.addAeropuerto(aer3);
        vueloRepository.save(vue3);

        Vuelo vue4 = new Vuelo();
        vue4.setNumeroVuelo(3001);
        vue4.setAerolinea(arl3);
        vue4.setPiloto(pl4);
        vue4.setFecha(fec3);
        vue4.setAvion(av5);
        vue4.addAeropuerto(aer4);
        vueloRepository.save(vue4);

        Vuelo vue5 = new Vuelo();
        vue5.setNumeroVuelo(4005);
        vue5.setAerolinea(arl2);
        vue5.setPiloto(pl5);
        vue5.setFecha(fec2);
        vue5.setAvion(av2);
        vue5.addAeropuerto(aer5);
        vueloRepository.save(vue5);

        Vuelo vue6 = new Vuelo();
        vue6.setNumeroVuelo(4023);
        vue6.setAerolinea(arl2);
        vue6.setPiloto(pl7);
        vue6.setFecha(fec4);
        vue6.setAvion(av7);
        vue6.addAeropuerto(aer6);
        vueloRepository.save(vue6);

        Vuelo vue7 = new Vuelo();
        vue7.setNumeroVuelo(4023);
        vue7.setAerolinea(arl4);
        vue7.setPiloto(pl6);
        vue7.setFecha(fec5);
        vue7.setAvion(av6);
        vue7.addAeropuerto(aer7);
        vueloRepository.save(vue7);

        //Insert de Tarifas
        Tarifa tar1 = new Tarifa();
        tar1.setNumeroTarifa(1);
        tar1.setImpuestoTarifa(5000);
        tar1.setPrecioTarifa(55000);
        tar1.setClaseTarifa(Clase.TURISTA);
        tar1.setVuelo(vue1);
        tarifaRepository.save(tar1);

        Tarifa tar2 = new Tarifa();
        tar2.setNumeroTarifa(2);
        tar2.setImpuestoTarifa(7500);
        tar2.setPrecioTarifa(75000);
        tar2.setClaseTarifa(Clase.BUSINESS);
        tar2.setVuelo(vue2);
        tarifaRepository.save(tar2);

        Tarifa tar3 = new Tarifa();
        tar3.setNumeroTarifa(3);
        tar3.setImpuestoTarifa(6000);
        tar3.setPrecioTarifa(60000);
        tar3.setClaseTarifa(Clase.TURISTA);
        tar3.setVuelo(vue3);
        tarifaRepository.save(tar3);

        Tarifa tar4 = new Tarifa();
        tar4.setNumeroTarifa(4);
        tar4.setImpuestoTarifa(8000);
        tar4.setPrecioTarifa(80000);
        tar4.setClaseTarifa(Clase.BUSINESS);
        tar4.setVuelo(vue4);
        tarifaRepository.save(tar4);

        Tarifa tar5 = new Tarifa();
        tar5.setNumeroTarifa(5);
        tar5.setImpuestoTarifa(4500);
        tar5.setPrecioTarifa(45000);
        tar5.setClaseTarifa(Clase.ECONOMY);
        tar5.setVuelo(vue5);
        tarifaRepository.save(tar5);

        Tarifa tar6 = new Tarifa();
        tar6.setNumeroTarifa(6);
        tar6.setImpuestoTarifa(7900);
        tar6.setPrecioTarifa(145000);
        tar6.setClaseTarifa(Clase.BUSINESS);
        tar6.setVuelo(vue6);
        tarifaRepository.save(tar6);

        Tarifa tar7 = new Tarifa();
        tar7.setNumeroTarifa(7);
        tar7.setImpuestoTarifa(3500);
        tar7.setPrecioTarifa(40000);
        tar7.setClaseTarifa(Clase.ECONOMY);
        tar7.setVuelo(vue7);
        tarifaRepository.save(tar7);

    }


}
