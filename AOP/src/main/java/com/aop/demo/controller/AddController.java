package com.aop.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class AddController {
    public void adding() {
        int a = 1;
        for (int i = 1; i <= 1000000; i++) {
            a++;
        }
        System.out.println("增加百万次操作！");
    }
    public void addPlus() {
        //记录执行前程序的时间戳
        long start = System.currentTimeMillis();
        adding();
        //记录完成任务后程序的时间戳
        long end = System.currentTimeMillis();
        System.out.println("Plus:增加百万次操作！,时间为：" + (end - start) + "ms");
    }
    public void playing() {
        System.out.println("playing ... ...");
    }
    public void running() {
        System.out.println("running ... ...");
    }
    public void sharing() {
        System.out.println("sharing ... ...");
    }
}
