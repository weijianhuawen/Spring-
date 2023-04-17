package com.data.source.demo;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DruidDataSource druidDataSource = (DruidDataSource) context.getBean("druidDataSource");
        ComboPooledDataSource comboPooledDataSource = (ComboPooledDataSource) context.getBean("c3p0DataSource");
        System.out.println(druidDataSource);
        System.out.println(comboPooledDataSource);
    }
}
