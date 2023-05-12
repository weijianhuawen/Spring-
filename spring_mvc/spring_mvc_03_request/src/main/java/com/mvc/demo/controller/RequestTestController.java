package com.mvc.demo.controller;

import com.mvc.demo.mode.Address;
import com.mvc.demo.mode.Book;
import com.mvc.demo.mode.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
@Controller
@RequestMapping(value = "test", produces = "text/html;charset=utf-8")
@ResponseBody
public class RequestTestController {
    //获取普通参数
    @RequestMapping("getName")
    public String getName(String name) {
        System.out.println("获取客户端普通参数：" + name);
        return "success require";
    }

    //客户端与后端参数名字不一致时，获取普通参数
    @RequestMapping("getUserName")
    public String getUserName(@RequestParam("name") String username) {
        System.out.println("获取客户端普通参数（前后端参数名不一致）：" + username);
        return "success require";
    }

    //获取多个参数
    @RequestMapping("login")
    public String login(@RequestParam("name") String username, String password) {
        System.out.println("获取多个参数-> 用户名：" + username + ", 密码：" + password);
        return "success require";
    }

    //通过对象获取多个参数
    @RequestMapping("getAddress")
    public String getAddress(Address address) {
        System.out.println("将获取到的参数以对象的形式接收，结果为：" + address);
        return "success require";
    }

    //通过对象获取参数，对象中含有引用类型的变量
    @RequestMapping("getUser")
    public String getUser(User user) {
        System.out.println("将获取到的参数以对象的形式接收，结果为：" + user);
        return "success require";
    }

    //获取普通类型的数组
    @RequestMapping("getLike")
    public String getLike(String[] likes) {
        System.out.println("接收基本数据类型数组：" + Arrays.toString(likes));
        return "success require";
    }
    //获取引用类型的数组
    @RequestMapping("getBooks")
    public String getBooks(Book[] books) {
        System.out.println("获取引用类型数组：" + Arrays.toString(books));
        return "success require";
    }

    //使用集合接收数组
    @RequestMapping("getLikeList")
    public String getLike(@RequestParam List<String> likes) {
        System.out.println("获取数组，使用集合接收：" + likes);
        return "success require";
    }


    //接收json数据（基于Jackson） 数组
    @RequestMapping("getNames")
    public String getNames(@RequestBody List<String> names) {
        System.out.println("获取json数组数据：" + names);
        return  "successful require";
    }

    //获取json格式的对象
    @RequestMapping("getBookJson")
    public String getBook(@RequestBody Book book) {
        System.out.println("获取json格式对象：" + book);
        return "successful require";
    }

    //获取日期格式数据
    @RequestMapping("getDate")
    public String getDate(Date date1,
                          @DateTimeFormat(pattern = "yyyy-MM-dd") Date date2,
                          @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date date3) {
        System.out.println("默认格式日期获取(yyyy/MM/dd):" + date1);
        System.out.println("指定日期格式获取1(yyyy-MM-dd):" + date2);
        System.out.println("指定日期格式获取2(yyyy/MM/dd HH:mm:ss):" + date3);
        return "successful require";
    }
}
