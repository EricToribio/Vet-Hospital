import React, { useEffect } from 'react'
import { useHistory } from 'react-router-dom'
import { navLinks } from './navContent/navLinks'

export const NavBar = ({loggedInUser, setLoggedInUser}) => {
    const history = useHistory()
useEffect(() => {
    loggedInUser === "no user" ? history.push('/') : console.log("Success")
},[loggedInUser])
  return (
    <div className='bg-primary h-25 w-100'>
      

    <navLinks loggedInUser={loggedInUser} setLoggedInUser={setLoggedInUser}/>
    </div>
  )
}
