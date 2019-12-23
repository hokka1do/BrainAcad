package com.brainacad.zp.ua.courseProject.dao;

import com.brainacad.zp.ua.courseProject.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

        Optional<Employee> getEmployeeByName(String name);

    Optional<Employee> getEmployeeByPhoneNumber(String phoneNumber);

}
