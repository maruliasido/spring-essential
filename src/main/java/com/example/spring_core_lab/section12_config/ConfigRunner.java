package com.example.spring_core_lab.section12_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigRunner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigB.class);
        GreetingService service = context.getBean(GreetingService.class);
        TimeService timeService = context.getBean(TimeService.class);

        timeService.showTime();
        service.greet();
    }
}