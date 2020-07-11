package com.crbiitr.demo;

import com.crbiitr.demo.config.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class JavaConfigDemoApplication {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Read spring config using java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // Get the bean from the spring context
        Coach tennisCoach = context.getBean("theTennisCoach",Coach.class);
        Coach trackCoach = context.getBean("trackCoach",Coach.class);

        // Call a method
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyWorkout());

        System.out.println(tennisCoach.getDailyFortune());
        System.out.println(trackCoach.getDailyFortune());

        // Close the context
        context.close();
    }
}
