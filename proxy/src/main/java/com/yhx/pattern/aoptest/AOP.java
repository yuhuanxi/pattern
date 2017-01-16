package com.yhx.pattern.aoptest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: shipeng.yu
 * @time: 2017年01月10日 下午7:17
 * @version: 1.0
 * @since: 1.0
 * @description:
 */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface AOP {

    boolean log() default false; // 是否打印日志

    boolean checkAuth() default false; // 是否验证权限

    String[] effectedMethod() default {}; // 注解在哪些方法上

    Class[] effectedClasses() default {}; // 注解在哪些类上
}
