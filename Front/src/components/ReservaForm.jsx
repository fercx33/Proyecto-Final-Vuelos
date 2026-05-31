import React, { useEffect, useState } from "react";
import { useParams, useNavigate } from "react-router-dom";
import VueloService from "../services/VueloService";
import ReservaService from "../services/ReservaService";


/**
 * Gestiona el proceso de reserva de un vuelo y el ingreso de datos del pasajero.
 */
function ReservaComponent() {
  const navigate = useNavigate();
  
  const { id } = useParams();

  const [vuelo, setVuelo] = useState(null);

  const [formData, setFormData] = useState({
    nombre: "",
    apellido: "",
    dni: "",
    correoElectronico: "",
    numeroTarjeta:"",
    tipoTarjeta:"DEBITO"
  });

  useEffect(() => {

    VueloService.getVueloById(id)
      .then((response) => {
        setVuelo(response.data);
      })
      .catch((error) => {
        console.log(error);
      });

  }, [id]);

  const handleChange = (e) => {
    const { name, value} = e.target;

    if(name === "dni" || name === "numeroTarjeta"){
      setFormData({
        ...formData,
      [name]: value.replace(/\D/g, "")
      });
    }
    setFormData({
      ...formData,
      [e.target.name]: e.target.value,
    });
  };

  const handleSubmit = async(e) => {
    e.preventDefault();

    const form = e.currentTarget;
    if(!form.checkValidity()){
      alert("Los campos deben ser completados correctamente")
      form.reportValidity();
      return;
    }

    const reserva = {
       nombre: formData.nombre.trim(),
       apellido: formData.apellido.trim(),
       dni: Number(formData.dni),
       correoElectronico: formData.correoElectronico.trim(),
       numeroTarjeta:formData.numeroTarjeta,
       tipoTarjeta:formData.tipoTarjeta,
       vueloId: Number(vuelo.id)
    };
    try{
        await ReservaService.createReserva(reserva);
        alert("Reserva Confirmada")

        navigate("/mis-vuelos");
    }catch(error){
        console.log(error.response.data);
        alert("Error en la reserva");
    }
  };

  if (!vuelo) {
    return (
      <div className="container py-5">
        <h3>Cargando vuelo...</h3>
      </div>
    );
  }

  return (
    <div className="container py-5">

      <div className="row justify-content-center">

        <div className="col-lg-8">

          <div className="card border-0 shadow rounded-4 mb-4">

            <div className="card-body p-4">

              <h3 className="fw-bold mb-4">
                Resumen del vuelo
              </h3>

              <div className="row">

                <div className="col-md-6">

                  <p>
                    <strong>Aerolínea:</strong>{" "}
                    {vuelo.aerolinea?.nombreAerolinea}
                  </p>

                  <p>
                    <strong>Vuelo:</strong>{" "}
                    {vuelo.numeroVuelo}
                  </p>

                  <p>
                    <strong>Aeropuerto:</strong>{" "}
                    {vuelo.aeropuertos?.[0]?.nombreAeropuerto}
                  </p>

                </div>

                <div className="col-md-6">

                  <p>
                    <strong>Destino:</strong>{" "}
                    {vuelo.aeropuertos?.[0]?.ciudad?.nombreCiudad}
                  </p>

                  <p>
                    <strong>Fecha:</strong>{" "}
                    {new Date(
                      vuelo.fecha?.fecha
                    ).toLocaleDateString()}
                  </p>

                  <p>
                    <strong>Clase:</strong>{" "}
                    {vuelo.avion?.asientos?.[0]?.claseAsiento}
                  </p>

                </div>

              </div>

              <hr />

              <div className="d-flex justify-content-between align-items-center">

                <h4 className="m-0">
                  Precio total
                </h4>

                <h2 className="text-primary fw-bold m-0">
                  ${vuelo.tarifas?.[0]?.precioTarifa}
                </h2>

              </div>

            </div>

          </div>

          <div className="card border-0 shadow rounded-4">

            <div className="card-body p-4">

              <h3 className="fw-bold mb-4">
                Datos del pasajero
              </h3>

              <form onSubmit={handleSubmit}>

                <div className="row g-4">

                  <div className="col-md-6">

                    <label className="form-label">
                      Nombre
                    </label>

                    <input
                      type="text"
                      className="form-control form-control-lg rounded-4"
                      name="nombre"
                      minLength="2"
                      value={formData.nombre}
                      onChange={handleChange}
                      required
                    />

                  </div>

                  <div className="col-md-6">

                    <label className="form-label">
                      Apellido
                    </label>

                    <input
                      type="text"
                      className="form-control form-control-lg rounded-4"
                      name="apellido"
                      minLength="2"
                      value={formData.apellido}
                      onChange={handleChange}
                      required
                    />

                  </div>

                  <div className="col-md-6">

                    <label className="form-label">
                      DNI
                    </label>

                    <input
                      type="text"
                      className="form-control form-control-lg rounded-4"
                      name="dni"
                      value={formData.dni}
                      onChange={handleChange}
                      pattern="\d{7,8}"
                      maxLength="8"
                      required
                    />

                  </div>

                  <div className="col-md-6">

                    <label className="form-label">
                      Email
                    </label>

                    <input
                      type="email"
                      className="form-control form-control-lg rounded-4"
                      name="correoElectronico"
                      value={formData.correoElectronico}
                      onChange={handleChange}
                      required
                    />

                  </div>

                  <hr className="my-4" />

                  <h3 className="fw-bold mb-4">
                    Datos de pago
                  </h3>
                  
                  <div className="col-md-6">

                    <label className="form-label">
                      Número de tarjeta
                    </label>

                    <input
                      type="text"
                      className="form-control form-control-lg rounded-4"
                      name="numeroTarjeta"
                      pattern="\d{16}"
                      maxLength="16"
                      value={formData.numeroTarjeta}
                      onChange={handleChange}
                      placeholder="1234 5678 8012 3456"
                      required
                    />
                  </div>

                  <div className="col-md-6">

                    <label className="form-label">
                      Tipo de tarjeta
                    </label>

                    <select
                      className="form-select form-select-lg rounded-4"
                      name="tipoTarjeta"
                      value={formData.tipoTarjeta}
                      onChange={handleChange}
                      required
                    >
                      <option value="CREDITO">
                        Crédito
                      </option>

                      <option value="DEBITO">
                        Débito
                      </option>
                    </select>

                  </div>
                </div>

                <div className="text-end mt-5">

                  <button className="btn btn-primary btn-lg rounded-pill px-5">
                    Confirmar reserva
                  </button>

                </div>

              </form>

            </div>

          </div>

        </div>

      </div>

    </div>
  );
}

export default ReservaComponent;