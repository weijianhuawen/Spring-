package com.mvc.restful.controller;

import lombok.Data;

/**
 * 统一数据格式返回，前后端共同商议协议内容
 * data:表示返回的数据体
 * code:表示后端处理的状态
 * message:返回给前端的数据
 */
@Data
public class ResponseResult {
    private Object data;
    private Integer code;
    private String message;

    //构造方法
    public ResponseResult(){}

    public ResponseResult(Integer code, Object data, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public ResponseResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseResult(Integer code, Object data) {
        this.data = data;
        this.code = code;
    }
}
