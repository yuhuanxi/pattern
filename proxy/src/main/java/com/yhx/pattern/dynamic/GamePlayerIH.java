package com.yhx.pattern.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: shipeng.yu
 * @time: 2017年01月08日 下午3:41
 * @version: 1.0
 * @since: 1.0
 * @description:
 */
public class GamePlayerIH implements InvocationHandler {

    // 被代理的实例
    private Object object;

    public GamePlayerIH(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(object, args);

        if (method.getName().equals("rename"))
            System.out.println("有人登录了你的账户");

        return result;
    }
}
