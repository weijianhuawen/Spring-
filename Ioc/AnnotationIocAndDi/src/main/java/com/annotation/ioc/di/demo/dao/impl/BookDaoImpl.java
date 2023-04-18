package com.annotation.ioc.di.demo.dao.impl;

import com.annotation.ioc.di.demo.dao.BookDao;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book save ...");
    }
}
