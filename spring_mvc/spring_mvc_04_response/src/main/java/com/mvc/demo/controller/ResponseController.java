package com.mvc.demo.controller;

import com.mvc.demo.mode.Address;
import com.mvc.demo.mode.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping( "resp")
public class ResponseController {
    //响应一个页面，就不加@ResponseBody注解，默认返回页面
    @RequestMapping("page")
    public String page() {
        System.out.println("返回一个jsp页面！");
        return "index.jsp";
    }

    //响应普通字符串，加上@ResponseBody注解，返回String
    @RequestMapping(value = "message", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String message() {
        System.out.println("返回一个文本字符串！");
        return "你好！成功返回一串普通的文本！";
    }

    //响应json对象，加上@ResponseBody注解，然后直接返回对象即可
    @RequestMapping("object")
    @ResponseBody
    public Book book() {
        Book book = new Book();
        book.setName("计算机网络");
        book.setIsbn("978-x-xxx-xxxxx-x");
        book.setClassify("计算机基础类");
        return book;
    }

    //响应json数组或集合
    @RequestMapping("collection")
    @ResponseBody
    public List<Address> addresses() {
        Address address1 = new Address();
        Address address2 = new Address();
        Address address3 = new Address();
        address1.setProvince("湖南省");
        address1.setCity("长沙市");
        address2.setProvince("福建省");
        address2.setCity("厦门市");
        address3.setProvince("湖北省");
        address3.setCity("武汉市");
        List<Address> res =  new ArrayList<Address>();
        res.add(address1);
        res.add(address2);
        res.add(address3);
        return res;
    }
}