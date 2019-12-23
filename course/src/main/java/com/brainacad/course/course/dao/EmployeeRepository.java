package com.brainacad.course.course.dao;

import com.brainacad.course.course.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    Optional<Employee> getEmployeeByName(String name);

    Optional<Employee> getEmployeeByPhoneNumber(String phoneNumber);

}
