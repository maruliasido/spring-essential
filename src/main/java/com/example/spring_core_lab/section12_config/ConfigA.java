package com.example.spring_core_lab.section12_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigA {
    @Bean
    public UserService userService() {
        return new UserService();
    }
}