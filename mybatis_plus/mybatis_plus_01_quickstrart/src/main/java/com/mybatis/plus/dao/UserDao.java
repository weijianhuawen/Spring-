package com.mybatis.plus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatis.plus.mode.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
