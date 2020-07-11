package com.crbiitr.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chetan on 10/7/20.
 */
public class AnnotationBeanScopeApp {
    public static void main(String[] args) {

        //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from spring container
        Coach theCoach = context.getBean("theTennisCoach",Coach.class);
        Coach alphaCoach = context.getBean("theTennisCoach",Coach.class);

        System.out.println("Both objects are pointing to the same location: " + (theCoach==alphaCoach));

        System.out.println("Memory location for theCoach: "+ theCoach);
        System.out.println("Memory location for alphaCoach: "+ alphaCoach);

        context.close();

    }
}
