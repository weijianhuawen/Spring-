package com.bean.life.demo.service.impl;

import com.bean.life.demo.dao.LifeDao;
import com.bean.life.demo.service.LifeService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeServiceImpl implements LifeService, InitializingBean, DisposableBean {
    private LifeDao lifeDao;
    public void setLifeDao(LifeDao lifeDao) {
        System.out.println("set ...");
        this.lifeDao = lifeDao;
    }
    @Override
    public void service() {
        System.out.println("完成Life业务操作！");
        lifeDao.save();
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("life service destroy ...");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("life service init ...");
    }
}
