package com.mvc.interceptor.config;

import com.mvc.interceptor.controller.interceptor.ProjectInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    //注入自定义拦截器对象
    //@Autowired
    private ProjectInterceptor interceptor;
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
        registry.addResourceHandler("/img/**").addResourceLocations("/img/");
        registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");
    }

    //将写好的拦截器加入到SpringMvc环境中
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器
        //表示访问/books路径所对应的方法时，就进行拦截
        registry.addInterceptor(interceptor).addPathPatterns("/books", "/books/*");
    }
}
