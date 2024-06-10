package com.muyoukule.factory;

public class DaggerFactory implements WeaponFactory {
    @Override
    public Weapon get() {
        return new Dagger();
    }
}