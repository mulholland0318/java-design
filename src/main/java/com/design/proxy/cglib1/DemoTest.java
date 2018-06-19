package com.design.proxy.cglib1;

import net.sf.cglib.core.DefaultGeneratorStrategy;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

public class DemoTest {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Person.class);
        enhancer.setInterceptDuringConstruction(false);
        enhancer.setStrategy(new DefaultGeneratorStrategy());

        CallbackFilter callbackFilter = new TargetMethodCallbackFilter();
        Callback callback = NoOp.INSTANCE;
        Callback callback1 = new ProxyFactory();
        Callback []callbacks = new Callback[2];
        callbacks[0] = callback;
        callbacks[1] = callback1;
        enhancer.setCallbacks(callbacks);
        enhancer.setInterceptDuringConstruction(false);
        enhancer.setCallbackFilter(callbackFilter);


//        ProxyFactory pf = new ProxyFactory();
//        enhancer.setCallback(pf);
        Person p = (Person) enhancer.create();
        p.eat();
        p.speak();
    }
}
