package com.crbiitr.demo.impl;

import com.crbiitr.demo.FortuneService;
import org.springframework.stereotype.Component;

/**
 * Created by chetan on 5/7/20.
 */
@Component
public class SadFortuneService implements FortuneService {
    public SadFortuneService() {
        System.out.println("Inside SadFortuneService no-args constructor ====> ");
    }

    @Override
    public String getFortune() {
        return "Today is your sad day";
    }
}
