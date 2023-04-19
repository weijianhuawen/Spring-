package com.annotation.ioc.di.demo.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Value("${name}")
    private  String username;
    @Value("${age}")
    private int age;

    public void service() {
        System.out.println("user service ... " + username + " " + age);
    }
}
