package com.design.singleton;

public class SingletonSysValotile {
    private static volatile SingletonSysValotile instance = null;

    private SingletonSysValotile(){

    }

    public static SingletonSysValotile getInstance(){
        if(null == instance){
            synchronized (SingletonSysValotile.class){
                if(null == instance){
                    instance = new SingletonSysValotile();
                }
            }
        }
        return instance;
    }

}
