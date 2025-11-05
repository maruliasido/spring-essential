package com.example.spring_core_lab.section13;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProfileRunner implements CommandLineRunner {

    private final ProfileConfig config;

    public ProfileRunner(ProfileConfig config) {
        this.config = config;
    }

    @Override
    public void run(String... args) {
        config.printInfo();
    }
}