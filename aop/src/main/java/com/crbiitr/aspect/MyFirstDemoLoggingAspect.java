package com.crbiitr.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyFirstDemoLoggingAspect {

  /*
      @Before("execution(public void addAccount())")
      public void beforeAddAccountAdvice() {
          System.out.println("\n=====>>> Executing @Before advice on addAccount()");
      }

      @Before("execution(public void add*())")
      public void beforeAddAccountAdvice2() {
          System.out.println("\n=====>>> Executing @Before advice on public void add*()");
      }

      @Before("execution(void add*())")
      public void beforeAddAccountAdvice3() {
          System.out.println("\n=====>>> Executing @Before advice on void add*()");
      }

      @Before("execution(* add*(com.crbiitr.model.Account))")
      public void beforeAddAccountAdvice4() {
          System.out.println("\n=====>>> Executing @Before advice on * add*(com.crbiitr.dao.AccountDAO))");
      }

      @Before("execution(* add*(com.crbiitr.model.Account, ..))")
      public void beforeAddAccountAdvice5() {
          System.out.println("\n=====>>> Executing @Before advice on * add*(com.crbiitr.dao.AccountDAO, ..))");
      }

      @Before("execution(* add*(..))")
      public void beforeAddAccountAdvice6() {
          System.out.println("\n=====>>> Executing @Before advice on * add*(..))");
      }

      @Pointcut("execution(* com.crbiitr.dao.*.*(..))")
      private void forDaoPackage() {
      }

      @Before("forDaoPackage()")
      public void beforeAddAccountAdvice7() {
          System.out.println("\n=====>>> Executing @Before advice on method by using forDaoPackage()");
      }

      @Before("forDaoPackage()")
      public void performApiAnalytics() {
          System.out.println("\n=====>>> Performing API analytics");
      }
  */

}
