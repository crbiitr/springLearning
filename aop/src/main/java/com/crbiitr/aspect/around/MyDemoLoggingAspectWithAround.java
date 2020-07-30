package com.crbiitr.aspect.around;

import com.crbiitr.model.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;

@Aspect
@Component
@Order(14)
public class MyDemoLoggingAspectWithAround {
  private Logger LOGGER = Logger.getLogger(getClass().getName());

  @Around("execution(* com.crbiitr.service.*.getFortune(..))")
  public Object aroundGetFortune(ProceedingJoinPoint theProceedingJoinPoint) throws Throwable {
    // print out method we are advising on
    String method = theProceedingJoinPoint.getSignature().toShortString();
    LOGGER.info("\n=====>>> Executing @Around on method: " + method);

    long begin = System.currentTimeMillis();
    Object result = null;
    try {
      result = theProceedingJoinPoint.proceed();
    } catch (Exception e) {
      LOGGER.warning(e.getMessage());
      result = "Major accident! But no worries, " + "your private AOP helicopter is on the way!";

      // Note: you can re-through the exception if you want to handle into the main program.
      // throw e;
    }

    long end = System.currentTimeMillis();
    long duration = end - begin;
    LOGGER.info("\n=====> Duration: " + duration / 1000.0 + " seconds");
    return result;
  }

  @After("execution(* com.crbiitr.dao.AccountDAO.findAccounts(..))")
  public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoint) {
    // print out which method we are advising on
    String method = theJoinPoint.getSignature().toShortString();
    LOGGER.info("\n=====>>> Executing @After (finally) on method: " + method);
  }

  @AfterThrowing(
      pointcut = "execution(* com.crbiitr.dao.AccountDAO.findAccounts(..))",
      throwing = "theExc")
  public void afterThrowingFindAccountsAdvice(JoinPoint theJoinPoint, Throwable theExc) {
    String method = theJoinPoint.getSignature().toShortString();
    LOGGER.info("\n=====>>> Executing @AfterThrowing on method: " + method);
    LOGGER.info("\n=====>>> The exception is: " + theExc);
  }

  @AfterReturning(
      pointcut = "execution(* com.crbiitr.dao.AccountDAO.findAccounts(..))",
      returning = "result")
  public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> result) {
    String method = theJoinPoint.getSignature().toShortString();
    LOGGER.info("\n=====>>> Executing @AfterReturning on method: " + method);
    LOGGER.info("\n=====>>> result is: " + result);
    convertAccountNamesToUpperCase(result);
    LOGGER.info("\n=====>>> result is: " + result);
  }

  private void convertAccountNamesToUpperCase(List<Account> result) {
    for (Account tempAccount : result) {
      String theUpperName = tempAccount.getName().toUpperCase();
      tempAccount.setName(theUpperName);
    }
  }

  @Before("com.crbiitr.aspect.order.AopExpressionsWithOrderUtil.forDaoPackageNoGetterSetter()")
  public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
    LOGGER.info("\n=====>>> Executing @Before advice on method");
    MethodSignature methodSig = (MethodSignature) theJoinPoint.getSignature();
    LOGGER.info("Method: " + methodSig);
    Object[] args = theJoinPoint.getArgs();
    // loop thru args
    for (Object tempArg : args) {
      LOGGER.info(tempArg.toString());
      if (tempArg instanceof Account) {
        Account theAccount = (Account) tempArg;
        LOGGER.info("account name: " + theAccount.getName());
        LOGGER.info("account level: " + theAccount.getLevel());
      }
    }
  }
}
