package com.yhx.pattern.aoptest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author: shipeng.yu
 * @time: 2017年01月10日 下午7:21
 * @version: 1.0
 * @since: 1.0
 * @description:
 */
public class DynamicProxy {

    public static <T> T newInstance(ClassLoader classLoader, Class[] instances, InvocationHandler handler) {
        return (T) Proxy.newProxyInstance(classLoader, instances, handler);
    }
}
