package com.example.spring_core_lab.section16_aop_proxy_demo.jdkproxy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.example.spring_core_lab.section16_aop_proxy_demo.jdkproxy")
@EnableAspectJAutoProxy(proxyTargetClass = false) // JDK Proxy
public class AppConfigJDK {
}