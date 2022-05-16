package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from spring container
        Coach myCoach = context.getBean("myCoach" , Coach.class);
        Coach SingleCoach = context.getBean("singleTon" , Coach.class);

        CricketCoach myCricketCoach = context.getBean("myCoachCricket" , CricketCoach.class);

        //call methods on bean
        System.out.println(myCoach.getDailyWorkout());

        //call method which import with dependency injection constructor
        System.out.println(myCoach.getFortuneService());
        //call method which import with dependency injection setter
        System.out.println(myCricketCoach.getDailyWorkout());
        //inject literal
        System.out.println(myCricketCoach.getEmailAddress());


        //close the context
        context.close();
    }
}
