package com.crbiitr;

import com.crbiitr.config.DemoConfig;
import com.crbiitr.dao.AccountDAO;
import com.crbiitr.dao.MembershipDAO;
import com.crbiitr.model.Account;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {
  public static void main(String[] args) {
    // read spring config java class
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(DemoConfig.class);
    // get the bean from spring container
    AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
    // get membership bean from spring container
    MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

    theAccountDAO.addAccount();

    Account account = new Account("John", "B1");
    theAccountDAO.addAccount(account);

    // call the business method
    Account myAccount = new Account("Karan", "B2");
    theAccountDAO.addAccount(myAccount, true);
    theAccountDAO.doWork();

    // call the accountdao getter/setter methods
    theAccountDAO.setName("foobar");
    theAccountDAO.setServiceCode("silver");

    String name = theAccountDAO.getName();
    String code = theAccountDAO.getServiceCode();

    // call the membership business method
    theMembershipDAO.addSillyMember();
    theMembershipDAO.goToSleep();

    // close the context
    context.close();
  }
}
