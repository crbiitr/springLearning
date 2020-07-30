package com.crbiitr;

import com.crbiitr.config.DemoConfig;
import com.crbiitr.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class AroundMainDemoApp {
  private static Logger LOGGER = Logger.getLogger(AroundMainDemoApp.class.getName());

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(DemoConfig.class);
    TrafficFortuneService theFortuneService =
        context.getBean("trafficFortuneService", TrafficFortuneService.class);

    LOGGER.info("\nMain Program: AroundDemoApp");
    LOGGER.info("Calling getFortune");
    String data = theFortuneService.getFortune();
    LOGGER.info("\nMy fortune is: " + data);
    LOGGER.info("Finished");

    // close the context
    context.close();
  }
}
