package com.work.mybatis.demo.service;

import com.work.mybatis.demo.entity.Account;

import java.util.List;

public interface AccountService {

    void save(Account account);

    void deleteByUid(Integer uid);

    void update(Account account);

    List<Account> findAll();

    Account findByUid(Integer uid);
}
