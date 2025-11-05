package com.example.spring_core_lab.section16_aop_proxy_demo.jdkproxy;

import org.springframework.stereotype.Component;

@Component
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Processing payment...");
    }

    public void internalAudit() {
        System.out.println("Internal audit (not in interface)...");
    }
}