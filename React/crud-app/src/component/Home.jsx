import React from 'react';
import { useState, useEffect } from 'react';
import ReactDOM from "react-dom/client";

// import { Link } from 'react-router';

import Search from "./Search";
import "./Home.css";
class Home extends React.Component{

  showNewUser = false;
  showDeleteUser = false;
  data = [];
  constructor(props){
    super(props);
    this.state={
        count:0,
        input:0,
        price:100,
        showNewUser: false,
        showUpdateUser: [],
        inputs: [],
        formData: {},
        hello: "world!",
        query: "",
    };
    this.newUser = this.newUser.bind(this);
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }
  async componentDidMount(){
    const response = await fetch("http://localhost:8080/getallusers");
    this.data = await response.json();
    this.setState({totalReactPackage: this.data.total});
    console.log(this.data);
    for(let i=0;i< this.data; i++){
      this.state.showUpdateUser.append(false);
    }

  }
  newUser(){
    if (this.state.showNewUser == true){
      this.state.showNewUser = false;
    } else {
      this.state.showNewUser = true;
    }
    console.log(this.state.showNewUser);
    this.forceUpdate();
    return 1;
  }
  updateUser(id){
    if (this.state.showUpdateUser[id] == true){
      this.state.showUpdateUser[id] = false;
    } else {
      this.state.showUpdateUser[id] = true;
    }
    console.log(this.state.showUpdateUser[id]);
    this.forceUpdate();
    return 1;
  }
  deleteUser(id){
    var myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");
    
    var requestOptions = {
      method: 'DELETE',
      headers: myHeaders,
      redirect: 'follow'
    };
    
    fetch(`http://localhost:8080/deleteuser/${id}`, requestOptions)
      .then(response => response.text())
      .then(result => console.log(result))
      .catch(error => console.log('error', error));
    window.location.reload();  

    return 1;
  }


  handleChange = (event) => {
    const name = event.target.name;
    const value = event.target.value;
    console.log(name);
    if(name == "firstName"){
      this.setState({firstName: value})
    }
    if(name == "lastName"){
      this.setState({lastName: value})
    }
    if(name == "email"){
      this.setState({email: value})
    }
    if(name == "picture"){
      this.setState({picture: value})
    }
    if(name == "query"){
      this.setState({query: value});
      console.log(this.state.query.toLowerCase());
    }
    this.setState({name: value})
  }

  handleSubmit = (event) => {
    event.preventDefault();
    console.log(this.state.firstName);
    console.log(this.state.lastName);
    console.log(this.state.email);
    console.log(this.state.picture);
    this.state.formData = {
      firstName: this.state.firstName,
      lastName: this.state.lastName,
      email: this.state.email,
      picture: this.state.picture
    }
    
    var myHeaders = new Headers();
myHeaders.append("Content-Type", "application/json");

var raw = JSON.stringify({
  "firstName": this.state.firstName,
  "lastName": this.state.lastName,
  "email": this.state.email,
  "picture": this.state.picture
});

var requestOptions = {
  method: 'POST',
  headers: myHeaders,
  body: raw,
  redirect: 'follow'
};

fetch("http://localhost:8080/adduser", requestOptions)
  .then(response => response.text())
  .then(result => console.log(result))
  .catch(error => console.log('error', error));
  window.location.reload();  
}
  handleSubmitUpdate(id){
    console.log(id);
    var myHeaders = new Headers();
myHeaders.append("Content-Type", "application/json");

var requestOptions = {
  method: 'PUT',
  headers: myHeaders,
  redirect: 'follow'
};

fetch(`http://localhost:8080/updateuser/${id}/${this.state.firstName}/${this.state.lastName}/${this.state.email}`, requestOptions)
  .then(response => response.text())
  .then(result => console.log(result))
  .catch(error => console.log('error', error));
  }
  render() {
    return (<>
      <div class="d-flex padding">
        <div class="p-2 flex-grow-1">
          <label>Search</label>
          <input type="text" name="query" value={this.state.query} onChange={this.handleChange}></input>
        </div>
        {this.state.showNewUser && 
          <form onSubmit={this.handleSubmit}>
            <label>
              First Name:
              <input type="text" name="firstName" value={this.state.firstName} onChange={this.handleChange} />
            </label>
            <label>
              Last Name:
              <input type="text" name="lastName" value={this.state.lastName} onChange={this.handleChange} />
            </label>
            <label>
              Email:
              <input type="text" name="email" value={this.state.email} onChange={this.handleChange} />
            </label>
            <label>
              Picture:
              <input type="text" name="picture" value={this.state.picture} onChange={this.handleChange} />
            </label>
            <input type="submit" value="Submit" />
          </form>
        }
        <button onClick={()=>this.newUser()} type="button" class="p-2 btn btn-primary">Create New User</button>

      </div>
      <div  class="d-flex padding">
        <table>
          <thead>
            <th>Picture</th>
            <th>FirstName</th>
            <th>LastName</th>
            <th>Email</th>
            <th>Update User</th>
            <th>Delete User</th>
          </thead>
          <tbody>
          {this.data.map(user => (
            <>
            {(((RegExp(this.state.query)).test(user.firstName.toLowerCase())) || this.state.query == "" || ((RegExp(this.state.query)).test(user.lastName.toLowerCase())) || ((RegExp(this.state.query)).test(user.email.toLowerCase()))) && 
            <tr>
              <td><img src={`${user.picture}`}></img></td>
              <td>{`${user.firstName}`}</td>
              <td>{`${user.lastName}`}</td>
              <td>{`${user.email}`}</td>
              <td>
              {this.state.showUpdateUser[user.id] && 
          <form onsubmit="return false" onSubmit={()=>this.handleSubmitUpdate(user.id)}>
            <label>
              First Name:
              <input name="firstName" value={this.state.firstName} onChange={this.handleChange} />
            </label>
            <label>
              Last Name:
              <input type="text" name="lastName" value={this.state.lastName} onChange={this.handleChange} />
            </label>
            <label>
              Email:
              <input type="text" name="email" value={this.state.email} onChange={this.handleChange} />
            </label>
            <input type="submit" value="Submit" />
          </form>
        }
                <button onClick={()=>this.updateUser(user.id)} type="button" class="p-2 btn btn-success">Update User</button></td>
                <td>
                <button onClick={()=>this.deleteUser(user.id)} type="button" class="p-2 btn btn-danger">Delete User</button></td>
            </tr>
            }
            </>
          ))}
          </tbody>
        </table>
        </div>
    </>
    );
  }
}

export default Home;