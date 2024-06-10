package com.muyoukule.service;

import com.muyoukule.dao.OrderDao;
import com.muyoukule.dao.UserDao;

public class OrderService {
    private OrderDao orderDao;
    private UserDao userDao;

    // 通过反射机制调用构造方法给属性赋值
    public OrderService(OrderDao orderDao, UserDao userDao) {
        this.orderDao = orderDao;
        this.userDao = userDao;
    }

    public void delete() {
        System.out.println("OrderService...");
        orderDao.deleteById();
        userDao.insert();
    }
}
