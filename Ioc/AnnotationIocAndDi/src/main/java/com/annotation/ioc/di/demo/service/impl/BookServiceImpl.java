package com.annotation.ioc.di.demo.service.impl;

import com.annotation.ioc.di.demo.dao.BookDao;
import com.annotation.ioc.di.demo.dao.impl.BookDaoImpl;
import com.annotation.ioc.di.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookServiceImpl implements BookService {
//    @Autowired(required = false)
//    //只设置value可以省略value=，因为默认值为value属性的值
//    @Qualifier(value = "bookDao" )
    @Resource(name = "bookDao", shareable = false)
    private BookDao bookDao;

//    @Resource
//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }
//    @Autowired
//    public BookServiceImpl(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }
    @Override
    public void service() {
        System.out.println("book service ...");
        bookDao.save();
    }
}
