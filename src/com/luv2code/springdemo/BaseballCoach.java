package com.luv2code.springdemo;

import com.luv2code.springdemo.service.FortuneService;
import com.luv2code.springdemo.service.HappyFortuneService;

public class BaseballCoach implements Coach {
    //define field for dependency injection
    FortuneService fortuneService ;

    public BaseballCoach(FortuneService happyFortuneService) {
        this.fortuneService = happyFortuneService;
    }


    @Override
    public String getDailyWorkout() {
            return "Spend 30 min on batting practice";
    }

    @Override
    public String getFortuneService(){
        return  fortuneService.getDailyFortune() ;
    }
}
