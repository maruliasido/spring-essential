package com.example.spring_core_lab.section12_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ConfigA.class, ConfigC.class})
public class ConfigB {
    @Bean
    public GreetingService greetingService(UserService userService) {
        return new GreetingService(userService);
    }
}