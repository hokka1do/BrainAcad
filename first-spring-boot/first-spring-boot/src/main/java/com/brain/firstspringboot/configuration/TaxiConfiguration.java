package com.brain.firstspringboot.configuration;

import com.brain.firstspringboot.model.Taxi;
import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.util.List;

/**
 * Created by 1111 on 20.11.2019.
 */
@Configuration
public class TaxiConfiguration {

    @Bean
    public List<Taxi> taxiList() {
        Taxi taxi1 = new Taxi("Ferrari", "32ref", "Tolya", DayOfWeek.SATURDAY);
        Taxi taxi2 = new Taxi("GAZ", "32rsdacef", "Ganzolya", DayOfWeek.SATURDAY);
        Taxi taxi3 = new Taxi("UAZ", "asd3ef", "Dodya", DayOfWeek.WEDNESDAY);
        return Lists.newArrayList(taxi1,taxi2,taxi3);
    }
}
