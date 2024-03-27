package com.muyoukule.Factory;

public class GunFactory implements WeaponFactory {
    @Override
    public Weapon get() {
        return new Gun();
    }
}