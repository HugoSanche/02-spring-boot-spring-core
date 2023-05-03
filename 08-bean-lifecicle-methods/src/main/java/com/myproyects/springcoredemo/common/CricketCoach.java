package com.myproyects.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach {
    public CricketCoach(){
        System.out.println("In constructor: "+getClass().getSimpleName());
    }
    //Define our init method
    @PostConstruct
    public void myStartupStuff(){
        System.out.println("In myStartupStuff() "+getClass().getSimpleName());
    }
    //Define our destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff() "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Do exercise for 30 minutes.xd!!";
    }
}
