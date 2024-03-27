package com.muyoukule.Service;

import org.springframework.stereotype.Service;

@Service
//用户业务
public class UserService {
    public void getUser() {
        System.out.println("获取用户信息");
    }

    public void saveUser() {
        System.out.println("保存用户");
    }

    public void deleteUser() {
        System.out.println("删除用户");
    }

    public void modifyUser() {
        System.out.println("修改用户");
    }
}