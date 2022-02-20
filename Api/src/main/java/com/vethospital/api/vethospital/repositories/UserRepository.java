package com.vethospital.api.vethospital.repositories;

import java.util.List;

import com.vethospital.api.vethospital.models.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findAll();  
}
