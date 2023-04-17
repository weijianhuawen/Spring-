package com.data.source.demo.Dao;

public class UserDao {
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public void save() {
        System.out.println("save ... " + username);
    }
}
