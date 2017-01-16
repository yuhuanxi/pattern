package com.yhx.pattern.commondynamic;

import java.lang.reflect.InvocationHandler;

/**
 * @author: shipeng.yu
 * @time: 2017年01月08日 下午6:01
 * @version: 1.0
 * @since: 1.0
 * @description:
 */
public class SubjectDynamicProxy extends DynamicProxy {

    public static <T> T newInstance(ISubject subject) {
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class[] interfaces = subject.getClass().getInterfaces();
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newInstance(classLoader, interfaces, handler);
    }
}
