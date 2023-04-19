package com.annotation.ioc.di.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PreDestroy;

@Configuration
@ComponentScan({"com.annotation.ioc.di.demo.service", "com.annotation.ioc.di.demo.dao"})
@PropertySource("classpath:user.properties")
public class SpringConfig {
}
