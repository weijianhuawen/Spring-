package com.mvc.restful.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

public class MybatisConfig {
    @Bean
    public SqlSessionFactoryBean  sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setTypeAliasesPackage("com.mvc.restful.mode");
        factoryBean.setDataSource(dataSource);
        //基于mapper文件需要设置扫描路径
        //factoryBean.setMapperLocations(new ClassPathResource("mapper/BookMapper.xml"));
        return factoryBean;
    }

    /**
     * 使用注解mapper映射sql的时候，需要写下面的方法，配置扫描包
     */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        configurer.setBasePackage("com.mvc.restful.dao");
        return configurer;
    }
}
