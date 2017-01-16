package com.yhx.pattern.commondynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: shipeng.yu
 * @time: 2017年01月08日 下午5:51
 * @version: 1.0
 * @since: 1.0
 * @description:
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object object;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object, args);
    }
}
