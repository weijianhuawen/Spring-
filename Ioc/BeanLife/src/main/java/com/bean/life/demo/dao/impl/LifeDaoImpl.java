package com.bean.life.demo.dao.impl;

import com.bean.life.demo.dao.LifeDao;

public class LifeDaoImpl implements LifeDao {
    @Override
    public void save() {
        System.out.println("完成Life存储数据操作！");
    }
    //初始化
    public void init() {
        System.out.println("life dao init ...");
    }
    //销毁
    public void destroy() {
        System.out.println("life dao destroy ...");
    }
}
