package com.transfer.demo.dao;

import com.transfer.demo.mode.TransferLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TransferLogDao {
    // 查询日志记录
    public List<TransferLog> selectLogs();
    // 根据lid查询日志记录
    public TransferLog selectLogByLid(@Param("lid") int lid);
    // 插入日志
    public int insertLog(TransferLog log);
}
