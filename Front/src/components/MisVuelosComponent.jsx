import React, { useEffect, useState } from 'react';
import ReservaService from '../services/ReservaService';
import { useSearchParams } from 'react-router-dom';
import { useNavigate, Link } from 'react-router-dom';


/**
 * Muestra el historial de vuelos reservados por los usuarios.
 */
export const MisvuelosComponent = () =>{
    const [reservas, setReservas] = useState([]);

    useEffect(() => {
        ReservaService.getAllReservas().then((response) => {
          setReservas(Array.isArray(response.data)
              ? response.data
              : response.data.content || []);
          console.log(response.data);
        }).catch(error => {
          console.log(error)
        })
    },[])

    return(
        <div className="container py-5">
            <div className="row justify-content-center">
            <div className="col-12 col-md-8 col-lg-6">
            {reservas.map((reserva) => (
                <div key={reserva.vueloReservado.vueloId}className="card shadow border-0 rounded-4 mb-4">

                <div className="card-body p-3">

                    <h2 className="fw-bold text-center mb-3">
                    ✈ Vuelo {reserva.vueloReservado.numeroVuelo}
                    </h2>

                    <div className="row mb-2">

                    <div className="col-6">
                        <p className="mb-0 small text-muted">
                        <strong>Aerolínea:</strong>{" "}
                        {reserva.vueloReservado.aerolinea.nombreAerolinea}
                        </p>
                    </div>

                    <div className="col-6 text-end">
                        <p className="mb-0 small text-muted">
                        <strong>Fecha:</strong>{" "}
                        {new Date(
                            reserva.vueloReservado.fecha.fecha
                        ).toLocaleDateString()}
                        </p>
                    </div>

                    </div>

                    <div className="row">

                    <div className="col-6">
                        <p className="mb-0 small text-muted">
                        <strong>Destino:</strong>{" "}
                        {reserva.vueloReservado.aeropuertos?.[0]?.ciudad?.nombreCiudad}
                        </p>
                    </div>

                    <div className="col-6 text-end">
                        <p className="mb-0 small text-muted">
                        <strong>Aeropuerto:</strong>{" "}
                        {reserva.vueloReservado.aeropuertos?.[0]?.nombreAeropuerto}
                        </p>
                    </div>

                    </div>

                </div>

                <div className="border-top bg-light-subtle px-3 py-2 rounded-bottom-4">

                    <div className="d-flex justify-content-between align-items-center">

                    <h3 className="fw-bold text-primary m-0">
                        ${reserva.vueloReservado.tarifas?.[0]?.precioTarifa}
                    </h3>

                    </div>

                </div>

                </div>
  
              ))}
            </div>
            </div>
        </div>
    )
} 