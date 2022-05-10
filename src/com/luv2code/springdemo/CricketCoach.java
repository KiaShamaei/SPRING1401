package com.luv2code.springdemo;

import com.luv2code.springdemo.service.FortuneService;


public class CricketCoach implements Coach {
    FortuneService fortuneService;
//creat setter method
    public void setFortuneService(FortuneService theFortuneService) {
        System.out.println("cricketCoachSetter");
        this.fortuneService = theFortuneService;
    }
    //create no-arg constructor
    public CricketCoach() {
        System.out.println("cricketCoachConstructor");
    }

    @Override
    public String getFortuneService() {
        return null;
    }

    @Override
    public String getDailyWorkout() {
        return "this is with setter injection"  + fortuneService.getDailyFortune();
    }

}
