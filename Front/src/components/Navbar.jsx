import "../styles/Navbar.css";
import { Link } from 'react-router-dom';
import logo from "../assets/logo.png";

function Navbar() {
  const links = [
    { to: "/", label: "Reservar" },
    { to: "/mis-vuelos", label: "Mis vuelos" },
  ]
  return (
    <nav className="navbar-custom text-white">
      <div className="container d-flex justify-content-between align-items-center py-3">

        {/* LOGO + NOMBRE */}
        <Link
          to="/"
          className="d-flex align-items-center text-white text-decoration-none"
        >
          <img
            src={logo}
            alt="FlySearch"
            height="40"
            className="rounded"
          />

          <h3 className="fw-bold m-0">
            FlySearch
          </h3>
        </Link>

        {/* LINKS */}
        <div className="d-flex gap-3 align-items-center">

          <Link
            to="/"
            className="btn btn-light rounded-pill px-4"
          >
            Reservar
          </Link>

          <Link
            to="/mis-vuelos"
            className="btn btn-link text-white text-decoration-none"
          >
            Mis vuelos
          </Link>

        </div>

      </div>
    </nav>
  );
}

export default Navbar;