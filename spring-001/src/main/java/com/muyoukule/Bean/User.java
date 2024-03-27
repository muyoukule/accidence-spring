package com.muyoukule.Bean;


public class User {
    public User() {
        System.out.println("User的无参数构造方法执行");
    }

    public User(String name) {
        System.out.println("User的有参数构造方法执行");
    }

    public void hello() {
        System.out.println("hello userBean....");
    }
}