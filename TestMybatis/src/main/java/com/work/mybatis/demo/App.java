package com.work.mybatis.demo;

import com.work.mybatis.demo.dao.AccountDao;
import com.work.mybatis.demo.entity.Account;
import com.work.mybatis.demo.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        // 1. 创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 2. 加载SqlMapConfig.xml配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config-xml.xml");
        // 3. 创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        // 4. 获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 5. 执行SqlSession对象执行查询，获取结果User
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        //验证查询方法
        Account account = accountDao.findByUid(1);
        System.out.println(account);
        account.setUsername("小花");
        account.setMoney(9981.34);
        //update
        accountDao.update(account);
        account = accountDao.findByUid(1);
        System.out.println(account);
        //验证插入方法
        Account ac = new Account();
        ac.setAddress("湖南省长沙市");
        ac.setAge(12);
        ac.setId("430000201111111345");
        ac.setSex("女");
        ac.setMoney(9999.99);
        ac.setUsername("奥利给");
        accountDao.save(ac);
        //查询所有元素
        List<Account> list = accountDao.findAll();
        System.out.println(list);
        // 6. 释放资源
        sqlSession.close();
    }
}