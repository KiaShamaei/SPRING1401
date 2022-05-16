package com.luv2code.springdemo;

import com.luv2code.springdemo.service.FortuneService;


public class CricketCoach implements Coach {

    private String emailAddress;
    private String name;
    public String getEmailAddress() {
        return emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }


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



    public void doMyStartUPStuff (){
        System.out.println("this is a init methode befor bean ");
    }
    public void destroyMethod (){
        System.out.println("this is a destroy methode befor bean ");
    }


}
