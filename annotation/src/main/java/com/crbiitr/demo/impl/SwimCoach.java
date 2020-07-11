package com.crbiitr.demo.impl;

import com.crbiitr.demo.Coach;
import com.crbiitr.demo.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by chetan on 7/7/20.
 */
public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${email}")
    private String email;

    @Value("${team}")
    private String team;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public SwimCoach() {
        System.out.println("Inside SwimCoach no-args constructor ====> ");
    }

    // define my init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("Inside SwimCoach::doMyStartupStuff ==>");
    }

    // define my destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("Inside SwimCoach::doMyCleanupStuff ==>");
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 10K daily";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
