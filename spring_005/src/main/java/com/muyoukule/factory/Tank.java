package com.muyoukule.factory;

public class Tank extends Weapon {
    @Override
    public void attack() {
        System.out.println("坦克开炮！");
    }
}