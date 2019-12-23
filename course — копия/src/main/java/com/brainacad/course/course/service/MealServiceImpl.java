package com.brainacad.course.course.service;

import com.brainacad.course.course.dao.MealRepository;
import com.brainacad.course.course.model.Meal;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MealServiceImpl implements MealService {
    private MealRepository mealRepository;

    @Override
    @Transactional
    public void addMeal(Meal meal) {
        this.mealRepository.addMeal(meal);
    }

    @Override
    @Transactional
    public void updateMeal(Meal meal) {
        this.mealRepository.updateMeal(meal);

    }

    @Override
    @Transactional
    public void removeMeal(Long id) {
        this.mealRepository.removeMeal(id);
    }

    @Override
    @Transactional
    public Meal getMealById(Long id) {
        return this.mealRepository.getMealById(id);
    }

    @Override
    @Transactional
    public List<Meal> listMeals() {
        return this.mealRepository.listMeals();
    }
}
