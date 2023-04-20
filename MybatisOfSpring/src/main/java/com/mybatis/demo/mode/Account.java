package com.mybatis.demo.mode;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Account {
    private int uid;
    private String id;
    private String username;
    private int age;
    private String sex;
    private String address;
    private String telephone;
    private double money;
}
