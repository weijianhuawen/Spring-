package com.mvc.interceptor.controller;

public class Code {
    //修改成功
    public static final Integer UPDATE_OK = 20021;
    //插入成功
    public static final Integer INSERT_OK = 20031;
    //查询成功
    public static final Integer GET_OK = 20041;
    //删除成功
    public static final Integer DELETE_OK = 20051;

    //对应失败的响应码
    public static final Integer UPDATE_ERROR = 20020;
    public static final Integer INSERT_ERROR = 20030;
    public static final Integer GET_ERROR = 20040;
    public static final Integer DELETE_ERROR = 20050;

    //未知错误
    public static final Integer UNKNOW_ERROR = 50010;
    //业务异常造成的错误
    public static final Integer BUSINESS_ERROR = 60010;
    //系统异常造成的错误
    public static final Integer SYSTEM_ERROR = 60020;
}
