package com.bean.demo;

import com.bean.demo.dao.ProductDao;
import com.bean.demo.factory.ProductDaoBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForProduct {
    public static void main(String[] args) {
//        //通过静态工厂实例化Bean
//        ProductDao productDao = ProductDaoBeanFactory.getProductDao();
//        productDao.save();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductDao productDao = (ProductDao) context.getBean("productDao");
        productDao.save();
    }
}
