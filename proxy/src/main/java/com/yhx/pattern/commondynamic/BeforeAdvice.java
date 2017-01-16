package com.yhx.pattern.commondynamic;

/**
 * @author: shipeng.yu
 * @time: 2017年01月08日 下午6:24
 * @version: 1.0
 * @since: 1.0
 * @description:
 */
public class BeforeAdvice implements IAdvice {

    public void exec() {
        System.out.println("执行前置通知");
    }
}
