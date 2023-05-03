package com.myproyects.springcoredemo.rest;

import com.myproyects.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    private Coach otherCoach;

    @Autowired
    //Nota.- @Qualifier("tennisCoach" first letter ins lowercase for the class TennisCoach
  public DemoController(@Qualifier("cricketCoach") Coach thecoach,@Qualifier("cricketCoach") Coach theotherCoach){
        System.out.println("In constructor: "+getClass().getSimpleName());
        myCoach=thecoach;
        otherCoach=theotherCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
    @GetMapping("/check")
    public String check(){
        return "Comparing beans mycoach==otherCoach, "+(myCoach==otherCoach);
    }
}
