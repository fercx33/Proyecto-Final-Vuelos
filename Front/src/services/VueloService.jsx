import axios from 'axios';
const VUELO_BASE_REST_API_URL = "http://localhost:9000/api/v1/vuelos";

class VueloService{
    getAllVuelos(){
        return axios.get(VUELO_BASE_REST_API_URL);
    }

    searchVuelos(filtro){
        return axios.get(`${VUELO_BASE_REST_API_URL}/search`, {params: { filtro }});
    }

    getVueloById(id){
        return axios.get(`${VUELO_BASE_REST_API_URL}/${id}`);
    }
}

export default new VueloService;