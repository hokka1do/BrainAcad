package com.brain.firstspringboot.repository;

import com.brain.firstspringboot.model.Taxi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by 1111 on 20.11.2019.
 */
@Repository
public class TaxiRepository {
    @Autowired
    private List<Taxi> taxiList;

    public Taxi getFreeTaxi() {
        return taxiList.stream().
                filter(taxi -> !taxi.getRestDay().equals(LocalDate.now().getDayOfWeek())).findAny().
                orElseThrow(RuntimeException::new);
    }
}