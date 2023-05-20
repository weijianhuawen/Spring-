package com.mybatis.dql;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mybatis.dql.dao.UserDao;
import com.mybatis.dql.mode.User;
import com.mybatis.dql.mode.query.UserQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.PublicKey;
import java.util.List;
import java.util.Map;

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
    @Test
    public void selectTest1() {
        //模拟页面跳转过来的数据
        UserQuery query = new UserQuery();
        //query.setAge(18);
        query.setAge2(30);

        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.gt(User::getAge, query.getAge());
        wrapper.lt(User::getAge, query.getAge2());

        //查询验证
        List<User> list = userDao.selectList(wrapper);
        System.out.println(list);
    }

//    @Test
//    public void selectTest2() {
//        //模拟页面跳转过来的数据
//        UserQuery query = new UserQuery();
//        query.setAge(18);
//        query.setAge2(30);
//
//        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
//        if (null != query.getAge()) {
//            wrapper.gt(User::getAge, query.getAge());
//        }
//        if (null != query.getAge2()) {
//            wrapper.lt(User::getAge, query.getAge2());
//        }
//
//        //查询验证
//        List<User> list = userDao.selectList(wrapper);
//        System.out.println(list);
//    }

    @Test
    public void selectTest2() {
        //模拟页面跳转过来的数据
        UserQuery query = new UserQuery();
        //query.setAge(18);
        query.setAge2(30);

        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.gt(null != query.getAge(), User::getAge, query.getAge());
        wrapper.lt(null != query.getAge2(), User::getAge, query.getAge2());
        //查询验证
        List<User> list = userDao.selectList(wrapper);
        System.out.println(list);
    }

    @Test
    public void selectTest3() {
        //编写查询条件对象
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.select(User::getId, User::getName);
        List<User> list = userDao.selectList(wrapper);
        System.out.println(list);
    }

    @Test
    public void getTest() {
        //聚合查询
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.select("count(*) as count", "age");
//        List<User> list = userDao.selectList(wrapper);

        //配合分组查询
        wrapper.groupBy("age");
        List<Map<String, Object>> list = userDao.selectMaps(wrapper);
        System.out.println(list);
    }

    @Test
    public void betweenTest() {
        //范围查询
       //lt 表示＜ le 表示≤  gt 表示＞ ge 表示≥ between 表示设置范围条件查询
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        //第一个参数指定字段，第二个参数val1指定下限，第三个参数val2指定上限,相当于 val1 <= x <= val2
        wrapper.between(User::getAge, 18, 28);
        List<User> list = userDao.selectList(wrapper);
        System.out.println(list);
    }

    @Test
    public void likeTest() {
        //模糊匹配
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        //在指定参数左右都加上%，就是查询包含val的数据，如%张%
//        wrapper.like(User::getName, "张");
        //左边添加%，及%张
//        ==>  Preparing: SELECT id,name,age,email FROM user WHERE (name LIKE ?)
//                ==> Parameters: %张(String)
        //wrapper.likeLeft(User::getName, "张");
        //右边添加%
        wrapper.likeRight(User::getName, "张");
        List<User> list = userDao.selectList(wrapper);
        System.out.println(list);
    }

    @Test
    public void equalsTest() {
        //等值查询
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getId, 1)
                .eq(User::getName, "张三");

        User user = userDao.selectOne(wrapper);
        System.out.println(user);
    }

    @Test
    public void orderBySelectTest() {
        //排序查询
        //按照年龄倒序进行查询
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.orderBy(true, false, User::getAge);

        List<User> list = userDao.selectList(wrapper);
        System.out.println(list);
    }
}
