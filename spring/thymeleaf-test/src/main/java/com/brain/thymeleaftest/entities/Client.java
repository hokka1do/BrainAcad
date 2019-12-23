package com.brain.thymeleaftest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author Vladimir Bratchikov
 */
@Entity
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Client's name is required")
    private String name;

    @NotBlank(message = "Client's phone  is required")
    private String phone;
}
