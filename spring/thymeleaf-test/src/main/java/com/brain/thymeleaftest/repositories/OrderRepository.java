package com.brain.thymeleaftest.repositories;

import com.brain.thymeleaftest.entities.Order;
import org.springframework.data.repository.CrudRepository;

import java.time.Year;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findOrderByCreationDate(Year year);
}
