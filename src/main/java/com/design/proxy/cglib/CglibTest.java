package com.design.proxy.cglib;

public class CglibTest {
    public static void main(String[] args) {
        UserDao target = new UserDao();

        UserDao proxy =(UserDao) new ProxyFactory(target).getProxyInstance();
        proxy.save();
    }
}
