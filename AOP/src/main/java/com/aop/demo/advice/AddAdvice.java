package com.aop.demo.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AddAdvice {
    //切点
    @Pointcut(value = "execution(void com.aop.demo.controller.*Controller.*ing(..))")
    public void pt(){}

    //切面
    @Around("pt()")
    //通知
    public Object getRunningTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        //获取切点方法的基本信息
        String message = proceedingJoinPoint.getSignature().toString();
        Object ret = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("执行" + message + "的运行时间为：" + (end - start) + "ms");
        return ret;
    }
}
