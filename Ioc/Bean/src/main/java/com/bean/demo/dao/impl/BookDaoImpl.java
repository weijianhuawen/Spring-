package com.bean.demo.dao.impl;

import com.bean.demo.dao.BookDao;
import com.bean.demo.service.impl.BookServiceImpl;

public class BookDaoImpl implements BookDao {
    //构造方法
    public BookDaoImpl() {
        //System.out.println("图书数据构造！");
    }
    @Override
    public void save() {
        System.out.println("存入图书数据！");
    }
}
