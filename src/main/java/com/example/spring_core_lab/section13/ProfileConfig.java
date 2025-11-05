package com.example.spring_core_lab.section13;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProfileConfig {

    @Value("${app.name}")
    private String appName;

    @Value("#{${app.version} + 0.1}")
    private double nextVersion;

    public void printInfo() {
        System.out.println("App Name: " + appName);
        System.out.println("Next Version (SpEL): " + nextVersion);
    }
}