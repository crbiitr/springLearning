package com.crbiitr.demo.impl;

import com.crbiitr.demo.FortuneService;
import org.springframework.stereotype.Component;

/**
 * Created by chetan on 5/7/20.
 */
@Component
public class DatabaseFortuneService implements FortuneService {
    public DatabaseFortuneService() {
        System.out.println("Inside DatabaseFortuneService no-args constructor ====> ");
    }

    @Override
    public String getFortune() {
        return "DatabaseFortuneService ";
    }
}
