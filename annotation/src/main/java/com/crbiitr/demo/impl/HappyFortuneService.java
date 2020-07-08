package com.crbiitr.demo.impl;

import com.crbiitr.demo.FortuneService;
import org.springframework.stereotype.Component;

/**
 * Created by chetan on 5/7/20.
 */
@Component
public class HappyFortuneService implements FortuneService {
    public HappyFortuneService() {
        System.out.println("Inside HappyFortuneService no-args constructor ====> ");
    }

    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
