package com.example.spring_core_lab.section12_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@EnableLab12Config
public class ConfigRunner2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigRunner.class);

        GreetingService greetingService = context.getBean(GreetingService.class);
        TimeService timeService = context.getBean(TimeService.class);

        greetingService.greet();
        timeService.showTime();
    }
}