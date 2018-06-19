package com.design.proxy.cglib1;

import net.sf.cglib.beans.BeanGenerator;

import java.lang.reflect.Method;

public class BeanDemo {
    public static void main(String[] args)throws Exception {
        BeanGenerator beanGenerator = new BeanGenerator();
        beanGenerator.addProperty("value",String.class);

        Object myBean = beanGenerator.create();
        Method setter = myBean.getClass().getMethod("setValue",String.class);

        setter.invoke(myBean,"hello");

        Method getter = myBean.getClass().getMethod("getValue");
        System.out.println(getter.invoke(myBean));
    }
}
