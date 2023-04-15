package com.bean.demo.service.impl;

import com.bean.demo.dao.StudentDao;
import com.bean.demo.service.StudentService;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    @Override
    public void service() {
        System.out.println("处理学生业务！");
        studentDao.save();
    }
}
