package com.yhx.pattern.commondynamic;

import java.lang.reflect.InvocationHandler;

/**
 * @author: shipeng.yu
 * @time: 2017年01月08日 下午5:55
 * @version: 1.0
 * @since: 1.0
 * @description:
 */
public class Client {

    public static void dynamicProxy() {
        ISubject subject = new ConcertSubject();
        InvocationHandler handler = new MyInvocationHandler(subject);

        ISubject concertSubject = DynamicProxy.newInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);

        concertSubject.doSomething();
    }

    public static void subjectDynamicProxy() {
        ISubject subject = new ConcertSubject();
        ISubject proxy = SubjectDynamicProxy.newInstance(subject);
        proxy.doSomething();
    }

    public static void main(String[] args) {
        dynamicProxy();
        subjectDynamicProxy();
    }
}
