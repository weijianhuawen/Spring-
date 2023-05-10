package com.transfer.demo.dao;

import com.transfer.demo.mode.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TransferDao {
    public List<Account> selectAll();
    public Account selectAccountByUid(@Param("uid") int uid);

    public void inMoneyByUid(@Param("uid") int uid, @Param("money") double money);
    public void outMoneyByUid(@Param("uid") int uid, @Param("money") double money);
    public void inMoneyByName(@Param("username") String username, @Param("money") double money);
    public void outMoneyByName(@Param("username") String username, @Param("money") double money);
}
