package com.design.proxy;

public class Vendor implements Sell {
    public void sell() {
        System.out.println("sell method running");
    }

    public void ad() {
        System.out.println("ad method running");
    }
}
