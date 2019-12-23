package com.brainacad.course.course.dao;

import com.brainacad.course.course.model.Employee;
import com.brainacad.course.course.model.Order;
import org.springframework.data.repository.CrudRepository;

import java.time.Year;
import java.util.Optional;

public interface OrderRepository extends CrudRepository<Order, Long> {

    Optional<Order> getOrdersByEmployee(Employee employee);

    Optional<Order> getOrdersByCreationDate(Year creationDate);

}
