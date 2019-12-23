package com.brainacad.zp.ua.courseProject.dao;


import com.brainacad.zp.ua.courseProject.model.Employee;
import com.brainacad.zp.ua.courseProject.model.Order;
import org.springframework.data.repository.CrudRepository;

import java.time.Year;
import java.util.Optional;

public interface OrderRepository extends CrudRepository<Order, Long> {

    Optional<Order> getOrdersByEmployee(Employee employee);

    Optional<Order> getOrdersByCreationDate(Year creationDate);

}
