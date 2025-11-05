package com.example.spring_core_lab.section16;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public void processPayment(String user, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        System.out.println("Processing payment of $" + amount + " for " + user);
    }
}
