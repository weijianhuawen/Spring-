package com.mybatis.crud;

import com.mybatis.crud.dao.UserDao;
import com.mybatis.crud.mode.User;
import org.assertj.core.api.UriAssert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlus02CrudApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
    public void selectTest() {
        User user = userDao.selectById(2);
        System.out.println("uid为" + 2 + "查询结果为：" + user);
    }


    @Test
    public void insert() {
        User user = new User(null, "老六", 42, "laoliu@qq.com");
        userDao.insert(user);

        List<User> list = userDao.selectList(null);
        System.out.println(list);
    }

    @Test
    public void delete() {
        Integer id = 3;

        userDao.deleteById(id);

        List<User> list = userDao.selectList(null);
        System.out.println(list);
    }

    @Test
    public void update() {
        User user = new User(1659516254844448769L, "老七" ,43, "laoqi@183.com");
        userDao.updateById(user);
        List<User> list = userDao.selectList(null);
        System.out.println(list);
    }

}
