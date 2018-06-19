package com.design.proxy.cglib1;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;

public class FixValueDemo {
    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Person.class);
        enhancer.setCallback(new FixedValue() {
            public Object loadObject() throws Exception {
                return "hello world";
            }
        });
        Person p = (Person) enhancer.create();
        String s = p.speak();
        System.out.println(s);
        System.out.println();


    }
}
