package com.design.factory.abstractfactory;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class AirconditionA implements Aircondition {

    public AirconditionA() {
        System.out.println("create AirconditionA");
    }

    public String flag(){
        return "geli";
    }
}
