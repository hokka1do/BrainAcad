package com.brainacad.course.course.controller;

import com.brainacad.course.course.model.Meal;
import com.brainacad.course.course.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class MealController {
    private MealService mealService;

    @Autowired(required = true)
    @Qualifier(value = "mealService")
    public void setMealService(MealService mealService) {
        this.mealService = mealService;
    }

    @RequestMapping(value = "meals", method = RequestMethod.GET)
    public String listMeals(Model model) {
        model.addAttribute("meal", new Meal());
        model.addAttribute("listMeals", this.mealService.listMeals());
        return "meals";
    }

    @RequestMapping(value = "/meals/add", method = RequestMethod.POST)
    public String addMeal(@ModelAttribute("meal") Meal meal) {
        if (meal.getId() == 0){
            this.mealService.addMeal(meal);
        }
        else {
            this.mealService.updateMeal(meal);
        }

        return "redirect:/meals";

    }
}
