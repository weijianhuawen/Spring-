package com.aop.demo.service.impl;

import com.aop.demo.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public void testBefore() {
        System.out.println("业务执行中...");
    }
    @Override
    public void testAfter() {
        System.out.println("业务执行中...");
    }
    @Override
    public void testAround() {
        System.out.println("业务执行中...");
    }
    @Override
    public String testHaveReturnAround() {
        System.out.println("业务执行中...");
        return "我有返回值！";
    }
    @Override
    public void testAfterThrowing() {
        System.out.println("业务执行中...");
        try {
            int a = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("存在除0异常！");
            e.printStackTrace();
        }
    }
//    @Override
//    public void testAfterThrowing() {
//        System.out.println("业务执行中...");
////        try {
////            int a = 1 / 0;
////        } catch (ArithmeticException e) {
////            System.out.println("存在除0异常！");
////            e.printStackTrace();
////        }
//        int a = 1 / 0;
//    }
    @Override
    public void testAfterReturning() {
        System.out.println("业务执行中...");
    }

    @Override
    public void test(int a, String s) {
        System.out.println("含参目标方法！");
    }

    @Override
    public String test() {
        System.out.println("含返回值目标方法！");
        return "test返回值!";
    }
}
