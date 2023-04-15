package com.bean.demo.dao.impl;

import com.bean.demo.dao.StudentDao;

public class StudentDaoImpl implements StudentDao {
    @Override
    public void save() {
        System.out.println("存入学生数据！");
    }
}
