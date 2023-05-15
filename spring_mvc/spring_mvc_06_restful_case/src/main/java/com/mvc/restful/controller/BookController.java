package com.mvc.restful.controller;

import com.mvc.restful.mode.Book;
import com.mvc.restful.service.BookService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    /**
     * 查询全部的书籍数据
     * @return
     */
    @GetMapping()
    public ResponseResult findAll() {
        System.out.println("开始查询...");
        List<Book> res = bookService.findAll();
        System.out.println(res);
        System.out.println("查询完毕！");
        if (res == null) return new ResponseResult(Code.GET_ERROR, null, "查询失败！");
        return new ResponseResult(Code.GET_OK, res, "查询成功！");
    }

    /**
     * 通过书的序列号进行查询
     * @param bid
     * @return
     */
    @GetMapping("/{bid}")
    public ResponseResult findByBid(@PathVariable Integer bid) {
        System.out.println("开始查询...");
        Book ret = bookService.findByBid(bid);
        System.out.println("查询完成！");
        if (ret == null) return new ResponseResult(Code.GET_ERROR, null, "查询失败！");
        return new ResponseResult(Code.GET_OK, ret, "查询成功！");
    }

    /**
     * 插入书籍信息
     * @param book
     */
    @PostMapping()
    public ResponseResult insert(@RequestBody Book book) {
        System.out.println("开始插入...");
        System.out.println(book);
        boolean ret = bookService.insert(book);
        if (!ret) return new ResponseResult(Code.INSERT_ERROR, ret, "插入数据失败！");
        System.out.println("插入完毕！");
        return new ResponseResult(Code.INSERT_OK, ret, "查询成功！");
    }

    /**
     * 修改书籍信息
     * @param book
     */
    @PutMapping()
    public ResponseResult update(@RequestBody Book book) {
        System.out.println("开始修改...");
        boolean ret = bookService.update(book);
        System.out.println("修改完成！");
        if (!ret) return new ResponseResult(Code.UPDATE_ERROR, ret, "修改数据失败！请稍后再试！");
        return new ResponseResult(Code.UPDATE_OK, ret, "修改数据成功！");
    }

    /**
     * 删除书籍信息
     * @param bid
     */
    @DeleteMapping("/{bid}")
    public ResponseResult deleteByBid(@PathVariable Integer bid) {
        System.out.println("开始删除...");
        boolean ret = bookService.deleteByBid(bid);
        System.out.println("删除完毕！");

        if (!ret) return new ResponseResult(Code.DELETE_ERROR, ret, "删除数据失败！请稍后再试！");
        return new ResponseResult(Code.DELETE_OK, ret, "删除数据失败！");
    }
}
