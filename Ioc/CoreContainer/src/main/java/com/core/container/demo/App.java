package com.core.container.demo;

import com.core.container.demo.dao.CoreDao;
import com.core.container.demo.dao.impl.CoreDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\未见花闻\\项目\\SpringLearning\\Ioc\\CoreContainer\\src\\main\\resources\\applicationContext.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        CoreDao coreDao = (CoreDao) context.getBean("coreDao");
//        CoreDao coreDao = context.getBean(CoreDao.class);
        CoreDao coreDao = context.getBean("coreDao", CoreDao.class);
        coreDao.save();
    }
}
