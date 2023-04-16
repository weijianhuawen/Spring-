package com.bean.life.demo;

import com.bean.life.demo.dao.LifeDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLife {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        LifeDao lifeDao = (LifeDao) context.getBean("lifeDao");
        lifeDao.save();
        //注册钩子关闭容器
        context.registerShutdownHook();
        //context.close();
    }
}
