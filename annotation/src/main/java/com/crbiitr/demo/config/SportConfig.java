package com.crbiitr.demo.config;

import com.crbiitr.demo.Coach;
import com.crbiitr.demo.FortuneService;
import com.crbiitr.demo.impl.SadFortuneService;
import com.crbiitr.demo.impl.SwimCoach;
import com.sun.tracing.ProbeName;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by chetan on 11/7/20.
 */
@Configuration
@ComponentScan("com.crbiitr.demo")
@PropertySource("sport.properties")
public class SportConfig {

    //Define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // Define bean for out swim coach and inject dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

}
