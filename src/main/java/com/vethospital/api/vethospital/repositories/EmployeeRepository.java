package com.vethospital.api.vethospital.repositories;

import java.util.List;
import com.vethospital.api.vethospital.models.Employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
    List<Employee> findAll();     
}
