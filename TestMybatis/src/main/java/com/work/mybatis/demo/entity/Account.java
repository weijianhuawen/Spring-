package com.work.mybatis.demo.entity;

import java.io.Serializable;

public class Account implements Serializable {
    private int uid;
    private String id;
    private String username;
    private int age;
    private String sex;
    private String address;
    private String telephone;
    private double money;

    @Override
    public String toString() {
        return "Account{" +
                "uid=" + uid +
                ", id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", money=" + money +
                '}';
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getUid() {
        return uid;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public double getMoney() {
        return money;
    }
}
