package com.spring.boot.quick.controller;

import com.spring.boot.quick.mode.Book;
import org.springframework.web.bind.annotation.*;

import javax.smartcardio.ResponseAPDU;

@RestController
@RequestMapping("/books")
public class BookController {
    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        System.out.println("欢迎您！" + name);
        return "hello " + name;
    }
    //查询
    @GetMapping
    public Result getAll() {
        System.out.println("查询中... find all");
        return new Result(Code.GET_OK, "success", "成功！");
    }
    //查询单个
    @GetMapping("/{bid}")
    public Result getByBid(@PathVariable Integer bid) {
        System.out.println("id === > " + bid);
        return new Result(Code.GET_OK, "success", "ok");
    }

    @PostMapping
    public Result insert(@RequestBody Book book) {
        System.out.println("插入书籍数据为：" + book);
        return new Result(Code.INSERT_OK, "success insert", "ok");
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        System.out.println("修改数据为：" + book);
        return new Result(Code.UPDATE_OK, "success update", "ok");
    }

    @DeleteMapping("/{bid}")
    public Result delete(@PathVariable Integer bid) {
        System.out.println("删除数据id为：" + bid);
        return new Result(Code.DELETE_OK, "success delete", "ok");
    }
}
