package com.crbiitr.demo;

/**
 * Created by chetan on 5/7/20.
 */
public class CricketCoach implements Coach {

    private String emailAddress;
    private String team;

    public void setEmailAddress(String emailAddress) {
        System.out.println("In CricketCoach:setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("In CricketCoach:setTeam");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    //Define a private field for the dependency
    private FortuneService fortuneService;

    // Create no-args constructor
    public CricketCoach() {
        System.out.println("In CricketCoach: No-args constructor");
    }


    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Daily practice batting for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
