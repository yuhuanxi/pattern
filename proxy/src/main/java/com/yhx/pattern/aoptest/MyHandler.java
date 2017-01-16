package com.yhx.pattern.aoptest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: shipeng.yu
 * @time: 2017年01月10日 下午7:23
 * @version: 1.0
 * @since: 1.0
 * @description:
 */
public class MyHandler<T> implements InvocationHandler {

    private T t;

    public MyHandler(T t) {
        this.t = t;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(t, args);
        return null;
    }
}
