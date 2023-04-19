package com.annotation.ioc.di.demo;

import com.annotation.ioc.di.demo.config.SpringConfig;
import com.annotation.ioc.di.demo.service.impl.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App6 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.service();
    }
}
