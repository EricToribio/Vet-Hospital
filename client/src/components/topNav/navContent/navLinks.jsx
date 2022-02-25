import React from 'react'
import LoginModal from "../../modals/loginModal/LoginModal"
export const navLinks = ({loggedInUser, setLoggedInUser}) => {
  return (
    <div>
        {
            loggedInUser === "no user" ? 
            <button>
                
            <LoginModal loggedInUser={loggedInUser} setLoggedInUser={setLoggedInUser}/> 
            </button> :
            <div></div>
        }
    </div>
  )
}
