package com.muyoukule.bean;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Customer {
    //p命名空间注入是基于setter方法的，所以需要对应的属性提供setter方法
    private String name;
    private int age;
}