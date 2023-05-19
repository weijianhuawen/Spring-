package com.boot.mybatis.dao;

import com.boot.mybatis.mode.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookDao {
    /**
     * 查询全部的书籍数据
     * @return
     */
    @Select("select * from book")
    public List<Book> findAll();

    /**
     * 通过书的序列号进行查询
     * @param bid
     * @return
     */
    @Select("select * from book where bid = #{bid}")
    public Book findByBid(Integer bid);


    /**
     * 插入书籍信息
     * @param book
     */
    @Insert("insert into book (name, classify, description) values (#{name}, #{classify}, #{description})")
    public int insert(Book book);

    /**
     * 修改书籍信息
     * @param book
     */
    @Update("update book set name = #{name}, classify = #{classify}, description = #{description} where bid = #{bid}")
    public int update(Book book);

    /**
     * 删除书籍信息
     * @param bid
     */
    @Delete("delete from book where bid = #{bid}")
    public int deleteByBid(Integer bid);
}
