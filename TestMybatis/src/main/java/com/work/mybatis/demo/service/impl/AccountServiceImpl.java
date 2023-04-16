package com.work.mybatis.demo.service.impl;

import com.work.mybatis.demo.dao.AccountDao;
import com.work.mybatis.demo.entity.Account;
import com.work.mybatis.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;

    public void save(Account account) {
        accountDao.save(account);
    }

    public void update(Account account){
        accountDao.update(account);
    }

    public void deleteByUid(Integer uid) {
        accountDao.deleteByUid(uid);
    }

    public Account findByUid(Integer uid) {
        return accountDao.findByUid(uid);
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
