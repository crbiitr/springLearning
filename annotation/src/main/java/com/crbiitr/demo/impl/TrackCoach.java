package com.crbiitr.demo.impl;

import com.crbiitr.demo.Coach;
import org.springframework.stereotype.Component;

/**
 * Created by chetan on 4/7/20.
 */
@Component
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "TrackCoach:: Run faster for 5 minutes";
    }
}
