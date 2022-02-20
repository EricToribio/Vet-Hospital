package com.vethospital.api.vethospital.service;


    
import java.util.List;

import com.vethospital.api.vethospital.models.User;
import com.vethospital.api.vethospital.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepo;

    public List<User> allUsers(){
        return userRepo.findAll();
    }
}


