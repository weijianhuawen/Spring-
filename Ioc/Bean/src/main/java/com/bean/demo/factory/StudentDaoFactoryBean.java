package com.bean.demo.factory;

import com.bean.demo.dao.StudentDao;
import com.bean.demo.dao.impl.StudentDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class StudentDaoFactoryBean implements FactoryBean<StudentDao> {
    @Override
    public boolean isSingleton() {
        //返回true表示单例，false表示多例，默认true
        return FactoryBean.super.isSingleton();
    }
    @Override
    public StudentDao getObject() throws Exception {
        //统一使用getObject获取对象
        System.out.println("基于FactoryBean的实例工厂！");
        return new StudentDaoImpl();
    }
    @Override
    public Class<?> getObjectType() {
        //告诉获取对象的类型是什么
        return StudentDaoImpl.class;
    }
}
