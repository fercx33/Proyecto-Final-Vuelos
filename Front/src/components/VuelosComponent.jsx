import React, { useEffect, useState } from 'react'
import VueloService from '../services/VueloService';
import { useSearchParams } from 'react-router-dom';
import { useNavigate, Link } from 'react-router-dom';


/**
 * Muestra los vuelos encontrados según el destino seleccionado.
 */
export const ListVuelosComponent = () => {
  const navigate = useNavigate();
  const [searchParams] = useSearchParams();
  const filtro = searchParams.get("filtro");
  const [vuelos, setVuelos] = useState([]);
  useEffect(() => {
    if (!filtro) return;
    VueloService.searchVuelos(filtro).then((response) => {
      setVuelos(Array.isArray(response.data)
          ? response.data
          : response.data.content || []);
      console.log(response.data);
    }).catch(error => {
      console.log(error)
    })
  },[filtro])

  return (
    <div className="container-fluid mt-4 px-4">
  <div className="d-flex flex-column gap-4">

    {vuelos.map((vuelo) => (
      <div
        key={vuelo.numeroVuelo}
        className="card border-0 shadow rounded-4 p-3"
      >

        <div className="row align-items-center">

          <div className="col-md-3">
            <h5 className="fw-bold mb-1">
              {vuelo.aerolinea?.nombreAerolinea}
            </h5>

            <small className="text-muted">
              Vuelo {vuelo.numeroVuelo}
            </small>
          </div>

          <div className="col-md-3 text-center">
            <h4 className="fw-bold mb-0">
              {new Date(vuelo.fecha.fecha).toLocaleDateString()}
            </h4>

            <small className="text-muted">
              {vuelo.aeropuertos?.[0]?.ciudad?.nombreCiudad}
            </small>
          </div>

          <div className="col-md-3">
            <p className="mb-1">
               Avión: {vuelo.avion?.numeroAvion}
            </p>

            <p className="mb-0">
               Clase:{" "}
              {vuelo.avion?.asientos?.[0]?.claseAsiento}
            </p>
          </div>

          <div className="col-md-3 text-md-end mt-3 mt-md-0">
            <h3 className="text-primary fw-bold">
              ${vuelo.tarifas?.[0]?.precioTarifa}
            </h3>

            <Link to={`/reserva/${vuelo.id}`} className="btn btn-primary rounded-pill px-4">
              Reservar
            </Link>
          </div>

        </div>

      </div>
    ))}

  </div>
  </div>
  )
}

export default ListVuelosComponent;