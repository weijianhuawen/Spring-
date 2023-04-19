package com.annotation.bean.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class JdbcDao {
    public void save() {
        System.out.println("save jdbc message ...");
    }
}
