package com.yhx.pattern.simple;

/**
 * @author: shipeng.yu
 * @time: 2017年01月07日 下午11:53
 * @version: 1.0
 * @since: 1.0
 * @description: 定义一个微商服务
 */
public interface IMicroBusiness {

    /**
     * 微商开始进货
     */
    void purchases();

    /**
     * 微商开始卖货
     */
    void sellGoods();

    /**
     * 卖完货开始算账
     */
    void castAccounts();
}
