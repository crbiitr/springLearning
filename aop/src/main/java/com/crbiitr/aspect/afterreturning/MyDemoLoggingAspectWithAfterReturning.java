package com.crbiitr.aspect.afterreturning;

import com.crbiitr.model.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(11)
public class MyDemoLoggingAspectWithAfterReturning {
  @AfterReturning(
      pointcut = "execution(* com.crbiitr.dao.AccountDAO.findAccounts(..))",
      returning = "result")
  public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> result) {
    String method = theJoinPoint.getSignature().toShortString();
    System.out.println("\n=====>>> Executing @AfterReturning on method: " + method);
    System.out.println("\n=====>>> result is: " + result);
    convertAccountNamesToUpperCase(result);
    System.out.println("\n=====>>> result is: " + result);
  }

  private void convertAccountNamesToUpperCase(List<Account> result) {
    for (Account tempAccount : result) {
      String theUpperName = tempAccount.getName().toUpperCase();
      tempAccount.setName(theUpperName);
    }
  }

  @Before("com.crbiitr.aspect.order.AopExpressionsWithOrderUtil.forDaoPackageNoGetterSetter()")
  public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
    System.out.println("\n=====>>> Executing @Before advice on method");
    MethodSignature methodSig = (MethodSignature) theJoinPoint.getSignature();
    System.out.println("Method: " + methodSig);
    Object[] args = theJoinPoint.getArgs();
    // loop thru args
    for (Object tempArg : args) {
      System.out.println(tempArg);
      if (tempArg instanceof Account) {
        Account theAccount = (Account) tempArg;
        System.out.println("account name: " + theAccount.getName());
        System.out.println("account level: " + theAccount.getLevel());
      }
    }
  }
}
