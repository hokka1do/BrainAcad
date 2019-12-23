package com.brainacad.course.course.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "receipt_ingridients")
public class ReceiptIngridients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Ingridient ingridient;

    private int count;
    private UnitEnum unit;
}
