package com.bean.demo.factory;

import com.bean.demo.dao.ProductDao;
import com.bean.demo.dao.impl.ProductDaoImpl;

public class ProductDaoBeanFactory {
    public static ProductDao getProductDao() {
        //System.out.println("产品静态工厂实例化Dao!");
        return new ProductDaoImpl();
    }
}
