package com.bean.life.demo;

import com.bean.life.demo.service.LifeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeService {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        LifeService lifeService = (LifeService) context.getBean("lifeService");
        lifeService.service();
        context.registerShutdownHook();
    }
}
