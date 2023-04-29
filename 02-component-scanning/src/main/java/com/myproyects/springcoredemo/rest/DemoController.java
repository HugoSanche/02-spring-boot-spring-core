package com.myproyects.springcoredemo.rest;

import com.myproyects.springcoredemo.common.CricketCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class DemoController {//constructor injection
    //define private field for the dependency
    private CricketCoach myCoach;

    //define a constructor for dependency injection
    @Autowired
    public DemoController(CricketCoach theCoach){
        myCoach=theCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
