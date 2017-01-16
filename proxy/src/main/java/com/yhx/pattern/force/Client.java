package com.yhx.pattern.force;

/**
 * @author: shipeng.yu
 * @time: 2017年01月08日 下午2:14
 * @version: 1.0
 * @since: 1.0
 * @description:
 */
public class Client {

    public static void forceProxy() {
        IGamePlayer gamePlayer = new GamePlayer("小明");
        gamePlayer.login("小明");

        IGamePlayer proxy = gamePlayer.getGamePlayerProxy();
        proxy.upgrade();
    }

    public static void main(String[] args) {
        forceProxy();
    }
}
