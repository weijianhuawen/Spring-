package com.mybatis.dml.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {
    @Bean
    public MybatisPlusInterceptor getMybatisPlusInterceptor() {
        //1.创建mybatisplus拦截器
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        //2.添加分页拦截器
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        //3.配置乐观锁拦截器
        interceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
        //3.返回拦截器对象
        return interceptor;
    }
}
