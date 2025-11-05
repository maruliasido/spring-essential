package com.example.spring_core_lab.section16_aop_proxy_demo.jdkproxy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JdkProxyApp {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfigJDK.class);
        var service = context.getBean(PaymentServiceImpl.class);

        service.pay();            // Will be advised
        service.internalAudit();  // Will NOT be advised
    }
}