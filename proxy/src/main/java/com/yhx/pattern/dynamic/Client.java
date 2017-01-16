package com.yhx.pattern.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author: shipeng.yu
 * @time: 2017年01月08日 下午3:45
 * @version: 1.0
 * @since: 1.0
 * @description:
 */
public class Client {

    private static void dynamicProxy() {
        IGamePlayer gamePlayer = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayerIH(gamePlayer);

        ClassLoader classLoader = gamePlayer.getClass().getClassLoader();
        Class[] classes = new Class[]{IGamePlayer.class};
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, classes, handler);
        proxy.login("yhx", "hello");
        proxy.killEnemy();
        proxy.upgrade();
    }

    public static void main(String[] args) {
        dynamicProxy();
    }
}
