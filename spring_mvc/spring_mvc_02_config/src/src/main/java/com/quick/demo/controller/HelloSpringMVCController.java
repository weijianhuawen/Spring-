package com.quick.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloSpringMVCController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        System.out.println("你好！Spring， MVC！");
        return "恭喜你，完成了spring_mvc第一个程序！";
    }
}
