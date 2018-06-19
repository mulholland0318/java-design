package com.design.singleton;

public class SingleTonSys {
    private static SingleTonSys instance = null;

    private SingleTonSys() {

    }

    public static SingleTonSys getInstance(){
        if(null == instance){
            synchronized (SingleTonSys.class){
                if(null == instance){
                    instance = new SingleTonSys();
                }
            }
        }
        return instance;
    }
}
