package com.design.factory.demo;

public class FactoryBMW350 implements FactoryBMW {
    @Override
    public BMW350 createBMW() {
        return new BMW350();
    }
}
