package com.aop.demo;

import com.aop.demo.config.SpringConfig;
import com.aop.demo.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        TestService testService = context.getBean(TestService.class);
        testService.testBefore();
        testService.testAfter();
        testService.testAfterReturning();
        testService.testAfterThrowing();
        testService.testAround();
    }
}
