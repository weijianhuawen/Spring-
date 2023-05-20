package com.mybatis.mapper;

import com.mybatis.mapper.dao.UserDao;
import com.mybatis.mapper.mode.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlus05MapperApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
        //Unknown column 'uid' in 'field list'
        //Unknown column 'password' in 'field list'
        List<User> users = userDao.selectList(null);
        System.out.println(users);
    }

    @Test
    public void getTest1() {
        //无法查询到密码字段
        List<User> users = userDao.selectList(null);
        System.out.println(users);
    }

}
