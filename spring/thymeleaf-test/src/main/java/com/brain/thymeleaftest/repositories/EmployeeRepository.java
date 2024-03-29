package com.brain.thymeleaftest.repositories;

import com.brain.thymeleaftest.entities.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

        List<Employee> findByName(String name);

        }