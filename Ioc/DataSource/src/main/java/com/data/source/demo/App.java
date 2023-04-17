package com.data.source.demo;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DruidDataSource druidDataSource = (DruidDataSource) context.getBean("druidDataSource");
        System.out.println(druidDataSource);
    }
}
