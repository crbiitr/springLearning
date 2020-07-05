package com.crbiitr.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chetan on 5/7/20.
 */
public class HelloSpringApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);

        // call method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
