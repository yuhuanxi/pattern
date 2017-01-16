package com.yhx.pattern.force;

/**
 * @author: shipeng.yu
 * @time: 2017年01月08日 下午2:09
 * @version: 1.0
 * @since: 1.0
 * @description:
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    public void login(String name) {
        this.gamePlayer.login(name);
    }

    public void killEnemy() {
        this.gamePlayer.killEnemy();
    }

    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    // 代理类这里没有自己的代理类,所以返回自己
    public IGamePlayer getGamePlayerProxy() {
        return this;
    }
}
