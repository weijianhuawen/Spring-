package com.data.source.demo;

import com.data.source.demo.Dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Map;

public class App4 {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        //获取系统环境变量
        Map<String, String> env = System.getenv();
        System.out.println(env);
        userDao.save();
    }
}
