import axios from 'axios';
const RESERVA_BASE_REST_API_URL = "http://localhost:9000/api/v1/reservas";

class ReservaService{
    createReserva(reserva){
        return axios.post(`${RESERVA_BASE_REST_API_URL}/crear`, reserva);
    }

    getAllReservas(){
        return axios.get(RESERVA_BASE_REST_API_URL);
    }
}

export default new ReservaService;