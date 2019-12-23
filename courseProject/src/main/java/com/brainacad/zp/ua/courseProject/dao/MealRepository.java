package com.brainacad.zp.ua.courseProject.dao;

import com.brainacad.zp.ua.courseProject.model.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MealRepository extends CrudRepository<Meal, Long> {


}
