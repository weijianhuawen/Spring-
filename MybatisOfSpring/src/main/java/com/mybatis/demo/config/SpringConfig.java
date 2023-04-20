package com.mybatis.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:jdbc.properties")
@ComponentScan("com.mybatis.demo")
@Import({MybatisConfig.class, JdbcConfig.class})
public class SpringConfig {
}
