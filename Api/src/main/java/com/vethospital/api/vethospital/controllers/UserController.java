package com.vethospital.api.vethospital.controllers;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;
import java.util.Random;

import com.vethospital.api.vethospital.models.User;
import com.vethospital.api.vethospital.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/api/test")
    public Object test(@RequestBody User test){
        System.out.println(test.getFirstName());

        Instant now = Instant.now();
        
        // don't forget to generate a different secret!
        byte[] secret = Base64.getDecoder().decode("o4OdCNjd8mmDN2+/nfHdIB2ZWta80foXqDx2rouL4nw=");

        String jwt = Jwts.builder()
        .claim("firstName",test.getFirstName())
        .claim("lastName",test.getLastName())
        .claim("employed", test.isEmployed())
        .setIssuedAt(Date.from(now))
        .setExpiration(Date.from(now.minus(1, ChronoUnit.MINUTES)))
        .signWith(Keys.hmacShaKeyFor(secret))
        .compact();

System.out.println(jwt);
        return jwt;
    }

}
