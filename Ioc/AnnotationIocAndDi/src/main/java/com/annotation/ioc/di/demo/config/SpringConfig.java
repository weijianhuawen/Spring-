package com.annotation.ioc.di.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.annotation.ioc.di.demo.service", "com.annotation.ioc.di.demo.dao"})
public class SpringConfig {
}
