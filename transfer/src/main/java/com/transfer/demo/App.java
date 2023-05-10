package com.transfer.demo;

import com.transfer.demo.config.SpringConfig;
import com.transfer.demo.mode.Account;
import com.transfer.demo.service.TransferService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        TransferService service = context.getBean(TransferService.class);
        Account in = new Account();
        in.setUid(2);
        Account out = new Account();
        out.setUid(1);
        System.out.println("转账前:");
        System.out.println(service.selectByUid(out.getUid()));
        System.out.println(service.selectByUid(in.getUid()));
        try{
            service.transferMoney(out, in, 100);
        } catch (ArithmeticException e) {
            System.out.println("转账异常！");
        }
        System.out.println("转账后:");
        System.out.println(service.selectByUid(out.getUid()));
        System.out.println(service.selectByUid(in.getUid()));
    }
}
