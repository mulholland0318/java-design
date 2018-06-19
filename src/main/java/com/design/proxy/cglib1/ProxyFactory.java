package com.design.proxy.cglib1;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        String superName = methodProxy.getSuperName();
        int i = methodProxy.getSuperIndex();
        System.out.println("superIndex:"+i);
        System.out.println("superName:"+superName);
        String name = methodProxy.getSignature().getName();

        System.out.println("signatureName is " +name);
        Object result = methodProxy.invokeSuper(o,objects);
        return result;
    }
}
