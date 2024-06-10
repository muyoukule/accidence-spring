package com.muyoukule.factory;

public class GunFactory implements WeaponFactory {
    @Override
    public Weapon get() {
        return new Gun();
    }
}