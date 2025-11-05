package com.example.spring_core_lab.section12;

import com.example.spring_core_lab.section12_config.ConfigB;
import com.example.spring_core_lab.section12_config.GreetingService;
import com.example.spring_core_lab.section12_config.TimeService;
import com.example.spring_core_lab.section12_config.UserService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfIntegrationTest {

    @LocalServerPort
    private String port;

    @Test
    void testAllBeansLoaded() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigB.class);

        assertNotNull(context.getBean(UserService.class));
        assertNotNull(context.getBean(GreetingService.class));
        assertNotNull(context.getBean(TimeService.class));
    }

}
