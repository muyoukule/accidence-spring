package com.muyoukule.service;

import org.springframework.stereotype.Service;

@Service
// 业务类
public class AccountService {
    // 转账业务方法
    public void transfer() {
        System.out.println("正在进行银行账户转账...");
    }

    // 取款业务方法
    public void withdraw() {
        System.out.println("正在进行取款操作...");
    }
}