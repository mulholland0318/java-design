package com.design.singleton;

public class SingleTonTwo {
    private static SingleTonTwo instance = new SingleTonTwo();

    public static SingleTonTwo getInstance() {
        return instance;
    }
}
