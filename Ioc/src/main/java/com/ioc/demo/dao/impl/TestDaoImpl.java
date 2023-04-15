package com.ioc.demo.dao.impl;

import com.ioc.demo.dao.TestDao;

public class TestDaoImpl implements TestDao {
    @Override
    public void save() {
        System.out.println("Dao层储存数据！");
    }
}
