import React from 'react'

const LoginAndRegView = ({loggedInUser, setLoggedInUser,children}) => {
  console.log(loggedInUser)
  return (
    {children}
  )
}

export default LoginAndRegView