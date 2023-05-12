package com.mvc.demo.mode;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private int age;
    private Address address;
}
