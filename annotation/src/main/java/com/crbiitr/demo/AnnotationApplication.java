package com.crbiitr.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class AnnotationApplication {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Read spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the bean from the spring context
        Coach tennisCoach = context.getBean("theTennisCoach",Coach.class);
        Coach trackCoach = context.getBean("trackCoach",Coach.class);

        // Call a method
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyWorkout());

        // Close the context
        context.close();
    }
}
