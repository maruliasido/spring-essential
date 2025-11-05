package com.example.spring_core_lab.section11_intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IntroRunner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BasicBean bean = context.getBean(BasicBean.class);
        bean.sayHello();
    }
}