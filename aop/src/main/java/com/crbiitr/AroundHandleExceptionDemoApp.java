package com.crbiitr;

import com.crbiitr.config.DemoConfig;
import com.crbiitr.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class AroundHandleExceptionDemoApp {
  private static Logger LOGGER = Logger.getLogger(AroundHandleExceptionDemoApp.class.getName());

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(DemoConfig.class);
    TrafficFortuneService theFortuneService =
        context.getBean("trafficFortuneService", TrafficFortuneService.class);

    LOGGER.info("\nMain Program: AroundDemoApp");
    LOGGER.info("Calling getFortune");
    boolean tripWire = true;
    String data = theFortuneService.getFortune(tripWire);
    LOGGER.info("\nMy fortune is: " + data);
    LOGGER.info("Finished");

    context.close();
  }
}
