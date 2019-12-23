package com.brainacad.course.course.service;

import com.brainacad.course.course.model.Meal;

import java.util.List;
import java.util.Optional;

public interface MealService {
    void addMeal(Meal meal);
    void updateMeal(Meal meal);
    void removeMeal(Long id);
    Optional<Meal> getMealById(Long id);
    Meal getMealByName(String name);
    List<Meal> listMeals();
}