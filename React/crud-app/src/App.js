import logo from './logo.svg';
import './App.css';
import {Routes, Route, BrowserRouter} from "react-router-dom";

import Home from "./component/Home";
import Navbar from "./component/Navbar";
function App() {
  return (
    <BrowserRouter class="routes-container">
    <Navbar />
    <Routes>
      <Route path="/" element={ <Home /> } />
    </Routes>
    </BrowserRouter>
  );
}

export default App;
