package com.design.proxy.cglib1;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

public class TargetMethodCallbackFilter implements CallbackFilter{
    public int accept(Method method) {
        String name = method.getName();
        if("eat".equals(name)){
            return 0;
        }
        else if("speak".equals(name)){
            return 1;
        }
        return 0;
    }
}
