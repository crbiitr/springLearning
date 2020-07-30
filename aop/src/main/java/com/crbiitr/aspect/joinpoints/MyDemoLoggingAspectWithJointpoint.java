package com.crbiitr.aspect.joinpoints;

import com.crbiitr.model.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(10)
public class MyDemoLoggingAspectWithJointpoint {
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
