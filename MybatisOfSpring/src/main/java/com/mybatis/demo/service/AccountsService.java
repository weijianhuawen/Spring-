package com.mybatis.demo.service;

import com.mybatis.demo.mode.Account;
import org.springframework.stereotype.Service;

@Service
public interface AccountsService {
    public Account selectByUid(int uid);
    public Account selectByUidAnnotation(int uid);
}
