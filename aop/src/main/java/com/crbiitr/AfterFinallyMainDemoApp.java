package com.crbiitr;

import com.crbiitr.config.DemoConfig;
import com.crbiitr.dao.AccountDAO;
import com.crbiitr.model.Account;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AfterFinallyMainDemoApp {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(DemoConfig.class);
    AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
    List<Account> theAccounts = null;

    try {
      boolean tripWire = false;
      theAccounts = theAccountDAO.findAccounts(tripWire);
    } catch (Exception exc) {
      System.out.println("\n\nMain Program ... caught exception: " + exc);
    }

    // display the accounts
    System.out.println("\n\nMain Program: AfterThrowingDemoApp");
    System.out.println("----");
    System.out.println(theAccounts);
    System.out.println("\n");

    context.close();
  }
}
