package com.annotation.ioc.di.demo.dao.impl;

import com.annotation.ioc.di.demo.dao.StudentDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository()
@Scope("singleton")
public class StudentDaoImpl implements StudentDao {
    @Override
    public void save() {
        System.out.println("student save ...");
    }
    public StudentDaoImpl() {
        System.out.println("stu constructor ...");
    }
    @PostConstruct
    public void init() {
        System.out.println("init ...");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("destroy ...");
    }
}
