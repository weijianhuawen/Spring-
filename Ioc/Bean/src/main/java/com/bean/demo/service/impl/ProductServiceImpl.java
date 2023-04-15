package com.bean.demo.service.impl;

import com.bean.demo.dao.ProductDao;
import com.bean.demo.service.ProductService;

public class ProductServiceImpl implements ProductService {
    private ProductDao productDao;
    @Override
    public void service() {
        System.out.println("处理产品业务！");
        productDao.save();
    }
}
