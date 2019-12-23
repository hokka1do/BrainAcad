package com.brain.thymeleaftest.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.Year;

@Data
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name="creation_date",nullable = false)
    private Year creationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
