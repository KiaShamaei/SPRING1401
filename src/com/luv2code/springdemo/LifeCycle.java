package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //test life cycle of bean which by default singleTon
        // Coach testBean = context.getBean("myCoach" , Coach.class);
        // Coach test2Bean = context.getBean("myCoach" , Coach.class);


        //test scope prototype bean
        Coach testBean = context.getBean("myCoachPrototype" , Coach.class);
        Coach test2Bean = context.getBean("myCoachPrototype" , Coach.class);
        boolean result = (test2Bean == testBean);
        System.out.println("test is lifeCycle is singleton:" + result);
        System.out.println("\n test Bean 1 : " + testBean);
        System.out.println("\n teat Bean 2 : "+ test2Bean);
        context.close();
        //check init and destroy method call in bean
        ClassPathXmlApplicationContext contextLifeCycleMethod = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
        Coach lifeCycleBean = contextLifeCycleMethod.getBean("myCircketCoach" , Coach.class);
        contextLifeCycleMethod.close();

    }
}
