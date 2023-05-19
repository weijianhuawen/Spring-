package com.mybatis.dql.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatis.dql.mode.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
