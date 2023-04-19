package com.annotation.ioc.di.demo;

import com.annotation.ioc.di.demo.config.SpringConfig;
import com.annotation.ioc.di.demo.dao.StudentDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);
        //设置Hook 注册钩子关闭容器
        context.registerShutdownHook();
        studentDao.save();
    }
}
