package com.crbiitr.demo;

/**
 * Created by chetan on 4/7/20.
 */
public class MyApp {
    public static void main(String[] args) {
        //create the object
        //Coach coach = new BaseballCoach();
        Coach coach = new TrackCoach();

        //user the object
        System.out.println(coach.getDailyWorkout());
    }
}
