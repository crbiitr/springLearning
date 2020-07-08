package com.crbiitr.demo.impl;

import com.crbiitr.demo.Coach;
import com.crbiitr.demo.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by chetan on 7/7/20.
 */
@Component("theTennisCoachWithSetterInjection")
public class TennisCoachWithSetterInjection implements Coach {

    // Define a private field for the dependency
     private FortuneService fortuneService;

    public TennisCoachWithSetterInjection() {
        System.out.println("Inside TennisCoachWithSetterInjection no-args constructor ====> ");
    }

    // Setter Injection
    @Autowired
    public void setFortuneService(@Qualifier("happyFortuneService") FortuneService fortuneService) {
        System.out.println("Inside TennisCoachWithSetterInjection::setFortuneService, Setter Injection ====> ");
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
