package com.mybatis.crud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatis.crud.mode.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.util.backoff.BackOff;
@Mapper
public interface UserDao extends BaseMapper<User> {
}
