package com.crbiitr.demo;

/**
 * Created by chetan on 4/7/20.
 */
public class BaseballCoach implements Coach {
    public BaseballCoach() {
    }
    //Define a private field for the dependency
    private FortuneService fortuneService;

    // Define a constructor for the dependency injection
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run faster for 5 mins";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
