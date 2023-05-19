package com.mybatis.pages;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatis.pages.dao.UserDao;
import com.mybatis.pages.mode.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlus03PagesApplicationTests {
    @Autowired
    private UserDao userDao;

//    @Test
//    public void pagesQueryTest() {
//        //1. 创建IPage分页对象
//        //第一个参数表示查询第几页，第二个参数表示每页数据的行数
//        IPage<User> page = new Page<>(1, 3);
//        // 2.执行分页查询
//        userDao.selectPage(page, null);
//        // 3.获取分页查询数据
//        System.out.println("当前页码值：" + page.getCurrent());
//        System.out.println("每一页显示数：" + page.getSize());
//        System.out.println("每一页数据条数：" + page.getTotal());
//        System.out.println("一共查询到的页数：" + page.getPages());
//        System.out.println("查询到的数据：" + page.getRecords());
//    }

    @Test
    public void pagesQueryTest() {
        //1. 创建IPage分页对象
        //第一个参数表示查询第几页，第二个参数表示每页数据的行数
        IPage<User> page = new Page<>(1, 3);
        // 2.执行分页查询
        userDao.selectPage(page, null);
        // 3.获取分页查询数据
        System.out.println("当前页码值：" + page.getCurrent());
        System.out.println("每一页显示数：" + page.getSize());
        System.out.println("总数据条数：" + page.getTotal());
        System.out.println("一共查询到的页数：" + page.getPages());
        System.out.println("查询到的数据：" + page.getRecords());
    }

}
