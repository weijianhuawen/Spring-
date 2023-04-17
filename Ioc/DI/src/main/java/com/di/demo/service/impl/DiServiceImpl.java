package com.di.demo.service.impl;

import com.di.demo.dao.DiDao;
import com.di.demo.dao.IocDao;
import com.di.demo.service.DiService;

public class DiServiceImpl implements DiService {
    //引用类型
    private DiDao diDao;
    private IocDao iocDao;
    public DiServiceImpl(DiDao diDao, IocDao iocDao) {
        this.diDao = diDao;
        this.iocDao = iocDao;
    }
    @Override
    public void service() {
        System.out.println("DI注入开始服务！");
        diDao.save();
        iocDao.save();
    }
}
