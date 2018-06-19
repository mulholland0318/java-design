package com.design.singleton;

public class SingleTonOne {

    private static SingleTonOne instance = null;

    private SingleTonOne(){

    }

    public static SingleTonOne getInstance(){
        if(null == instance){
            instance = new SingleTonOne();
        }
        return instance;
    }
}
