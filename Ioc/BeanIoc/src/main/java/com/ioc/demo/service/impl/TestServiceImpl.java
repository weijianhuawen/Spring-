package com.ioc.demo.service.impl;

import com.ioc.demo.dao.TestDao;
import com.ioc.demo.dao.impl.TestDaoImpl;
import com.ioc.demo.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//public class TestServiceImpl implements TestService{
//    public TestDaoImpl testDao = new TestDaoImpl();
//    @Override
//    public void service() {
//        System.out.println("Service层开始服务！");
//        testDao.save();
//    }
//}
public class TestServiceImpl implements TestService {
    //Dao
    private TestDaoImpl testDao;
    @Override
    public void service() {
        System.out.println("Service层开始服务！");
        this.testDao = testDao;
        testDao.save();
    }

    public void setTestDao(TestDaoImpl testDao) {
        this.testDao = testDao;
    }
}

//public class TestServiceImpl implements TestService {
//    //Dao
//    public TestDaoImpl testDao;
//    @Override
//    public void service(TestDaoImpl testDao) {
//        System.out.println("Service层开始服务！");
//        this.testDao = testDao;
//        testDao.save();
//    }
//}
