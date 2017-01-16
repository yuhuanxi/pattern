package com.yhx.pattern.simple;

/**
 * @author: shipeng.yu
 * @time: 2017年01月08日 上午12:17
 * @version: 1.0
 * @since: 1.0
 * @description: 代理的通用接口
 */
public interface ISellerProxy {

    // 代理需要收取一定的费用
    void payment();
}
