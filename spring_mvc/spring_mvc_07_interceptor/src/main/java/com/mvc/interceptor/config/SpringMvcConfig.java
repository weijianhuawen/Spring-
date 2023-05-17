package com.mvc.interceptor.config;

import com.mvc.interceptor.controller.interceptor.ProjectInterceptor;
import com.mvc.interceptor.controller.interceptor.ProjectInterceptor2;
import com.mvc.interceptor.controller.interceptor.ProjectInterceptor3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan({"com.mvc.interceptor.controller", "com.mvc.interceptor.config"})
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {
    @Autowired
    private ProjectInterceptor interceptor;
    @Autowired
    private ProjectInterceptor2 interceptor2;
    @Autowired
    private ProjectInterceptor3 interceptor3;
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor).addPathPatterns("/books", "/books/*");
        registry.addInterceptor(interceptor2).addPathPatterns("/books", "/books/*");
        registry.addInterceptor(interceptor3).addPathPatterns("/books", "/books/*");
    }
}
