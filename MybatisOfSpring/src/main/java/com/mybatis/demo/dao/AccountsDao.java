package com.mybatis.demo.dao;

import com.mybatis.demo.mode.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AccountsDao {
    //通过uid查找用户
    public Account selectByUid(int uid);

    @Select("select * from Account where uid = #{uid}")
    public Account selectByUidAnnotation(int uid);
}
