package com.bean.demo.dao.impl;

import com.bean.demo.dao.ProductDao;

public class ProductDaoImpl implements ProductDao {
    @Override
    public void save() {
        System.out.println("存入产品数据！");
    }
}
