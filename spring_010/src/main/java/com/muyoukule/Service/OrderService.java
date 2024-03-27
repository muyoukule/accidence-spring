package com.muyoukule.Service;

import org.springframework.stereotype.Service;

@Service
// 业务类
public class OrderService {
    // 生成订单
    public void generate() {
        System.out.println("正在生成订单...");
    }

    // 取消订单
    public void cancel() {
        System.out.println("正在取消订单...");
    }
}