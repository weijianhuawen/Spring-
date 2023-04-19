package com.annotation.bean.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.annotation.bean.demo.dao.JdbcDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

public class JdbcConfig {
    @Value("${jdbc.driver}")
    private String drive;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String name;
    @Value("${jdbc.password}")
    private String password;
    @Bean
    public DataSource dataSource(JdbcDao jdbcDao) {
        jdbcDao.save();
        DruidDataSource druidDataSource = new DruidDataSource();
        //设置相关参数
        //设置驱动类
        druidDataSource.setDriverClassName(drive);
        //设置url
        druidDataSource.setUrl(url);
        //设置username
        druidDataSource.setUsername(name);
        //设置密码
        druidDataSource.setPassword(password);
        return druidDataSource;
    }
}
