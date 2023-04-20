package com.mybatis.demo;

import com.mybatis.demo.config.SpringConfig;
import com.mybatis.demo.mode.Account;
import com.mybatis.demo.service.AccountsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountsService service = context.getBean(AccountsService.class);
        Account account = service.selectByUid(1);
        System.out.println(account);
    }
}
