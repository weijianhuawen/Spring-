package com.di.demo.dao.impl;

import com.di.demo.dao.IocDao;

public class IocDaoImpl implements IocDao {
    @Override
    public void save() {
        System.out.println("ioc dao ...");
    }
}
