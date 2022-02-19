package com.vethospital.api.vethospital.service;

import java.util.List;

import com.vethospital.api.vethospital.models.Employee;
import com.vethospital.api.vethospital.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepo;

    public List<Employee> allUsers(){
        return employeeRepo.findAll();
    }
}
