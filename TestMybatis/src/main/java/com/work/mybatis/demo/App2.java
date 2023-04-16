package com.work.mybatis.demo;

import com.work.mybatis.demo.config.SpringConfig;
import com.work.mybatis.demo.entity.Account;
import com.work.mybatis.demo.service.AccountService;
import com.work.mybatis.demo.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService accountService = ctx.getBean(AccountServiceImpl.class);
        Account ac = accountService.findByUid(1);
        System.out.println(ac);
    }
}