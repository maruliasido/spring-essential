package com.example.spring_core_lab.section16_aop_proxy_demo.cglibproxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* *(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("[CGLIB Proxy] Before: " + joinPoint.getSignature());
    }
}