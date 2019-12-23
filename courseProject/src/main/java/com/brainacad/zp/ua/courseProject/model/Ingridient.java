package com.brainacad.zp.ua.courseProject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table
public class Ingridient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "ingridient_type")
    @Enumerated(EnumType.STRING)
    private IngridientTypeEnum ingridientType;
}
