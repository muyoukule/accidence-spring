package com.muyoukule.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// 切面类
@Component
//@Aspect
//@Order(2)
public class MyAspect {

    // 定义通用的切点表达式
    @Pointcut("execution(* com.muyoukule.Service..*(..))")
    public void pointcut() {
        // 这个方法只是一个标记，方法名随意，方法体中也不需要写任何代码。
    }

    @Around("pointcut()")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知开始");
        // 执行目标方法。
        proceedingJoinPoint.proceed();
        System.out.println("环绕通知结束");
    }

    @Before("pointcut()")
    public void beforeAdvice() {
        System.out.println("前置通知");
    }

    @AfterReturning("pointcut()")
    public void afterReturningAdvice() {
        System.out.println("后置通知");
    }

    @AfterThrowing("pointcut()")
    public void afterThrowingAdvice() {
        System.out.println("异常通知");
    }

    @After("pointcut()")
    public void afterAdvice() {
        System.out.println("最终通知");
    }

}