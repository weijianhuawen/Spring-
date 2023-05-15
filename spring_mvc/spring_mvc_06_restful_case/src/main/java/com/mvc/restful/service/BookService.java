package com.mvc.restful.service;

import com.mvc.restful.mode.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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
