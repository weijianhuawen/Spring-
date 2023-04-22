package com.aop.demo.service;

public interface TestService {
    public void testBefore();
    public void testAfter();
    public void testAround();
    public void testAfterThrowing();
    public void testAfterReturning();
    public String testHaveReturnAround();
    public void test(int a, String s);
    public String test();
}
