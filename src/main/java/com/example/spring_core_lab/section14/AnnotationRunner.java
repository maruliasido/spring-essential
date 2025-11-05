package com.example.spring_core_lab.section14;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AnnotationRunner implements CommandLineRunner {

    private final MyComponent myComponent;

    public AnnotationRunner(MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    @Override
    public void run(String... args) {
        myComponent.doWork();
    }
}