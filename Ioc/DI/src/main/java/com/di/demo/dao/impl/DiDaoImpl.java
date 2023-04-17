package com.di.demo.dao.impl;

import com.di.demo.dao.DiDao;

public class DiDaoImpl implements DiDao {
    private int dataNum;
    private String databaseName;
    public void setDataNum(int dataNum) {
        this.dataNum = dataNum;
    }
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
    @Override
    public void save() {
        System.out.println("di save ..." + ", " + databaseName + ", " + dataNum);
    }
}
