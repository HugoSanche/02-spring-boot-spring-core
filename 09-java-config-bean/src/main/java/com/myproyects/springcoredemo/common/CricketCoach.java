package com.myproyects.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach {
    public CricketCoach(){
        System.out.println("In constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Do exercise for 30 minutes.xd!!";
    }
}
