package com.brainacad.course.course.service;

import com.brainacad.course.course.model.Meal;

import java.util.List;

public interface MealService {
    public void addMeal(Meal meal);
    public void updateMeal(Meal meal);
    public void removeMeal(Long id);
    public Meal getMealById(Long id);
    public List<Meal> listMeals();
}
