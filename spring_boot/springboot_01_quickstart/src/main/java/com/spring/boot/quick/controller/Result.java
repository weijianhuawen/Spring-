package com.spring.boot.quick.controller;

import lombok.Data;

@Data
public class Result {
    public Integer code;
    public String message;
    public Object data;

    public Result(Integer code, Object data, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(Integer code, Object data) {
        this.data = data;
        this.code = code;
    }
}
