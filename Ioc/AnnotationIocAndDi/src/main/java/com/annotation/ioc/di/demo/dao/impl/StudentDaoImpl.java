package com.annotation.ioc.di.demo.dao.impl;

import com.annotation.ioc.di.demo.dao.StudentDao;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository("stuDao")
public class StudentDaoImpl implements StudentDao {
    @Override
    public void save() {
        System.out.println("student save ...");
    }
}
