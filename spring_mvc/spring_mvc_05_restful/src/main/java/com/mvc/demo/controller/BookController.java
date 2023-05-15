package com.mvc.demo.controller;

import com.mvc.demo.mode.Book;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestScope;

import java.util.ArrayList;
import java.util.List;

/**
 * 基于restful风格进行开发
 */

//@Controller
//@ResponseBody
//public class BookController {
//
//    //查询全部
//
//    /**
//     * 查询全部的数据
//     * @return 查询结果列表
//     */
//    @RequestMapping(value = "/books", method = RequestMethod.GET)
//    public List<Book> getAll() {
//        System.out.println("正在查询所有的书本... ");
//        List<Book> list = new ArrayList<Book>();
//        Book book1 = new Book();
//        book1.setBid(1);
//        book1.setName("计算机组成原理");
//        book1.setIsbn("978-xxxx-x-xx-xxx");
//        book1.setClassify("计算机基础");
//        book1.setDescribe("计算机硬件组成，计算机工作原理等");
//        list.add(book1);
//
//        Book book2 = new Book();
//        book2.setBid(2);
//        book2.setName("计算机网络");
//        book2.setIsbn("978-xx-xxx-xxx");
//        book2.setClassify("计算机基础");
//        book2.setDescribe("计算机通信原理，计算机网络分层与协议等");
//        list.add(book2);
//
//        Book book3 = new Book();
//        book3.setBid(3);
//        book3.setName("操作系统");
//        book3.setIsbn("978-xxxxx-x-xxx");
//        book3.setClassify("计算机基础");
//        book3.setDescribe("计算机操作系统，广义指令，Linux等");
//        list.add(book3);
//
//        return list;
//    }
//
//    //查询单个
//
//    /**
//     * 根据bid查询单条数据
//     * @param bid 书本的id
//     * @return 查询到的数据
//     */
//    @RequestMapping(value = "/books/{bid}", method = RequestMethod.GET)
//    public Book getBook(@PathVariable Integer bid) {
//        System.out.println("正在为你查询中...");
//        Book book = new Book();
//        book.setBid(4);
//        book.setName("数据结构与算法");
//        book.setIsbn("978-xx-x-xxxxx-x");
//        book.setClassify("计算机基础");
//        book.setDescribe("线性表，顺序表，队列，栈，哈希表，二叉树，图论等");
//
//        return book;
//    }
//
//    //插入数据
//
//    /**
//     * 插入单条书本数据
//     * @param book 书本信息（json）
//     * @return 提示信息
//     */
//    @RequestMapping(value = "/books", method = RequestMethod.POST, produces = "text/html;charset=utf8")
//    public String insertBook(@RequestBody Book book) {
//        System.out.println("正在为你插入数据...");
//        System.out.println(book);
//        return "插入数据 成功！";
//    }
//
//    //修改数据
//
//    /**
//     * 修改单条数据
//     * @param book 修改信息
//     * @return 提示信息
//     */
//    @RequestMapping(value = "/books", method = RequestMethod.PUT, produces = "text/html;charset=utf8")
//    public String updateBook(@RequestBody Book book) {
//        System.out.println("正在为你更新数据...");
//        System.out.println(book);
//        return "更新数据 成功！";
//    }
//
//    //删除数据
//
//    /**
//     * 删除单条数据
//     * @param bid 删除数据的bid
//     * @return 提示信息
//     */
//    @RequestMapping(value = "/books/{bid}", method = RequestMethod.DELETE, produces = "text/html;charset=utf8")
//    public String deleteBook(@PathVariable Integer bid) {
//        System.out.println("正在为你删除数据...");
//        System.out.println("删除的书籍bid为：" + bid);
//        return "删除数据 成功！";
//    }
//}

//极简开发
//@Controller
//@ResponseBody
//Controller注解和ResponseBody注解可以合并为ResController
@RestController
//路由的books可以合并到类外
@RequestMapping(value = "/books")
public class BookController {

    //查询全部

    /**
     * 查询全部的数据
     * @return 查询结果列表
     */
    //接收GET请求可以使用专门的注解来表示
    @GetMapping()
    public List<Book> getAll() {
        System.out.println("正在查询所有的书本... ");
        List<Book> list = new ArrayList<Book>();
        Book book1 = new Book();
        book1.setBid(1);
        book1.setName("计算机组成原理");
        book1.setIsbn("978-xxxx-x-xx-xxx");
        book1.setClassify("计算机基础");
        book1.setDescribe("计算机硬件组成，计算机工作原理等");
        list.add(book1);

        Book book2 = new Book();
        book2.setBid(2);
        book2.setName("计算机网络");
        book2.setIsbn("978-xx-xxx-xxx");
        book2.setClassify("计算机基础");
        book2.setDescribe("计算机通信原理，计算机网络分层与协议等");
        list.add(book2);

        Book book3 = new Book();
        book3.setBid(3);
        book3.setName("操作系统");
        book3.setIsbn("978-xxxxx-x-xxx");
        book3.setClassify("计算机基础");
        book3.setDescribe("计算机操作系统，广义指令，Linux等");
        list.add(book3);

        return list;
    }

    //查询单个

    /**
     * 根据bid查询单条数据
     * @param bid 书本的id
     * @return 查询到的数据
     */
    @GetMapping("{bid}")
    public Book getBook(@PathVariable Integer bid) {
        System.out.println("正在为你查询中...");
        Book book = new Book();
        book.setBid(4);
        book.setName("数据结构与算法");
        book.setIsbn("978-xx-x-xxxxx-x");
        book.setClassify("计算机基础");
        book.setDescribe("线性表，顺序表，队列，栈，哈希表，二叉树，图论等");

        return book;
    }

    //插入数据

    /**
     * 插入单条书本数据
     * @param book 书本信息（json）
     * @return 提示信息
     */
    @PostMapping(produces = "text/html;charset=utf8")
    public String insertBook(@RequestBody Book book) {
        System.out.println("正在为你插入数据...");
        System.out.println(book);
        return "插入数据 成功！";
    }

    //修改数据

    /**
     * 修改单条数据
     * @param book 修改信息
     * @return 提示信息
     */
    @PutMapping(produces = "text/html;charset=utf8")
    public String updateBook(@RequestBody Book book) {
        System.out.println("正在为你更新数据...");
        System.out.println(book);
        return "更新数据 成功！";
    }

    //删除数据

    /**
     * 删除单条数据
     * @param bid 删除数据的bid
     * @return 提示信息
     */
    @DeleteMapping(value = "{bid}", produces = "text/html;charset=utf8")
    public String deleteBook(@PathVariable Integer bid) {
        System.out.println("正在为你删除数据...");
        System.out.println("删除的书籍bid为：" + bid);
        return "删除数据 成功！";
    }
}

