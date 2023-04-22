package com.aop.demo.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestServiceAdvice {
    //切点
    //执行前通知
    @Pointcut(value = "execution(void com.aop.demo.service.TestService.testBefore())")
    public void bfpf(){}
    //执行后通知
    @Pointcut(value = "execution(void com.aop.demo.service.TestService.testAfter())")
    public void afpf(){}
    //返回后通知
    @Pointcut(value = "execution(void com.aop.demo.service.TestService.testAfterReturning())")
    public void afrpf(){}
    //抛异常后通知
    @Pointcut(value = "execution(void com.aop.demo.service.TestService.testAfterThrowing())")
    public void afepf(){}
    //环绕通知
    @Pointcut(value = "execution(* com.aop.demo.service.TestService.*Around())")
    public void arpf(){}

    @Before("bfpf()")
    public void beforePlus() {
        System.out.println("执行前通知！");
    }
    @After("afpf()")
    public void afterPlus() {
        System.out.println("执行后通知！");
    }
    @AfterReturning("afrpf()")
    public void afterReturningPlus() {
        System.out.println("返回后通知！");
    }
    @AfterThrowing(value = "afepf()", throwing = "t")
    public void afterThrowing(Throwable t) {
        System.out.println("抛异常后通知！");
        System.out.println(t.getMessage());
    }
//    @Around("arpf()")
//    public void aroundPlus(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("环绕前通知！");
//        proceedingJoinPoint.proceed();
//        System.out.println("环绕后通知！");
//    }
//    @Around("arpf()")
//    public Object aroundPlus(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("环绕前通知！");
//        Object ret = proceedingJoinPoint.proceed();
//        System.out.println("环绕后通知！");
//        return ret;
//    }

    @Around("arpf()")
    public Object aroundPlus(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前通知！");
        //获取环绕通知的方法信息
        String ret = proceedingJoinPoint.getSignature().toString();
        proceedingJoinPoint.proceed();
        System.out.println("环绕后通知！");
        //返回信息
        return ret;
    }

    @Pointcut(value = "execution(void com.aop.demo.service.TestService.test(..))")
    public void testpt(){}

//    @Before("testpt()")
//    public void testBeforePlus(JoinPoint joinPoint) {
//        Object[] objects = joinPoint.getArgs();
//        for (int i = 0; i < objects.length; i++) {
//            System.out.println("第" + (i + 1) + "个参数为：" + objects[i].toString());
//        }
//    }

    @Around("testpt()")
    public Object testAroundPlus(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object[] objects = proceedingJoinPoint.getArgs();
        System.out.println("环绕1");
        Object ret = proceedingJoinPoint.proceed();
        for (int i = 0; i < objects.length; i++) {
            System.out.println("第" + (i + 1) + "个参数为：" + objects[i].toString());
        }
        System.out.println("环绕2");
        return ret;
    }
    @Pointcut(value = "execution(String com.aop.demo.service.TestService.test(..))")
    public void testptre(){}
    @AfterReturning(value = "testptre()",returning = "ret")
    public void testAfterReturningPlus(Object ret) {
        System.out.println("返回后通知：" + ret);
    }

}
