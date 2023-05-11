package com.transfer.demo.service;

import com.transfer.demo.mode.TransferLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TransferLogService {
    public List<TransferLog> selectAll();
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public int insertLog(TransferLog log);
    public TransferLog selectByLid(int lid);
}
