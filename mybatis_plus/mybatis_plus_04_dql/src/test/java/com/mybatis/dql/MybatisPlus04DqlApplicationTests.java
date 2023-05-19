package com.mybatis.dql;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mybatis.dql.dao.UserDao;
import com.mybatis.dql.mode.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlus04DqlApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
    public void selectTest() {
        List<User> list = userDao.selectList(null);
        System.out.println(list);

        System.out.println("==========");
        //1.创建好条件构造器
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        //2.方式1：通过属性名设置条件，容易写错，不推荐
        //lt表示小于，如筛选小于年龄小于或等于18的数据
        //queryWrapper.lt("age", 19);
//        List<User> list1 = userDao.selectList(queryWrapper);
//        System.out.println(list1);
//        System.out.println("==============");
        //3.方式2：通过lambda表达式设置查询条件
//        queryWrapper.lambda().lt(User::getAge, 19);
//        List<User> list2 = userDao.selectList(queryWrapper);
//        System.out.println(list2);

        //4.方式3：通过LambdaQueryWrapper对象设置条件，等价与方式2
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
//        //如查询年龄大于18，小于31的数据
//        lambdaQueryWrapper.lt(User::getAge, 31).gt(User::getAge, 18);
//        List<User> list3 = userDao.selectList(lambdaQueryWrapper);
//        System.out.println(list3);

        //默认情况为取and，即同时满足，如果需要设置或逻辑的数据再使用or方法来分离条件
        lambdaQueryWrapper.lt(User::getAge, 19).or().gt(User::getAge, 30);
        List<User> list4 = userDao.selectList(lambdaQueryWrapper);
        System.out.println(list4);
    }

}
