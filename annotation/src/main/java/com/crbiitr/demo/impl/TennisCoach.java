package com.crbiitr.demo.impl;

import com.crbiitr.demo.Coach;
import com.crbiitr.demo.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by chetan on 7/7/20.
 */
@Component("theTennisCoach")
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

    @Override
    public String getDailyWorkout() {
        return "Practice very fast";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
