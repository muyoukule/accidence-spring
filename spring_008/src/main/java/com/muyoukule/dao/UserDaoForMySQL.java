package com.muyoukule.dao;

import org.springframework.stereotype.Repository;

@Repository //纳入bean管理
public class UserDaoForMySQL implements UserDao {
    @Override
    public void insert() {
        System.out.println("正在向mysql数据库插入User数据...");
    }
}