package com.boot.mybatis.service;

import com.boot.mybatis.mode.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface BookService {
    /**
     * 查询全部的书籍数据
     * @return
     */
    public List<Book> findAll();

    /**
     * 通过书的序列号进行查询
     * @param bid
     * @return
     */
    public Book findByBid(Integer bid);

    /**
     * 插入书籍信息
     * @param book
     */
    public boolean insert(Book book);

    /**
     * 修改书籍信息
     * @param book
     */
    public boolean update(Book book);

    /**
     * 删除书籍信息
     * @param bid
     */
    public boolean deleteByBid(Integer bid);
}
