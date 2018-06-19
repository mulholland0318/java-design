package com.design.observer.demo1;

import java.util.ArrayList;
import java.util.List;

public class WechatServer implements Observerable {

    private List<com.design.observer.demo1.Observer> list;
    private String message;

    public WechatServer() {
        this.list = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        list.add(o);
    }

    public void removeObserver(Observer o) {
        if(list.size()>0){
            list.remove(o);
        }
    }

    public void notifyObserver() {
        list.forEach( o -> {o.update(message);});
    }

    public void setInfomation(String message){
        this.message = message;
        System.out.println("wechat message");
        notifyObserver();
    }
}
