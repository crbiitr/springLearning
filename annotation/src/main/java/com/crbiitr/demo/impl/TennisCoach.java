package com.crbiitr.demo.impl;

import com.crbiitr.demo.Coach;
import org.springframework.stereotype.Component;

/**
 * Created by chetan on 7/7/20.
 */
@Component("theTennisCoach")
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice very fast";
    }
}
