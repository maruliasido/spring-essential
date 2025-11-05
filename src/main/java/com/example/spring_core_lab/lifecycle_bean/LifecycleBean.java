package com.example.spring_core_lab.lifecycle_bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
class MyService {
    public void serve() {
        System.out.println("Service is serving...");
    }
}

@Repository
class MyRepository {
    public void query() {
        System.out.println("Repository is querying...");
    }
}

@Controller
class MyController {
    public void handle() {
        System.out.println("Controller is handling...");
    }
}

@Component
@DependsOn("myServiceBean") // memastikan bean ini dibuat setelah myServiceBean
public class LifecycleBean {

    private final MyService myService;

    @Autowired
    public LifecycleBean(@Qualifier("myServiceBean") MyService myService) {
        this.myService = myService;
        System.out.println("Constructor: LifecycleBean created");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct: Bean initialized");
        myService.serve();
    }

    public void doSomething() {
        System.out.println("Doing something...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PreDestroy: Bean will be destroyed");
    }
}

@Configuration
class AppConfig {

    @Bean
    @Primary // bean ini akan dipilih jika ada lebih dari satu MyService
    public MyService myServiceBean() {
        System.out.println("Bean: myServiceBean created");
        return new MyService();
    }

    @Bean
    public MyService backupServiceBean() {
        System.out.println("Bean: backupServiceBean created");
        return new MyService();
    }
}