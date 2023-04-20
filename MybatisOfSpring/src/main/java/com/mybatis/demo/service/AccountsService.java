package com.mybatis.demo.service;

import com.mybatis.demo.mode.Account;

public interface AccountsService {
    public Account selectByUid(int uid);
    public Account selectByUidAnnotation(int uid);
}
