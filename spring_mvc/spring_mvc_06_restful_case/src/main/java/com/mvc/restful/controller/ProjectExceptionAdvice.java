package com.mvc.restful.controller;

import com.mvc.restful.exception.BusinessException;
import com.mvc.restful.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public ResponseResult doSystemException(SystemException e) {
        System.out.println("系统内部异常！");
        //记录日志
        //通知运维，开发人员
        //安抚用户
        return new ResponseResult(Code.SYSTEM_ERROR, null, e.getMessage());
    }

    /**
     * 处理业务异常
     * @param e
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    public ResponseResult doBusinessException(BusinessException e) {
        System.out.println("遇到业务异常造成的错误！");
        //通知用户 "网络繁忙，请稍后再试！"
        return new ResponseResult(Code.BUSINESS_ERROR, null, e.getMessage());
    }

    /**
     * 处理未知异常
     * @param e 未知异常
     * @return
     */
    @ExceptionHandler(Exception.class)
    public static ResponseResult doException(Exception e) {
        System.out.println("遇到不可预计的异常，请通知相关人员进行修复！");
        //记录日志
        e.printStackTrace();
        //通知开发者
        //安抚用户 "呀！系统白痴了！请稍后再试一试吧！"
        return new ResponseResult(Code.UNKNOW_ERROR, null, "遇到了未知错误！正在全力修复中！");
    }
}
