package com.mgmetehan.springaopexamples.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
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

    @Around("@annotation(com.mgmetehan.springaopexamples.annotation.RequireVerifiedMail)")
    public void aroundSave(JoinPoint joinPoint) {
        System.out.println("----------------------------");
        System.out.println("Around: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
        System.out.println("----------------------------");
    }

    @Before("@annotation(com.mgmetehan.springaopexamples.annotation.RequireVerifiedMail)")
    public void BeforearoundSave(JoinPoint joinPoint) {
        System.out.println("----------------------------");
        System.out.println("BeforearoundSave: " + joinPoint.getArgs()[0]);
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
