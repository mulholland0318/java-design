package com.design.observer.demo1;

import java.util.Observable;
import java.util.Observer;

public class Demo {

    public static void main(String[] args) {
        User u1 = new User("zhangsan");
        WechatServer ws = new WechatServer();
        ws.registerObserver(u1);
        ws.setInfomation(" hello");



    }
}
