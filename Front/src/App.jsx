import { useState } from 'react'
import VuelosComponent from './components/VuelosComponent'
import Reserva from './components/Reserva'
import {BrowserRouter, Route, Routes} from 'react-router-dom';
import Navbar from './components/Navbar'
import ReservaForm from './components/ReservaForm'
import { MisvuelosComponent } from './components/MisVuelosComponent';

function App() {
  return (
    <div>
      <BrowserRouter>
          <Navbar/>
          <Routes>
            <Route exact path='/vuelos' element={<VuelosComponent/>}></Route>
            <Route path="/" element={<Reserva/>} />
            <Route path="/reserva/:id" element={<ReservaForm/>} />
            <Route path="/mis-vuelos" element={<MisvuelosComponent/>}/>
          </Routes>
      </BrowserRouter>
    </div>
  )
}

export default App
