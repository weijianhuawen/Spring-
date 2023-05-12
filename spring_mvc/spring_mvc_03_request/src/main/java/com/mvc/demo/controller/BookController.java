package com.mvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/book")
@ResponseBody
public class BookController {
    @RequestMapping("/save")
    public String save() {
        System.out.println("执行图书保存操作...");
        return "book save...";
    }

    @RequestMapping("/delete")
    public String delete() {
        System.out.println("执行图书删除操作...");
        return "book delete...";
    }
}
