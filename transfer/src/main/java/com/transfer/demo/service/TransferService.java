package com.transfer.demo.service;

import com.transfer.demo.mode.Account;
import com.transfer.demo.mode.TransferLog;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface  TransferService {
    public List<Account> selectAll();
    @Transactional
    public void transferMoney(Account user1, Account user2, double money);
    public Account selectByUid(int uid);
}
