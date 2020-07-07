package com.crbiitr.beanLifeCycleDemo;

import com.crbiitr.demo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chetan on 7/7/20.
 */
public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        context.close();
    }
}
