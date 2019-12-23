package com.brain.firstspringboot;

import com.brain.firstspringboot.component.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class FirstSpringBootApplication {

    private final Person person;
    private final ApplicationContext applicationContext;

    public FirstSpringBootApplication(Person person, ApplicationContext applicationContext) {
        this.person = person;
        this.applicationContext = applicationContext;
    }

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringBootApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void onRun() {
        person.goTaxi();
    }

}
