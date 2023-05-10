package com.transfer.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

public class JdbcConfig {
    //驱动
    @Value("${jdbc.driver}")
    private String drive;
    //url
    @Value("${jdbc.url}")
    private String url;
    //账户
    @Value("${jdbc.username}")
    private String username;
    //密码
    @Value("${jdbc.password}")
    private String password;

    /**
     * 配置数据源
     */
    @Bean
    public DataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(drive);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        //设置数据自动提交
        dataSource.setDefaultAutoCommit(true);
        return dataSource;
    }
    @Bean
    public PlatformTransactionManager getTransactionManger(DataSource dataSource) {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }

}
