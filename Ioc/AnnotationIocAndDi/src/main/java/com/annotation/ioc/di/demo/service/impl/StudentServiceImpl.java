package com.annotation.ioc.di.demo.service.impl;

import com.annotation.ioc.di.demo.dao.StudentDao;
import com.annotation.ioc.di.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
//    @Autowired
//    @Qualifier("stuDao")
    @Resource(description = "")
    private StudentDao studentDao;
    @Override
    public void service() {
        System.out.println("student service ...");
        studentDao.save();
    }
}
