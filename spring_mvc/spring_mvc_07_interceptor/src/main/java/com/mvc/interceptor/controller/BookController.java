package com.mvc.interceptor.controller;

import com.mvc.interceptor.mode.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ServletWebArgumentResolverAdapter;

@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping("/{bid}")
    public Result getByBid(@PathVariable Integer bid) {
        System.out.println("查询数据中..." + bid);
        return new Result(Code.GET_OK, "data", "success");
    }

    @GetMapping()
    public Result getAll() {
        System.out.println("查询全部数据中...");
        return new Result(Code.GET_OK, "all data", "success");
    }

    @PostMapping()
    public Result insert(@RequestBody Book book) {
        System.out.println("插入的数据为 ===> ");
        System.out.println(book);
        return new Result(Code.INSERT_OK, "insert data", "success");
    }

    @PutMapping()
    public Result update(@RequestBody Book book) {
        System.out.println("修改的数据为 ===> ");
        System.out.println(book);
        return new Result(Code.UPDATE_OK, "update data", "success");
    }

    @DeleteMapping("/{bid}")
    public Result delete(@PathVariable Integer bid) {
        System.out.println("正在删除数据 ===> ");
        System.out.println(bid);
        return new Result(Code.DELETE_OK, "delete data", "success");
    }

}
