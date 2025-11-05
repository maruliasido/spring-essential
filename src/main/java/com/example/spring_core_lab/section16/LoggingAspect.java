package com.example.spring_core_lab.section16;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.spring_core_lab.section16_aop.TargetService.*(..))")
    public void logBefore() {
        System.out.println("LoggingAspect: Before method execution");
    }
}