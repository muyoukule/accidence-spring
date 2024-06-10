package com.muyoukule.factory;

public class Gun extends Weapon {
    @Override
    public void attack() {
        System.out.println("开枪射击！");
    }
}