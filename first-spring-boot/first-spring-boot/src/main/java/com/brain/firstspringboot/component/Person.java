package com.brain.firstspringboot.component;

import com.brain.firstspringboot.service.TaxiCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Autowired
    private TaxiCaller taxiCaller;

    @Value("${user.properties.person.name")
    private String name;

    
    @Value("${user.properties.person.phone")
    private String phone;

    public void goTaxi() {
        taxiCaller.call(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public TaxiCaller getTaxiCaller() {
        return taxiCaller;
    }

    public void setTaxiCaller(TaxiCaller taxiCaller) {
        this.taxiCaller = taxiCaller;
    }
}