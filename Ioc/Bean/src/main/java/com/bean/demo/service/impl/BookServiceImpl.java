package com.bean.demo.service.impl;

import com.bean.demo.dao.BookDao;
import com.bean.demo.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    //构造方法
    public BookServiceImpl() {
        //System.out.println("图书服务构造！");
    }
    @Override
    public void service() {
        System.out.println("处理图书业务！");
        bookDao.save();
    }
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
