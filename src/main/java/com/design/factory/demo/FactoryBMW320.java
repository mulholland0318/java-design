package com.design.factory.demo;

public class FactoryBMW320 implements FactoryBMW {
    @Override
    public BMW320 createBMW() {
        return new BMW320();
    }
}
