package com.aop.demo;

import com.aop.demo.config.SpringConfig;
import com.aop.demo.controller.AddController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AddController addController = context.getBean(AddController.class);
        addController.adding();
        addController.playing();
        addController.running();
        addController.sharing();
    }
}
