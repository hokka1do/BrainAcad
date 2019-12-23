package com.brainacad.course.course.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "meal")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "mass")
    private Double mass;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    List<ReceiptIngridients> receiptIngridients;
}