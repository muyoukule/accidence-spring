package com.muyoukule.factory;

public class FighterFactory implements WeaponFactory {
    @Override
    public Weapon get() {
        return new Fighter();
    }
}