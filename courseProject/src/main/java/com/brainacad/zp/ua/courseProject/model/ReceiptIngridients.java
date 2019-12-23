package com.brainacad.zp.ua.courseProject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table
public class ReceiptIngridients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private int count;
    private UnitEnum unit;
}
