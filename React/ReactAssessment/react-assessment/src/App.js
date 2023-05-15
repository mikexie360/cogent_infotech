import logo from './logo.svg';
import './App.css';
import {Routes, Route, BrowserRouter} from "react-router-dom";
import Home from "./components/Home";

function App() {
  return (
    <BrowserRouter class="routes-container">
    <Routes>
      <Route path="/" element={ <Home /> } />
    </Routes>
    </BrowserRouter>
  );
}

export default App;
