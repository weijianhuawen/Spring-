package com.mvc.demo.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.Filter;

//public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
//    @Override
//    protected WebApplicationContext createServletApplicationContext() {
//        //加载spring-mvc容器配置
//        //1.创建springmvc容器
//        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//        //2.将mvc配置类注册到容器当中
//        context.register(SpringMvcConfig.class);
//        return context;
//    }
//
//    @Override
//    protected String[] getServletMappings() {
//        //该方法做请求拦截，拦截哪一些请求到spingmvc
//        //允许所有的请求进入到mvc，由spring_mvc处理
//        return new String[]{"/"};
//    }
//
//    @Override
//    protected WebApplicationContext createRootApplicationContext() {
//        //加载spring容器配置
//        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//        context.register(SpringConfig.class);
//        return context;
//    }
//}

public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //处理post请求乱码问题
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("utf-8");
        filter.setForceEncoding(true);
        filter.setForceResponseEncoding(true);
        filter.setForceRequestEncoding(true);
        return new Filter[]{filter};
    }
}