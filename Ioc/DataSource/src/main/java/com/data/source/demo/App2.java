package com.data.source.demo;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ComboPooledDataSource comboPooledDataSource = (ComboPooledDataSource) context.getBean("c3p0DataSource");
        System.out.println(comboPooledDataSource);
    }
}
