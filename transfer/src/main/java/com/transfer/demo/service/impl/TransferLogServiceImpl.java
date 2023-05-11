package com.transfer.demo.service.impl;

import com.transfer.demo.dao.TransferLogDao;
import com.transfer.demo.mode.TransferLog;
import com.transfer.demo.service.TransferLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferLogServiceImpl implements TransferLogService {
    @Autowired
    private TransferLogDao logDao;
    @Override
    public List<TransferLog> selectAll() {
        return logDao.selectLogs();
    }

    @Override
    public int insertLog(TransferLog log) {
        return logDao.insertLog(log);
    }

    @Override
    public TransferLog selectByLid(int lid) {
        return logDao.selectLogByLid(lid);
    }
}
