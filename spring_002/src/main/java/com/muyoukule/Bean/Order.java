package com.muyoukule.Bean;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    // 一个订单中有多个商品
    private Goods[] goods;
}