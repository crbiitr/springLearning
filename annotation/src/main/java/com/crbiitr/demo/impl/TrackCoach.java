package com.crbiitr.demo.impl;

import com.crbiitr.demo.Coach;
import com.crbiitr.demo.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by chetan on 4/7/20.
 */
@Component
public class TrackCoach implements Coach {
    //Define a private field for the dependency
    private FortuneService fortuneService;

    // Define a constructor for the dependency injection
    @Autowired
    public TrackCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
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
