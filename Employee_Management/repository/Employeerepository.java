package com.example.Employee_Management.repository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.Comp.Repository.RepositoryRestResource;
import com.example.Employee_Management.model.Employee;

@RepositoryRestResource(collectionResourceRel = "employees", path = "employees")
public interface Employeerepository extends PagingAndSortingRepository<Employee, Long>{
    Employee findById(long id);
    }