import './App.css';
import React,{useState} from 'react';
import jwt_decode from 'jwt-decode';
import Cookies from 'js-cookie'
import {
  BrowserRouter,
  Switch,
  Route

} from 'react-router-dom'
import LoginAndRegView from './views/LoginAndRegView';
import { NavBar } from './components/topNav/NavBar';


function App() {
  const [loggedInUser, setLoggedInUser] = useState(
Cookies.get("user_id") ? jwt_decode(Cookies.get("user_id")) : "no user"
  )
  return (
    <BrowserRouter >
    <Switch>
    <NavBar loggedInUser={loggedInUser} setLoggedInUser={setLoggedInUser} >
      <Route exact path='/'>
        <LoginAndRegView loggedInUser={loggedInUser} setLoggedInUser={setLoggedInUser}>

        </LoginAndRegView>

      </Route>
      <Route exact path='/hello'>
        <LoginAndRegView loggedInUser={loggedInUser} setLoggedInUser={setLoggedInUser}>

        </LoginAndRegView>
      </Route>
    </NavBar>
    </Switch>
    </BrowserRouter>
  );
}

export default App;
