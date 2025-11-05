package com.example.spring_core_lab.section11_intro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public BasicBean basicBean() {
        return new BasicBean();
    }
}