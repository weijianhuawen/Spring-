package com.mybatis.dml.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatis.dml.mode.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
