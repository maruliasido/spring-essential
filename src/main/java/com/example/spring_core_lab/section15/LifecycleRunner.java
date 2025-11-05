package com.example.spring_core_lab.section15;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LifecycleRunner implements CommandLineRunner {

    private final LifecycleBean lifecycleBean;

    public LifecycleRunner(LifecycleBean lifecycleBean) {
        this.lifecycleBean = lifecycleBean;
    }

    @Override
    public void run(String... args) {
        lifecycleBean.doSomething();
    }
}