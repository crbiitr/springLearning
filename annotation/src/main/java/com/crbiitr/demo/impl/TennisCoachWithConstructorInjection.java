package com.crbiitr.demo.impl;

import com.crbiitr.demo.Coach;
import com.crbiitr.demo.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by chetan on 7/7/20.
 */
@Component("theTennisCoachWithConstructorInjection")
public class TennisCoachWithConstructorInjection implements Coach {

    // Define a private field for the dependency
     private FortuneService fortuneService;

    public TennisCoachWithConstructorInjection() {
        System.out.println("Inside TennisCoachWithConstructorInjection no-args constructor ====> ");
    }

    // Constructor Injection, Define a constructor for the dependency injection
    @Autowired
    public TennisCoachWithConstructorInjection(@Qualifier("happyFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
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
