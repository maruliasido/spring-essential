package com.example.spring_core_lab.section16_aop_proxy_demo.cglibproxy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CglibProxyApp {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfigCGLIB.class);
        var service = context.getBean(ConcreteService.class);

        service.execute();        // Will be advised
        service.internalAudit();  // Will also be advised
    }
}