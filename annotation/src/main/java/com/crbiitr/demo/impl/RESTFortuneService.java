package com.crbiitr.demo.impl;

import com.crbiitr.demo.FortuneService;
import org.springframework.stereotype.Component;

/**
 * Created by chetan on 5/7/20.
 */
@Component
public class RESTFortuneService implements FortuneService {
    public RESTFortuneService() {
        System.out.println("Inside RESTFortuneService no-args constructor ====> ");
    }

    @Override
    public String getFortune() {
        return "RESTFortuneService";
    }
}
