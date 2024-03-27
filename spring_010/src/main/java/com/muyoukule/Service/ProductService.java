package com.muyoukule.Service;

import org.springframework.stereotype.Service;

// 商品业务类
@Service
public class ProductService {
    public void getProduct() {
        System.out.println("获取商品信息");
    }

    public void saveProduct() {
        System.out.println("保存商品");
    }

    public void deleteProduct() {
        System.out.println("删除商品");
    }

    public void modifyProduct() {
        System.out.println("修改商品");
    }
}