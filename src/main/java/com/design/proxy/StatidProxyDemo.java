package com.design.proxy;

import java.lang.reflect.Proxy;

public class StatidProxyDemo {

    public static void main(String[] args) {
        Sell sell = (Sell) Proxy.newProxyInstance(Sell.class.getClassLoader(),new Class[] {Sell.class},new DynamicProxy(new Vendor()));
        sell.ad();
        sell.sell();
    }
}
