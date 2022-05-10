package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.nio.file.attribute.AclFileAttributeView;

public class MyApp {
    public static void main(String[] args) {


        //create obj
        Coach theCoach = new TrackCoach();



        //use method of obj
        System.out.println(theCoach.getDailyWorkout());
    }
}
