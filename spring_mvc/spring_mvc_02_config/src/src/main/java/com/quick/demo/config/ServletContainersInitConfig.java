package com.quick.demo.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.FrameworkServlet;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        //1.创建springmvc容器
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        //2.将mvc配置类注册到容器当中
        context.register(SpringMvcConfig.class);
        return context;
    }

    @Override
    protected String[] getServletMappings() {
        //该方法做请求拦截，拦截哪一些请求到spingmvc
        //允许所有的请求进入到mvc，由spring_mvc处理
        return new String[]{"/"};
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        //加载spring配置类
        return null;
    }
}
