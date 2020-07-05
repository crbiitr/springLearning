package com.crbiitr.demo;

/**
 * Created by chetan on 5/7/20.
 */
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "I am your luck";
    }
}
