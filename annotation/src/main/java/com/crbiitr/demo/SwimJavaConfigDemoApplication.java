package com.crbiitr.demo;

import com.crbiitr.demo.config.SportConfig;
import com.crbiitr.demo.impl.SwimCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class SwimJavaConfigDemoApplication {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Read spring config using java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // Get the bean from the spring context
        // NOTE: name of bean should be here as function name defined in sportConfig class
        SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);

        // Call a method
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println("Email: " + theCoach.getEmail());
        System.out.println("Team: " + theCoach.getTeam());


        // Close the context
        context.close();
    }
}
