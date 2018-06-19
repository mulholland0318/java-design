package com.design.proxy.cglib1;

public class Person {

    public Person() {
        speak();
    }

    public void eat(){
        System.out.println("eat something");
    }

    public String speak(){
        System.out.println("speak something");
        return "Hello world";
    }
}
