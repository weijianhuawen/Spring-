package com.mybatis.dml;

import com.mybatis.dml.dao.UserDao;
import com.mybatis.dml.mode.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.jnlp.ClipboardService;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MybatisPlus06DmlApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
    public void idCreateStrategy() {
//        List<User> users = userDao.selectList(null);
//
//        System.out.println(users);
//
        //默认id生成策略
        User user = new User();
        user.setName("小花");
        user.setAge(15);
        user.setEmail("xiaohua@qq.com");
        user.setPassword("xiaohuabangbangda");
        //插入
        userDao.insert(user);
    }

    @Test
    public void deleteTest() {
        //批量删除数据
        List<Long> list = new ArrayList<>();
        list.add(1659921040345493507L);
        list.add(1659921040345493506L);
        list.add(1795L);
        userDao.deleteBatchIds(list);

    }

    @Test
    public void getTest() {
        //按照id批量查找数据
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(4L);
        list.add(5L);
        List<User> users = userDao.selectBatchIds(list);

        System.out.println(users);
    }

    @Test
    public void logicDelTest() {
        userDao.deleteById(1L);

        List<User> users = userDao.selectList(null);
        System.out.println(users);
    }


    @Test
    public void updateTest() {
//        User user = new User();
//        user.setId(3L);
//        user.setName("王五");
//        user.setVersion(1);
//        userDao.updateById(user);

        //首先根据id获取数据库中的数据，然后再进行修改，因为需要使用到上一次对应数据行的版本

        User user = userDao.selectById(3L);
        //修改
        user.setName("王五999");
        user.setEmail("wangwu999@163.com");

        userDao.updateById(user);
    }

    @Test
    public void updateTest2() {
        User user1 = userDao.selectById(3L);
        User user2 = userDao.selectById(3L);

        user1.setName("王五34553");
        user2.setName("王五18882");

        userDao.updateById(user1);
        userDao.updateById(user2);
    }

}
