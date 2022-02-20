package com.vethospital.api.vethospital.service;

import java.util.List;

import com.vethospital.api.vethospital.models.Addresses;
import com.vethospital.api.vethospital.repositories.AddressesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressesService {
    @Autowired
    AddressesRepository addressRepo;

    public List<Addresses> allAddresses(){
        return addressRepo.findAll();
    }

}
