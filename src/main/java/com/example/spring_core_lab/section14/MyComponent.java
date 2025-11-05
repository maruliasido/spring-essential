package com.example.spring_core_lab.section14;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    @PostConstruct
    public void init() {
        System.out.println("Component initialized");
    }

    public void doWork() {
        System.out.println("Working...");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Component destroyed");
    }
}