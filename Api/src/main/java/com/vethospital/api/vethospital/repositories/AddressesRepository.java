package com.vethospital.api.vethospital.repositories;

import java.util.List;

import com.vethospital.api.vethospital.models.Addresses;

import org.springframework.data.repository.CrudRepository;

public interface AddressesRepository extends CrudRepository<Addresses, Long>{
    List<Addresses> findAll();
    
}
