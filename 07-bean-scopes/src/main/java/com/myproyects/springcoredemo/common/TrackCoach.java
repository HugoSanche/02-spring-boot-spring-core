package com.myproyects.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
//@Lazy //By default Spring start all class buy if you put @Lazy this class not start by default
public class TrackCoach implements Coach{
    public TrackCoach(){
        System.out.println("In constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run 10 kilometers";
    }
}
