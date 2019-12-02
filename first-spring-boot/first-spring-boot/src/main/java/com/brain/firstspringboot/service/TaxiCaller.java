package com.brain.firstspringboot.service;

import com.brain.firstspringboot.model.Taxi;
import com.brain.firstspringboot.repository.TaxiRepository;
import org.springframework.stereotype.Service;

/**
 * Created by 1111 on 20.11.2019.
 */
@Service

public class TaxiCaller {

    private final TaxiRepository taxiRepository;

    public TaxiCaller(TaxiRepository taxiRepository) {
        this.taxiRepository = taxiRepository;
    }

    public void call(String person) {
        Taxi freeCar = taxiRepository.getFreeTaxi();
        System.out.println("Call taxi for " + person);
        System.out.println("Car:" + freeCar);
    }
}
