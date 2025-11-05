package com.example.spring_core_lab.section15;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleBean {

    public LifecycleBean() {
        System.out.println("Constructor: LifecycleBean created");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct: Bean initialized");
    }

    public void doSomething() {
        System.out.println("Doing something...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PreDestroy: Bean will be destroyed");
    }
}