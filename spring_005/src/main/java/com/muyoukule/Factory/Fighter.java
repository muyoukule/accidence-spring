package com.muyoukule.Factory;

public class Fighter extends Weapon {
    @Override
    public void attack() {
        System.out.println("战斗机发射核弹！");
    }
}