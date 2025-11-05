package com.example.spring_core_lab.section16_aop_proxy_demo.jdkproxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* *(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("[JDK Proxy] Before: " + joinPoint.getSignature());
    }
}