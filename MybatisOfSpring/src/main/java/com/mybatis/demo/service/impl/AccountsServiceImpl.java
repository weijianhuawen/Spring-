package com.mybatis.demo.service.impl;

import com.mybatis.demo.dao.AccountsDao;
import com.mybatis.demo.mode.Account;
import com.mybatis.demo.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountsServiceImpl implements AccountsService {
    @Resource
    private AccountsDao accountsDao;

    public Account selectByUid(int uid){
        System.out.println("service : select by uid ...");
        return accountsDao.selectByUid(uid);
    }
    public Account selectByUidAnnotation(int uid){
        System.out.println("service : annotation select by uid ...");
        return accountsDao.selectByUidAnnotation(uid);
    }
}
