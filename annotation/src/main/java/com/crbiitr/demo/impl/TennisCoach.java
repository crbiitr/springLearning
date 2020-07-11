package com.crbiitr.demo.impl;

import com.crbiitr.demo.Coach;
import com.crbiitr.demo.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by chetan on 7/7/20.
 */
@Component("theTennisCoach")
//@Scope("prototype")
public class TennisCoach implements Coach {

    // Define a private field for the dependency
    // private FortuneService fortuneService;

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("Inside TennisCoach no-args constructor ====> ");
    }

    // Setter Injection
    /*
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside TennisCoach::setFortuneService, Setter Injection ====> ");
        this.fortuneService = fortuneService;
    }
*/
    // Constructor Injection, Define a constructor for the dependency injection
   /*
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */


    // Method Injection
   /*
    @Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        System.out.println("Inside TennisCoach::doSomeCrazyStuff, Setter Injection ====> ");
        this.fortuneService = fortuneService;
    }
*/

   // define my init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("Inside TennisCoach::doMyStartupStuff ==>");
    }

    // define my destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("Inside TennisCoach::doMyCleanupStuff ==>");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice very fast";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
