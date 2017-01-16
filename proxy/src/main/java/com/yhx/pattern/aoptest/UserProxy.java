package com.yhx.pattern.aoptest;

import java.lang.reflect.InvocationHandler;

/**
 * @author: shipeng.yu
 * @time: 2017年01月10日 下午7:25
 * @version: 1.0
 * @since: 1.0
 * @description:
 */
public class UserProxy extends DynamicProxy {

    public static <T> T getInstance(IUserLogic userLogic) {

        ClassLoader loader = userLogic.getClass().getClassLoader();
        Class[] instances = userLogic.getClass().getInterfaces();
        InvocationHandler handler = new UserHandler(userLogic);

        return newInstance(loader, instances, handler);
    }
}
