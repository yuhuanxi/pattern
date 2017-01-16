package com.yhx.pattern.commondynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author: shipeng.yu
 * @time: 2017年01月08日 下午5:52
 * @version: 1.0
 * @since: 1.0
 * @description:
 */
public class DynamicProxy {

    public static <T> T newInstance(ClassLoader classLoader, Class[] interfaces, InvocationHandler handler) {

        if (true) {
            (new BeforeAdvice()).exec();
        }

        return (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}
