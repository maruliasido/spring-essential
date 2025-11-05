package com.example.spring_core_lab.section12_config;

import org.springframework.context.annotation.Import;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({ConfigA.class, ConfigB.class, ConfigC.class})
public @interface EnableLab12Config {
}