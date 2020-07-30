package com.crbiitr;

import com.crbiitr.config.DemoConfig;
import com.crbiitr.dao.AccountDAO;
import com.crbiitr.model.Account;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AfterReturningMainDemoApp {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(DemoConfig.class);
    AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
    List<Account> theAccounts = theAccountDAO.findAccounts();

    System.out.println("\n\nMain Program: AfterReturningDemoApp");
    System.out.println("----");
    System.out.println(theAccounts);
    System.out.println("\n");

    context.close();
  }
}
