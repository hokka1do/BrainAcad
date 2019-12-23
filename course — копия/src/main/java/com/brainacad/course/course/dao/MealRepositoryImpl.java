package com.brainacad.course.course.dao;

import com.brainacad.course.course.model.Meal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MealRepositoryImpl implements MealRepository {
    private static final Logger logger = LoggerFactory.getLogger(MealRepositoryImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addMeal(Meal meal) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(meal);
        logger.info("Meal was added to repository. Meal details" + meal);
    }

    @Override
    public void updateMeal(Meal meal) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(meal);
        logger.info("Meal was updated. Meal details" + meal);
    }

    @Override
    public void removeMeal(Long id) {
        Session session = this.sessionFactory.getCurrentSession();
        Meal meal = (Meal) session.load(Meal.class, new Long(id));

        if (meal != null) {
            session.delete(meal);
        }
        logger.info("Meal was removed. Meal details" + meal);
    }

    @Override
    public Meal getMealById(Long id) {
        Session session = this.sessionFactory.getCurrentSession();
        Meal meal = (Meal) session.load(Meal.class, new Long(id));
        logger.info("Meal was loaded. Meal details" + meal);
        return meal;
    }

    @Override
    @SuppressWarnings("uncchecked")
    public List<Meal> listMeals() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Meal> mealList = session.createQuery("from Meal").list();
        for (Meal meal : mealList) {
            logger.info("Meal list" + meal);
        }
        return mealList;
    }
}
