package com.myproyects.springcoredemo.rest;

import com.myproyects.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//NOTA.- Spring injection types
//A) Recommended by the spring.io development io
// 1.-Constructor injection. Required dependencies
// 2.-Setter injection. Optional dependencies

//B)Not recommend by the spring.io develop team
// 1.-Field injection

@RestController
public class DemoController {//constructor injection
    //define private field for the dependency
    private Coach myCoach;

    //define a setter injection dependencies
    @Autowired
  public void setCoach(Coach thecoach){
        myCoach=thecoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
