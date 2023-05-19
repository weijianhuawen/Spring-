package com.mybatis.pages.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatis.pages.mode.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
