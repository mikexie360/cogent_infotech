import React from 'react';
import { useState, useEffect } from 'react';
import ReactDOM from "react-dom/client";

// import { Link } from 'react-router';

import "./Home.css";
class Home extends React.Component{

  showNewBook = false;
  showDeleteBook = false;
  data = [];
  constructor(props){
    super(props);
    this.state={
        count:0,
        input:0,
        price:100,
        showNewBook: false,
        showUpdateBook: [],
        inputs: [],
        formData: {},
        hello: "world!",
        query: "",
    };
    this.newBook = this.newBook.bind(this);
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }
  async componentDidMount(){
    const response = await fetch("http://localhost:8080/getallbooks");
    this.data = await response.json();
    this.setState({totalReactPackage: this.data.total});
    console.log(this.data);
    for(let i=0;i< this.data; i++){
      this.state.showUpdateBook.append(false);
    }

  }
  newBook(){
    if (this.state.showNewBook == true){
      this.state.showNewBook = false;
    } else {
      this.state.showNewBook = true;
    }
    console.log(this.state.showNewBook);
    this.forceUpdate();
    return 1;
  }
  updateBook(id){
    if (this.state.showUpdateBook[id] == true){
      this.state.showUpdateBook[id] = false;
    } else {
      this.state.showUpdateBook[id] = true;
    }
    console.log(this.state.showUpdateBook[id]);
    this.forceUpdate();
    return 1;
  }
  deleteBook(id){
    var myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");
    
    var requestOptions = {
      method: 'DELETE',
      headers: myHeaders,
      redirect: 'follow'
    };
    
    fetch(`http://localhost:8080/deletebook/${id}`, requestOptions)
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
    if(name == "title"){
      this.setState({title: value})
    }
    if(name == "price"){
      this.setState({price: value})
    }
    if(name == "query"){
      this.setState({query: value});
      console.log(this.state.query.toLowerCase());
    }
    this.setState({name: value})
  }

  handleSubmit = (event) => {
    event.preventDefault();
    console.log(this.state.title);
    console.log(this.state.price);
    this.state.formData = {
      title: this.state.title,
      price: this.state.price
    }
    
    var myHeaders = new Headers();
myHeaders.append("Content-Type", "application/json");

var raw = JSON.stringify({
  "title": this.state.title,
  "price": this.state.price
});

var requestOptions = {
  method: 'POST',
  headers: myHeaders,
  body: raw,
  redirect: 'follow'
};

fetch("http://localhost:8080/addbook", requestOptions)
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

fetch(`http://localhost:8080/updatebook/${id}/${this.state.title}/${this.state.price}`, requestOptions)
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
        {this.state.showNewBook && 
          <form onSubmit={this.handleSubmit}>
            <label>
              Title:
              <input type="text" name="title" value={this.state.title} onChange={this.handleChange} />
            </label>
            <label>
              Price:
              <input name="price" value={this.state.price} onChange={this.handleChange} />
            </label>
            <input type="submit" value="Submit" />
          </form>
        }
        <button onClick={()=>this.newBook()} type="button" class="p-2 btn btn-primary">Create New Book</button>

      </div>
      <div  class="d-flex padding">
        <table class="sig">
          <thead>
            <th>Id</th>
            <th>Title</th>
            <th>Price</th>
            <th>Update Book</th>
            <th>Delete Book</th>
          </thead>
          <tbody>
          {this.data.map(book => (
            <>
            {(((RegExp(this.state.query)).test(book.title.toLowerCase())) || this.state.query == "") && 
            <tr >
              <td>{`${book.id}`}</td>
              <td>{`${book.title}`}</td>
              <td>{`${book.price}`}</td>
              <td>
              {this.state.showUpdateBook[book.id] && 
          <form onsubmit="return false" onSubmit={()=>this.handleSubmitUpdate(book.id)}>
            <label>
              Book Title:
              <input name="title" value={this.state.title} onChange={this.handleChange} />
            </label>
            <label>
              Book Price:
              <input name="price" value={this.state.price} onChange={this.handleChange} />
            </label>
            <input type="submit" value="Submit" />
          </form>
        }
                <button onClick={()=>this.updateBook(book.id)} type="button" class="p-2 btn btn-success">Update Book</button></td>
                <td>
                <button onClick={()=>this.deleteBook(book.id)} type="button" class="p-2 btn btn-danger">Delete Book</button></td>
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