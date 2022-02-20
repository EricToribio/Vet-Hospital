import logo from './logo.svg';
import './App.css';
import axios from 'axios';
import React,{useEffect,useState} from 'react';
import jwt_decode from 'jwt-decode';

function App() {
  const [jwt,setJwt] = useState()
  useEffect(async () => {
   await axios.post("http://localhost:8080/api/test", {
     firstName : "Eric",
     lastName : "Toribio",
     employed : false
   })
   .then(res => {
     console.log(res.data)
    console.log(jwt_decode(res.data))
   })
    
  }, []);
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
