package com.bean.demo;

import com.bean.demo.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForBook {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookService = (BookServiceImpl) context.getBean("bookService");
        bookService.service();
    }
}
