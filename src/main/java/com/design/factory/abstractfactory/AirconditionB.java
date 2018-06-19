package com.design.factory.abstractfactory;

public class AirconditionB implements Aircondition {
    public AirconditionB () {
        System.out.println("create AirconditionB");
    }

    public String flag(){
        return "haier";
    }
}
