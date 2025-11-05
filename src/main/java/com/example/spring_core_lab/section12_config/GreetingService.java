package com.example.spring_core_lab.section12_config;

public class GreetingService {
    private final UserService userService;

    public GreetingService(UserService userService) {
        this.userService = userService;
    }

    public void greet() {
        System.out.println("Hello, " + userService.getUser());
    }
}