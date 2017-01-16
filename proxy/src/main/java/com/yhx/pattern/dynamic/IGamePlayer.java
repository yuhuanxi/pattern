package com.yhx.pattern.dynamic;

/**
 * @author: shipeng.yu
 * @time: 2017年01月08日 下午3:38
 * @version: 1.0
 * @since: 1.0
 * @description:
 */
public interface IGamePlayer {

    void login(String name, String pass);

    void killEnemy();

    void upgrade();
}
