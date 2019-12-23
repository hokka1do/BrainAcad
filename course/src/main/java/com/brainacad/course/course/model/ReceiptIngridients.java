package com.brainacad.course.course.model;

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

}
