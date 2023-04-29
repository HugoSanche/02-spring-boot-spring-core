package com.myproyects.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Do exercise for 30 minutes..!!";
    }
}
