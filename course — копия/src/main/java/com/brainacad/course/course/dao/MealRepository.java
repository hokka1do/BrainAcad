package com.brainacad.course.course.dao;

import com.brainacad.course.course.model.Meal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MealRepository extends CrudRepository {
    public void addMeal(Meal meal);
    public void updateMeal(Meal meal);
    public void removeMeal(Long id);
    public Meal getMealById(Long id);
    public List<Meal> listMeals();
}
