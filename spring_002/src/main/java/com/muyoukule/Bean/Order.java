package com.muyoukule.Bean;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    // 一个订单中有多个商品
    private Goods[] goods;
}