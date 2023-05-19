package com.mvc.restful.service.impl;

import com.mvc.restful.controller.Code;
import com.mvc.restful.dao.BookDao;
import com.mvc.restful.exception.BusinessException;
import com.mvc.restful.exception.SystemException;
import com.mvc.restful.mode.Book;
import com.mvc.restful.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookDao bookDao;
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    public Book findByBid(Integer bid) {
        //模拟异常
        if (bid == 0) {
            //模拟抛出业务异常
            throw new BusinessException(Code.BUSINESS_ERROR, "网络繁忙，请重新再试！");
        } else if (bid == -1) {
            //模拟系统异常
            throw new SystemException(Code.SYSTEM_ERROR, "呀！服务器开小差了，请稍后再试！");
        }

        return bookDao.findByBid(bid);
    }

    public boolean insert(Book book) {
        bookDao.insert(book);
        bookDao.findByBid(book.getBid());
        return true;
    }

    public boolean update(Book book) {
        int num = bookDao.update(book);
        if (num == 0) return false;
        Book ret = bookDao.findByBid(book.getBid());
        if (ret == null) return false;
        if (!ret.getName().equals(book.getName())) return false;
        if (!ret.getClassify().equals(book.getClassify())) return false;
        if (!ret.getDescription().equals(book.getDescription())) return false;
        return true;
    }

    public boolean deleteByBid(Integer bid) {
        int ret = bookDao.deleteByBid(bid);
        return ret > 0;
    }
}
