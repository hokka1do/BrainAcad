package com.brainacad.zp.ua.courseProject.service;


import com.brainacad.zp.ua.courseProject.model.Meal;

import java.util.List;
import java.util.Optional;

public interface MealService {
    void addMeal(Meal meal);
    void updateMeal(Meal meal);
    void removeMeal(Long id);
    Optional<Meal> getMealById(Long id);
    List<Meal> listMeals();
}