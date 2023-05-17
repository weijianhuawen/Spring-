package com.mvc.interceptor.controller.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Configuration
public class ProjectInterceptor implements HandlerInterceptor {
    //原始方法调用前的执行内容，返回false，后续两个方法以及原始方法不执行
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("原始方法执行前执行...正在执行preHandle方法");
        return true;
    }
    //原始方法调用后的执行内容
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("原始方法执行后执行...正在执行postHandle方法");
    }
    //原始方法完全执行完执行的内容
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("原始方法调用完后并在posthandle方法后执行的内容...正在执行afterCompletion方法");
    }
}
