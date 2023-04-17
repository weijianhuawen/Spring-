package com.di.demo;

import com.di.demo.service.DiService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForConstructor {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DiService diService = (DiService) context.getBean("diService");
        diService.service();
    }
}
