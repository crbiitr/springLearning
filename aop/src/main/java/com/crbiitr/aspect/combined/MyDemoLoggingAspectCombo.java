package com.crbiitr.aspect.combined;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspectCombo {
  /*
  @Pointcut("execution(* com.crbiitr.dao.*.*(..))")
  private void forDaoPackage() {
  }

  // create pointcut for getter methods
  @Pointcut("execution(* com.crbiitr.dao.*.get*(..))")
  private void getter() {}

  // create pointcut for setter methods
  @Pointcut("execution(* com.crbiitr.dao.*.set*(..))")
  private void setter() {}

  // create pointcut: include package ... exclude getter/setter
  @Pointcut("forDaoPackage() && !(getter() || setter())")
  private void forDaoPackageNoGetterSetter() {}

  @Before("forDaoPackageNoGetterSetter()")
  public void beforeAddAccountAdviceWithPointcutCombo() {
      System.out.println("\n=====>>> Executing @Before advice on method");
  }

  @Before("forDaoPackageNoGetterSetter()")
  public void performApiAnalyticsWithPointcutCombo() {
      System.out.println("\n=====>>> Performing API analytics");
  }
  */
}
