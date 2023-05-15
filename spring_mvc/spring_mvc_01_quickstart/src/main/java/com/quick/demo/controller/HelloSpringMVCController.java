package com.quick.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class HelloSpringMVCController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        System.out.println("你好！Spring， MVC！");
        HashMap<Integer,Integer> hashMap;
        return "hello spring mvc!";
    }
}
