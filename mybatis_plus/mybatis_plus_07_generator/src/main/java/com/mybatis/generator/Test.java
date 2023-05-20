package com.mybatis.generator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Test {
    @Value("${spring.datasource.username}")
    private String name;

    @Bean
    public String test() {
        return name;
    }
}
