package com.brainacad.zp.ua.courseProject.service.impl;


import com.brainacad.zp.ua.courseProject.dao.MealRepository;
import com.brainacad.zp.ua.courseProject.model.Meal;
import com.brainacad.zp.ua.courseProject.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MealServiceImpl implements MealService {

    @Autowired
    private MealRepository mealRepository;

    @Override
    public void addMeal(Meal meal) {
        this.mealRepository.save(meal);
    }

    @Override
    public void updateMeal(Meal meal) {
        this.mealRepository.save(meal);
    }

    @Override
    public void removeMeal(Long id) {
        mealRepository.deleteById(id);
    }

    @Override
    public Optional<Meal> getMealById(Long id) {
        return mealRepository.findById(id);
    }

    @Override
    public List<Meal> listMeals() {
        return (List<Meal>) mealRepository.findAll();
    }


}
