package com.example.spring_core_lab.section16;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditAspect {

    @After("execution(* com.example.springaop.section16_aop.PaymentService.processPayment(..))")
    public void logAfterPayment() {
        System.out.println("[AUDIT] Payment processed successfully.");
    }
}