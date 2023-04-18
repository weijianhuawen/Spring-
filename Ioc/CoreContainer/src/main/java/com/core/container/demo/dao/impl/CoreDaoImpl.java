package com.core.container.demo.dao.impl;

import com.core.container.demo.dao.CoreDao;

public class CoreDaoImpl implements CoreDao {
    public CoreDaoImpl() {
        System.out.println("创建CoreDaoImpl对象!");
    }

    @Override
    public void save() {
        System.out.println("save core ...");
    }
}
