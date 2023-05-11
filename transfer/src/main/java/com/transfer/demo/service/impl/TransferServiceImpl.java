package com.transfer.demo.service.impl;

import com.transfer.demo.dao.TransferDao;
import com.transfer.demo.mode.Account;
import com.transfer.demo.mode.TransferLog;
import com.transfer.demo.service.TransferLogService;
import com.transfer.demo.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
@Service
public class TransferServiceImpl implements TransferService {
    @Autowired
    private TransferDao transferDao;
    @Autowired
    private TransferLogService logService;
    @Override
    public List<Account> selectAll() {
        List<Account> list = transferDao.selectAll();
        return list;
    }
    @Override
    public void transferMoney(Account user1, Account user2, double money) {
        boolean flag = false;
        TransferLog log = new TransferLog();
        try {
            transferDao.outMoneyByUid(user1.getUid(), money);
            int a = 1 / 0;
            transferDao.inMoneyByUid(user2.getUid(), money);
            flag = true;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        } finally {
            //记录转账日志
            String message = user1.getUsername() + "向" + user2.getUsername() + "转账" + money + "元";
            String state = "成功";
            if(!flag) state = "失败";
            log.setContent(message);
            log.setState(state);
            logService.insertLog(log);
            System.out.println("日志保存成功！" + state);
        }
    }

    @Override
    public Account selectByUid(int uid) {
        return transferDao.selectAccountByUid(uid);
    }
}
