package com.transfer.demo.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

public class MybatisConfig {
    /**
     * 配置mybatis
     * @param dataSource 数据库的数据源
     * @return SqlSessionFactoryBean
     */
    @Bean
    public SqlSessionFactoryBean getSqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        //配置数据源
        sqlSessionFactoryBean.setDataSource(dataSource);
        //简化
        sqlSessionFactoryBean.setTypeAliasesPackage("com.transfer.demo.mode");
        //配置所需要扫描到的mapper文件
        sqlSessionFactoryBean.setMapperLocations(new ClassPathResource[]{
                new ClassPathResource("mapper/TransferMapper.xml"),
                new ClassPathResource("mapper/TransferLogMapper.xml")
        });
        return sqlSessionFactoryBean;
    }

    /**
     * 配置所对应需要扫描的mapper接口 基于注解编写sql需要设置这个 使用xml文件配置编写sql不需要
     * @return  MapperScannerConfigurer
     */
    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer() {
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        configurer.setBasePackage("com.transfer.demo.dao");
        return configurer;
    }
}
