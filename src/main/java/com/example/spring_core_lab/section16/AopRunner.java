package com.example.spring_core_lab.section16;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AopRunner implements CommandLineRunner {

    private final PaymentService PaymentService;

    public AopRunner(PaymentService PaymentService) {
        this.PaymentService = PaymentService;
    }

    @Override
    public void run(String... args) {
        try {
            PaymentService.processPayment("Joy Gabriel", 250.0);
            PaymentService.processPayment("Naomi Gracia", -100.0);
        } catch (Exception e) {
            System.out.println("[ERROR] Payment failed: " + e.getMessage());
        }
    }
}