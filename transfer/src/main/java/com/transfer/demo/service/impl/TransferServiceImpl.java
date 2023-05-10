package com.transfer.demo.service.impl;

import com.transfer.demo.dao.TransferDao;
import com.transfer.demo.mode.Account;
import com.transfer.demo.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class TransferServiceImpl implements TransferService {
    @Autowired
    private TransferDao transferDao;
    @Override
    public List<Account> selectAll() {
        List<Account> list = transferDao.selectAll();
        return list;
    }
    @Override
    public void transferMoney(Account user1, Account user2, double money) {
        transferDao.outMoneyByUid(user1.getUid(), money);
        int a = 1 / 0;
        transferDao.inMoneyByUid(user2.getUid(), money);
    }

    @Override
    public Account selectByUid(int uid) {
        return transferDao.selectAccountByUid(uid);
    }
}
