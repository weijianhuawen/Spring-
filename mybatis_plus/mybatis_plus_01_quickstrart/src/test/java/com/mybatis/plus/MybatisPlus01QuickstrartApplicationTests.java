package com.mybatis.plus;

import com.mybatis.plus.dao.User2Dao;
import com.mybatis.plus.dao.UserDao;
import com.mybatis.plus.mode.User;
import com.mybatis.plus.mode.User2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlus01QuickstrartApplicationTests {
    @Autowired
    private UserDao userDao;
    @Autowired
    private User2Dao user2Dao;

    @Test
    public void selectTest() {
        List<User> list = userDao.selectList(null);
        System.out.println(list);
        User user = userDao.selectById(2);
        System.out.println(user);
    }
    @Test
    public void selectTest2() {
        List<User2> list = user2Dao.selectList(null);
        System.out.println(list);
        User2 user = user2Dao.selectById(2);
        System.out.println(user);
    }
    @Test
    public void insertTest() {
        User user = new User();
        user.setName("小小怪");
        user.setAge(13);
        user.setEmail("xiaoxiaoguai@163.com");
        userDao.insert(user);
    }

}
