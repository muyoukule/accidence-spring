package com.muyoukule.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityAspect {

    @Pointcut("execution(* com.muyoukule.service..save*(..))")
    public void savePointcut() {
    }

    @Pointcut("execution(* com.muyoukule.service..delete*(..))")
    public void deletePointcut() {
    }

    @Pointcut("execution(* com.muyoukule.service..modify*(..))")
    public void modifyPointcut() {
    }

    @Before("savePointcut() || deletePointcut() || modifyPointcut()")
    public void beforeAdivce(JoinPoint joinpoint) {
        System.out.println("XXX操作员正在操作" + joinpoint.getSignature().getName() + "方法");
    }
}