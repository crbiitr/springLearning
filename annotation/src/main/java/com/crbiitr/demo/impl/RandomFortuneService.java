package com.crbiitr.demo.impl;

import com.crbiitr.demo.FortuneService;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by chetan on 5/7/20.
 */
@Component
public class RandomFortuneService implements FortuneService {

    private String[] data= {
            "Don't leave your true friend.",
            "Help others.",
            "Don't waste money."
    };
    private Random random = new Random();
    public RandomFortuneService() {
        System.out.println("Inside RandomFortuneService no-args constructor ====> ");
    }

    @Override
    public String getFortune() {
        return data[random.nextInt(data.length)];
    }
}
