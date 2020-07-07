package com.crbiitr.beanScopeDemo;

import com.crbiitr.demo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chetan on 7/7/20.
 */
public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // Check if they are the same
        boolean result = (theCoach == alphaCoach);
        System.out.println("\nIs same memory location: "+result);

        System.out.println("\nMemory location for theCoach: "+ theCoach);
        System.out.println("\nMemory location for alphaCoach: "+ alphaCoach);


    }
}
