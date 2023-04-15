package com.bean.demo.factory;

import com.bean.demo.dao.StudentDao;
import com.bean.demo.dao.impl.StudentDaoImpl;

public class StudentDaoBeanFactory {
    public StudentDao getStudentDao() {
        System.out.println("学生工厂实例化对象!");
        return new StudentDaoImpl();
    }
}
