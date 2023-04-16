package com.work.mybatis.demo.dao;

import com.work.mybatis.demo.entity.Account;
import org.apache.ibatis.annotations.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
//public interface AccountDao {
//    @Insert("insert into account values(null, #{id}, #{username}, #{age}, #{sex}, #{address}, #{telephone}, #{money})")
//    void save(Account account);
//
//    @Delete("delete from account where uid = #{uid} ")
//    void deleteByUid(Integer uid);
//
//    @Update("update account set username = #{username} , money = #{money} where uid = #{uid} ")
//    void update(Account account);
//
//    @Select("select * from account")
//    List<Account> findAll();
//
//    @Select("select * from account where uid = #{uid} ")
//    Account findByUid(Integer uid);
//}

@Mapper
public interface AccountDao {
    void save(Account account);
    void deleteByUid(Integer uid);
    void update(Account account);
    List<Account> findAll();
    Account findByUid(Integer uid);
}
