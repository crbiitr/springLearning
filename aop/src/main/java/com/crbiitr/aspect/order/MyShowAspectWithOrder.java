package com.crbiitr.aspect.order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(6)
public class MyShowAspectWithOrder {

  @Before("com.crbiitr.aspect.order.AopExpressionsWithOrderUtil.forDaoPackageNoGetterSetter()")
  public void performApiAnalytics() {
    System.out.println("\n=====>>> SHOW");
  }
}
