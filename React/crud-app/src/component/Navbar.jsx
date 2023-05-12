import React from 'react';
import { Outlet, Link } from "react-router-dom";
import './Navbar.css'
class Navbar extends React.Component{
    render() {
    return (
    <>
      <nav class="navbar">
        <span class="center">
            <p><b>REACT CRUD APP</b></p>
        </span>
      </nav>

      <Outlet />

    </>     
    ) 
    }
}

export default Navbar;