package com.bean.demo;

import com.bean.demo.dao.StudentDao;
import com.bean.demo.factory.StudentDaoBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForStudent {
    public static void main(String[] args) {
        //实例工厂获取对象
//        StudentDaoBeanFactory factory = new StudentDaoBeanFactory();
//        StudentDao studentDao = factory.getStudentDao();
//        studentDao.save();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao studentDao = (StudentDao) context.getBean("studentDao");
        studentDao.save();
    }
}
