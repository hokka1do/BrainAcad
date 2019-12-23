package com.brainacad.course.course.dao;

import com.brainacad.course.course.model.Meal;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MealRepository extends CrudRepository<Meal, Long> {

    @Query("select m from meal m where m.name = :name")
    Meal findByName(@Param("name") String name);

}
