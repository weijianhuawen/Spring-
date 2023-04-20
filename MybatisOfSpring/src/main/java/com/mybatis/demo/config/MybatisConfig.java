package com.mybatis.demo.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

public class MybatisConfig {
    //配置mybatis
    @Bean
    public SqlSessionFactoryBean getSqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage("com.mybatis.demo.mode");
        //设置mapper文件路径
        sqlSessionFactoryBean.setMapperLocations(new ClassPathResource("mapper/AccountsMapper.xml"));
        return sqlSessionFactoryBean;
    }
    //配置dao扫描包
    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.mybatis.demo.dao");
        return mapperScannerConfigurer;
    }
}
