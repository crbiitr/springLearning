package com.crbiitr.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chetan on 5/7/20.
 */
public class SetterInjectionApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from spring container
        CricketCoach cricketCoach = context.getBean("cricketCoach",CricketCoach.class);

        // call method on the bean
        System.out.println(cricketCoach.getDailyWorkout());

        // let's call our new method for fortune
        System.out.println(cricketCoach.getDailyFortune());

        // call out new methods to get the literal values
        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeam());

        // close the context
        context.close();
    }
}
