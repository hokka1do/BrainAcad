package com.brainacad.course.course.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.Year;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "ingridient_type")
    private IngridientTypeEnum ingridientType;

    @Column(name="creation_date",nullable = false)
    private Year creationDate;

    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER)
    List<OrderItem> orderItems;
}
