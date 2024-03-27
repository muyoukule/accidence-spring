package com.muyoukule.Factory;

public class DaggerFactory implements WeaponFactory {
    @Override
    public Weapon get() {
        return new Dagger();
    }
}