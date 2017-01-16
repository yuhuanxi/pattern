package com.yhx.pattern.force;

/**
 * @author: shipeng.yu
 * @time: 2017年01月08日 下午2:08
 * @version: 1.0
 * @since: 1.0
 * @description: 强制代理
 */
public interface IGamePlayer {

    void login(String name);

    void killEnemy();

    void upgrade();

    // 需要找到自己的代理人
    IGamePlayer getGamePlayerProxy();
}
