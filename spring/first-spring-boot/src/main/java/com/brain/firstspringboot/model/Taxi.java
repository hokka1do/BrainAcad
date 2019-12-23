package com.brain.firstspringboot.model;

import java.time.DayOfWeek;

/**
 * Created by 1111 on 20.11.2019.
 */
public class Taxi {
    private String car;
    private String carNumber;
    private String driverNumber;
    private DayOfWeek restDay;

    public Taxi(String car, String carNumber, String driverNumber, DayOfWeek restday) {
        this.car = car;
        this.carNumber = carNumber;
        this.driverNumber = driverNumber;
        this.restDay = restday;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getDriverNumber() {
        return driverNumber;
    }

    public void setDriverNumber(String driverNumber) {
        this.driverNumber = driverNumber;
    }

    public DayOfWeek getRestDay() {
        return restDay;
    }

    public void setRestDay(DayOfWeek restDay) {
        this.restDay = restDay;
    }
}
