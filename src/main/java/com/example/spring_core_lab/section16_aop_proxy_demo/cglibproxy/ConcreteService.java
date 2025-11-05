package com.example.spring_core_lab.section16_aop_proxy_demo.cglibproxy;

import org.springframework.stereotype.Component;

@Component
public class ConcreteService {
    public void execute() {
        System.out.println("Executing task...");
    }

    public void internalAudit() {
        System.out.println("Internal audit (concrete class)...");
    }
}