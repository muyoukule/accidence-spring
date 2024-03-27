package com.muyoukule.Factory;

public class FighterFactory implements WeaponFactory {
    @Override
    public Weapon get() {
        return new Fighter();
    }
}