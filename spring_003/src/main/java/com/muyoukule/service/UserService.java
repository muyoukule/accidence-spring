package com.muyoukule.service;

import com.muyoukule.dao.UserDao;

public class UserService {
    private UserDao aaa;

    // 这个set方法非常关键
    /*    public void setAaa(UserDao aaa) {
        this.aaa = aaa;
    }*/
    // set方法名变化了
    public void setDao(UserDao aaa) {
        this.aaa = aaa;
    }

    public void save() {
        System.out.println("UserService...");
        aaa.insert();
    }
}