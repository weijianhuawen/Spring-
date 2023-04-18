package com.annotation.ioc.di.demo;

import com.annotation.ioc.di.demo.config.SpringConfig;
import com.annotation.ioc.di.demo.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = context.getBean(BookService.class);
        bookService.service();
    }
}
