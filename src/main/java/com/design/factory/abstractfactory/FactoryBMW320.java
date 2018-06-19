package com.design.factory.abstractfactory;

public class FactoryBMW320 implements  AbastactFactory {
    @Override
    public EngineA createEngine() {
        return new EngineA();
    }

    @Override
    public AirconditionA creasteAircondition() {
        return new AirconditionA();
    }
}
