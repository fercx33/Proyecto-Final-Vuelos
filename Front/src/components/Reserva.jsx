import React, { useState }from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import "../styles/Reserva.css";
import { useNavigate } from 'react-router-dom'



export default function VueloSearch() {
  const [filtro, setFiltro] = useState("");

  const navigate = useNavigate();

  const handleBuscar = () => {
    if (!filtro) {
      alert("Debe seleccionar un destino");
      return;
    }

    navigate(`/vuelos?filtro=${encodeURIComponent(filtro)}`);
  };

  return (
    <div className="flight-page container-fluid p-0">
      <div className="hero-section text-white">
        <div className="container py-5">

          <div className="hero-content">
            <h1 className="display-4 fw-light">
              ¿A dónde viajás hoy?
            </h1>

            <p className="fs-4 text-light opacity-75">
              Encontrá los mejores vuelos al mejor precio
            </p>
          </div>
        </div>
      </div>

      <div className="container">
        <div className="search-card shadow-lg">
          <div className="row g-0 justify-content-center">
            <div className="col-md-6 text-center">
              <label className="form-label fw-bold text-uppercase small">
                Destino
              </label>

              <select
              className="form-select form-select-lg rounded-4"  value={filtro}
              onChange={(e) => setFiltro(e.target.value)}>

              <option value="">
                Seleccione un destino
              </option>

              <option value="Buenos Aires">
                Buenos Aires
              </option>

              <option value="Miami">
                Miami
              </option>

              <option value="Rio de Janeiro">
                Río de Janeiro
              </option>

              <option value="Ciudad de Mexico">
                Ciudad de México
              </option>

              <option value="Lima">
                Lima
              </option>

              <option value="Madrid">
                Madrid
              </option>
              
              <option value="Santiago de Chile">
                Santiago de Chile
              </option>
            </select>

            </div>

            <div className="text-center mt-4">
              <button
              className="btn btn-primary btn-lg rounded-pill px-5"
              onClick={handleBuscar}
              >
                Buscar vuelos
              </button>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}