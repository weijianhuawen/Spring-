package com.annotation.ioc.di.demo;

import com.annotation.ioc.di.demo.config.SpringConfig;
import com.annotation.ioc.di.demo.dao.StudentDao;
import com.annotation.ioc.di.demo.dao.impl.StudentDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App4 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);
        StudentDao studentDao1 = context.getBean(StudentDao.class);
        StudentDao studentDao2 = context.getBean(StudentDao.class);
        System.out.println(studentDao);
        System.out.println(studentDao1);
        System.out.println(studentDao2);
    }
}
