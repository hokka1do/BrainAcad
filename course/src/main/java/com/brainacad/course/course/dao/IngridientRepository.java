package com.brainacad.course.course.dao;

import com.brainacad.course.course.model.Ingridient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngridientRepository extends CrudRepository<Ingridient, Long> {
}
