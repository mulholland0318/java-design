package com.design.factory.abstractfactory;

public class EngineB implements Engine {
    public EngineB() {
        System.out.println("create EngineB");
    }

    public String flag(){
        return "BMW";
    }
}
