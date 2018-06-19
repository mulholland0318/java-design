package com.design.factory.simple;

public class BMWFactory {

    public BMW createBMW(int type){
        switch(type){
            case 1:
                return new BMW320();
            case 2:
                return new BMW350();
            default:
                return null;
        }
    }
}
