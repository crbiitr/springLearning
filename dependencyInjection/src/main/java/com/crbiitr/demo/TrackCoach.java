package com.crbiitr.demo;

/**
 * Created by chetan on 4/7/20.
 */
public class TrackCoach implements Coach {
    public TrackCoach() {
    }

    //Define a private field for the dependency
    private FortuneService fortuneService;

    // Define a constructor for the dependency injection
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "TrackCoach:: Run faster for 5 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
