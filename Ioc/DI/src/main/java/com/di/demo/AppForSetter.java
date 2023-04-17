package com.di.demo;

import com.di.demo.dao.DiDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForSetter {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DiDao diDao = (DiDao) context.getBean("diDao");
        diDao.save();
    }
}
