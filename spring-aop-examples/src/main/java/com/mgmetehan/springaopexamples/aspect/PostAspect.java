package com.mgmetehan.springaopexamples.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PostAspect {
    @Before("execution(* com.mgmetehan.springaopexamples.service.impl.PostServiceImpl.save(..))")
    public void beforeSave(JoinPoint joinPoint) {
        System.out.println("----------------------------");
        System.out.println("Before: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
        System.out.println("----------------------------");
    }

    @After("execution(* com.mgmetehan.springaopexamples.service.impl.*.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("----------------------------");
        System.out.println("After: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
        System.out.println("----------------------------");
    }
}
